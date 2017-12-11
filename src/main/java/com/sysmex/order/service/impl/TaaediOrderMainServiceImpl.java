package com.sysmex.order.service.impl;
import com.sysmex.order.service.TaaediOrderMainServiceI;
import org.hibernate.type.Type;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.hibernate.qbc.HqlQuery;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.sysmex.order.entity.TaaediOrderMainEntity;
import com.sysmex.order.entity.TaaediOrderDetailEntity;

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


@Service("taaediOrderMainService")
@Transactional
public class TaaediOrderMainServiceImpl extends CommonServiceImpl implements TaaediOrderMainServiceI {
	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((TaaediOrderMainEntity)entity);
 	}


	public void  getDataGridReturnByHql(CriteriaQuery cq ,boolean isOffset){
		String sql = "SELECT\n" +
				"	id AS id,\n" +
				"	create_name ,\n" +
				"	create_by ,\n" +
				"	create_date ,\n" +
				"	update_name ,\n" +
				"	update_by ,\n" +
				"	update_date ,\n" +
				"	sys_org_code ,\n" +
				"	sys_company_code ,\n" +
				"	bpm_status ,\n" +
				"	t1.m_bill_no ,\n" +
				"	vendor_name ,\n" +
				"	vendor_num ,\n" +
				"	t3.t_quantity ,\n" +
				"	deliver_date ,\n" +
				"	bill_type ,\n" +
				"	status ,\n" +
				"	urgent_flag ,\n" +
				"	attachment_flag ,\n" +
				"	remark_flag ,\n" +
				"	memo ,\n" +
				"	t1.delflag ,\n" +
				"	t1.del_date \n" +
				"FROM\n" +
				"	taaedi_order_main t1,\n" +
				"	(SELECT SUM(t2.quantity) t_quantity,\n" +
				"		t2.m_bill_no FROM\n" +
				"		taaedi_order_detail t2 \n" +
				"	GROUP BY\n" +
				"		t2.m_bill_no \n" +
				"	) t3 \n" +
				"WHERE\n" +
				"	t1.m_bill_no= t3.m_bill_no";
		HqlQuery sqlQuery = new HqlQuery(sql,new Object[]{},new Type[]{});
		sqlQuery.setCurPage(cq.getCurPage());
		sqlQuery.setPageSize(cq.getPageSize());
		sqlQuery.setDataGrid(cq.getDataGrid());
		sqlQuery.setClass1(TaaediOrderMainEntity.class);
		commonDao.getDataGridReturnBySql(sqlQuery,isOffset,true);

		/*String hql =
				//"from TaaediOrderMainEntity where 1=1";
				"select new Map(id as id,createName as createName,createBy as createBy,createDate as createDate,updateName as updateName,updateBy as updateBy," +
				"updateDate as updateDate,sysOrgCode as sysOrgCode,sysCompanyCode as sysCompanyCode,bpmStatus as bpmStatus,mBillNo as mBillNo,vendorName as vendorName," +
				"vendorNum as vendorNum," +
						"tQuantity as tQuantity," +
						"deliverDate as deliverDate," +
						"billType as billType," +
						"status as status," +
						"urgentFlag as urgentFlag," +
				"attachmentFlag as attachmentFlag," +
						"remarkFlag as remarkFlag,memo as memo," +
						"delflag as delflag,delDate as delDate)" +
				"from TaaediOrderMainEntity as t1  ";
		HqlQuery hqlQuery = new HqlQuery(hql,new Object[]{},new Type[]{});
		hqlQuery.setCurPage(cq.getCurPage());
		hqlQuery.setPageSize(cq.getPageSize());
		hqlQuery.setDataGrid(cq.getDataGrid());
		commonDao.getDataGridReturnByHql(hqlQuery,isOffset);*/


		//commonDao.getDataGridReturn(cq, isOffset);
	}
	
	public void addMain(TaaediOrderMainEntity taaediOrderMain,
	        List<TaaediOrderDetailEntity> taaediOrderDetailList){
			//保存主信息
			this.save(taaediOrderMain);
		
			/**保存-采购订单明细*/
			for(TaaediOrderDetailEntity taaediOrderDetail:taaediOrderDetailList){
				//外键设置
				taaediOrderDetail.setmBillNo(taaediOrderMain.getmBillNo());
				this.save(taaediOrderDetail);
			}
			//执行新增操作配置的sql增强
 			this.doAddSql(taaediOrderMain);
	}

	
	public void updateMain(TaaediOrderMainEntity taaediOrderMain,
	        List<TaaediOrderDetailEntity> taaediOrderDetailList) {
		//保存主表信息
		if(StringUtil.isNotEmpty(taaediOrderMain.getId())){
			try {
				TaaediOrderMainEntity temp = findUniqueByProperty(TaaediOrderMainEntity.class, "id", taaediOrderMain.getId());
				MyBeanUtils.copyBeanNotNull2Bean(taaediOrderMain, temp);
				this.saveOrUpdate(temp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			this.saveOrUpdate(taaediOrderMain);
		}
		//===================================================================================
		//获取参数
		Object mBillNo0 = taaediOrderMain.getmBillNo();
		//===================================================================================
		//1.查询出数据库的明细数据-采购订单明细
	    String hql0 = "from TaaediOrderDetailEntity where 1 = 1 AND mBillNo = ? ";
	    List<TaaediOrderDetailEntity> taaediOrderDetailOldList = this.findHql(hql0,mBillNo0);
		//2.筛选更新明细数据-采购订单明细
		if(taaediOrderDetailList!=null&&taaediOrderDetailList.size()>0){
		for(TaaediOrderDetailEntity oldE:taaediOrderDetailOldList){
			boolean isUpdate = false;
				for(TaaediOrderDetailEntity sendE:taaediOrderDetailList){
					//需要更新的明细数据-采购订单明细
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
		    		//如果数据库存在的明细，前台没有传递过来则是删除-采购订单明细
		    		super.delete(oldE);
	    		}
	    		
			}
			//3.持久化新增的数据-采购订单明细
			for(TaaediOrderDetailEntity taaediOrderDetail:taaediOrderDetailList){
				if(oConvertUtils.isEmpty(taaediOrderDetail.getId())){
					//外键设置
					taaediOrderDetail.setmBillNo(taaediOrderMain.getmBillNo());
					this.save(taaediOrderDetail);
				}
			}
		}
		//执行更新操作配置的sql增强
 		this.doUpdateSql(taaediOrderMain);
	}

	
	public void delMain(TaaediOrderMainEntity taaediOrderMain) {
		//删除主表信息
		this.delete(taaediOrderMain);
		//===================================================================================
		//获取参数
		Object mBillNo0 = taaediOrderMain.getmBillNo();
		//===================================================================================
		//删除-采购订单明细
	    String hql0 = "from TaaediOrderDetailEntity where 1 = 1 AND mBillNo = ? ";
	    List<TaaediOrderDetailEntity> taaediOrderDetailOldList = this.findHql(hql0,mBillNo0);
		this.deleteAllEntitie(taaediOrderDetailOldList);
	}
	
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param
	 * @return
	 */
 	public boolean doAddSql(TaaediOrderMainEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param
	 * @return
	 */
 	public boolean doUpdateSql(TaaediOrderMainEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param
	 * @return
	 */
 	public boolean doDelSql(TaaediOrderMainEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,TaaediOrderMainEntity t){
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
 		sql  = sql.replace("#{m_bill_no}",String.valueOf(t.getmBillNo()));
 		sql  = sql.replace("#{vendor_name}",String.valueOf(t.getVendorName()));
 		sql  = sql.replace("#{vendor_num}",String.valueOf(t.getVendorNum()));
 		sql  = sql.replace("#{t_quantity}",String.valueOf(t.gettQuantity()));
 		sql  = sql.replace("#{deliver_date}",String.valueOf(t.getDeliverDate()));
 		sql  = sql.replace("#{bill_type}",String.valueOf(t.getBillType()));
 		sql  = sql.replace("#{status}",String.valueOf(t.getStatus()));
 		sql  = sql.replace("#{urgent_flag}",String.valueOf(t.getUrgentFlag()));
 		sql  = sql.replace("#{attachment_flag}",String.valueOf(t.getAttachmentFlag()));
 		sql  = sql.replace("#{remark_flag}",String.valueOf(t.getRemarkFlag()));
 		sql  = sql.replace("#{memo}",String.valueOf(t.getMemo()));
 		sql  = sql.replace("#{delflag}",String.valueOf(t.getDelflag()));
 		sql  = sql.replace("#{del_date}",String.valueOf(t.getDelDate()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
}