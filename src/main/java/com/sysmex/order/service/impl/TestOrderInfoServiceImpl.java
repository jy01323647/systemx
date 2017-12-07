package com.sysmex.order.service.impl;
import com.sysmex.order.service.TestOrderInfoServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.sysmex.order.entity.TestOrderInfoEntity;
import com.sysmex.order.entity.TestOrderDetailInfoEntity;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;
import java.util.ArrayList;
import java.util.UUID;
import java.io.Serializable;


@Service("testOrderInfoService")
@Transactional
public class TestOrderInfoServiceImpl extends CommonServiceImpl implements TestOrderInfoServiceI {
	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((TestOrderInfoEntity)entity);
 	}
	
	public void addMain(TestOrderInfoEntity testOrderInfo,
	        List<TestOrderDetailInfoEntity> testOrderDetailInfoList){
			//保存主信息
			this.save(testOrderInfo);
		
			/**保存-订单明细*/
			for(TestOrderDetailInfoEntity testOrderDetailInfo:testOrderDetailInfoList){
				//外键设置
				testOrderDetailInfo.setOrderId(testOrderInfo.getId());
				this.save(testOrderDetailInfo);
			}
			//执行新增操作配置的sql增强
 			this.doAddSql(testOrderInfo);
	}

	
	public void updateMain(TestOrderInfoEntity testOrderInfo,
	        List<TestOrderDetailInfoEntity> testOrderDetailInfoList) {
		//保存主表信息
		if(StringUtil.isNotEmpty(testOrderInfo.getId())){
			try {
				TestOrderInfoEntity temp = findUniqueByProperty(TestOrderInfoEntity.class, "id", testOrderInfo.getId());
				MyBeanUtils.copyBeanNotNull2Bean(testOrderInfo, temp);
				this.saveOrUpdate(temp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			this.saveOrUpdate(testOrderInfo);
		}
		//===================================================================================
		//获取参数
		Object id0 = testOrderInfo.getId();
		//===================================================================================
		//1.查询出数据库的明细数据-订单明细
	    String hql0 = "from TestOrderDetailInfoEntity where 1 = 1 AND oRDER_ID = ? ";
	    List<TestOrderDetailInfoEntity> testOrderDetailInfoOldList = this.findHql(hql0,id0);
		//2.筛选更新明细数据-订单明细
		if(testOrderDetailInfoList!=null&&testOrderDetailInfoList.size()>0){
		for(TestOrderDetailInfoEntity oldE:testOrderDetailInfoOldList){
			boolean isUpdate = false;
				for(TestOrderDetailInfoEntity sendE:testOrderDetailInfoList){
					//需要更新的明细数据-订单明细
					if(oldE.getId().equals(sendE.getId())){
		    			try {
							MyBeanUtils.copyBeanNotNull2Bean(sendE,oldE);
							this.saveOrUpdate(oldE);
						} catch (Exception e) {
							e.printStackTrace();
							throw new BusinessException(e.getMessage());
						}
						isUpdate= true;
		    			break;
		    		}
		    	}
	    		if(!isUpdate){
		    		//如果数据库存在的明细，前台没有传递过来则是删除-订单明细
		    		super.delete(oldE);
	    		}
	    		
			}
			//3.持久化新增的数据-订单明细
			for(TestOrderDetailInfoEntity testOrderDetailInfo:testOrderDetailInfoList){
				if(oConvertUtils.isEmpty(testOrderDetailInfo.getId())){
					//外键设置
					testOrderDetailInfo.setOrderId(testOrderInfo.getId());
					this.save(testOrderDetailInfo);
				}
			}
		}
		//执行更新操作配置的sql增强
 		this.doUpdateSql(testOrderInfo);
	}

	
	public void delMain(TestOrderInfoEntity testOrderInfo) {
		//删除主表信息
		this.delete(testOrderInfo);
		//===================================================================================
		//获取参数
		Object id0 = testOrderInfo.getId();
		//===================================================================================
		//删除-订单明细
	    String hql0 = "from TestOrderDetailInfoEntity where 1 = 1 AND oRDER_ID = ? ";
	    List<TestOrderDetailInfoEntity> testOrderDetailInfoOldList = this.findHql(hql0,id0);
		this.deleteAllEntitie(testOrderDetailInfoOldList);
	}
	
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(TestOrderInfoEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(TestOrderInfoEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(TestOrderInfoEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,TestOrderInfoEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{create_name}",String.valueOf(t.getCreateName()));
 		sql  = sql.replace("#{create_by}",String.valueOf(t.getCreateBy()));
 		sql  = sql.replace("#{create_date}",String.valueOf(t.getCreateDate()));
 		sql  = sql.replace("#{update_name}",String.valueOf(t.getUpdateName()));
 		sql  = sql.replace("#{update_by}",String.valueOf(t.getUpdateBy()));
 		sql  = sql.replace("#{update_date}",String.valueOf(t.getUpdateDate()));
 		sql  = sql.replace("#{sys_org_code}",String.valueOf(t.getSysOrgCode()));
 		sql  = sql.replace("#{sys_company_code}",String.valueOf(t.getSysCompanyCode()));
 		sql  = sql.replace("#{bpm_status}",String.valueOf(t.getBpmStatus()));
 		sql  = sql.replace("#{order_number}",String.valueOf(t.getOrderNumber()));
 		sql  = sql.replace("#{order_name}",String.valueOf(t.getOrderName()));
 		sql  = sql.replace("#{order_count}",String.valueOf(t.getOrderCount()));
 		sql  = sql.replace("#{order_pirce}",String.valueOf(t.getOrderPirce()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
}