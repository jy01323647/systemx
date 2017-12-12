<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="taaediDeclarationMainList" checkbox="true" fitColumns="true" title="报关单主表" actionUrl="taaediDeclarationMainController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人登录名称"  field="createBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人名称"  field="updateName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人登录名称"  field="updateBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新日期"  field="updateDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属部门"  field="sysOrgCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属公司"  field="sysCompanyCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="流程状态"  field="bpmStatus"  queryMode="single"  dictionary="bpm_status"  width="120"></t:dgCol>
   <t:dgCol title="报关发票号"  field="customsInvoiceNo"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="海关单号"  field="customsNo"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="提交申请日期"  field="applicationDate"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="贸易方式"  field="tradeMode"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="报关行"  field="customsBroker"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="报关总金额"  field="tamount"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="备案号"  field="customsRecordno"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="进出口公司"  field="impExpCorp"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="运输方式"  field="shippingType"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="运输工具名称"  field="conveyance"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="运单号"  field="waybillNo"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="收货单位"  field="consignee"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="报关合同号"  field="contractNo"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="征免性质"  field="freeFlag"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="征税比例"  field="taxRate"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="许可证号"  field="licenceNo"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="启运国"  field="countryOfOrigin"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="装货港"  field="loadingPort"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="进口口岸"  field="importPort"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="境内目的地"  field="inlandDestination"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="批准文号"  field="approvalNumber"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="成交方式"  field="dealMode"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="件数"  field="quantity"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="集装箱号"  field="containerNo"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="用途"  field="purpose"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="报关状态"  field="status"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="报关单"  field="customsBill"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="税单"  field="taxBill"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="进岸清单"  field="impList"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="是否紧急标志"  field="urgentFlag"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="附件标志"  field="attachmentFlag"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预警提示"  field="remarkFlag"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="memo"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="删除标记"  field="delflag"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="删除时间"  field="delDate"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="taaediDeclarationMainController.do?doDel&id={id}"  urlclass="ace_button" urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="taaediDeclarationMainController.do?goAdd" funname="add" width="100%" height="100%"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="taaediDeclarationMainController.do?goUpdate" funname="update" width="100%" height="100%"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="taaediDeclarationMainController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="taaediDeclarationMainController.do?goUpdate" funname="detail" width="100%" height="100%"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/sysmex/declaration/taaediDeclarationMainList.js"></script>		
 <script type="text/javascript">
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'taaediDeclarationMainController.do?upload', "taaediDeclarationMainList");
}

//导出
function ExportXls() {
	JeecgExcelExport("taaediDeclarationMainController.do?exportXls","taaediDeclarationMainList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("taaediDeclarationMainController.do?exportXlsByT","taaediDeclarationMainList");
}
 </script>