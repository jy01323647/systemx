<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="sxSalesOrderList" checkbox="false" pagination="true" fitColumns="true" title="销售订单表" actionUrl="sxSalesOrderController.do?datagrid" idField="id" fit="true" queryMode="group">
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
   <t:dgCol title="销售订单号"  field="salesOrderNumber"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经销商"  field="suppliersName"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="产品编号"  field="productCode"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="产品名称"  field="productName"  query="true"  queryMode="single"  width="200"></t:dgCol>
   <t:dgCol title="外贸合同号"  field="contractNumber"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="币种"  field="currencyCode"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="供货日期"  field="supplierDate"  formatter="yyyy-MM-dd"  query="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="状态"  field="status"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="发货日期"  field="sendDate"  formatter="yyyy-MM-dd"  query="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="remark"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="订单数量"  field="salesOrderCount"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="sxSalesOrderController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="sxSalesOrderController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="sxSalesOrderController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="sxSalesOrderController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="sxSalesOrderController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
   <!-- 列表自定义查询条件 -->
   <%--<div id="sxSalesOrderListtb" style="padding: 3px;height: 25px">
    <div style="float:left;">
       <a href="#" id="add" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="add('新增订单','sxSalesOrderController.do','sxSalesOrderList')">新增订单</a>
       <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="update('修改订单','sxSalesOrderController.do','sxSalesOrderList')">修改订单</a>
    </div>
    <div align="right">
       订单名称:<input type="text" class="easyui-validatebox" name="orderName" style="width: 80px">
       订单编号:<input type="text" class="easyui-validatebox" name="orderCode" style="width: 80px">
     <a href="#" class="easyui-linkbutton" plain="true" icon="icon-search" onclick="sxSalesOrderListsearch();">查询</a>
     <a href="#" class="easyui-linkbutton" plain="true" icon="icon-search" onclick="searchRest('sxSalesOrderList');">重置</a>
    </div>
   </div>--%>

  </div>
 </div>
 <script src = "webpage/com/sysmex/sales.order/sxSalesOrderList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'sxSalesOrderController.do?upload', "sxSalesOrderList");
}

//导出
function ExportXls() {
	JeecgExcelExport("sxSalesOrderController.do?exportXls","sxSalesOrderList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("sxSalesOrderController.do?exportXlsByT","sxSalesOrderList");
}

 </script>