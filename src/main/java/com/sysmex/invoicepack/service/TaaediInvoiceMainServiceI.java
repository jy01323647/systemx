package com.sysmex.invoicepack.service;
import com.sysmex.invoicepack.entity.TaaediInvoiceMainEntity;
import com.sysmex.invoicepack.entity.TaaediInvoiceDetailEntity;
import com.sysmex.invoicepack.entity.TaaediInvoicePackDetailEntity;

import java.util.List;

import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.service.CommonService;
import java.io.Serializable;

public interface TaaediInvoiceMainServiceI extends CommonService{
	
 	public <T> void delete(T entity);
	/**
	 * 添加一对多
	 * 
	 */
	public void addMain(TaaediInvoiceMainEntity taaediInvoiceMain,
	        List<TaaediInvoiceDetailEntity> taaediInvoiceDetailList,List<TaaediInvoicePackDetailEntity> taaediInvoicePackDetailList) ;
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(TaaediInvoiceMainEntity taaediInvoiceMain,
	        List<TaaediInvoiceDetailEntity> taaediInvoiceDetailList,List<TaaediInvoicePackDetailEntity> taaediInvoicePackDetailList);
	public void delMain (TaaediInvoiceMainEntity taaediInvoiceMain);
	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(TaaediInvoiceMainEntity t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(TaaediInvoiceMainEntity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(TaaediInvoiceMainEntity t);

	public void getDataGridBySql(CriteriaQuery cq, boolean b);
}
