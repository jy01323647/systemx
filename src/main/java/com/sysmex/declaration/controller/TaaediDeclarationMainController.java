package com.sysmex.declaration.controller;
import com.sysmex.declaration.entity.TaaediDeclarationMainEntity;
import com.sysmex.declaration.service.TaaediDeclarationMainServiceI;
import com.sysmex.declaration.page.TaaediDeclarationMainPage;
import com.sysmex.declaration.entity.TaaediDeclarationPackDetailEntity;
import com.sysmex.declaration.entity.TaaediDeclarationDetailEntity;
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
 * @Description: 报关单主表
 * @author onlineGenerator
 * @date 2017-12-12 17:52:49
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/taaediDeclarationMainController")
public class TaaediDeclarationMainController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TaaediDeclarationMainController.class);

	@Autowired
	private TaaediDeclarationMainServiceI taaediDeclarationMainService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;

	/**
	 * 报关单主表列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/sysmex/declaration/taaediDeclarationMainList");
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
	public void datagrid(TaaediDeclarationMainEntity taaediDeclarationMain,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TaaediDeclarationMainEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, taaediDeclarationMain);
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.taaediDeclarationMainService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除报关单主表
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(TaaediDeclarationMainEntity taaediDeclarationMain, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		taaediDeclarationMain = systemService.getEntity(TaaediDeclarationMainEntity.class, taaediDeclarationMain.getId());
		String message = "报关单主表删除成功";
		try{
			taaediDeclarationMainService.delMain(taaediDeclarationMain);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "报关单主表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 批量删除报关单主表
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		AjaxJson j = new AjaxJson();
		String message = "报关单主表删除成功";
		try{
			for(String id:ids.split(",")){
				TaaediDeclarationMainEntity taaediDeclarationMain = systemService.getEntity(TaaediDeclarationMainEntity.class,
				id
				);
				taaediDeclarationMainService.delMain(taaediDeclarationMain);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "报关单主表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 添加报关单主表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(TaaediDeclarationMainEntity taaediDeclarationMain,TaaediDeclarationMainPage taaediDeclarationMainPage, HttpServletRequest request) {
		List<TaaediDeclarationPackDetailEntity> taaediDeclarationPackDetailList =  taaediDeclarationMainPage.getTaaediDeclarationPackDetailList();
		List<TaaediDeclarationDetailEntity> taaediDeclarationDetailList =  taaediDeclarationMainPage.getTaaediDeclarationDetailList();
		AjaxJson j = new AjaxJson();
		String message = "添加成功";
		try{
			taaediDeclarationMainService.addMain(taaediDeclarationMain, taaediDeclarationPackDetailList,taaediDeclarationDetailList);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "报关单主表添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	/**
	 * 更新报关单主表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(TaaediDeclarationMainEntity taaediDeclarationMain,TaaediDeclarationMainPage taaediDeclarationMainPage, HttpServletRequest request) {
		List<TaaediDeclarationPackDetailEntity> taaediDeclarationPackDetailList =  taaediDeclarationMainPage.getTaaediDeclarationPackDetailList();
		List<TaaediDeclarationDetailEntity> taaediDeclarationDetailList =  taaediDeclarationMainPage.getTaaediDeclarationDetailList();
		AjaxJson j = new AjaxJson();
		String message = "更新成功";
		try{
			taaediDeclarationMainService.updateMain(taaediDeclarationMain, taaediDeclarationPackDetailList,taaediDeclarationDetailList);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "更新报关单主表失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 报关单主表新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(TaaediDeclarationMainEntity taaediDeclarationMain, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(taaediDeclarationMain.getId())) {
			taaediDeclarationMain = taaediDeclarationMainService.getEntity(TaaediDeclarationMainEntity.class, taaediDeclarationMain.getId());
			req.setAttribute("taaediDeclarationMainPage", taaediDeclarationMain);
		}
		return new ModelAndView("com/sysmex/declaration/taaediDeclarationMain-add");
	}
	
	/**
	 * 报关单主表编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(TaaediDeclarationMainEntity taaediDeclarationMain, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(taaediDeclarationMain.getId())) {
			taaediDeclarationMain = taaediDeclarationMainService.getEntity(TaaediDeclarationMainEntity.class, taaediDeclarationMain.getId());
			req.setAttribute("taaediDeclarationMainPage", taaediDeclarationMain);
		}
		return new ModelAndView("com/sysmex/declaration/taaediDeclarationMain-update");
	}
	
	
	/**
	 * 加载明细列表[报关箱单明细]
	 * 
	 * @return
	 */
	@RequestMapping(params = "taaediDeclarationPackDetailList")
	public ModelAndView taaediDeclarationPackDetailList(TaaediDeclarationMainEntity taaediDeclarationMain, HttpServletRequest req) {
	
		//===================================================================================
		//获取参数
		Object id0 = taaediDeclarationMain.getId();
		//===================================================================================
		//查询-报关箱单明细
	    String hql0 = "from TaaediDeclarationPackDetailEntity where 1 = 1 AND mAIN_ID = ? ";
	    try{
	    	List<TaaediDeclarationPackDetailEntity> taaediDeclarationPackDetailEntityList = systemService.findHql(hql0,id0);
			req.setAttribute("taaediDeclarationPackDetailList", taaediDeclarationPackDetailEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("com/sysmex/declaration/taaediDeclarationPackDetailList");
	}
	/**
	 * 加载明细列表[报关明细]
	 * 
	 * @return
	 */
	@RequestMapping(params = "taaediDeclarationDetailList")
	public ModelAndView taaediDeclarationDetailList(TaaediDeclarationMainEntity taaediDeclarationMain, HttpServletRequest req) {
	
		//===================================================================================
		//获取参数
		Object id1 = taaediDeclarationMain.getId();
		//===================================================================================
		//查询-报关明细
	    String hql1 = "from TaaediDeclarationDetailEntity where 1 = 1 AND mAIN_ID = ? ";
	    try{
	    	List<TaaediDeclarationDetailEntity> taaediDeclarationDetailEntityList = systemService.findHql(hql1,id1);
			req.setAttribute("taaediDeclarationDetailList", taaediDeclarationDetailEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("com/sysmex/declaration/taaediDeclarationDetailList");
	}

    /**
    * 导出excel
    *
    * @param request
    * @param response
    */
    @RequestMapping(params = "exportXls")
    public String exportXls(TaaediDeclarationMainEntity taaediDeclarationMain,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid,ModelMap map) {
    	CriteriaQuery cq = new CriteriaQuery(TaaediDeclarationMainEntity.class, dataGrid);
    	//查询条件组装器
    	org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, taaediDeclarationMain);
    	try{
    	//自定义追加查询条件
    	}catch (Exception e) {
    		throw new BusinessException(e.getMessage());
    	}
    	cq.add();
    	List<TaaediDeclarationMainEntity> list=this.taaediDeclarationMainService.getListByCriteriaQuery(cq, false);
    	List<TaaediDeclarationMainPage> pageList=new ArrayList<TaaediDeclarationMainPage>();
        if(list!=null&&list.size()>0){
        	for(TaaediDeclarationMainEntity entity:list){
        		try{
        		TaaediDeclarationMainPage page=new TaaediDeclarationMainPage();
        		   MyBeanUtils.copyBeanNotNull2Bean(entity,page);
            	    Object id0 = entity.getId();
				    String hql0 = "from TaaediDeclarationPackDetailEntity where 1 = 1 AND mAIN_ID = ? ";
        	        List<TaaediDeclarationPackDetailEntity> taaediDeclarationPackDetailEntityList = systemService.findHql(hql0,id0);
            		page.setTaaediDeclarationPackDetailList(taaediDeclarationPackDetailEntityList);
            	    Object id1 = entity.getId();
				    String hql1 = "from TaaediDeclarationDetailEntity where 1 = 1 AND mAIN_ID = ? ";
        	        List<TaaediDeclarationDetailEntity> taaediDeclarationDetailEntityList = systemService.findHql(hql1,id1);
            		page.setTaaediDeclarationDetailList(taaediDeclarationDetailEntityList);
            		pageList.add(page);
            	}catch(Exception e){
            		logger.info(e.getMessage());
            	}
            }
        }
        map.put(NormalExcelConstants.FILE_NAME,"报关单主表");
        map.put(NormalExcelConstants.CLASS,TaaediDeclarationMainPage.class);
        map.put(NormalExcelConstants.PARAMS,new ExportParams("报关单主表列表", "导出人:Jeecg",
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
				List<TaaediDeclarationMainPage> list =  ExcelImportUtil.importExcel(file.getInputStream(), TaaediDeclarationMainPage.class, params);
				TaaediDeclarationMainEntity entity1=null;
				for (TaaediDeclarationMainPage page : list) {
					entity1=new TaaediDeclarationMainEntity();
					MyBeanUtils.copyBeanNotNull2Bean(page,entity1);
		            taaediDeclarationMainService.addMain(entity1, page.getTaaediDeclarationPackDetailList(),page.getTaaediDeclarationDetailList());
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
		map.put(NormalExcelConstants.FILE_NAME,"报关单主表");
		map.put(NormalExcelConstants.CLASS,TaaediDeclarationMainPage.class);
		map.put(NormalExcelConstants.PARAMS,new ExportParams("报关单主表列表", "导出人:"+ ResourceUtil.getSessionUser().getRealName(),
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
		req.setAttribute("controller_name", "taaediDeclarationMainController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}

 	
 	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<TaaediDeclarationMainEntity> list() {
		List<TaaediDeclarationMainEntity> listTaaediDeclarationMains=taaediDeclarationMainService.getList(TaaediDeclarationMainEntity.class);
		return listTaaediDeclarationMains;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		TaaediDeclarationMainEntity task = taaediDeclarationMainService.get(TaaediDeclarationMainEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}
 	
 	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody TaaediDeclarationMainPage taaediDeclarationMainPage, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TaaediDeclarationMainPage>> failures = validator.validate(taaediDeclarationMainPage);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		List<TaaediDeclarationPackDetailEntity> taaediDeclarationPackDetailList =  taaediDeclarationMainPage.getTaaediDeclarationPackDetailList();
		List<TaaediDeclarationDetailEntity> taaediDeclarationDetailList =  taaediDeclarationMainPage.getTaaediDeclarationDetailList();
		
		TaaediDeclarationMainEntity taaediDeclarationMain = new TaaediDeclarationMainEntity();
		try{
			MyBeanUtils.copyBeanNotNull2Bean(taaediDeclarationMain,taaediDeclarationMainPage);
		}catch(Exception e){
            logger.info(e.getMessage());
        }
		taaediDeclarationMainService.addMain(taaediDeclarationMain, taaediDeclarationPackDetailList,taaediDeclarationDetailList);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = taaediDeclarationMainPage.getId();
		URI uri = uriBuilder.path("/rest/taaediDeclarationMainController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody TaaediDeclarationMainPage taaediDeclarationMainPage) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TaaediDeclarationMainPage>> failures = validator.validate(taaediDeclarationMainPage);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		List<TaaediDeclarationPackDetailEntity> taaediDeclarationPackDetailList =  taaediDeclarationMainPage.getTaaediDeclarationPackDetailList();
		List<TaaediDeclarationDetailEntity> taaediDeclarationDetailList =  taaediDeclarationMainPage.getTaaediDeclarationDetailList();
		
		TaaediDeclarationMainEntity taaediDeclarationMain = new TaaediDeclarationMainEntity();
		try{
			MyBeanUtils.copyBeanNotNull2Bean(taaediDeclarationMain,taaediDeclarationMainPage);
		}catch(Exception e){
            logger.info(e.getMessage());
        }
		taaediDeclarationMainService.updateMain(taaediDeclarationMain, taaediDeclarationPackDetailList,taaediDeclarationDetailList);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		TaaediDeclarationMainEntity taaediDeclarationMain = taaediDeclarationMainService.get(TaaediDeclarationMainEntity.class, id);
		taaediDeclarationMainService.delMain(taaediDeclarationMain);
	}
}
