<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>销售订单表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="sxSalesOrderController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${sxSalesOrderPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							销售订单号:
						</label>
					</td>
					<td class="value">
					     	 <input id="salesOrderNumber" name="salesOrderNumber" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">销售订单号</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							经销商:
						</label>
					</td>
					<td class="value">
					     	 <input id="suppliersName" name="suppliersName" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经销商</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							产品编号:
						</label>
					</td>
					<td class="value">
					     	 <input id="productCode" name="productCode" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">产品编号</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							产品名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="productName" name="productName" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">产品名称</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							外贸合同号:
						</label>
					</td>
					<td class="value">
					     	 <input id="contractNumber" name="contractNumber" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">外贸合同号</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							币种:
						</label>
					</td>
					<td class="value">
					     	 <input id="currencyCode" name="currencyCode" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">币种</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							供货日期:
						</label>
					</td>
					<td class="value">
							   <input id="supplierDate" name="supplierDate" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">供货日期</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							状态:
						</label>
					</td>
					<td class="value">
					     	 <input id="status" name="status" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">状态</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							发货日期:
						</label>
					</td>
					<td class="value">
							   <input id="sendDate" name="sendDate" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">发货日期</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							备注:
						</label>
					</td>
					<td class="value">
					     	 <input id="remark" name="remark" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							订单数量:
						</label>
					</td>
					<td class="value">
					     	 <input id="salesOrderCount" name="salesOrderCount" type="text" style="width: 150px" class="inputxt"  datatype="n"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">订单数量</label>
						</td>
				<td align="right">
					<label class="Validform_label">
					</label>
				</td>
				<td class="value">
				</td>
					</tr>
				
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/sysmex/sales.order/sxSalesOrder.js"></script>		
