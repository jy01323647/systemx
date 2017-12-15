package com.sysmex.declaration.service.impl;
import com.sysmex.declaration.service.TaaediDeclarationSecondMainServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.sysmex.declaration.entity.TaaediDeclarationSecondMainEntity;
import com.sysmex.declaration.entity.TaaediDeclarationSecondPacklistEntity;
import com.sysmex.declaration.entity.TaaediDeclarationSecondDetailEntity;

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


@Service("taaediDeclarationSecondMainService")
@Transactional
public class TaaediDeclarationSecondMainServiceImpl extends CommonServiceImpl implements TaaediDeclarationSecondMainServiceI {
	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((TaaediDeclarationSecondMainEntity)entity);
 	}
	
	public void addMain(TaaediDeclarationSecondMainEntity taaediDeclarationSecondMain,
	        List<TaaediDeclarationSecondPacklistEntity> taaediDeclarationSecondPacklistList,List<TaaediDeclarationSecondDetailEntity> taaediDeclarationSecondDetailList){
			//保存主信息
			this.save(taaediDeclarationSecondMain);
		
			/**保存-二次报关箱单明细*/
			for(TaaediDeclarationSecondPacklistEntity taaediDeclarationSecondPacklist:taaediDeclarationSecondPacklistList){
				//外键设置
				taaediDeclarationSecondPacklist.setMainId(taaediDeclarationSecondMain.getId());
				this.save(taaediDeclarationSecondPacklist);
			}
			/**保存-二次报关明细*/
			for(TaaediDeclarationSecondDetailEntity taaediDeclarationSecondDetail:taaediDeclarationSecondDetailList){
				//外键设置
				taaediDeclarationSecondDetail.setMainId(taaediDeclarationSecondMain.getId());
				this.save(taaediDeclarationSecondDetail);
			}
			//执行新增操作配置的sql增强
 			this.doAddSql(taaediDeclarationSecondMain);
	}

	
	public void updateMain(TaaediDeclarationSecondMainEntity taaediDeclarationSecondMain,
	        List<TaaediDeclarationSecondPacklistEntity> taaediDeclarationSecondPacklistList,List<TaaediDeclarationSecondDetailEntity> taaediDeclarationSecondDetailList) {
		//保存主表信息
		if(StringUtil.isNotEmpty(taaediDeclarationSecondMain.getId())){
			try {
				TaaediDeclarationSecondMainEntity temp = findUniqueByProperty(TaaediDeclarationSecondMainEntity.class, "id", taaediDeclarationSecondMain.getId());
				MyBeanUtils.copyBeanNotNull2Bean(taaediDeclarationSecondMain, temp);
				this.saveOrUpdate(temp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			this.saveOrUpdate(taaediDeclarationSecondMain);
		}
		//===================================================================================
		//获取参数
		Object id0 = taaediDeclarationSecondMain.getId();
		Object id1 = taaediDeclarationSecondMain.getId();
		//===================================================================================
		//1.查询出数据库的明细数据-二次报关箱单明细
	    String hql0 = "from TaaediDeclarationSecondPacklistEntity where 1 = 1 AND mAIN_ID = ? ";
	    List<TaaediDeclarationSecondPacklistEntity> taaediDeclarationSecondPacklistOldList = this.findHql(hql0,id0);
		//2.筛选更新明细数据-二次报关箱单明细
		if(taaediDeclarationSecondPacklistList!=null&&taaediDeclarationSecondPacklistList.size()>0){
		for(TaaediDeclarationSecondPacklistEntity oldE:taaediDeclarationSecondPacklistOldList){
			boolean isUpdate = false;
				for(TaaediDeclarationSecondPacklistEntity sendE:taaediDeclarationSecondPacklistList){
					//需要更新的明细数据-二次报关箱单明细
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
		    		//如果数据库存在的明细，前台没有传递过来则是删除-二次报关箱单明细
		    		super.delete(oldE);
	    		}
	    		
			}
			//3.持久化新增的数据-二次报关箱单明细
			for(TaaediDeclarationSecondPacklistEntity taaediDeclarationSecondPacklist:taaediDeclarationSecondPacklistList){
				if(oConvertUtils.isEmpty(taaediDeclarationSecondPacklist.getId())){
					//外键设置
					taaediDeclarationSecondPacklist.setMainId(taaediDeclarationSecondMain.getId());
					this.save(taaediDeclarationSecondPacklist);
				}
			}
		}
		//===================================================================================
		//1.查询出数据库的明细数据-二次报关明细
	    String hql1 = "from TaaediDeclarationSecondDetailEntity where 1 = 1 AND mAIN_ID = ? ";
	    List<TaaediDeclarationSecondDetailEntity> taaediDeclarationSecondDetailOldList = this.findHql(hql1,id1);
		//2.筛选更新明细数据-二次报关明细
		if(taaediDeclarationSecondDetailList!=null&&taaediDeclarationSecondDetailList.size()>0){
		for(TaaediDeclarationSecondDetailEntity oldE:taaediDeclarationSecondDetailOldList){
			boolean isUpdate = false;
				for(TaaediDeclarationSecondDetailEntity sendE:taaediDeclarationSecondDetailList){
					//需要更新的明细数据-二次报关明细
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
		    		//如果数据库存在的明细，前台没有传递过来则是删除-二次报关明细
		    		super.delete(oldE);
	    		}
	    		
			}
			//3.持久化新增的数据-二次报关明细
			for(TaaediDeclarationSecondDetailEntity taaediDeclarationSecondDetail:taaediDeclarationSecondDetailList){
				if(oConvertUtils.isEmpty(taaediDeclarationSecondDetail.getId())){
					//外键设置
					taaediDeclarationSecondDetail.setMainId(taaediDeclarationSecondMain.getId());
					this.save(taaediDeclarationSecondDetail);
				}
			}
		}
		//执行更新操作配置的sql增强
 		this.doUpdateSql(taaediDeclarationSecondMain);
	}

	
	public void delMain(TaaediDeclarationSecondMainEntity taaediDeclarationSecondMain) {
		//删除主表信息
		this.delete(taaediDeclarationSecondMain);
		//===================================================================================
		//获取参数
		Object id0 = taaediDeclarationSecondMain.getId();
		Object id1 = taaediDeclarationSecondMain.getId();
		//===================================================================================
		//删除-二次报关箱单明细
	    String hql0 = "from TaaediDeclarationSecondPacklistEntity where 1 = 1 AND mAIN_ID = ? ";
	    List<TaaediDeclarationSecondPacklistEntity> taaediDeclarationSecondPacklistOldList = this.findHql(hql0,id0);
		this.deleteAllEntitie(taaediDeclarationSecondPacklistOldList);
		//===================================================================================
		//删除-二次报关明细
	    String hql1 = "from TaaediDeclarationSecondDetailEntity where 1 = 1 AND mAIN_ID = ? ";
	    List<TaaediDeclarationSecondDetailEntity> taaediDeclarationSecondDetailOldList = this.findHql(hql1,id1);
		this.deleteAllEntitie(taaediDeclarationSecondDetailOldList);
	}
	
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(TaaediDeclarationSecondMainEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(TaaediDeclarationSecondMainEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(TaaediDeclarationSecondMainEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,TaaediDeclarationSecondMainEntity t){
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
 		sql  = sql.replace("#{total_amount}",String.valueOf(t.getTotalAmount()));
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