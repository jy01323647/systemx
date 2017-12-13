<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="taaediInvoiceMainList" checkbox="true" fitColumns="true" title="发票主表" actionUrl="taaediInvoiceMainController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人登录名称"  field="createBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人名称"  field="updateName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人登录名称"  field="updateBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新日期"  field="updateDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属部门"  field="sysOrgCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属公司"  field="sysCompanyCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="流程状态"  field="bpmStatus"  hidden="true"  queryMode="single"  dictionary="bpm_status"  width="120"></t:dgCol>
   <t:dgCol title="供应商编码"  field="vendorNum"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="供应商名称"  field="vendorName"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="发票号"  field="invioceNo"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="开票日期 "  field="invioceDate"  formatter="yyyy-MM-dd"  query="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="币种"  field="currency"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="总金额 "  field="totalAmount"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="总数量"  field="totalQuantity"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="总箱数"  field="totalBoxQuantity"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="总净重"  field="totalNetWeight"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="总毛重"  field="totalGrossWeight"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="状态"  field="status"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="是否紧急标志"  field="urgentFlag"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="附件标志"  field="attachmentFlag"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预警提示"  field="remarkFlag"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="memo"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="删除标记"  field="delflag"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="删除时间"  field="delDate"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="taaediInvoiceMainController.do?doDel&id={id}"  urlclass="ace_button" urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="taaediInvoiceMainController.do?goAdd" funname="add" width="100%" height="100%"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="taaediInvoiceMainController.do?goUpdate" funname="update" width="100%" height="100%"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="taaediInvoiceMainController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="taaediInvoiceMainController.do?goUpdate" funname="detail" width="100%" height="100%"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/sysmex/invoicepack/taaediInvoiceMainList.js"></script>		
 <script type="text/javascript">
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'taaediInvoiceMainController.do?upload', "taaediInvoiceMainList");
}

//导出
function ExportXls() {
	JeecgExcelExport("taaediInvoiceMainController.do?exportXls","taaediInvoiceMainList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("taaediInvoiceMainController.do?exportXlsByT","taaediInvoiceMainList");
}
 </script>