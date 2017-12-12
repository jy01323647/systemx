
package com.sysmex.order.page;
import com.sysmex.order.entity.TaaediOrderMainEntity;
import com.sysmex.order.entity.TaaediOrderDetailEntity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelCollection;

/**   
 * @Title: Entity
 * @Description: 采购订单主表
 * @author onlineGenerator
 * @date 2017-12-11 13:59:25
 * @version V1.0   
 *
 */
public class TaaediOrderMainPage implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**创建人名称*/
	private java.lang.String createName;
	/**创建人登录名称*/
	private java.lang.String createBy;
	/**创建日期*/
	private java.util.Date createDate;
	/**更新人名称*/
	private java.lang.String updateName;
	/**更新人登录名称*/
	private java.lang.String updateBy;
	/**更新日期*/
	private java.util.Date updateDate;
	/**所属部门*/
	private java.lang.String sysOrgCode;
	/**所属公司*/
	private java.lang.String sysCompanyCode;
	/**流程状态*/
	private java.lang.String bpmStatus;
	/**主订单编号*/
    @Excel(name="主订单编号")
	private java.lang.String mmBillNo;
	/**供应商名称*/
    @Excel(name="供应商名称")
	private java.lang.String vendorName;
	/**供应商编码*/
    @Excel(name="供应商编码")
	private java.lang.String vendorNum;
	/**总数量*/
	private java.lang.Double tQuantity;
	/**提货时间*/
    @Excel(name="提货时间",format = "yyyy-MM-dd")
	private java.util.Date deliverDate;
	/**订单类型*/
    @Excel(name="订单类型")
	private java.lang.String billType;
	/**订单状态*/
	private java.lang.String status;
	/**是否紧急标志*/
	private java.lang.String urgentFlag;
	/**附件标志*/
	private java.lang.Integer attachmentFlag;
	/**预警提示*/
	private java.lang.Integer remarkFlag;
	/**备注*/
    @Excel(name="备注")
	private java.lang.String memo;
	/**删除标记*/
	private java.lang.Integer delflag;
	/**删除时间*/
	private java.util.Date delDate;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人名称
	 */
	public java.lang.String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人名称
	 */
	public void setCreateName(java.lang.String createName){
		this.createName = createName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人登录名称
	 */
	public java.lang.String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人登录名称
	 */
	public void setCreateBy(java.lang.String createBy){
		this.createBy = createBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建日期
	 */
	public java.util.Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建日期
	 */
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人名称
	 */
	public java.lang.String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人名称
	 */
	public void setUpdateName(java.lang.String updateName){
		this.updateName = updateName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人登录名称
	 */
	public java.lang.String getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人登录名称
	 */
	public void setUpdateBy(java.lang.String updateBy){
		this.updateBy = updateBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新日期
	 */
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新日期
	 */
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属部门
	 */
	public java.lang.String getSysOrgCode(){
		return this.sysOrgCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属部门
	 */
	public void setSysOrgCode(java.lang.String sysOrgCode){
		this.sysOrgCode = sysOrgCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属公司
	 */
	public java.lang.String getSysCompanyCode(){
		return this.sysCompanyCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属公司
	 */
	public void setSysCompanyCode(java.lang.String sysCompanyCode){
		this.sysCompanyCode = sysCompanyCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  流程状态
	 */
	public java.lang.String getBpmStatus(){
		return this.bpmStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  流程状态
	 */
	public void setBpmStatus(java.lang.String bpmStatus){
		this.bpmStatus = bpmStatus;
	}

	public String getMmBillNo() {
		return mmBillNo;
	}

	public void setMmBillNo(String mmBillNo) {
		this.mmBillNo = mmBillNo;
	}

	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  供应商名称
	 */
	public java.lang.String getVendorName(){
		return this.vendorName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  供应商名称
	 */
	public void setVendorName(java.lang.String vendorName){
		this.vendorName = vendorName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  供应商编码
	 */
	public java.lang.String getVendorNum(){
		return this.vendorNum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  供应商编码
	 */
	public void setVendorNum(java.lang.String vendorNum){
		this.vendorNum = vendorNum;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  总数量
	 */
	public java.lang.Double getTQuantity(){
		return this.tQuantity;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  总数量
	 */
	public void setTQuantity(java.lang.Double tQuantity){
		this.tQuantity = tQuantity;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  提货时间
	 */
	public java.util.Date getDeliverDate(){
		return this.deliverDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  提货时间
	 */
	public void setDeliverDate(java.util.Date deliverDate){
		this.deliverDate = deliverDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单类型
	 */
	public java.lang.String getBillType(){
		return this.billType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单类型
	 */
	public void setBillType(java.lang.String billType){
		this.billType = billType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单状态
	 */
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单状态
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否紧急标志
	 */
	public java.lang.String getUrgentFlag(){
		return this.urgentFlag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否紧急标志
	 */
	public void setUrgentFlag(java.lang.String urgentFlag){
		this.urgentFlag = urgentFlag;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  附件标志
	 */
	public java.lang.Integer getAttachmentFlag(){
		return this.attachmentFlag;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  附件标志
	 */
	public void setAttachmentFlag(java.lang.Integer attachmentFlag){
		this.attachmentFlag = attachmentFlag;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  预警提示
	 */
	public java.lang.Integer getRemarkFlag(){
		return this.remarkFlag;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  预警提示
	 */
	public void setRemarkFlag(java.lang.Integer remarkFlag){
		this.remarkFlag = remarkFlag;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */
	public java.lang.String getMemo(){
		return this.memo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setMemo(java.lang.String memo){
		this.memo = memo;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  删除标记
	 */
	public java.lang.Integer getDelflag(){
		return this.delflag;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  删除标记
	 */
	public void setDelflag(java.lang.Integer delflag){
		this.delflag = delflag;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  删除时间
	 */
	public java.util.Date getDelDate(){
		return this.delDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  删除时间
	 */
	public void setDelDate(java.util.Date delDate){
		this.delDate = delDate;
	}

	/**保存-采购订单明细*/
    @ExcelCollection(name="采购订单明细")
	private List<TaaediOrderDetailEntity> taaediOrderDetailList = new ArrayList<TaaediOrderDetailEntity>();
		public List<TaaediOrderDetailEntity> getTaaediOrderDetailList() {
		return taaediOrderDetailList;
		}
		public void setTaaediOrderDetailList(List<TaaediOrderDetailEntity> taaediOrderDetailList) {
		this.taaediOrderDetailList = taaediOrderDetailList;
		}
}
