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
 * @Description: 发票主表
 * @author onlineGenerator
 * @date 2017-12-13 12:31:54
 * @version V1.0   
 *
 */
@Entity
@Table(name = "taaedi_invoice_main", schema = "")
@SuppressWarnings("serial")
public class TaaediInvoiceMainEntity implements java.io.Serializable {
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
	/**供应商编码*/
    @Excel(name="供应商编码",width=15)
	private java.lang.String vendorNum;
	/**供应商名称*/
    @Excel(name="供应商名称",width=15)
	private java.lang.String vendorName;
	/**发票号*/
    @Excel(name="发票号",width=15)
	private java.lang.String invioceNo;
	/**开票日期 */
    @Excel(name="开票日期 ",width=15)
	private Date invioceDate;
	/**币种*/
	private java.lang.String currency;
	/**总金额 */
	private java.lang.Double totalAmount;
	/**总数量*/
	private java.lang.Double totalQuantity;
	/**总箱数*/
	private java.lang.String totalBoxQuantity;
	/**总净重*/
	private java.lang.Double totalNetWeight;
	/**总毛重*/
	private java.lang.Double totalGrossWeight;
	/**状态*/
	private java.lang.String status;
	/**是否紧急标志*/
	private java.lang.String urgentFlag;
	/**附件标志*/
	private java.lang.Integer attachmentFlag;
	/**预警提示*/
    @Excel(name="预警提示",width=15)
	private java.lang.Integer remarkFlag;
	/**备注*/
    @Excel(name="备注",width=15)
	private java.lang.String memo;
	/**删除标记*/
	private java.lang.String delflag;
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
	 *@return: java.lang.String  供应商编码
	 */
	
	@Column(name ="VENDOR_NUM",nullable=true,length=50)
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  供应商名称
	 */
	
	@Column(name ="VENDOR_NAME",nullable=true,length=50)
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
	 *@return: java.lang.String  发票号
	 */
	
	@Column(name ="INVIOCE_NO",nullable=true,length=50)
	public java.lang.String getInvioceNo(){
		return this.invioceNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  发票号
	 */
	public void setInvioceNo(java.lang.String invioceNo){
		this.invioceNo = invioceNo;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  开票日期 
	 */
	
	@Column(name ="INVIOCE_DATE",nullable=true,length=50)
	public Date getInvioceDate(){
		return this.invioceDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  开票日期 
	 */
	public void setInvioceDate(Date invioceDate){
		this.invioceDate = invioceDate;
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
	 *@return: java.lang.Double  总金额 
	 */
	
	@Column(name ="TOTAL_AMOUNT",nullable=true,scale=3,length=20)
	public java.lang.Double getTotalAmount(){
		return this.totalAmount;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  总金额 
	 */
	public void setTotalAmount(java.lang.Double totalAmount){
		this.totalAmount = totalAmount;
	}
	
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  总数量
	 */
	
	@Column(name ="TOTAL_QUANTITY",nullable=true,scale=3,length=20)
	public java.lang.Double getTotalQuantity(){
		return this.totalQuantity;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  总数量
	 */
	public void setTotalQuantity(java.lang.Double totalQuantity){
		this.totalQuantity = totalQuantity;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  总箱数
	 */
	
	@Column(name ="TOTAL_BOX_QUANTITY",nullable=true,length=50)
	public java.lang.String getTotalBoxQuantity(){
		return this.totalBoxQuantity;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  总箱数
	 */
	public void setTotalBoxQuantity(java.lang.String totalBoxQuantity){
		this.totalBoxQuantity = totalBoxQuantity;
	}
	
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  总净重
	 */
	
	@Column(name ="TOTAL_NET_WEIGHT",nullable=true,scale=3,length=20)
	public java.lang.Double getTotalNetWeight(){
		return this.totalNetWeight;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  总净重
	 */
	public void setTotalNetWeight(java.lang.Double totalNetWeight){
		this.totalNetWeight = totalNetWeight;
	}
	
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  总毛重
	 */
	
	@Column(name ="TOTAL_GROSS_WEIGHT",nullable=true,scale=3,length=20)
	public java.lang.Double getTotalGrossWeight(){
		return this.totalGrossWeight;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  总毛重
	 */
	public void setTotalGrossWeight(java.lang.Double totalGrossWeight){
		this.totalGrossWeight = totalGrossWeight;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  状态
	 */
	
	@Column(name ="STATUS",nullable=true,length=50)
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  附件标志
	 */
	
	@Column(name ="ATTACHMENT_FLAG",nullable=true,length=3)
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
	
	@Column(name ="REMARK_FLAG",nullable=true,length=3)
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
	
	@Column(name ="MEMO",nullable=true,length=500)
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  删除标记
	 */
	
	@Column(name ="DELFLAG",nullable=true,length=2)
	public java.lang.String getDelflag(){
		return this.delflag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  删除标记
	 */
	public void setDelflag(java.lang.String delflag){
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
