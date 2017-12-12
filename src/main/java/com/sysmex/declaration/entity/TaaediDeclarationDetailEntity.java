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
 * @Description: 报关明细
 * @author onlineGenerator
 * @date 2017-12-12 17:52:49
 * @version V1.0   
 *
 */
@Entity
@Table(name = "taaedi_declaration_detail", schema = "")
@SuppressWarnings("serial")
public class TaaediDeclarationDetailEntity implements java.io.Serializable {
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
	/**报关发票号*/
    @Excel(name="报关发票号",width=15)
	private java.lang.String customsInvoiceNo;
	/**海关品编号*/
    @Excel(name="海关品编号",width=15)
	private java.lang.String customsGoodsNum;
	/**海关品名称*/
    @Excel(name="海关品名称",width=15)
	private java.lang.String customsGoodsName;
	/**原产国*/
    @Excel(name="原产国",width=15)
	private java.lang.String provenance;
	/**币种*/
    @Excel(name="币种",width=15)
	private java.lang.String currency;
	/**本次报关数量*/
    @Excel(name="本次报关数量",width=15)
	private java.math.BigDecimal customsQuantity;
	/**原始单价*/
    @Excel(name="原始单价",width=15)
	private java.math.BigDecimal unitPriceOriginal;
	/**基准单价*/
    @Excel(name="基准单价",width=15)
	private java.math.BigDecimal unitPriceBase;
	/**调整单价*/
    @Excel(name="调整单价",width=15)
	private java.math.BigDecimal unitPriceUpdate;
	/**运费分摊单价*/
    @Excel(name="运费分摊单价",width=15)
	private java.math.BigDecimal unitPriceShippingfee;
	/**合计单价*/
    @Excel(name="合计单价",width=15)
	private java.math.BigDecimal untiPriceTotal;
	/**报关金额*/
    @Excel(name="报关金额",width=15)
	private java.math.BigDecimal customsAmount;
	/**税择号*/
    @Excel(name="税择号",width=15)
	private java.lang.String hscode;
	/**特殊审批单*/
    @Excel(name="特殊审批单",width=15)
	private java.lang.String licenceSpecial;
	/**动植物审批单*/
    @Excel(name="动植物审批单",width=15)
	private java.lang.String licenceAnimalPlant;
	/**特殊物品审批单*/
    @Excel(name="特殊物品审批单",width=15)
	private java.lang.String licenceSpecialgoods;
	/**濒危证*/
    @Excel(name="濒危证",width=15)
	private java.lang.String licenceEndangered;
	/**免征标志*/
    @Excel(name="免征标志",width=15)
	private java.lang.String freeFlag;
	/**包装规格*/
    @Excel(name="包装规格",width=15)
	private java.lang.String packageType;
	/**单位*/
    @Excel(name="单位",width=15)
	private java.lang.String units;
	/**净重*/
    @Excel(name="净重",width=15)
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
	/**是否紧急标志*/
    @Excel(name="是否紧急标志",width=15)
	private java.lang.String urgentFlag;
	/**附件标志*/
    @Excel(name="附件标志",width=15)
	private java.lang.Integer attachmentFlag;
	/**预警提示*/
    @Excel(name="预警提示",width=15)
	private java.lang.Integer remarkFlag;
	/**备注*/
    @Excel(name="备注",width=15)
	private java.lang.String memo;
	/**删除标记*/
	private java.lang.Integer delflag;
	/**删除时间*/
	private java.util.Date delDate;
	/**主表ID*/
	private java.lang.String mainId;
	
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
	 *@return: java.lang.String  报关发票号
	 */
	
