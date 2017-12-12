package com.sysmex.declaration.service.impl;
import com.sysmex.declaration.service.TaaediDeclarationMainServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.sysmex.declaration.entity.TaaediDeclarationMainEntity;
import com.sysmex.declaration.entity.TaaediDeclarationPackDetailEntity;
import com.sysmex.declaration.entity.TaaediDeclarationDetailEntity;

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


@Service("taaediDeclarationMainService")
@Transactional
public class TaaediDeclarationMainServiceImpl extends CommonServiceImpl implements TaaediDeclarationMainServiceI {
	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((TaaediDeclarationMainEntity)entity);
 	}
	
	public void addMain(TaaediDeclarationMainEntity taaediDeclarationMain,
	        List<TaaediDeclarationPackDetailEntity> taaediDeclarationPackDetailList,List<TaaediDeclarationDetailEntity> taaediDeclarationDetailList){
			//保存主信息
			this.save(taaediDeclarationMain);
		
			/**保存-报关箱单明细*/
			for(TaaediDeclarationPackDetailEntity taaediDeclarationPackDetail:taaediDeclarationPackDetailList){
				//外键设置
				taaediDeclarationPackDetail.setMainId(taaediDeclarationMain.getId());
				this.save(taaediDeclarationPackDetail);
			}
			/**保存-报关明细*/
			for(TaaediDeclarationDetailEntity taaediDeclarationDetail:taaediDeclarationDetailList){
				//外键设置
				taaediDeclarationDetail.setMainId(taaediDeclarationMain.getId());
				this.save(taaediDeclarationDetail);
			}
			//执行新增操作配置的sql增强
 			this.doAddSql(taaediDeclarationMain);
	}

	
	public void updateMain(TaaediDeclarationMainEntity taaediDeclarationMain,
	        List<TaaediDeclarationPackDetailEntity> taaediDeclarationPackDetailList,List<TaaediDeclarationDetailEntity> taaediDeclarationDetailList) {
		//保存主表信息
		if(StringUtil.isNotEmpty(taaediDeclarationMain.getId())){
			try {
				TaaediDeclarationMainEntity temp = findUniqueByProperty(TaaediDeclarationMainEntity.class, "id", taaediDeclarationMain.getId());
				MyBeanUtils.copyBeanNotNull2Bean(taaediDeclarationMain, temp);
				this.saveOrUpdate(temp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			this.saveOrUpdate(taaediDeclarationMain);
		}
		//===================================================================================
		//获取参数
		Object id0 = taaediDeclarationMain.getId();
		Object id1 = taaediDeclarationMain.getId();
		//===================================================================================
		//1.查询出数据库的明细数据-报关箱单明细
	    String hql0 = "from TaaediDeclarationPackDetailEntity where 1 = 1 AND mAIN_ID = ? ";
	    List<TaaediDeclarationPackDetailEntity> taaediDeclarationPackDetailOldList = this.findHql(hql0,id0);
		//2.筛选更新明细数据-报关箱单明细
		if(taaediDeclarationPackDetailList!=null&&taaediDeclarationPackDetailList.size()>0){
		for(TaaediDeclarationPackDetailEntity oldE:taaediDeclarationPackDetailOldList){
			boolean isUpdate = false;
				for(TaaediDeclarationPackDetailEntity sendE:taaediDeclarationPackDetailList){
					//需要更新的明细数据-报关箱单明细
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
		    		//如果数据库存在的明细，前台没有传递过来则是删除-报关箱单明细
		    		super.delete(oldE);
	    		}
	    		
			}
			//3.持久化新增的数据-报关箱单明细
			for(TaaediDeclarationPackDetailEntity taaediDeclarationPackDetail:taaediDeclarationPackDetailList){
				if(oConvertUtils.isEmpty(taaediDeclarationPackDetail.getId())){
					//外键设置
					taaediDeclarationPackDetail.setMainId(taaediDeclarationMain.getId());
					this.save(taaediDeclarationPackDetail);
				}
			}
		}
		//===================================================================================
		//1.查询出数据库的明细数据-报关明细
	    String hql1 = "from TaaediDeclarationDetailEntity where 1 = 1 AND mAIN_ID = ? ";
	    List<TaaediDeclarationDetailEntity> taaediDeclarationDetailOldList = this.findHql(hql1,id1);
		//2.筛选更新明细数据-报关明细
		if(taaediDeclarationDetailList!=null&&taaediDeclarationDetailList.size()>0){
		for(TaaediDeclarationDetailEntity oldE:taaediDeclarationDetailOldList){
			boolean isUpdate = false;
				for(TaaediDeclarationDetailEntity sendE:taaediDeclarationDetailList){
					//需要更新的明细数据-报关明细
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
		    		//如果数据库存在的明细，前台没有传递过来则是删除-报关明细
		    		super.delete(oldE);
	    		}
	    		
			}
			//3.持久化新增的数据-报关明细
			for(TaaediDeclarationDetailEntity taaediDeclarationDetail:taaediDeclarationDetailList){
				if(oConvertUtils.isEmpty(taaediDeclarationDetail.getId())){
					//外键设置
					taaediDeclarationDetail.setMainId(taaediDeclarationMain.getId());
					this.save(taaediDeclarationDetail);
				}
			}
		}
		//执行更新操作配置的sql增强
 		this.doUpdateSql(taaediDeclarationMain);
	}

	
	public void delMain(TaaediDeclarationMainEntity taaediDeclarationMain) {
		//删除主表信息
		this.delete(taaediDeclarationMain);
		//===================================================================================
		//获取参数
		Object id0 = taaediDeclarationMain.getId();
		Object id1 = taaediDeclarationMain.getId();
		//===================================================================================
		//删除-报关箱单明细
	    String hql0 = "from TaaediDeclarationPackDetailEntity where 1 = 1 AND mAIN_ID = ? ";
	    List<TaaediDeclarationPackDetailEntity> taaediDeclarationPackDetailOldList = this.findHql(hql0,id0);
		this.deleteAllEntitie(taaediDeclarationPackDetailOldList);
		//===================================================================================
		//删除-报关明细
	    String hql1 = "from TaaediDeclarationDetailEntity where 1 = 1 AND mAIN_ID = ? ";
	    List<TaaediDeclarationDetailEntity> taaediDeclarationDetailOldList = this.findHql(hql1,id1);
		this.deleteAllEntitie(taaediDeclarationDetailOldList);
	}
	
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(TaaediDeclarationMainEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(TaaediDeclarationMainEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(TaaediDeclarationMainEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,TaaediDeclarationMainEntity t){
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
 		sql  = sql.replace("#{customs_invoice_no}",String.valueOf(t.getCustomsInvoiceNo()));
 		sql  = sql.replace("#{customs_no}",String.valueOf(t.getCustomsNo()));
 		sql  = sql.replace("#{application_date}",String.valueOf(t.getApplicationDate()));
 		sql  = sql.replace("#{trade_mode}",String.valueOf(t.getTradeMode()));
 		sql  = sql.replace("#{customs_broker}",String.valueOf(t.getCustomsBroker()));
 		sql  = sql.replace("#{tamount}",String.valueOf(t.getTamount()));
 		sql  = sql.replace("#{customs_recordno}",String.valueOf(t.getCustomsRecordno()));
 		sql  = sql.replace("#{imp_exp_corp}",String.valueOf(t.getImpExpCorp()));
 		sql  = sql.replace("#{shipping_type}",String.valueOf(t.getShippingType()));
 		sql  = sql.replace("#{conveyance}",String.valueOf(t.getConveyance()));
 		sql  = sql.replace("#{waybill_no}",String.valueOf(t.getWaybillNo()));
 		sql  = sql.replace("#{consignee}",String.valueOf(t.getConsignee()));
 		sql  = sql.replace("#{contract_no}",String.valueOf(t.getContractNo()));
 		sql  = sql.replace("#{free_flag}",String.valueOf(t.getFreeFlag()));
 		sql  = sql.replace("#{tax_rate}",String.valueOf(t.getTaxRate()));
 		sql  = sql.replace("#{licence_no}",String.valueOf(t.getLicenceNo()));
 		sql  = sql.replace("#{country_of_origin}",String.valueOf(t.getCountryOfOrigin()));
 		sql  = sql.replace("#{loading_port}",String.valueOf(t.getLoadingPort()));
 		sql  = sql.replace("#{import_port}",String.valueOf(t.getImportPort()));
 		sql  = sql.replace("#{inland_destination}",String.valueOf(t.getInlandDestination()));
 		sql  = sql.replace("#{approval_number}",String.valueOf(t.getApprovalNumber()));
 		sql  = sql.replace("#{deal_mode}",String.valueOf(t.getDealMode()));
 		sql  = sql.replace("#{quantity}",String.valueOf(t.getQuantity()));
 		sql  = sql.replace("#{container_no}",String.valueOf(t.getContainerNo()));
 		sql  = sql.replace("#{purpose}",String.valueOf(t.getPurpose()));
 		sql  = sql.replace("#{status}",String.valueOf(t.getStatus()));
 		sql  = sql.replace("#{customs_bill}",String.valueOf(t.getCustomsBill()));
 		sql  = sql.replace("#{tax_bill}",String.valueOf(t.getTaxBill()));
 		sql  = sql.replace("#{imp_list}",String.valueOf(t.getImpList()));
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