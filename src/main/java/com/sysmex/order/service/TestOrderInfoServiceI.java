package com.sysmex.order.service;
import com.sysmex.order.entity.TestOrderInfoEntity;
import com.sysmex.order.entity.TestOrderDetailInfoEntity;

import java.util.List;
import org.jeecgframework.core.common.service.CommonService;
import java.io.Serializable;

public interface TestOrderInfoServiceI extends CommonService{
	
 	public <T> void delete(T entity);
	/**
	 * 添加一对多
	 * 
	 */
	public void addMain(TestOrderInfoEntity testOrderInfo,
	        List<TestOrderDetailInfoEntity> testOrderDetailInfoList) ;
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(TestOrderInfoEntity testOrderInfo,
	        List<TestOrderDetailInfoEntity> testOrderDetailInfoList);
	public void delMain (TestOrderInfoEntity testOrderInfo);
	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(TestOrderInfoEntity t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(TestOrderInfoEntity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(TestOrderInfoEntity t);
}
