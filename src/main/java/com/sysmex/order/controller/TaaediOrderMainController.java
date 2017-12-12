package com.sysmex.order.controller;
import com.sysmex.order.entity.TaaediOrderMainEntity;
import com.sysmex.order.service.TaaediOrderMainServiceI;
import com.sysmex.order.page.TaaediOrderMainPage;
import com.sysmex.order.entity.TaaediOrderDetailEntity;
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
 * @Description: 采购订单主表
 * @author onlineGenerator
 * @date 2017-12-11 13:59:25
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/taaediOrderMainController")
public class TaaediOrderMainController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TaaediOrderMainController.class);

	@Autowired
	private TaaediOrderMainServiceI taaediOrderMainService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;

	/**
	 * 采购订单主表列表 页面跳转
	 *
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/sysmex/order/taaediOrderMainList");
	}

	/**
	 * easyui AJAX请求数据
	 *
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(TaaediOrderMainEntity taaediOrderMain,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TaaediOrderMainEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, taaediOrderMain);
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.taaediOrderMainService.getDataGridReturnByHql(cq,true);
		//this.taaediOrderMainService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 采购订单字表列表 页面跳转
	 *
	 * @return
	 */
	@RequestMapping(params = "listDetail")
	public ModelAndView listDetail(HttpServletRequest request) {
		return new ModelAndView("com/sysmex/order/taaediOrderListForDetail");
	}

	/**
	 * easyui AJAX请求数据
	 *
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param
	 */

	@RequestMapping(params = "datagridForDetail")
	public void datagridForDetail(TaaediOrderDetailEntity taaediOrderDetail,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TaaediOrderDetailEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, taaediOrderDetail);
		try{
			//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		//this.taaediOrderMainService.getDataGridReturnByHql(cq,true);
		this.taaediOrderMainService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除采购订单主表
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(TaaediOrderMainEntity taaediOrderMain, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		taaediOrderMain = systemService.getEntity(TaaediOrderMainEntity.class, taaediOrderMain.getId());
		String message = "采购订单主表删除成功";
		try{
			taaediOrderMainService.delMain(taaediOrderMain);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "采购订单主表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 批量删除采购订单主表
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		AjaxJson j = new AjaxJson();
		String message = "采购订单主表删除成功";
		try{
			for(String id:ids.split(",")){
				TaaediOrderMainEntity taaediOrderMain = systemService.getEntity(TaaediOrderMainEntity.class,
				id
				);
				taaediOrderMainService.delMain(taaediOrderMain);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "采购订单主表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 添加采购订单主表
	 * 
	 * @param
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(TaaediOrderMainEntity taaediOrderMain,TaaediOrderMainPage taaediOrderMainPage, HttpServletRequest request) {
		List<TaaediOrderDetailEntity> taaediOrderDetailList =  taaediOrderMainPage.getTaaediOrderDetailList();
		AjaxJson j = new AjaxJson();
		String message = "添加成功";
		try{
			taaediOrderMainService.addMain(taaediOrderMain, taaediOrderDetailList);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "采购订单主表添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	/**
	 * 更新采购订单主表
	 * 
	 * @param
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(TaaediOrderMainEntity taaediOrderMain,TaaediOrderMainPage taaediOrderMainPage, HttpServletRequest request) {
		List<TaaediOrderDetailEntity> taaediOrderDetailList =  taaediOrderMainPage.getTaaediOrderDetailList();
		AjaxJson j = new AjaxJson();
		String message = "更新成功";
		try{
			taaediOrderMainService.updateMain(taaediOrderMain, taaediOrderDetailList);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "更新采购订单主表失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 采购订单主表新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(TaaediOrderMainEntity taaediOrderMain, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(taaediOrderMain.getId())) {
			taaediOrderMain = taaediOrderMainService.getEntity(TaaediOrderMainEntity.class, taaediOrderMain.getId());
			req.setAttribute("taaediOrderMainPage", taaediOrderMain);
		}
		return new ModelAndView("com/sysmex/order/taaediOrderMain-add");
	}
	
	/**
	 * 采购订单主表编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(TaaediOrderMainEntity taaediOrderMain, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(taaediOrderMain.getId())) {
			taaediOrderMain = taaediOrderMainService.getEntity(TaaediOrderMainEntity.class, taaediOrderMain.getId());
			req.setAttribute("taaediOrderMainPage", taaediOrderMain);
		}
		return new ModelAndView("com/sysmex/order/taaediOrderMain-update");
	}
	
	
	/**
	 * 加载明细列表[采购订单明细]
	 * 
	 * @return
	 */
	@RequestMapping(params = "taaediOrderDetailList")
	public ModelAndView taaediOrderDetailList(TaaediOrderMainEntity taaediOrderMain, HttpServletRequest req) {
	
		//===================================================================================
		//获取参数
		Object mBillNo0 = taaediOrderMain.getMmBillNo();
		//===================================================================================
		//查询-采购订单明细
	    String hql0 = "from TaaediOrderDetailEntity where 1 = 1 AND mmBillNo = ? ";
	    try{
	    	List<TaaediOrderDetailEntity> taaediOrderDetailEntityList = systemService.findHql(hql0,mBillNo0);
			req.setAttribute("taaediOrderDetailList", taaediOrderDetailEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("com/sysmex/order/taaediOrderDetailList");
	}

    /**
    * 导出excel
    *
    * @param request
    * @param response
    */
    @RequestMapping(params = "exportXls")
    public String exportXls(TaaediOrderMainEntity taaediOrderMain,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid,ModelMap map) {
    	CriteriaQuery cq = new CriteriaQuery(TaaediOrderMainEntity.class, dataGrid);
    	//查询条件组装器
    	org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, taaediOrderMain);
    	try{
    	//自定义追加查询条件
    	}catch (Exception e) {
    		throw new BusinessException(e.getMessage());
    	}
    	cq.add();
    	List<TaaediOrderMainEntity> list=this.taaediOrderMainService.getListByCriteriaQuery(cq, false);
    	List<TaaediOrderMainPage> pageList=new ArrayList<TaaediOrderMainPage>();
        if(list!=null&&list.size()>0){
        	for(TaaediOrderMainEntity entity:list){
        		try{
        		TaaediOrderMainPage page=new TaaediOrderMainPage();
        		   MyBeanUtils.copyBeanNotNull2Bean(entity,page);
           		    Object mBillNo0 = entity.getMmBillNo();
				    String hql0 = "from TaaediOrderDetailEntity where 1 = 1 AND mBillNo = ? ";
        	        List<TaaediOrderDetailEntity> taaediOrderDetailEntityList = systemService.findHql(hql0,mBillNo0);
            		page.setTaaediOrderDetailList(taaediOrderDetailEntityList);
            		pageList.add(page);
            	}catch(Exception e){
            		logger.info(e.getMessage());
            	}
            }
        }
        map.put(NormalExcelConstants.FILE_NAME,"采购订单主表");
        map.put(NormalExcelConstants.CLASS,TaaediOrderMainPage.class);
        map.put(NormalExcelConstants.PARAMS,new ExportParams("采购订单主表列表", "导出人:Jeecg",
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
				List<TaaediOrderMainPage> list =  ExcelImportUtil.importExcel(file.getInputStream(), TaaediOrderMainPage.class, params);
				TaaediOrderMainEntity entity1=null;
				for (TaaediOrderMainPage page : list) {
					entity1=new TaaediOrderMainEntity();
					MyBeanUtils.copyBeanNotNull2Bean(page,entity1);
		            taaediOrderMainService.addMain(entity1, page.getTaaediOrderDetailList());
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
		map.put(NormalExcelConstants.FILE_NAME,"采购订单主表");
		map.put(NormalExcelConstants.CLASS,TaaediOrderMainPage.class);
		map.put(NormalExcelConstants.PARAMS,new ExportParams("采购订单主表列表", "导出人:"+ ResourceUtil.getSessionUser().getRealName(),
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
		req.setAttribute("controller_name", "taaediOrderMainController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}

 	
 	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<TaaediOrderMainEntity> list() {
		List<TaaediOrderMainEntity> listTaaediOrderMains=taaediOrderMainService.getList(TaaediOrderMainEntity.class);
		return listTaaediOrderMains;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		TaaediOrderMainEntity task = taaediOrderMainService.get(TaaediOrderMainEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}
 	
 	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody TaaediOrderMainPage taaediOrderMainPage, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TaaediOrderMainPage>> failures = validator.validate(taaediOrderMainPage);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		List<TaaediOrderDetailEntity> taaediOrderDetailList =  taaediOrderMainPage.getTaaediOrderDetailList();
		
		TaaediOrderMainEntity taaediOrderMain = new TaaediOrderMainEntity();
		try{
			MyBeanUtils.copyBeanNotNull2Bean(taaediOrderMain,taaediOrderMainPage);
		}catch(Exception e){
            logger.info(e.getMessage());
        }
		taaediOrderMainService.addMain(taaediOrderMain, taaediOrderDetailList);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = taaediOrderMainPage.getId();
		URI uri = uriBuilder.path("/rest/taaediOrderMainController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody TaaediOrderMainPage taaediOrderMainPage) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TaaediOrderMainPage>> failures = validator.validate(taaediOrderMainPage);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		List<TaaediOrderDetailEntity> taaediOrderDetailList =  taaediOrderMainPage.getTaaediOrderDetailList();
		
		TaaediOrderMainEntity taaediOrderMain = new TaaediOrderMainEntity();
		try{
			MyBeanUtils.copyBeanNotNull2Bean(taaediOrderMain,taaediOrderMainPage);
		}catch(Exception e){
            logger.info(e.getMessage());
        }
		taaediOrderMainService.updateMain(taaediOrderMain, taaediOrderDetailList);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		TaaediOrderMainEntity taaediOrderMain = taaediOrderMainService.get(TaaediOrderMainEntity.class, id);
		taaediOrderMainService.delMain(taaediOrderMain);
	}
}
