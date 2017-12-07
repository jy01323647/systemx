<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>订单表</title>
    <style>
  .ui-button {
  	  display: inline-block;
	  padding: 2px 2px;
	  margin-bottom: 0;
	  font-size: 8px;
	  font-weight: normal;
	  line-height: 1.42857143;
	  text-align: center;
	  white-space: nowrap;
	  vertical-align: middle;
	  -ms-touch-action: manipulation;
      touch-action: manipulation;
	  cursor: pointer;
	  -webkit-user-select: none;
      -moz-user-select: none;
      -ms-user-select: none;
      user-select: none;
	  background-image: none;
	  border: 1px solid transparent;
	  border-radius: 4px;
  }
  </style>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  $(document).ready(function(){
	$('#tt').tabs({
	   onSelect:function(title){
	       $('#tt .panel-body').css('width','auto');
		}
	});
	$(".tabs-wrap").css('width','100%');
  });
 </script>
 </head>
 <body style="overflow-x: hidden;">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" tiptype="1" action="testOrderInfoController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${testOrderInfoPage.id }"/>
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right">
				<label class="Validform_label">所属部门:</label>
			</td>
			<td class="value">
		     	 <input id="sysOrgCode" name="sysOrgCode" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${testOrderInfoPage.sysOrgCode}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">所属部门</label>
			</td>
			<td align="right">
				<label class="Validform_label">所属公司:</label>
			</td>
			<td class="value">
		     	 <input id="sysCompanyCode" name="sysCompanyCode" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${testOrderInfoPage.sysCompanyCode}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">所属公司</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">订单编号:</label>
			</td>
			<td class="value">
		     	 <input id="orderNumber" name="orderNumber" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${testOrderInfoPage.orderNumber}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">订单编号</label>
			</td>
			<td align="right">
				<label class="Validform_label">订单名称:</label>
			</td>
			<td class="value">
		     	 <input id="orderName" name="orderName" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${testOrderInfoPage.orderName}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">订单名称</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">订单数量:</label>
			</td>
			<td class="value">
		     	 <input id="orderCount" name="orderCount" type="text" style="width: 150px" class="inputxt"  datatype="n"  ignore="ignore"  value='${testOrderInfoPage.orderCount}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">订单数量</label>
			</td>
			<td align="right">
				<label class="Validform_label">订单金额:</label>
			</td>
			<td class="value">
		     	 <input id="orderPirce" name="orderPirce" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${testOrderInfoPage.orderPirce}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">订单金额</label>
			</td>
		</tr>
	
			</table>
			<div style="width: auto;height: 200px;">
				<%-- 增加一个div，用于调节页面大小，否则默认太小 --%>
				<div style="width:800px;height:1px;"></div>
				<t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
				 <t:tab href="testOrderInfoController.do?testOrderDetailInfoList&id=${testOrderInfoPage.id}" icon="icon-search" title="订单明细" id="testOrderDetailInfo"></t:tab>
				</t:tabs>
			</div>
			</t:formvalid>
			<!-- 添加 附表明细 模版 -->
		<table style="display:none">
		<tbody id="add_testOrderDetailInfo_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
					  		<input name="testOrderDetailInfoList[#index#].productName" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">物料名称</label>
				  </td>
				  <td align="left">
					  		<input name="testOrderDetailInfoList[#index#].productCode" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">物料编码</label>
				  </td>
				  <td align="left">
					  		<input name="testOrderDetailInfoList[#index#].productCount" maxlength="11" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">物料数量</label>
				  </td>
			</tr>
		 </tbody>
		</table>
 </body>
 <script src = "webpage/com/sysmex/order/testOrderInfo.js"></script>	
