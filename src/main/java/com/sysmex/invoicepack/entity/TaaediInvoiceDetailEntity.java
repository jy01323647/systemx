package com.sysmex.invoicepack.entity;
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
 * @Description: TaaediInvoiceDetail
 * @author onlineGenerator
 * @date 2017-12-13 12:31:54
 * @version V1.0   
 *
 */
@Entity
@Table(name = "taaedi_invoice_detail", schema = "")
@SuppressWarnings("serial")
public class TaaediInvoiceDetailEntity implements java.io.Serializable {
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
	/**发票编号*/
    @Excel(name="发票编号",width=15)
	private java.lang.String invoiceNo;
	/**子订单编码*/
	private java.lang.String billNo;
	/**物品名称*/
    @Excel(name="物品名称",width=15)
	private java.lang.String itemName;
	/**物品编码*/
    @Excel(name="物品编码",width=15)
	private java.lang.String itemNum;
	/**币种*/
    @Excel(name="币种",width=15,dicCode="currency")
	private java.lang.String currency;
	/**开票数量*/
    @Excel(name="开票数量",width=15)
	private java.lang.Double quantity;
	/**单价*/
    @Excel(name="单价",width=15)
	private java.lang.Double unitPrice;
	/**开票金额*/
    @Excel(name="开票金额",width=15)
	private java.lang.Double totalAmount;
	/**是否紧急标志*/
	private java.lang.String urgentFlag;
	/**附件标志*/
	private java.lang.String attachmentFlag;
	/**预警提示*/
	private java.lang.String remarkFlag;
	/**备注*/
    @Excel(name="备注",width=15)
	private java.lang.String memo;
	/**删除标记*/
	private java.lang.Integer delflag;
	/**删除时间*/
	private java.util.Date delDate;
	
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
	 *@return: java.lang.String  发票编号
	 */
	
	@Column(name ="INVOICE_NO",nullable=true,length=50)
	public java.lang.String getInvoiceNo(){
		return this.invoiceNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  发票编号
	 */
	public void setInvoiceNo(java.lang.String invoiceNo){
		this.invoiceNo = invoiceNo;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  子订单编码
	 */
	
	@Column(name ="BILL_NO",nullable=true,length=50)
	public java.lang.String getBillNo(){
		return this.billNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  子订单编码
	 */
	public void setBillNo(java.lang.String billNo){
		this.billNo = billNo;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  物品名称
	 */
	
	@Column(name ="ITEM_NAME",nullable=true,length=50)
	public java.lang.String getItemName(){
		return this.itemName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  物品名称
	 */
	public void setItemName(java.lang.String itemName){
		this.itemName = itemName;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  物品编码
	 */
	
	@Column(name ="ITEM_NUM",nullable=true,length=50)
	public java.lang.String getItemNum(){
		return this.itemNum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  物品编码
	 */
	public void setItemNum(java.lang.String itemNum){
		this.itemNum = itemNum;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  币种
	 */
	
	@Column(name ="CURRENCY",nullable=true,length=10)
	public java.lang.String getCurrency(){
		return this.currency;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  币种
	 */
	public void setCurrency(java.lang.String currency){
		this.currency = currency;
	}
	
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  开票数量
	 */
	
	@Column(name ="QUANTITY",nullable=true,scale=3,length=20)
	public java.lang.Double getQuantity(){
		return this.quantity;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  开票数量
	 */
	public void setQuantity(java.lang.Double quantity){
		this.quantity = quantity;
	}
	
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  单价
	 */
	
	@Column(name ="UNIT_PRICE",nullable=true,scale=3,length=20)
	public java.lang.Double getUnitPrice(){
		return this.unitPrice;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  单价
	 */
	public void setUnitPrice(java.lang.Double unitPrice){
		this.unitPrice = unitPrice;
	}
	
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  开票金额
	 */
	
	@Column(name ="TOTAL_AMOUNT",nullable=true,scale=3,length=20)
	public java.lang.Double getTotalAmount(){
		return this.totalAmount;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  开票金额
	 */
	public void setTotalAmount(java.lang.Double totalAmount){
		this.totalAmount = totalAmount;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否紧急标志
	 */
	
	@Column(name ="URGENT_FLAG",nullable=true,length=50)
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  附件标志
	 */
	
	@Column(name ="ATTACHMENT_FLAG",nullable=true,length=3)
	public java.lang.String getAttachmentFlag(){
		return this.attachmentFlag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  附件标志
	 */
	public void setAttachmentFlag(java.lang.String attachmentFlag){
		this.attachmentFlag = attachmentFlag;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  预警提示
	 */
	
	@Column(name ="REMARK_FLAG",nullable=true,length=3)
	public java.lang.String getRemarkFlag(){
		return this.remarkFlag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  预警提示
	 */
	public void setRemarkFlag(java.lang.String remarkFlag){
		this.remarkFlag = remarkFlag;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */
	
	@Column(name ="MEMO",nullable=true,length=32)
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
	
	@Column(name ="DELFLAG",nullable=true,length=2)
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
	
	@Column(name ="DEL_DATE",nullable=true,length=32)
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
	
}
