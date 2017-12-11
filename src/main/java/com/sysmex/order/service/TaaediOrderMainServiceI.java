package com.sysmex.order.service;
import com.sysmex.order.entity.TaaediOrderMainEntity;
import com.sysmex.order.entity.TaaediOrderDetailEntity;

import java.util.List;

import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.service.CommonService;
import java.io.Serializable;

public interface TaaediOrderMainServiceI extends CommonService{
	
 	public <T> void delete(T entity);
	/**
	 * 添加一对多
	 * 
	 */
	public void addMain(TaaediOrderMainEntity taaediOrderMain,
	        List<TaaediOrderDetailEntity> taaediOrderDetailList) ;
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(TaaediOrderMainEntity taaediOrderMain,
	        List<TaaediOrderDetailEntity> taaediOrderDetailList);
	public void delMain (TaaediOrderMainEntity taaediOrderMain);
	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(TaaediOrderMainEntity t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(TaaediOrderMainEntity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(TaaediOrderMainEntity t);


	public void  getDataGridReturnByHql(CriteriaQuery cq , boolean isOffset);
}
