<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>采购订单主表</title>
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
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" tiptype="1" action="taaediOrderMainController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${taaediOrderMainPage.id }"/>
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right">
				<label class="Validform_label">主订单编号:</label>
			</td>
			<td class="value">
		     	 <input id="mBillNo" name="mBillNo" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediOrderMainPage.mBillNo}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">主订单编号</label>
			</td>
			<td align="right">
				<label class="Validform_label">供应商名称:</label>
			</td>
			<td class="value">
		     	 <input id="vendorName" name="vendorName" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediOrderMainPage.vendorName}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">供应商名称</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">供应商编码:</label>
			</td>
			<td class="value">
		     	 <input id="vendorNum" name="vendorNum" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediOrderMainPage.vendorNum}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">供应商编码</label>
			</td>
			<td align="right">
				<label class="Validform_label">提货时间:</label>
			</td>
			<td class="value">
					  <input id="deliverDate" name="deliverDate" type="text" style="width: 150px"   ignore="ignore"  value='<fmt:formatDate value='${taaediOrderMainPage.deliverDate}' type="date" pattern="yyyy-MM-dd"/>'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">提货时间</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">订单类型:</label>
			</td>
			<td class="value">
					<t:dictSelect field="billType" type="list"   typeGroupCode="bill_type"  defaultVal="${taaediOrderMainPage.billType}" hasLabel="false"  title="订单类型"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">订单类型</label>
			</td>
		</tr>
	
		<tr>
			<td align="right">
				<label class="Validform_label">备注:</label>
			</td>
			<td class="value" colspan="3">
				 <textarea id="memo" style="width:600px;" class="inputxt" rows="6" name="memo"  ignore="ignore" >${taaediOrderMainPage.memo}</textarea>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">备注</label>
			</td>
		</tr>
			</table>
			<div style="width: auto;height: 200px;">
				<%-- 增加一个div，用于调节页面大小，否则默认太小 --%>
				<div style="width:800px;height:1px;"></div>
				<t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
				 <t:tab href="taaediOrderMainController.do?taaediOrderDetailList&mBillNo=${taaediOrderMainPage.mBillNo}" icon="icon-search" title="采购订单明细" id="taaediOrderDetail"></t:tab>
				</t:tabs>
			</div>
			</t:formvalid>
			<!-- 添加 附表明细 模版 -->
		<table style="display:none">
		<tbody id="add_taaediOrderDetail_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
					  		<input name="taaediOrderDetailList[#index#].itemName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">物品名称</label>
				  </td>
				  <td align="left">
					  		<input name="taaediOrderDetailList[#index#].itemNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">物品编码</label>
				  </td>
				  <td align="left">
					  		<input name="taaediOrderDetailList[#index#].vendorNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">供应商编码</label>
				  </td>
				  <td align="left">
					  		<input name="taaediOrderDetailList[#index#].vendorName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">供应商名称</label>
				  </td>
				  <td align="left">
							<input name="taaediOrderDetailList[#index#].billDate" maxlength="32" type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">单据日期</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="taaediOrderDetailList[#index#].currency" type="list"   typeGroupCode="currency"  defaultVal="" hasLabel="false"  title="币种"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">币种</label>
				  </td>
				  <td align="left">
					  		<input name="taaediOrderDetailList[#index#].quantity" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">订单数量</label>
				  </td>
				  <td align="left">
					  		<input name="taaediOrderDetailList[#index#].packQuantity" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">箱单数量</label>
				  </td>
				  <td align="left">
					  		<input name="taaediOrderDetailList[#index#].unitPrice" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">单价</label>
				  </td>
				  <td align="left">
							<input name="taaediOrderDetailList[#index#].pArrivalDate" maxlength="32" type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">预计到货日期</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="taaediOrderDetailList[#index#].billType" type="list"   typeGroupCode="bill_type"  defaultVal="" hasLabel="false"  title="订单类型"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">订单类型</label>
				  </td>
				  <td align="left">
					  		<input name="taaediOrderDetailList[#index#].carrierName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">运输商名称</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="taaediOrderDetailList[#index#].shippingType" type="list"   typeGroupCode="shiptype"  defaultVal="" hasLabel="false"  title="运输方式"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">运输方式</label>
				  </td>
				  <td align="left">
					  		<input name="taaediOrderDetailList[#index#].shippingRequirement" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">运输要求</label>
				  </td>
				  <td align="left">
					  		<input name="taaediOrderDetailList[#index#].tradeTerms" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">贸易条款</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="taaediOrderDetailList[#index#].tradeMode" type="list"   typeGroupCode="trade_mode"  defaultVal="" hasLabel="false"  title="贸易方式"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">贸易方式</label>
				  </td>
				  <td align="left">
					  		<input name="taaediOrderDetailList[#index#].memo" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">备注</label>
				  </td>
			</tr>
		 </tbody>
		</table>
 </body>
 <script src = "webpage/com/sysmex/order/taaediOrderMain.js"></script>	
