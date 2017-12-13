package com.sysmex.invoicepack.service.impl;
import com.sysmex.invoicepack.service.TaaediInvoiceMainServiceI;
import org.hibernate.SQLQuery;
import org.hibernate.type.Type;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.hibernate.qbc.HqlQuery;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.sysmex.invoicepack.entity.TaaediInvoiceMainEntity;
import com.sysmex.invoicepack.entity.TaaediInvoiceDetailEntity;
import com.sysmex.invoicepack.entity.TaaediInvoicePackDetailEntity;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;

import java.io.Serializable;


@Service("taaediInvoiceMainService")
@Transactional
public class TaaediInvoiceMainServiceImpl extends CommonServiceImpl implements TaaediInvoiceMainServiceI {
	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((TaaediInvoiceMainEntity)entity);
 	}
	
	public void addMain(TaaediInvoiceMainEntity taaediInvoiceMain,
	        List<TaaediInvoiceDetailEntity> taaediInvoiceDetailList,List<TaaediInvoicePackDetailEntity> taaediInvoicePackDetailList){
			//保存主信息
			this.save(taaediInvoiceMain);
		
			/**保存-TaaediInvoiceDetail*/
			for(TaaediInvoiceDetailEntity taaediInvoiceDetail:taaediInvoiceDetailList){
				//外键设置
				taaediInvoiceDetail.setInvoiceNo(taaediInvoiceMain.getInvioceNo());
				this.save(taaediInvoiceDetail);
			}
			/**保存-TaaediInvoicePackDetail*/
			for(TaaediInvoicePackDetailEntity taaediInvoicePackDetail:taaediInvoicePackDetailList){
				//外键设置
				//taaediInvoicePackDetail.setBillNo(taaediInvoiceMain.getBILL_NO());
				//外键设置
				taaediInvoicePackDetail.setInvoiceNo(taaediInvoiceMain.getInvioceNo());
				this.save(taaediInvoicePackDetail);
			}
			//执行新增操作配置的sql增强
 			this.doAddSql(taaediInvoiceMain);
	}

	
	public void updateMain(TaaediInvoiceMainEntity taaediInvoiceMain,
	        List<TaaediInvoiceDetailEntity> taaediInvoiceDetailList,List<TaaediInvoicePackDetailEntity> taaediInvoicePackDetailList) {
		//保存主表信息
		if(StringUtil.isNotEmpty(taaediInvoiceMain.getId())){
			try {
				TaaediInvoiceMainEntity temp = findUniqueByProperty(TaaediInvoiceMainEntity.class, "id", taaediInvoiceMain.getId());
				MyBeanUtils.copyBeanNotNull2Bean(taaediInvoiceMain, temp);
				this.saveOrUpdate(temp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			this.saveOrUpdate(taaediInvoiceMain);
		}
		//===================================================================================
		//获取参数
		Object iNVOICE_NO0 = taaediInvoiceMain.getInvioceNo();
		//Object bILL_NO1 = taaediInvoiceMain.getBILL_NO();
		Object iNVOICE_NO1 = taaediInvoiceMain.getInvioceNo();
		//===================================================================================
		//1.查询出数据库的明细数据-TaaediInvoiceDetail
	    String hql0 = "from TaaediInvoiceDetailEntity where 1 = 1 AND iNVOICE_NO = ? ";
	    List<TaaediInvoiceDetailEntity> taaediInvoiceDetailOldList = this.findHql(hql0,iNVOICE_NO0);
		//2.筛选更新明细数据-TaaediInvoiceDetail
		if(taaediInvoiceDetailList!=null&&taaediInvoiceDetailList.size()>0){
		for(TaaediInvoiceDetailEntity oldE:taaediInvoiceDetailOldList){
			boolean isUpdate = false;
				for(TaaediInvoiceDetailEntity sendE:taaediInvoiceDetailList){
					//需要更新的明细数据-TaaediInvoiceDetail
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
		    		//如果数据库存在的明细，前台没有传递过来则是删除-TaaediInvoiceDetail
		    		super.delete(oldE);
	    		}
	    		
			}
			//3.持久化新增的数据-TaaediInvoiceDetail
			for(TaaediInvoiceDetailEntity taaediInvoiceDetail:taaediInvoiceDetailList){
				if(oConvertUtils.isEmpty(taaediInvoiceDetail.getId())){
					//外键设置
					taaediInvoiceDetail.setInvoiceNo(taaediInvoiceMain.getInvioceNo());
					this.save(taaediInvoiceDetail);
				}
			}
		}
		//===================================================================================
		//1.查询出数据库的明细数据-TaaediInvoicePackDetail
	    String hql1 = "from TaaediInvoicePackDetailEntity where 1 = 1   AND iNVOICE_NO = ? ";
	    List<TaaediInvoicePackDetailEntity> taaediInvoicePackDetailOldList = this.findHql(hql1,iNVOICE_NO1);
		//2.筛选更新明细数据-TaaediInvoicePackDetail
		if(taaediInvoicePackDetailList!=null&&taaediInvoicePackDetailList.size()>0){
		for(TaaediInvoicePackDetailEntity oldE:taaediInvoicePackDetailOldList){
			boolean isUpdate = false;
				for(TaaediInvoicePackDetailEntity sendE:taaediInvoicePackDetailList){
					//需要更新的明细数据-TaaediInvoicePackDetail
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
		    		//如果数据库存在的明细，前台没有传递过来则是删除-TaaediInvoicePackDetail
		    		super.delete(oldE);
	    		}
	    		
			}
			//3.持久化新增的数据-TaaediInvoicePackDetail
			for(TaaediInvoicePackDetailEntity taaediInvoicePackDetail:taaediInvoicePackDetailList){
				if(oConvertUtils.isEmpty(taaediInvoicePackDetail.getId())){
					//外键设置
					//taaediInvoicePackDetail.setBillNo(taaediInvoiceMain.getBILL_NO());
					taaediInvoicePackDetail.setInvoiceNo(taaediInvoiceMain.getInvioceNo());
					this.save(taaediInvoicePackDetail);
				}
			}
		}
		//执行更新操作配置的sql增强
 		this.doUpdateSql(taaediInvoiceMain);
	}

	
	public void delMain(TaaediInvoiceMainEntity taaediInvoiceMain) {
		//删除主表信息
		this.delete(taaediInvoiceMain);
		//===================================================================================
		//获取参数
		Object iNVOICE_NO0 = taaediInvoiceMain.getInvioceNo();
		//Object bILL_NO1 = taaediInvoiceMain.getBILL_NO();
		Object iNVOICE_NO1 = taaediInvoiceMain.getInvioceNo();
		//===================================================================================
		//删除-TaaediInvoiceDetail
	    String hql0 = "from TaaediInvoiceDetailEntity where 1 = 1 AND iNVOICE_NO = ? ";
	    List<TaaediInvoiceDetailEntity> taaediInvoiceDetailOldList = this.findHql(hql0,iNVOICE_NO0);
		this.deleteAllEntitie(taaediInvoiceDetailOldList);
		//===================================================================================
		//删除-TaaediInvoicePackDetail
	    String hql1 = "from TaaediInvoicePackDetailEntity where 1 = 1  AND iNVOICE_NO = ? ";
	    List<TaaediInvoicePackDetailEntity> taaediInvoicePackDetailOldList = this.findHql(hql1,iNVOICE_NO1);
		this.deleteAllEntitie(taaediInvoicePackDetailOldList);
	}
	
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param 
	 * @return
	 */
 	public boolean doAddSql(TaaediInvoiceMainEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param 
	 * @return
	 */
 	public boolean doUpdateSql(TaaediInvoiceMainEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param 
	 * @return
	 */
 	public boolean doDelSql(TaaediInvoiceMainEntity t){
	 	return true;
 	}

	
	public void getDataGridBySql(CriteriaQuery cq, boolean b) {
		String sql = "SELECT\n" +
				"	this_.id ,\n" +
				"	this_.create_name ,\n" +
				"	this_.create_by ,\n" +
				"	this_.create_date ,\n" +
				"	this_.update_name ,\n" +
				"		this_.update_by ,\n" +
				"	this_.update_date ,\n" +
				"	this_.sys_org_code ,\n" +
				"this_.sys_company_code ,\n" +
				"	this_.bpm_status ,\n" +
				"	this_.vendor_num ,\n" +
				"	this_.vendor_name ,\n" +
				"	this_.invioce_no ,\n" +
				"	this_.invioce_date ,\n" +
				"	this_.currency ,\n" +
				"	tid.total_amount total_amount ,\n" +
				"	this_.total_quantity ,\n" +
				"	tipd.box_quantity total_box_quantity ,\n" +
				"	tipd.net_weight total_net_weight ,\n" +
				"	tipd.gross_weight total_gross_weight ,\n" +
				"	this_.status ,\n" +
				"	this_.urgent_flag ,\n" +
				"	this_.attachment_flag ,\n" +
				"	this_.remark_flag ,\n" +
				"	this_.memo ,\n" +
				"	this_.del_date ,\n" +
				"	this_.delflag \n" +
				"FROM\n" +
				"	taaedi_invoice_main this_,(	select invoice_no, sum(total_amount) total_amount from taaedi_invoice_detail  GROUP BY invoice_no) tid,\n" +
				"	(select invoice_no, count(id) box_quantity,sum(net_weight) net_weight,sum(gross_weight) gross_weight from taaedi_invoice_pack_detail  group by invoice_no) tipd\n" +
				"	where this_.invioce_no=tid.invoice_no and this_.invioce_no=tipd.invoice_no ";
		//查询条件
		Map map = cq.getMap();
		StringBuffer stringBuffer = new StringBuffer("");
		if (map.get("invioceNo")!=null && !map.get("invioceNo").equals("")){
			stringBuffer.append(" and  this_.invioce_no=:invioceNo ");
		}
		if (map.get("vendorNum")!=null && !map.get("vendorNum").equals("")){
			stringBuffer.append(" and  this_.vendor_num=:vendorNum ");
		}
		if (map.get("vendorName")!=null && !map.get("vendorName").equals("")){
			stringBuffer.append(" and  this_.vendor_name like :vendorName ");
			map.put("vendorName","%"+map.get("vendorName")+"%");
		}

		sql = sql+stringBuffer.toString();
		HqlQuery sqlQuery = new HqlQuery(sql,map);
		sqlQuery.setCurPage(cq.getCurPage());
		sqlQuery.setPageSize(cq.getPageSize());
		sqlQuery.setDataGrid(cq.getDataGrid());
		sqlQuery.setClass1(TaaediInvoiceMainEntity.class);
		commonDao.getDataGridReturnBySql(sqlQuery);
	}

	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,TaaediInvoiceMainEntity t){
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
 		sql  = sql.replace("#{vendor_num}",String.valueOf(t.getVendorNum()));
 		sql  = sql.replace("#{vendor_name}",String.valueOf(t.getVendorName()));
 		sql  = sql.replace("#{invioce_no}",String.valueOf(t.getInvioceNo()));
 		sql  = sql.replace("#{invioce_date}",String.valueOf(t.getInvioceDate()));
 		sql  = sql.replace("#{currency}",String.valueOf(t.getCurrency()));
 		sql  = sql.replace("#{total_amount}",String.valueOf(t.getTotalAmount()));
 		sql  = sql.replace("#{total_quantity}",String.valueOf(t.getTotalQuantity()));
 		sql  = sql.replace("#{total_box_quantity}",String.valueOf(t.getTotalBoxQuantity()));
 		sql  = sql.replace("#{total_net_weight}",String.valueOf(t.getTotalNetWeight()));
 		sql  = sql.replace("#{total_gross_weight}",String.valueOf(t.getTotalGrossWeight()));
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