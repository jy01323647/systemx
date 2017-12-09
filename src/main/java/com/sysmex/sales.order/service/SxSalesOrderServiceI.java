package com.sysmex.sales.order.service;
import com.sysmex.sales.order.entity.SxSalesOrderEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface SxSalesOrderServiceI extends CommonService{
	
 	public void delete(SxSalesOrderEntity entity) throws Exception;
 	
 	public Serializable save(SxSalesOrderEntity entity) throws Exception;
 	
 	public void saveOrUpdate(SxSalesOrderEntity entity) throws Exception;
 	
}
