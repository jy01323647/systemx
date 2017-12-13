package com.sysmex.invoicepack.controller;
import com.sysmex.invoicepack.entity.TaaediInvoiceMainEntity;
import com.sysmex.invoicepack.service.TaaediInvoiceMainServiceI;
import com.sysmex.invoicepack.page.TaaediInvoiceMainPage;
import com.sysmex.invoicepack.entity.TaaediInvoiceDetailEntity;
import com.sysmex.invoicepack.entity.TaaediInvoicePackDetailEntity;
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
 * @Description: 发票主表
 * @author onlineGenerator
 * @date 2017-12-13 12:31:54
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/taaediInvoiceMainController")
public class TaaediInvoiceMainController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TaaediInvoiceMainController.class);

	@Autowired
	private TaaediInvoiceMainServiceI taaediInvoiceMainService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;

	/**
	 * 发票主表列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/sysmex/invoicepack/taaediInvoiceMainList");
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
	public void datagrid(TaaediInvoiceMainEntity taaediInvoiceMain,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TaaediInvoiceMainEntity.class, dataGrid);
		//查询条件组装器
		//org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, taaediInvoiceMain);
		cq.setMap(org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installQueryParams(taaediInvoiceMain));
		try{
		//自定义追加查询条件
		String query_invioceDate_begin = request.getParameter("invioceDate_begin");
		String query_invioceDate_end = request.getParameter("invioceDate_end");
		if(StringUtil.isNotEmpty(query_invioceDate_begin)){
			cq.ge("invioceDate", Integer.parseInt(query_invioceDate_begin));
		}
		if(StringUtil.isNotEmpty(query_invioceDate_end)){
			cq.le("invioceDate", Integer.parseInt(query_invioceDate_end));
		}
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.taaediInvoiceMainService.getDataGridBySql(cq,true);
		//this.taaediInvoiceMainService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除发票主表
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(TaaediInvoiceMainEntity taaediInvoiceMain, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		taaediInvoiceMain = systemService.getEntity(TaaediInvoiceMainEntity.class, taaediInvoiceMain.getId());
		String message = "发票主表删除成功";
		try{
			taaediInvoiceMainService.delMain(taaediInvoiceMain);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "发票主表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 批量删除发票主表
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		AjaxJson j = new AjaxJson();
		String message = "发票主表删除成功";
		try{
			for(String id:ids.split(",")){
				TaaediInvoiceMainEntity taaediInvoiceMain = systemService.getEntity(TaaediInvoiceMainEntity.class,
				id
				);
				taaediInvoiceMainService.delMain(taaediInvoiceMain);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "发票主表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 添加发票主表
	 * 
	 * @param 
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(TaaediInvoiceMainEntity taaediInvoiceMain,TaaediInvoiceMainPage taaediInvoiceMainPage, HttpServletRequest request) {
		List<TaaediInvoiceDetailEntity> taaediInvoiceDetailList =  taaediInvoiceMainPage.getTaaediInvoiceDetailList();
		List<TaaediInvoicePackDetailEntity> taaediInvoicePackDetailList =  taaediInvoiceMainPage.getTaaediInvoicePackDetailList();
		AjaxJson j = new AjaxJson();
		String message = "添加成功";
		try{
			taaediInvoiceMainService.addMain(taaediInvoiceMain, taaediInvoiceDetailList,taaediInvoicePackDetailList);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "发票主表添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	/**
	 * 更新发票主表
	 * 
	 * @param 
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(TaaediInvoiceMainEntity taaediInvoiceMain,TaaediInvoiceMainPage taaediInvoiceMainPage, HttpServletRequest request) {
		List<TaaediInvoiceDetailEntity> taaediInvoiceDetailList =  taaediInvoiceMainPage.getTaaediInvoiceDetailList();
		List<TaaediInvoicePackDetailEntity> taaediInvoicePackDetailList =  taaediInvoiceMainPage.getTaaediInvoicePackDetailList();
		AjaxJson j = new AjaxJson();
		String message = "更新成功";
		try{
			taaediInvoiceMainService.updateMain(taaediInvoiceMain, taaediInvoiceDetailList,taaediInvoicePackDetailList);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "更新发票主表失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 发票主表新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(TaaediInvoiceMainEntity taaediInvoiceMain, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(taaediInvoiceMain.getId())) {
			taaediInvoiceMain = taaediInvoiceMainService.getEntity(TaaediInvoiceMainEntity.class, taaediInvoiceMain.getId());
			req.setAttribute("taaediInvoiceMainPage", taaediInvoiceMain);
		}
		return new ModelAndView("com/sysmex/invoicepack/taaediInvoiceMain-add");
	}
	
	/**
	 * 发票主表编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(TaaediInvoiceMainEntity taaediInvoiceMain, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(taaediInvoiceMain.getId())) {
			taaediInvoiceMain = taaediInvoiceMainService.getEntity(TaaediInvoiceMainEntity.class, taaediInvoiceMain.getId());
			req.setAttribute("taaediInvoiceMainPage", taaediInvoiceMain);
		}
		return new ModelAndView("com/sysmex/invoicepack/taaediInvoiceMain-update");
	}
	
	
	/**
	 * 加载明细列表[TaaediInvoiceDetail]
	 * 
	 * @return
	 */
	@RequestMapping(params = "taaediInvoiceDetailList")
	public ModelAndView taaediInvoiceDetailList(TaaediInvoiceMainEntity taaediInvoiceMain, HttpServletRequest req) {
	
		//===================================================================================
		//获取参数
		Object iNVOICE_NO0 = taaediInvoiceMain.getInvioceNo();
		//===================================================================================
		//查询-TaaediInvoiceDetail
	    String hql0 = "from TaaediInvoiceDetailEntity where 1 = 1 AND iNVOICE_NO = ? ";
	    try{
	    	List<TaaediInvoiceDetailEntity> taaediInvoiceDetailEntityList = systemService.findHql(hql0,iNVOICE_NO0);
			req.setAttribute("taaediInvoiceDetailList", taaediInvoiceDetailEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("com/sysmex/invoicepack/taaediInvoiceDetailList");
	}
	/**
	 * 加载明细列表[TaaediInvoicePackDetail]
	 * 
	 * @return
	 */
	@RequestMapping(params = "taaediInvoicePackDetailList")
	public ModelAndView taaediInvoicePackDetailList(TaaediInvoiceMainEntity taaediInvoiceMain, HttpServletRequest req) {
	
		//===================================================================================
		//获取参数
		//Object bILL_NO1 = taaediInvoiceMain.getBILL_NO();
		Object iNVOICE_NO1 = taaediInvoiceMain.getInvioceNo();
		//===================================================================================
		//查询-TaaediInvoicePackDetail
	    String hql1 = "from TaaediInvoicePackDetailEntity where 1 = 1  AND iNVOICE_NO = ? ";
	    try{
	    	List<TaaediInvoicePackDetailEntity> taaediInvoicePackDetailEntityList = systemService.findHql(hql1,iNVOICE_NO1);
			req.setAttribute("taaediInvoicePackDetailList", taaediInvoicePackDetailEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("com/sysmex/invoicepack/taaediInvoicePackDetailList");
	}

    /**
    * 导出excel
    *
    * @param request
    * @param response
    */
    @RequestMapping(params = "exportXls")
    public String exportXls(TaaediInvoiceMainEntity taaediInvoiceMain,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid,ModelMap map) {
    	CriteriaQuery cq = new CriteriaQuery(TaaediInvoiceMainEntity.class, dataGrid);
    	//查询条件组装器
    	org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, taaediInvoiceMain);
    	try{
    	//自定义追加查询条件
    	}catch (Exception e) {
    		throw new BusinessException(e.getMessage());
    	}
    	cq.add();
    	List<TaaediInvoiceMainEntity> list=this.taaediInvoiceMainService.getListByCriteriaQuery(cq, false);
    	List<TaaediInvoiceMainPage> pageList=new ArrayList<TaaediInvoiceMainPage>();
        if(list!=null&&list.size()>0){
        	for(TaaediInvoiceMainEntity entity:list){
        		try{
        		TaaediInvoiceMainPage page=new TaaediInvoiceMainPage();
        		   MyBeanUtils.copyBeanNotNull2Bean(entity,page);
           		    Object iNVOICE_NO0 = entity.getInvioceNo();
				    String hql0 = "from TaaediInvoiceDetailEntity where 1 = 1 AND iNVOICE_NO = ? ";
        	        List<TaaediInvoiceDetailEntity> taaediInvoiceDetailEntityList = systemService.findHql(hql0,iNVOICE_NO0);
            		page.setTaaediInvoiceDetailList(taaediInvoiceDetailEntityList);

           		    Object iNVOICE_NO1 = entity.getInvioceNo();
				    String hql1 = "from TaaediInvoicePackDetailEntity where 1 = 1   AND iNVOICE_NO = ? ";
        	        List<TaaediInvoicePackDetailEntity> taaediInvoicePackDetailEntityList = systemService.findHql(hql1,iNVOICE_NO1);
            		page.setTaaediInvoicePackDetailList(taaediInvoicePackDetailEntityList);
            		pageList.add(page);
            	}catch(Exception e){
            		logger.info(e.getMessage());
            	}
            }
        }
        map.put(NormalExcelConstants.FILE_NAME,"发票主表");
        map.put(NormalExcelConstants.CLASS,TaaediInvoiceMainPage.class);
        map.put(NormalExcelConstants.PARAMS,new ExportParams("发票主表列表", "导出人:Jeecg",
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
				List<TaaediInvoiceMainPage> list =  ExcelImportUtil.importExcel(file.getInputStream(), TaaediInvoiceMainPage.class, params);
				TaaediInvoiceMainEntity entity1=null;
				for (TaaediInvoiceMainPage page : list) {
					entity1=new TaaediInvoiceMainEntity();
					MyBeanUtils.copyBeanNotNull2Bean(page,entity1);
		            taaediInvoiceMainService.addMain(entity1, page.getTaaediInvoiceDetailList(),page.getTaaediInvoicePackDetailList());
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
		map.put(NormalExcelConstants.FILE_NAME,"发票主表");
		map.put(NormalExcelConstants.CLASS,TaaediInvoiceMainPage.class);
		map.put(NormalExcelConstants.PARAMS,new ExportParams("发票主表列表", "导出人:"+ ResourceUtil.getSessionUser().getRealName(),
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
		req.setAttribute("controller_name", "taaediInvoiceMainController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}

 	
 	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<TaaediInvoiceMainEntity> list() {
		List<TaaediInvoiceMainEntity> listTaaediInvoiceMains=taaediInvoiceMainService.getList(TaaediInvoiceMainEntity.class);
		return listTaaediInvoiceMains;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		TaaediInvoiceMainEntity task = taaediInvoiceMainService.get(TaaediInvoiceMainEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}
 	
 	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody TaaediInvoiceMainPage taaediInvoiceMainPage, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TaaediInvoiceMainPage>> failures = validator.validate(taaediInvoiceMainPage);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		List<TaaediInvoiceDetailEntity> taaediInvoiceDetailList =  taaediInvoiceMainPage.getTaaediInvoiceDetailList();
		List<TaaediInvoicePackDetailEntity> taaediInvoicePackDetailList =  taaediInvoiceMainPage.getTaaediInvoicePackDetailList();
		
		TaaediInvoiceMainEntity taaediInvoiceMain = new TaaediInvoiceMainEntity();
		try{
			MyBeanUtils.copyBeanNotNull2Bean(taaediInvoiceMain,taaediInvoiceMainPage);
		}catch(Exception e){
            logger.info(e.getMessage());
        }
		taaediInvoiceMainService.addMain(taaediInvoiceMain, taaediInvoiceDetailList,taaediInvoicePackDetailList);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = taaediInvoiceMainPage.getId();
		URI uri = uriBuilder.path("/rest/taaediInvoiceMainController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody TaaediInvoiceMainPage taaediInvoiceMainPage) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TaaediInvoiceMainPage>> failures = validator.validate(taaediInvoiceMainPage);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		List<TaaediInvoiceDetailEntity> taaediInvoiceDetailList =  taaediInvoiceMainPage.getTaaediInvoiceDetailList();
		List<TaaediInvoicePackDetailEntity> taaediInvoicePackDetailList =  taaediInvoiceMainPage.getTaaediInvoicePackDetailList();
		
		TaaediInvoiceMainEntity taaediInvoiceMain = new TaaediInvoiceMainEntity();
		try{
			MyBeanUtils.copyBeanNotNull2Bean(taaediInvoiceMain,taaediInvoiceMainPage);
		}catch(Exception e){
            logger.info(e.getMessage());
        }
		taaediInvoiceMainService.updateMain(taaediInvoiceMain, taaediInvoiceDetailList,taaediInvoicePackDetailList);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		TaaediInvoiceMainEntity taaediInvoiceMain = taaediInvoiceMainService.get(TaaediInvoiceMainEntity.class, id);
		taaediInvoiceMainService.delMain(taaediInvoiceMain);
	}
}
