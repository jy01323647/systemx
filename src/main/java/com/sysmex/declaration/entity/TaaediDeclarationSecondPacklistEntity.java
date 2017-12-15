package com.sysmex.declaration.entity;
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
 * @Description: 二次报关箱单明细
 * @author onlineGenerator
 * @date 2017-12-14 22:51:15
 * @version V1.0   
 *
 */
@Entity
@Table(name = "taaedi_declaration_second_packlist", schema = "")
@SuppressWarnings("serial")
public class TaaediDeclarationSecondPacklistEntity implements java.io.Serializable {
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
	/**报关主表ID*/
    @Excel(name="报关主表ID",width=15)
	private java.lang.String mainId;
	/**销售订单号*/
    @Excel(name="销售订单号",width=15)
	private java.lang.String saleorderNo;
	/**库存流水号*/
    @Excel(name="库存流水号",width=15)
	private java.lang.String inventoryNo;
	/**二次报关发票号*/
    @Excel(name="二次报关发票号",width=15)
	private java.lang.String customsInvoiceNo;
	/**二次报关数量*/
    @Excel(name="二次报关数量",width=15)
	private java.lang.Integer customsQuantity;
	/**二次报关状态*/
    @Excel(name="二次报关状态",width=15)
	private java.lang.String customsStatus;
	/**进境报关发票号*/
    @Excel(name="进境报关发票号",width=15)
	private java.lang.String entryInvoiceNo;
	/**进境报关数量*/
    @Excel(name="进境报关数量",width=15)
	private java.lang.Integer entryQuantity;
	/**进境报关状态*/
    @Excel(name="进境报关状态",width=15)
	private java.lang.String entryStatus;
	/**运单号*/
    @Excel(name="运单号",width=15)
	private java.lang.String waybillNo;
	/**子订单编码*/
    @Excel(name="子订单编码",width=15)
	private java.lang.String billNo;
	/**发票编号*/
    @Excel(name="发票编号",width=15)
	private java.lang.String invoiceNo;
	/**装箱单号*/
    @Excel(name="装箱单号",width=15)
	private java.lang.String packNo;
	/**箱单数量*/
    @Excel(name="箱单数量",width=15)
	private java.lang.Integer packQuantity;
	/**包装规格*/
    @Excel(name="包装规格",width=15)
	private java.lang.String packageType;
	/**单位*/
    @Excel(name="单位",width=15)
	private java.math.BigDecimal units;
	/**净重 */
    @Excel(name="净重 ",width=15)
	private java.math.BigDecimal netWeight;
	/**毛重*/
    @Excel(name="毛重",width=15)
	private java.math.BigDecimal grossWeight;
	/**长宽高*/
    @Excel(name="长宽高",width=15)
	private java.lang.String dimension;
	/**体积*/
    @Excel(name="体积",width=15)
	private java.math.BigDecimal volume;
	/**物品名称*/
    @Excel(name="物品名称",width=15)
	private java.lang.String itemName;
	/**物品编码*/
    @Excel(name="物品编码",width=15)
	private java.lang.String itemNum;
	/**物品类型*/
    @Excel(name="物品类型",width=15)
	private java.lang.String itemCategory;
	/**供应商编码*/
    @Excel(name="供应商编码",width=15)
	private java.lang.String vendorNum;
	/**供应商名称*/
    @Excel(name="供应商名称",width=15)
	private java.lang.String vendorName;
	/**订单日期*/
    @Excel(name="订单日期",width=15)
	private java.lang.String billDate;
	/**币种*/
    @Excel(name="币种",width=15)
	private java.lang.String currency;
	/**订单数量*/
    @Excel(name="订单数量",width=15)
	private java.lang.Integer poQuantity;
	/**单价*/
    @Excel(name="单价",width=15)
	private java.math.BigDecimal unitPrice;
	/**订单总金额*/
    @Excel(name="订单总金额",width=15)
	private java.math.BigDecimal poAmount;
	/**预计到货日期*/
    @Excel(name="预计到货日期",width=15)
	private java.lang.String planArrivalDate;
	/**订单类型*/
    @Excel(name="订单类型",width=15)
	private java.lang.String billType;
	/**订单状态*/
    @Excel(name="订单状态",width=15)
	private java.lang.String status;
	/**运输商*/
    @Excel(name="运输商",width=15)
	private java.lang.String carrierNum;
	/**运输商名称*/
    @Excel(name="运输商名称",width=15)
	private java.lang.String carrierName;
	/**运输方式*/
    @Excel(name="运输方式",width=15)
	private java.lang.String shippingType;
	/**运输要求*/
    @Excel(name="运输要求",width=15)
	private java.lang.String shippingRequirement;
	/**贸易条款*/
    @Excel(name="贸易条款",width=15)
	private java.lang.String tradeTerms;
	/**贸易方式*/
    @Excel(name="贸易方式",width=15)
	private java.lang.String tradeMode;
	/**预警提示*/
    @Excel(name="预警提示",width=15)
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
	 *@return: java.lang.String  报关主表ID
	 */
	
