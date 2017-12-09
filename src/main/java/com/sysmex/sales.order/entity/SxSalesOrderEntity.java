package com.sysmex.sales.order.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 销售订单表
 * @author onlineGenerator
 * @date 2017-12-09 12:53:10
 * @version V1.0   
 *
 */
@Entity
@Table(name = "sx_sales_order", schema = "")
@SuppressWarnings("serial")
public class SxSalesOrderEntity implements java.io.Serializable {
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
	/**销售订单号*/
	@Excel(name="销售订单号",width=15)
	private java.lang.String salesOrderNumber;
	/**经销商*/
	@Excel(name="经销商",width=15)
	private java.lang.String suppliersName;
	/**产品编号*/
	@Excel(name="产品编号",width=15)
	private java.lang.String productCode;
	/**产品名称*/
	@Excel(name="产品名称",width=15)
	private java.lang.String productName;
	/**外贸合同号*/
	@Excel(name="外贸合同号",width=15)
	private java.lang.String contractNumber;
	/**币种*/
	@Excel(name="币种",width=15)
	private java.lang.String currencyCode;
	/**供货日期*/
	@Excel(name="供货日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date supplierDate;
	/**状态*/
	@Excel(name="状态",width=15)
	private java.lang.String status;
	/**发货日期*/
	@Excel(name="发货日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date sendDate;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String remark;
	/**订单数量*/
	@Excel(name="订单数量",width=15)
	private java.lang.Integer salesOrderCount;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")

	@Column(name ="ID",nullable=false,length=36)
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

	@Column(name ="CREATE_NAME",nullable=true,length=50)
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

	@Column(name ="CREATE_BY",nullable=true,length=50)
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

	@Column(name ="CREATE_DATE",nullable=true,length=20)
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

	@Column(name ="UPDATE_NAME",nullable=true,length=50)
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

	@Column(name ="UPDATE_BY",nullable=true,length=50)
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

	@Column(name ="UPDATE_DATE",nullable=true,length=20)
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

	@Column(name ="SYS_ORG_CODE",nullable=true,length=50)
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

	@Column(name ="SYS_COMPANY_CODE",nullable=true,length=50)
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

	@Column(name ="BPM_STATUS",nullable=true,length=32)
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
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  销售订单号
	 */

	@Column(name ="SALES_ORDER_NUMBER",nullable=true,length=32)
	public java.lang.String getSalesOrderNumber(){
		return this.salesOrderNumber;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  销售订单号
	 */
	public void setSalesOrderNumber(java.lang.String salesOrderNumber){
		this.salesOrderNumber = salesOrderNumber;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  经销商
	 */

	@Column(name ="SUPPLIERS_NAME",nullable=true,length=50)
	public java.lang.String getSuppliersName(){
		return this.suppliersName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  经销商
	 */
	public void setSuppliersName(java.lang.String suppliersName){
		this.suppliersName = suppliersName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  产品编号
	 */

	@Column(name ="PRODUCT_CODE",nullable=true,length=32)
	public java.lang.String getProductCode(){
		return this.productCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  产品编号
	 */
	public void setProductCode(java.lang.String productCode){
		this.productCode = productCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  产品名称
	 */

	@Column(name ="PRODUCT_NAME",nullable=true,length=50)
	public java.lang.String getProductName(){
		return this.productName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  产品名称
	 */
	public void setProductName(java.lang.String productName){
		this.productName = productName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  外贸合同号
	 */

	@Column(name ="CONTRACT_NUMBER",nullable=true,length=32)
	public java.lang.String getContractNumber(){
		return this.contractNumber;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  外贸合同号
	 */
	public void setContractNumber(java.lang.String contractNumber){
		this.contractNumber = contractNumber;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  币种
	 */

	@Column(name ="CURRENCY_CODE",nullable=true,length=10)
	public java.lang.String getCurrencyCode(){
		return this.currencyCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  币种
	 */
	public void setCurrencyCode(java.lang.String currencyCode){
		this.currencyCode = currencyCode;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  供货日期
	 */

	@Column(name ="SUPPLIER_DATE",nullable=true,length=20)
	public java.util.Date getSupplierDate(){
		return this.supplierDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  供货日期
	 */
	public void setSupplierDate(java.util.Date supplierDate){
		this.supplierDate = supplierDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  状态
	 */

	@Column(name ="STATUS",nullable=true,length=32)
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  状态
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  发货日期
	 */

	@Column(name ="SEND_DATE",nullable=true,length=20)
	public java.util.Date getSendDate(){
		return this.sendDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  发货日期
	 */
	public void setSendDate(java.util.Date sendDate){
		this.sendDate = sendDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="REMARK",nullable=true,length=100)
	public java.lang.String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setRemark(java.lang.String remark){
		this.remark = remark;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  订单数量
	 */

	@Column(name ="SALES_ORDER_COUNT",nullable=true,length=11)
	public java.lang.Integer getSalesOrderCount(){
		return this.salesOrderCount;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  订单数量
	 */
	public void setSalesOrderCount(java.lang.Integer salesOrderCount){
		this.salesOrderCount = salesOrderCount;
	}
}
