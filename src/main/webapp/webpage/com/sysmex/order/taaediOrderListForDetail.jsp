<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="taaediOrderDetailList" checkbox="false" pagination="true" fitColumns="false" title="采购订单明细表" actionUrl="taaediOrderMainController.do?datagridForDetail" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人登录名称"  field="createBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人名称"  field="updateName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人登录名称"  field="updateBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新日期"  field="updateDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属部门"  field="sysOrgCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属公司"  field="sysCompanyCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="流程状态"  field="bpmStatus" hidden="true"   queryMode="single"  dictionary="bpm_status"  width="120"></t:dgCol>
   <t:dgCol title="主订单编号"  field="mmBillNo" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="子订单编号"  field="billNo"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="物品名称"  field="itemName" query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="物品编码"  field="itemNum" query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="物品类型"  field="itemCategory"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="供应商编码"  field="vendorNum" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="供应商名称"  field="vendorName" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单据日期"  field="billDate"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="币种"  field="currency" query="true" queryMode="single"  dictionary="currency"  width="120"></t:dgCol>
   <t:dgCol title="订单数量"  field="quantity"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="箱单数量"  field="packQuantity"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单价"  field="unitPrice"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="订单总金额"  field="tAmount"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预计到货日期"  field="ppArrivalDate"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="订单类型"  field="billType" query="true" queryMode="single"  dictionary="bill_type"  width="120"></t:dgCol>
   <t:dgCol title="订单状态"  field="status" query="true" queryMode="single"  dictionary="order_detail_status"  width="120"></t:dgCol>
   <t:dgCol title="运输商"  field="carrierNum"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="运输商名称"  field="carrierName"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="运输方式"  field="shippingType" query="true"  queryMode="single"  dictionary="shiptype"  width="120"></t:dgCol>
   <t:dgCol title="运输要求"  field="shippingRequirement"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="贸易条款"  field="tradeTerms"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="贸易方式"  field="tradeMode"  queryMode="single"  dictionary="trade_mode"  width="120"></t:dgCol>
   <t:dgCol title="是否紧急标志"  field="urgentFlag"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="附件标志"  field="attachmentFlag"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预警提示"  field="remarkFlag"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="memo"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="删除标记"  field="delflag"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="删除时间"  field="delDate"  hidden="true"  queryMode="single"  width="120"></t:dgCol>



   <t:dgToolBar title="查看" icon="icon-search" url="taaediOrderDetailController.do?goUpdate" funname="detail"></t:dgToolBar>

  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/sysmex/order/taaediOrderDetailList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'taaediOrderDetailController.do?upload', "taaediOrderDetailList");
}

//导出
function ExportXls() {
	JeecgExcelExport("taaediOrderDetailController.do?exportXls","taaediOrderDetailList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("taaediOrderDetailController.do?exportXlsByT","taaediOrderDetailList");
}

 </script>