	@Column(name ="MAIN_ID",nullable=true,length=36)
	public java.lang.String getMainId(){
		return this.mainId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  报关主表ID
	 */
	public void setMainId(java.lang.String mainId){
		this.mainId = mainId;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  销售订单号
	 */
	
	@Column(name ="SALEORDER_NO",nullable=true,length=50)
	public java.lang.String getSaleorderNo(){
		return this.saleorderNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  销售订单号
	 */
	public void setSaleorderNo(java.lang.String saleorderNo){
		this.saleorderNo = saleorderNo;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  库存流水号
	 */
	
	@Column(name ="INVENTORY_NO",nullable=true,length=50)
	public java.lang.String getInventoryNo(){
		return this.inventoryNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  库存流水号
	 */
	public void setInventoryNo(java.lang.String inventoryNo){
		this.inventoryNo = inventoryNo;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  二次报关发票号
	 */
	
	@Column(name ="CUSTOMS_INVOICE_NO",nullable=true,length=50)
	public java.lang.String getCustomsInvoiceNo(){
		return this.customsInvoiceNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  二次报关发票号
	 */
	public void setCustomsInvoiceNo(java.lang.String customsInvoiceNo){
		this.customsInvoiceNo = customsInvoiceNo;
	}
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  二次报关数量
	 */
	
	@Column(name ="CUSTOMS_QUANTITY",nullable=true,length=10)
	public java.lang.Integer getCustomsQuantity(){
		return this.customsQuantity;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  二次报关数量
	 */
	public void setCustomsQuantity(java.lang.Integer customsQuantity){
		this.customsQuantity = customsQuantity;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  二次报关状态
	 */
	
	@Column(name ="CUSTOMS_STATUS",nullable=true,length=50)
	public java.lang.String getCustomsStatus(){
		return this.customsStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  二次报关状态
	 */
	public void setCustomsStatus(java.lang.String customsStatus){
		this.customsStatus = customsStatus;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  进境报关发票号
	 */
	
	@Column(name ="ENTRY_INVOICE_NO",nullable=true,length=50)
	public java.lang.String getEntryInvoiceNo(){
		return this.entryInvoiceNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  进境报关发票号
	 */
	public void setEntryInvoiceNo(java.lang.String entryInvoiceNo){
		this.entryInvoiceNo = entryInvoiceNo;
	}
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  进境报关数量
	 */
	
	@Column(name ="ENTRY_QUANTITY",nullable=true,length=10)
	public java.lang.Integer getEntryQuantity(){
		return this.entryQuantity;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  进境报关数量
	 */
	public void setEntryQuantity(java.lang.Integer entryQuantity){
		this.entryQuantity = entryQuantity;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  进境报关状态
	 */
	
	@Column(name ="ENTRY_STATUS",nullable=true,length=50)
	public java.lang.String getEntryStatus(){
		return this.entryStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  进境报关状态
	 */
	public void setEntryStatus(java.lang.String entryStatus){
		this.entryStatus = entryStatus;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  运单号
	 */
	
	@Column(name ="WAYBILL_NO",nullable=true,length=50)
	public java.lang.String getWaybillNo(){
		return this.waybillNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  运单号
	 */
	public void setWaybillNo(java.lang.String waybillNo){
		this.waybillNo = waybillNo;
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
	 *@return: java.lang.String  装箱单号
	 */
	
	@Column(name ="PACK_NO",nullable=true,length=50)
	public java.lang.String getPackNo(){
		return this.packNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  装箱单号
	 */
	public void setPackNo(java.lang.String packNo){
		this.packNo = packNo;
	}
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  箱单数量
	 */
	
	@Column(name ="PACK_QUANTITY",nullable=true,length=10)
	public java.lang.Integer getPackQuantity(){
		return this.packQuantity;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  箱单数量
	 */
	public void setPackQuantity(java.lang.Integer packQuantity){
		this.packQuantity = packQuantity;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  包装规格
	 */
	
	@Column(name ="PACKAGE_TYPE",nullable=true,length=50)
	public java.lang.String getPackageType(){
		return this.packageType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  包装规格
	 */
	public void setPackageType(java.lang.String packageType){
		this.packageType = packageType;
	}
	
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  单位
	 */
	
	@Column(name ="UNITS",nullable=true,scale=2,length=20)
	public java.math.BigDecimal getUnits(){
		return this.units;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  单位
	 */
	public void setUnits(java.math.BigDecimal units){
		this.units = units;
	}
	
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  净重 
	 */
	
	@Column(name ="NET_WEIGHT",nullable=true,scale=2,length=20)
	public java.math.BigDecimal getNetWeight(){
		return this.netWeight;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  净重 
	 */
	public void setNetWeight(java.math.BigDecimal netWeight){
		this.netWeight = netWeight;
	}
	
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  毛重
	 */
	
	@Column(name ="GROSS_WEIGHT",nullable=true,scale=2,length=20)
	public java.math.BigDecimal getGrossWeight(){
		return this.grossWeight;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  毛重
	 */
	public void setGrossWeight(java.math.BigDecimal grossWeight){
		this.grossWeight = grossWeight;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  长宽高
	 */
	
	@Column(name ="DIMENSION",nullable=true,length=50)
	public java.lang.String getDimension(){
		return this.dimension;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  长宽高
	 */
	public void setDimension(java.lang.String dimension){
		this.dimension = dimension;
	}
	
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  体积
	 */
	
	@Column(name ="VOLUME",nullable=true,scale=2,length=20)
	public java.math.BigDecimal getVolume(){
		return this.volume;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  体积
	 */
	public void setVolume(java.math.BigDecimal volume){
		this.volume = volume;
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单日期
	 */
	
	@Column(name ="BILL_DATE",nullable=true,length=50)
	public java.lang.String getBillDate(){
		return this.billDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单日期
	 */
	public void setBillDate(java.lang.String billDate){
		this.billDate = billDate;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  币种
	 */
	
	@Column(name ="CURRENCY",nullable=true,length=50)
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  订单数量
	 */
	
	@Column(name ="PO_QUANTITY",nullable=true,length=10)
	public java.lang.Integer getPoQuantity(){
		return this.poQuantity;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  订单数量
	 */
	public void setPoQuantity(java.lang.Integer poQuantity){
		this.poQuantity = poQuantity;
	}
	
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  单价
	 */
	
	@Column(name ="UNIT_PRICE",nullable=true,scale=3,length=20)
	public java.math.BigDecimal getUnitPrice(){
		return this.unitPrice;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  单价
	 */
	public void setUnitPrice(java.math.BigDecimal unitPrice){
		this.unitPrice = unitPrice;
	}
	
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  订单总金额
	 */
	
	@Column(name ="PO_AMOUNT",nullable=true,scale=3,length=20)
	public java.math.BigDecimal getPoAmount(){
		return this.poAmount;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  订单总金额
	 */
	public void setPoAmount(java.math.BigDecimal poAmount){
		this.poAmount = poAmount;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  预计到货日期
	 */
	
	@Column(name ="PLAN_ARRIVAL_DATE",nullable=true,length=50)
	public java.lang.String getPlanArrivalDate(){
		return this.planArrivalDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  预计到货日期
	 */
	public void setPlanArrivalDate(java.lang.String planArrivalDate){
		this.planArrivalDate = planArrivalDate;
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
	 *@return: java.lang.String  预警提示
	 */
	
	@Column(name ="REMARK_FLAG",nullable=true,length=50)
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
	
	@Column(name ="DEL_DATE",nullable=true,length=20)
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
