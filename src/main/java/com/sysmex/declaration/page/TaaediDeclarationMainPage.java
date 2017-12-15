
package com.sysmex.declaration.page;
import com.sysmex.declaration.entity.TaaediDeclarationMainEntity;
import com.sysmex.declaration.entity.TaaediDeclarationPackDetailEntity;
import com.sysmex.declaration.entity.TaaediDeclarationDetailEntity;

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
 * @Description: 报关单主表
 * @author onlineGenerator
 * @date 2017-12-12 17:52:49
 * @version V1.0   
 *
 */
public class TaaediDeclarationMainPage implements java.io.Serializable {
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
    @Excel(name="报关发票号")
	private java.lang.String customsInvoiceNo;
	/**海关单号*/
    @Excel(name="海关单号")
	private java.lang.String customsNo;
	/**提交申请日期*/
    @Excel(name="提交申请日期")
	private java.lang.String applicationDate;
	/**贸易方式*/
    @Excel(name="贸易方式")
	private java.lang.String tradeMode;
	/**报关行*/
    @Excel(name="报关行")
	private java.lang.String customsBroker;
	/**报关总金额*/
    @Excel(name="报关总金额")
	private java.math.BigDecimal totalAmount;
	/**备案号*/
    @Excel(name="备案号")
	private java.lang.String customsRecordno;
	/**进出口公司*/
    @Excel(name="进出口公司")
	private java.lang.String impExpCorp;
	/**运输方式*/
    @Excel(name="运输方式")
	private java.lang.String shippingType;
	/**运输工具名称*/
    @Excel(name="运输工具名称")
	private java.lang.String conveyance;
	/**运单号*/
    @Excel(name="运单号")
	private java.lang.String waybillNo;
	/**收货单位*/
    @Excel(name="收货单位")
	private java.lang.String consignee;
	/**报关合同号*/
    @Excel(name="报关合同号")
	private java.lang.String contractNo;
	/**征免性质*/
    @Excel(name="征免性质")
	private java.lang.String freeFlag;
	/**征税比例*/
    @Excel(name="征税比例")
	private java.lang.String taxRate;
	/**许可证号*/
    @Excel(name="许可证号")
	private java.lang.String licenceNo;
	/**启运国*/
    @Excel(name="启运国")
	private java.lang.String countryOfOrigin;
	/**装货港*/
    @Excel(name="装货港")
	private java.lang.String loadingPort;
	/**进口口岸*/
    @Excel(name="进口口岸")
	private java.lang.String importPort;
	/**境内目的地*/
    @Excel(name="境内目的地")
	private java.lang.String inlandDestination;
	/**批准文号*/
    @Excel(name="批准文号")
	private java.lang.String approvalNumber;
	/**成交方式*/
    @Excel(name="成交方式")
	private java.lang.String dealMode;
	/**件数*/
    @Excel(name="件数")
	private java.lang.Integer quantity;
	/**集装箱号*/
    @Excel(name="集装箱号")
	private java.lang.String containerNo;
	/**用途*/
    @Excel(name="用途")
	private java.lang.String purpose;
	/**报关状态*/
    @Excel(name="报关状态")
	private java.lang.String status;
	/**报关单*/
    @Excel(name="报关单")
	private java.lang.String customsBill;
	/**税单*/
    @Excel(name="税单")
	private java.lang.String taxBill;
	/**进岸清单*/
    @Excel(name="进岸清单")
	private java.lang.String impList;
	/**是否紧急标志*/
    @Excel(name="是否紧急标志")
	private java.lang.String urgentFlag;
	/**附件标志*/
    @Excel(name="附件标志")
	private java.lang.Integer attachmentFlag;
	/**预警提示*/
    @Excel(name="预警提示")
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
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  报关发票号
	 */
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
	 *@return: java.lang.String  海关单号
	 */
	public java.lang.String getCustomsNo(){
		return this.customsNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  海关单号
	 */
	public void setCustomsNo(java.lang.String customsNo){
		this.customsNo = customsNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  提交申请日期
	 */
	public java.lang.String getApplicationDate(){
		return this.applicationDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  提交申请日期
	 */
	public void setApplicationDate(java.lang.String applicationDate){
		this.applicationDate = applicationDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  贸易方式
	 */
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
	 *@return: java.lang.String  报关行
	 */
	public java.lang.String getCustomsBroker(){
		return this.customsBroker;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  报关行
	 */
	public void setCustomsBroker(java.lang.String customsBroker){
		this.customsBroker = customsBroker;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  报关总金额
	 */
	public java.math.BigDecimal getTotalAmount(){
		return this.totalAmount;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  报关总金额
	 */
	public void setTamount(java.math.BigDecimal totalAmount){
		this.totalAmount = totalAmount;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备案号
	 */
	public java.lang.String getCustomsRecordno(){
		return this.customsRecordno;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备案号
	 */
	public void setCustomsRecordno(java.lang.String customsRecordno){
		this.customsRecordno = customsRecordno;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  进出口公司
	 */
	public java.lang.String getImpExpCorp(){
		return this.impExpCorp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  进出口公司
	 */
	public void setImpExpCorp(java.lang.String impExpCorp){
		this.impExpCorp = impExpCorp;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  运输方式
	 */
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
	 *@return: java.lang.String  运输工具名称
	 */
	public java.lang.String getConveyance(){
		return this.conveyance;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  运输工具名称
	 */
	public void setConveyance(java.lang.String conveyance){
		this.conveyance = conveyance;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  运单号
	 */
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
	 *@return: java.lang.String  收货单位
	 */
	public java.lang.String getConsignee(){
		return this.consignee;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  收货单位
	 */
	public void setConsignee(java.lang.String consignee){
		this.consignee = consignee;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  报关合同号
	 */
	public java.lang.String getContractNo(){
		return this.contractNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  报关合同号
	 */
	public void setContractNo(java.lang.String contractNo){
		this.contractNo = contractNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  征免性质
	 */
	public java.lang.String getFreeFlag(){
		return this.freeFlag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  征免性质
	 */
	public void setFreeFlag(java.lang.String freeFlag){
		this.freeFlag = freeFlag;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  征税比例
	 */
	public java.lang.String getTaxRate(){
		return this.taxRate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  征税比例
	 */
	public void setTaxRate(java.lang.String taxRate){
		this.taxRate = taxRate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  许可证号
	 */
	public java.lang.String getLicenceNo(){
		return this.licenceNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  许可证号
	 */
	public void setLicenceNo(java.lang.String licenceNo){
		this.licenceNo = licenceNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  启运国
	 */
	public java.lang.String getCountryOfOrigin(){
		return this.countryOfOrigin;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  启运国
	 */
	public void setCountryOfOrigin(java.lang.String countryOfOrigin){
		this.countryOfOrigin = countryOfOrigin;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  装货港
	 */
	public java.lang.String getLoadingPort(){
		return this.loadingPort;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  装货港
	 */
	public void setLoadingPort(java.lang.String loadingPort){
		this.loadingPort = loadingPort;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  进口口岸
	 */
	public java.lang.String getImportPort(){
		return this.importPort;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  进口口岸
	 */
	public void setImportPort(java.lang.String importPort){
		this.importPort = importPort;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  境内目的地
	 */
	public java.lang.String getInlandDestination(){
		return this.inlandDestination;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  境内目的地
	 */
	public void setInlandDestination(java.lang.String inlandDestination){
		this.inlandDestination = inlandDestination;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  批准文号
	 */
	public java.lang.String getApprovalNumber(){
		return this.approvalNumber;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  批准文号
	 */
	public void setApprovalNumber(java.lang.String approvalNumber){
		this.approvalNumber = approvalNumber;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  成交方式
	 */
	public java.lang.String getDealMode(){
		return this.dealMode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  成交方式
	 */
	public void setDealMode(java.lang.String dealMode){
		this.dealMode = dealMode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  件数
	 */
	public java.lang.Integer getQuantity(){
		return this.quantity;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  件数
	 */
	public void setQuantity(java.lang.Integer quantity){
		this.quantity = quantity;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  集装箱号
	 */
	public java.lang.String getContainerNo(){
		return this.containerNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  集装箱号
	 */
	public void setContainerNo(java.lang.String containerNo){
		this.containerNo = containerNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用途
	 */
	public java.lang.String getPurpose(){
		return this.purpose;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用途
	 */
	public void setPurpose(java.lang.String purpose){
		this.purpose = purpose;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  报关状态
	 */
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  报关状态
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  报关单
	 */
	public java.lang.String getCustomsBill(){
		return this.customsBill;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  报关单
	 */
	public void setCustomsBill(java.lang.String customsBill){
		this.customsBill = customsBill;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  税单
	 */
	public java.lang.String getTaxBill(){
		return this.taxBill;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  税单
	 */
	public void setTaxBill(java.lang.String taxBill){
		this.taxBill = taxBill;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  进岸清单
	 */
	public java.lang.String getImpList(){
		return this.impList;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  进岸清单
	 */
	public void setImpList(java.lang.String impList){
		this.impList = impList;
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

	/**保存-报关箱单明细*/
    @ExcelCollection(name="报关箱单明细")
	private List<TaaediDeclarationPackDetailEntity> taaediDeclarationPackDetailList = new ArrayList<TaaediDeclarationPackDetailEntity>();
		public List<TaaediDeclarationPackDetailEntity> getTaaediDeclarationPackDetailList() {
		return taaediDeclarationPackDetailList;
		}
		public void setTaaediDeclarationPackDetailList(List<TaaediDeclarationPackDetailEntity> taaediDeclarationPackDetailList) {
		this.taaediDeclarationPackDetailList = taaediDeclarationPackDetailList;
		}
	/**保存-报关明细*/
    @ExcelCollection(name="报关明细")
	private List<TaaediDeclarationDetailEntity> taaediDeclarationDetailList = new ArrayList<TaaediDeclarationDetailEntity>();
		public List<TaaediDeclarationDetailEntity> getTaaediDeclarationDetailList() {
		return taaediDeclarationDetailList;
		}
		public void setTaaediDeclarationDetailList(List<TaaediDeclarationDetailEntity> taaediDeclarationDetailList) {
		this.taaediDeclarationDetailList = taaediDeclarationDetailList;
		}
}