	@Column(name ="CUSTOMS_INVOICE_NO",nullable=true,length=50)
	public java.lang.String getCustomsInvoiceNo(){
		return this.customsInvoiceNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  报关发票号
	 */
	public void setCustomsInvoiceNo(java.lang.String customsInvoiceNo){
		this.customsInvoiceNo = customsInvoiceNo;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  海关品编号
	 */
	
	@Column(name ="CUSTOMS_GOODS_NUM",nullable=true,length=50)
	public java.lang.String getCustomsGoodsNum(){
		return this.customsGoodsNum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  海关品编号
	 */
	public void setCustomsGoodsNum(java.lang.String customsGoodsNum){
		this.customsGoodsNum = customsGoodsNum;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  海关品名称
	 */
	
	@Column(name ="CUSTOMS_GOODS_NAME",nullable=true,length=50)
	public java.lang.String getCustomsGoodsName(){
		return this.customsGoodsName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  海关品名称
	 */
	public void setCustomsGoodsName(java.lang.String customsGoodsName){
		this.customsGoodsName = customsGoodsName;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  原产国
	 */
	
	@Column(name ="PROVENANCE",nullable=true,length=50)
	public java.lang.String getProvenance(){
		return this.provenance;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  原产国
	 */
	public void setProvenance(java.lang.String provenance){
		this.provenance = provenance;
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
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  本次报关数量
	 */
	
	@Column(name ="CUSTOMS_QUANTITY",nullable=true,scale=3,length=20)
	public java.math.BigDecimal getCustomsQuantity(){
		return this.customsQuantity;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  本次报关数量
	 */
	public void setCustomsQuantity(java.math.BigDecimal customsQuantity){
		this.customsQuantity = customsQuantity;
	}
	
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  原始单价
	 */
	
	@Column(name ="UNIT_PRICE_ORIGINAL",nullable=true,scale=3,length=20)
	public java.math.BigDecimal getUnitPriceOriginal(){
		return this.unitPriceOriginal;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  原始单价
	 */
	public void setUnitPriceOriginal(java.math.BigDecimal unitPriceOriginal){
		this.unitPriceOriginal = unitPriceOriginal;
	}
	
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  基准单价
	 */
	
	@Column(name ="UNIT_PRICE_BASE",nullable=true,scale=3,length=20)
	public java.math.BigDecimal getUnitPriceBase(){
		return this.unitPriceBase;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  基准单价
	 */
	public void setUnitPriceBase(java.math.BigDecimal unitPriceBase){
		this.unitPriceBase = unitPriceBase;
	}
	
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  调整单价
	 */
	
	@Column(name ="UNIT_PRICE_UPDATE",nullable=true,scale=3,length=20)
	public java.math.BigDecimal getUnitPriceUpdate(){
		return this.unitPriceUpdate;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  调整单价
	 */
	public void setUnitPriceUpdate(java.math.BigDecimal unitPriceUpdate){
		this.unitPriceUpdate = unitPriceUpdate;
	}
	
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  运费分摊单价
	 */
	
	@Column(name ="UNIT_PRICE_SHIPPINGFEE",nullable=true,scale=3,length=20)
	public java.math.BigDecimal getUnitPriceShippingfee(){
		return this.unitPriceShippingfee;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  运费分摊单价
	 */
	public void setUnitPriceShippingfee(java.math.BigDecimal unitPriceShippingfee){
		this.unitPriceShippingfee = unitPriceShippingfee;
	}
	
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  合计单价
	 */
	
	@Column(name ="UNTI_PRICE_TOTAL",nullable=true,scale=3,length=20)
	public java.math.BigDecimal getUntiPriceTotal(){
		return this.untiPriceTotal;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  合计单价
	 */
	public void setUntiPriceTotal(java.math.BigDecimal untiPriceTotal){
		this.untiPriceTotal = untiPriceTotal;
	}
	
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  报关金额
	 */
	
	@Column(name ="CUSTOMS_AMOUNT",nullable=true,scale=3,length=20)
	public java.math.BigDecimal getCustomsAmount(){
		return this.customsAmount;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  报关金额
	 */
	public void setCustomsAmount(java.math.BigDecimal customsAmount){
		this.customsAmount = customsAmount;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  税择号
	 */
	
	@Column(name ="HSCODE",nullable=true,length=50)
	public java.lang.String getHscode(){
		return this.hscode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  税择号
	 */
	public void setHscode(java.lang.String hscode){
		this.hscode = hscode;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  特殊审批单
	 */
	
	@Column(name ="LICENCE_SPECIAL",nullable=true,length=50)
	public java.lang.String getLicenceSpecial(){
		return this.licenceSpecial;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  特殊审批单
	 */
	public void setLicenceSpecial(java.lang.String licenceSpecial){
		this.licenceSpecial = licenceSpecial;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  动植物审批单
	 */
	
	@Column(name ="LICENCE_ANIMAL_PLANT",nullable=true,length=50)
	public java.lang.String getLicenceAnimalPlant(){
		return this.licenceAnimalPlant;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  动植物审批单
	 */
	public void setLicenceAnimalPlant(java.lang.String licenceAnimalPlant){
		this.licenceAnimalPlant = licenceAnimalPlant;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  特殊物品审批单
	 */
	
	@Column(name ="LICENCE_SPECIALGOODS",nullable=true,length=50)
	public java.lang.String getLicenceSpecialgoods(){
		return this.licenceSpecialgoods;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  特殊物品审批单
	 */
	public void setLicenceSpecialgoods(java.lang.String licenceSpecialgoods){
		this.licenceSpecialgoods = licenceSpecialgoods;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  濒危证
	 */
	
	@Column(name ="LICENCE_ENDANGERED",nullable=true,length=50)
	public java.lang.String getLicenceEndangered(){
		return this.licenceEndangered;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  濒危证
	 */
	public void setLicenceEndangered(java.lang.String licenceEndangered){
		this.licenceEndangered = licenceEndangered;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  免征标志
	 */
	
	@Column(name ="FREE_FLAG",nullable=true,length=50)
	public java.lang.String getFreeFlag(){
		return this.freeFlag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  免征标志
	 */
	public void setFreeFlag(java.lang.String freeFlag){
		this.freeFlag = freeFlag;
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位
	 */
	
	@Column(name ="UNITS",nullable=true,scale=2,length=20)
	public java.lang.String getUnits(){
		return this.units;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位
	 */
	public void setUnits(java.lang.String units){
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
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主表ID
	 */
	
	@Column(name ="MAIN_ID",nullable=true,length=36)
	public java.lang.String getMainId(){
		return this.mainId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主表ID
	 */
	public void setMainId(java.lang.String mainId){
		this.mainId = mainId;
	}
	
}
