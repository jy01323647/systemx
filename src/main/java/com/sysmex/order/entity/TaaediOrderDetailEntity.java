package com.sysmex.order.entity;
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
 * @Description: 采购订单明细
 * @author onlineGenerator
 * @date 2017-12-11 13:59:25
 * @version V1.0   
 *
 */
@Entity
@Table(name = "taaedi_order_detail", schema = "")
@SuppressWarnings("serial")
public class TaaediOrderDetailEntity implements java.io.Serializable {
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
	private java.lang.String mmBillNo;
	/**子订单编号*/
	private java.lang.String billNo;
	/**物品名称*/
    @Excel(name="物品名称",width=15)
	private java.lang.String itemName;
	/**物品编码*/
    @Excel(name="物品编码",width=15)
	private java.lang.String itemNum;
	/**物品类型*/
	private java.lang.String itemCategory;
	/**供应商编码*/
    @Excel(name="供应商编码",width=15)
	private java.lang.String vendorNum;
	/**供应商名称*/
    @Excel(name="供应商名称",width=15)
	private java.lang.String vendorName;
	/**单据日期*/
    @Excel(name="单据日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date billDate;
	/**币种*/
    @Excel(name="币种",width=15,dicCode="currency")
	private java.lang.String currency;
	/**订单数量*/
    @Excel(name="订单数量",width=15)
	private java.lang.Double quantity;
	/**箱单数量*/
    @Excel(name="箱单数量",width=15)
	private java.lang.Double packQuantity;
	/**单价*/
    @Excel(name="单价",width=15)
	private java.lang.Double unitPrice;
	/**订单总金额*/
	private java.lang.Double tAmount;
	/**预计到货日期*/
    @Excel(name="预计到货日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date ppArrivalDate;
	/**订单类型*/
    @Excel(name="订单类型",width=15,dicCode="bill_type")
	private java.lang.String billType;
	/**订单状态*/
	private java.lang.String status;
	/**运输商*/
	private java.lang.String carrierNum;
	/**运输商名称*/
    @Excel(name="运输商名称",width=15)
	private java.lang.String carrierName;
	/**运输方式*/
    @Excel(name="运输方式",width=15,dicCode="shiptype")
	private java.lang.String shippingType;
	/**运输要求*/
    @Excel(name="运输要求",width=15)
	private java.lang.String shippingRequirement;
	/**贸易条款*/
    @Excel(name="贸易条款",width=15)
	private java.lang.String tradeTerms;
	/**贸易方式*/
    @Excel(name="贸易方式",width=15,dicCode="trade_mode")
	private java.lang.String tradeMode;
	/**是否紧急标志*/
	private java.lang.String urgentFlag;
	/**附件标志*/
	private java.lang.Integer attachmentFlag;
	/**预警提示*/
	private java.lang.Integer remarkFlag;
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
	 *@return: java.lang.String  主订单编号
	 */

	@Column(name ="M_BILL_NO",nullable=true,length=50)
	public String getMmBillNo() {
		return mmBillNo;
	}

	public void setMmBillNo(String mmBillNo) {
		this.mmBillNo = mmBillNo;
	}

	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  子订单编号
	 */
	
	@Column(name ="BILL_NO",nullable=true,length=50)
	public java.lang.String getBillNo(){
		return this.billNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  子订单编号
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
	 *@return: java.lang.String  物品类型
	 */
	
	@Column(name ="ITEM_CATEGORY",nullable=true,length=50)
	public java.lang.String getItemCategory(){
		return this.itemCategory;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  物品类型
	 */
	public void setItemCategory(java.lang.String itemCategory){
		this.itemCategory = itemCategory;
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  单据日期
	 */
	
	@Column(name ="BILL_DATE",nullable=true,length=32)
	public java.util.Date getBillDate(){
		return this.billDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  单据日期
	 */
	public void setBillDate(java.util.Date billDate){
		this.billDate = billDate;
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
	 *@return: java.lang.Double  订单数量
	 */
	
	@Column(name ="QUANTITY",nullable=true,length=20)
	public java.lang.Double getQuantity(){
		return this.quantity;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  订单数量
	 */
	public void setQuantity(java.lang.Double quantity){
		this.quantity = quantity;
	}
	
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  箱单数量
	 */
	
	@Column(name ="PACK_QUANTITY",nullable=true,length=20)
	public java.lang.Double getPackQuantity(){
		return this.packQuantity;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  箱单数量
	 */
	public void setPackQuantity(java.lang.Double packQuantity){
		this.packQuantity = packQuantity;
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
	 *@return: java.lang.Double  订单总金额
	 */
	
	@Column(name ="T_AMOUNT",nullable=true,scale=3,length=20)
	public java.lang.Double gettAmount(){
		return this.tAmount;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  订单总金额
	 */
	public void settAmount(java.lang.Double tAmount){
		this.tAmount = tAmount;
	}


	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  预计到货日期
	 */



	@Column(name ="P_ARRIVAL_DATE",nullable=true,length=32)
	public Date getPpArrivalDate() {
		return ppArrivalDate;
	}

	public void setPpArrivalDate(Date ppArrivalDate) {
		this.ppArrivalDate = ppArrivalDate;
	}

	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单类型
	 */
	
	@Column(name ="BILL_TYPE",nullable=true,length=50)
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
	
	@Column(name ="STATUS",nullable=true,length=50)
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
	 *@return: java.lang.String  运输商
	 */
	
	@Column(name ="CARRIER_NUM",nullable=true,length=50)
	public java.lang.String getCarrierNum(){
		return this.carrierNum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  运输商
	 */
	public void setCarrierNum(java.lang.String carrierNum){
		this.carrierNum = carrierNum;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  运输商名称
	 */
	
	@Column(name ="CARRIER_NAME",nullable=true,length=50)
	public java.lang.String getCarrierName(){
		return this.carrierName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  运输商名称
	 */
	public void setCarrierName(java.lang.String carrierName){
		this.carrierName = carrierName;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  运输方式
	 */
	
	@Column(name ="SHIPPING_TYPE",nullable=true,length=50)
	public java.lang.String getShippingType(){
		return this.shippingType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  运输方式
	 */
	public void setShippingType(java.lang.String shippingType){
		this.shippingType = shippingType;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  运输要求
	 */
	
	@Column(name ="SHIPPING_REQUIREMENT",nullable=true,length=50)
	public java.lang.String getShippingRequirement(){
		return this.shippingRequirement;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  运输要求
	 */
	public void setShippingRequirement(java.lang.String shippingRequirement){
		this.shippingRequirement = shippingRequirement;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  贸易条款
	 */
	
	@Column(name ="TRADE_TERMS",nullable=true,length=500)
	public java.lang.String getTradeTerms(){
		return this.tradeTerms;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  贸易条款
	 */
	public void setTradeTerms(java.lang.String tradeTerms){
		this.tradeTerms = tradeTerms;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  贸易方式
	 */
	
	@Column(name ="TRADE_MODE",nullable=true,length=50)
	public java.lang.String getTradeMode(){
		return this.tradeMode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  贸易方式
	 */
	public void setTradeMode(java.lang.String tradeMode){
		this.tradeMode = tradeMode;
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
