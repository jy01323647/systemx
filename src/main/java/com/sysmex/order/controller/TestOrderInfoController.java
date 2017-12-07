package com.sysmex.order.controller;
import com.sysmex.order.entity.TestOrderInfoEntity;
import com.sysmex.order.service.TestOrderInfoServiceI;
import com.sysmex.order.page.TestOrderInfoPage;
import com.sysmex.order.entity.TestOrderDetailInfoEntity;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.ExceptionUtil;
import org.jeecgframework.core.util.ResourceUtil;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.io.IOException;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.jeecgframework.core.beanvalidator.BeanValidators;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.net.URI;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

/**   
 * @Title: Controller
 * @Description: 订单表
 * @author onlineGenerator
 * @date 2017-12-07 11:34:54
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/testOrderInfoController")
public class TestOrderInfoController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TestOrderInfoController.class);

	@Autowired
	private TestOrderInfoServiceI testOrderInfoService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;

	/**
	 * 订单表列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/sysmex/order/testOrderInfoList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(TestOrderInfoEntity testOrderInfo,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TestOrderInfoEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, testOrderInfo);
		try{
		//自定义追加查询条件
		String query_createDate_begin = request.getParameter("createDate_begin");
		String query_createDate_end = request.getParameter("createDate_end");
		if(StringUtil.isNotEmpty(query_createDate_begin)){
			cq.ge("createDate", new SimpleDateFormat("yyyy-MM-dd").parse(query_createDate_begin));
		}
		if(StringUtil.isNotEmpty(query_createDate_end)){
			cq.le("createDate", new SimpleDateFormat("yyyy-MM-dd").parse(query_createDate_end));
		}
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.testOrderInfoService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除订单表
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(TestOrderInfoEntity testOrderInfo, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		testOrderInfo = systemService.getEntity(TestOrderInfoEntity.class, testOrderInfo.getId());
		String message = "订单表删除成功";
		try{
			testOrderInfoService.delMain(testOrderInfo);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "订单表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 批量删除订单表
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		AjaxJson j = new AjaxJson();
		String message = "订单表删除成功";
		try{
			for(String id:ids.split(",")){
				TestOrderInfoEntity testOrderInfo = systemService.getEntity(TestOrderInfoEntity.class,
				id
				);
				testOrderInfoService.delMain(testOrderInfo);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "订单表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 添加订单表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(TestOrderInfoEntity testOrderInfo,TestOrderInfoPage testOrderInfoPage, HttpServletRequest request) {
		List<TestOrderDetailInfoEntity> testOrderDetailInfoList =  testOrderInfoPage.getTestOrderDetailInfoList();
		AjaxJson j = new AjaxJson();
		String message = "添加成功";
		try{
			testOrderInfoService.addMain(testOrderInfo, testOrderDetailInfoList);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "订单表添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	/**
	 * 更新订单表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(TestOrderInfoEntity testOrderInfo,TestOrderInfoPage testOrderInfoPage, HttpServletRequest request) {
		List<TestOrderDetailInfoEntity> testOrderDetailInfoList =  testOrderInfoPage.getTestOrderDetailInfoList();
		AjaxJson j = new AjaxJson();
		String message = "更新成功";
		try{
			testOrderInfoService.updateMain(testOrderInfo, testOrderDetailInfoList);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "更新订单表失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 订单表新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(TestOrderInfoEntity testOrderInfo, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(testOrderInfo.getId())) {
			testOrderInfo = testOrderInfoService.getEntity(TestOrderInfoEntity.class, testOrderInfo.getId());
			req.setAttribute("testOrderInfoPage", testOrderInfo);
		}
		return new ModelAndView("com/sysmex/order/testOrderInfo-add");
	}
	
	/**
	 * 订单表编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(TestOrderInfoEntity testOrderInfo, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(testOrderInfo.getId())) {
			testOrderInfo = testOrderInfoService.getEntity(TestOrderInfoEntity.class, testOrderInfo.getId());
			req.setAttribute("testOrderInfoPage", testOrderInfo);
		}
		return new ModelAndView("com/sysmex/order/testOrderInfo-update");
	}
	
	
	/**
	 * 加载明细列表[订单明细]
	 * 
	 * @return
	 */
	@RequestMapping(params = "testOrderDetailInfoList")
	public ModelAndView testOrderDetailInfoList(TestOrderInfoEntity testOrderInfo, HttpServletRequest req) {
	
		//===================================================================================
		//获取参数
		Object id0 = testOrderInfo.getId();
		//===================================================================================
		//查询-订单明细
	    String hql0 = "from TestOrderDetailInfoEntity where 1 = 1 AND oRDER_ID = ? ";
	    try{
	    	List<TestOrderDetailInfoEntity> testOrderDetailInfoEntityList = systemService.findHql(hql0,id0);
			req.setAttribute("testOrderDetailInfoList", testOrderDetailInfoEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("com/sysmex/order/testOrderDetailInfoList");
	}

    /**
    * 导出excel
    *
    * @param request
    * @param response
    */
    @RequestMapping(params = "exportXls")
    public String exportXls(TestOrderInfoEntity testOrderInfo,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid,ModelMap map) {
    	CriteriaQuery cq = new CriteriaQuery(TestOrderInfoEntity.class, dataGrid);
    	//查询条件组装器
    	org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, testOrderInfo);
    	try{
    	//自定义追加查询条件
    	}catch (Exception e) {
    		throw new BusinessException(e.getMessage());
    	}
    	cq.add();
    	List<TestOrderInfoEntity> list=this.testOrderInfoService.getListByCriteriaQuery(cq, false);
    	List<TestOrderInfoPage> pageList=new ArrayList<TestOrderInfoPage>();
        if(list!=null&&list.size()>0){
        	for(TestOrderInfoEntity entity:list){
        		try{
        		TestOrderInfoPage page=new TestOrderInfoPage();
        		   MyBeanUtils.copyBeanNotNull2Bean(entity,page);
            	    Object id0 = entity.getId();
				    String hql0 = "from TestOrderDetailInfoEntity where 1 = 1 AND oRDER_ID = ? ";
        	        List<TestOrderDetailInfoEntity> testOrderDetailInfoEntityList = systemService.findHql(hql0,id0);
            		page.setTestOrderDetailInfoList(testOrderDetailInfoEntityList);
            		pageList.add(page);
            	}catch(Exception e){
            		logger.info(e.getMessage());
            	}
            }
        }
        map.put(NormalExcelConstants.FILE_NAME,"订单表");
        map.put(NormalExcelConstants.CLASS,TestOrderInfoPage.class);
        map.put(NormalExcelConstants.PARAMS,new ExportParams("订单表列表", "导出人:Jeecg",
            "导出信息"));
        map.put(NormalExcelConstants.DATA_LIST,pageList);
        return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}

    /**
	 * 通过excel导入数据
	 * @param request
	 * @param
	 * @return
	 */
	@RequestMapping(params = "importExcel", method = RequestMethod.POST)
	@ResponseBody
	public AjaxJson importExcel(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson j = new AjaxJson();
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile file = entity.getValue();// 获取上传文件对象
			ImportParams params = new ImportParams();
			params.setTitleRows(2);
			params.setHeadRows(2);
			params.setNeedSave(true);
			try {
				List<TestOrderInfoPage> list =  ExcelImportUtil.importExcel(file.getInputStream(), TestOrderInfoPage.class, params);
				TestOrderInfoEntity entity1=null;
				for (TestOrderInfoPage page : list) {
					entity1=new TestOrderInfoEntity();
					MyBeanUtils.copyBeanNotNull2Bean(page,entity1);
		            testOrderInfoService.addMain(entity1, page.getTestOrderDetailInfoList());
				}
				j.setMsg("文件导入成功！");
			} catch (Exception e) {
				j.setMsg("文件导入失败！");
				logger.error(ExceptionUtil.getExceptionMessage(e));
			}finally{
				try {
					file.getInputStream().close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			}
			return j;
	}
	/**
	* 导出excel 使模板
	*/
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(ModelMap map) {
		map.put(NormalExcelConstants.FILE_NAME,"订单表");
		map.put(NormalExcelConstants.CLASS,TestOrderInfoPage.class);
		map.put(NormalExcelConstants.PARAMS,new ExportParams("订单表列表", "导出人:"+ ResourceUtil.getSessionUser().getRealName(),
		"导出信息"));
		map.put(NormalExcelConstants.DATA_LIST,new ArrayList());
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	* 导入功能跳转
	*
	* @return
	*/
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name", "testOrderInfoController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}

 	
 	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<TestOrderInfoEntity> list() {
		List<TestOrderInfoEntity> listTestOrderInfos=testOrderInfoService.getList(TestOrderInfoEntity.class);
		return listTestOrderInfos;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		TestOrderInfoEntity task = testOrderInfoService.get(TestOrderInfoEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}
 	
 	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody TestOrderInfoPage testOrderInfoPage, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TestOrderInfoPage>> failures = validator.validate(testOrderInfoPage);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		List<TestOrderDetailInfoEntity> testOrderDetailInfoList =  testOrderInfoPage.getTestOrderDetailInfoList();
		
		TestOrderInfoEntity testOrderInfo = new TestOrderInfoEntity();
		try{
			MyBeanUtils.copyBeanNotNull2Bean(testOrderInfo,testOrderInfoPage);
		}catch(Exception e){
            logger.info(e.getMessage());
        }
		testOrderInfoService.addMain(testOrderInfo, testOrderDetailInfoList);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = testOrderInfoPage.getId();
		URI uri = uriBuilder.path("/rest/testOrderInfoController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody TestOrderInfoPage testOrderInfoPage) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TestOrderInfoPage>> failures = validator.validate(testOrderInfoPage);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		List<TestOrderDetailInfoEntity> testOrderDetailInfoList =  testOrderInfoPage.getTestOrderDetailInfoList();
		
		TestOrderInfoEntity testOrderInfo = new TestOrderInfoEntity();
		try{
			MyBeanUtils.copyBeanNotNull2Bean(testOrderInfo,testOrderInfoPage);
		}catch(Exception e){
            logger.info(e.getMessage());
        }
		testOrderInfoService.updateMain(testOrderInfo, testOrderDetailInfoList);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		TestOrderInfoEntity testOrderInfo = testOrderInfoService.get(TestOrderInfoEntity.class, id);
		testOrderInfoService.delMain(testOrderInfo);
	}
}
