<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>发票主表</title>
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
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" tiptype="1" action="taaediInvoiceMainController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${taaediInvoiceMainPage.id }"/>
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right">
				<label class="Validform_label">供应商编码:</label>
			</td>
			<td class="value">
		     	 <input id="vendorNum" name="vendorNum" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">供应商编码</label>
			</td>
			<td align="right">
				<label class="Validform_label">供应商名称:</label>
			</td>
			<td class="value">
		     	 <input id="vendorName" name="vendorName" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">供应商名称</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">发票号:</label>
			</td>
			<td class="value">
		     	 <input id="invioceNo" name="invioceNo" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">发票号</label>
			</td>
			<td align="right">
				<label class="Validform_label">开票日期 :</label>
			</td>
			<td class="value">
					  <input id="invioceDate" name="invioceDate" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore"  />
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">开票日期 </label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">预警提示:</label>
			</td>
			<td class="value">
		     	 <input id="remarkFlag" name="remarkFlag" type="text" style="width: 150px" class="inputxt"  datatype="n"  ignore="ignore" />
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">预警提示</label>
			</td>
			<td align="right">
				<label class="Validform_label">备注:</label>
			</td>
			<td class="value">
		     	 <input id="memo" name="memo" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">备注</label>
			</td>
		</tr>
	
	</table>
			<div style="width: auto;height: 200px;">
				<%-- 增加一个div，用于调节页面大小，否则默认太小 --%>
				<div style="width:800px;height:1px;"></div>
				<t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
				 <t:tab href="taaediInvoiceMainController.do?taaediInvoiceDetailList&invoiceNo=${taaediInvoiceMainPage.invoiceNo}" icon="icon-search" title="发票明细信息" id="taaediInvoiceDetail"></t:tab>
				 <t:tab href="taaediInvoiceMainController.do?taaediInvoicePackDetailList&invoiceNo=${taaediInvoiceMainPage.invoiceNo}" icon="icon-search" title="箱单明细信息" id="taaediInvoicePackDetail"></t:tab>
				</t:tabs>
			</div>
			</t:formvalid>
			<!-- 添加 附表明细 模版 -->
	<table style="display:none">
	<tbody id="add_taaediInvoiceDetail_table_template">
		<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
					  	<input name="taaediInvoiceDetailList[#index#].invoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">发票编号</label>
				  </td>
				  <td align="left">
					  	<input name="taaediInvoiceDetailList[#index#].itemName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">物品名称</label>
				  </td>
				  <td align="left">
					  	<input name="taaediInvoiceDetailList[#index#].itemNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">物品编码</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="taaediInvoiceDetailList[#index#].currency" type="list"    typeGroupCode="currency"  defaultVal="" hasLabel="false"  title="币种"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">币种</label>
				  </td>
				  <td align="left">
					  	<input name="taaediInvoiceDetailList[#index#].quantity" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">开票数量</label>
				  </td>
				  <td align="left">
					  	<input name="taaediInvoiceDetailList[#index#].unitPrice" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">单价</label>
				  </td>
				  <td align="left">
					  	<input name="taaediInvoiceDetailList[#index#].totalAmount" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">开票金额</label>
				  </td>
				  <td align="left">
					  	<input name="taaediInvoiceDetailList[#index#].memo" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">备注</label>
				  </td>
			</tr>
		 </tbody>
	<tbody id="add_taaediInvoicePackDetail_table_template">
		<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[#index#].billNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">订单编码</label>
				  </td>


				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[#index#].packNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">装箱单号</label>
				  </td>
				<td align="left">
					<input name="taaediInvoicePackDetailList[#index#].itemNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					<label class="Validform_label" style="display: none;">物品编码</label>
				</td>
				<td align="left">
					<input name="taaediInvoicePackDetailList[#index#].itemName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					<label class="Validform_label" style="display: none;">物品名称</label>
				</td>
			<td align="left">
				<input name="taaediInvoicePackDetailList[#index#].itemCategory" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
				<label class="Validform_label" style="display: none;">物品类型</label>
			</td>
			<%--<td align="left">
				<t:dictSelect field="taaediInvoicePackDetailList[#index#].itemCategory" type="list"    typeGroupCode=""  defaultVal="" hasLabel="false"  title="物品类型"></t:dictSelect>
				<label class="Validform_label" style="display: none;">物品类型</label>
			</td>--%>
			<td align="left">
				<input name="taaediInvoicePackDetailList[#index#].packageType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
				<label class="Validform_label" style="display: none;">规格</label>
			</td>


				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[#index#].units" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">单位</label>
				  </td>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[#index#].netWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">净重 </label>
				  </td>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[#index#].grossWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">毛重</label>
				  </td>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[#index#].dimension" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">长宽高</label>
				  </td>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[#index#].volume" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">体积</label>
				  </td>


				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[#index#].shippingType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">运输方式</label>
				  </td>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[#index#].shippingRequirement" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">运输要求</label>
				  </td>
			<td align="left">
				<input name="taaediInvoicePackDetailList[#index#].tradeMode" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
				<label class="Validform_label" style="display: none;">贸易方式</label>
			</td>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[#index#].tradeTerms" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">贸易条款</label>
				  </td>

			</tr>
		 </tbody>
		</table>
 </body>
 <script src = "webpage/com/sysmex/invoicepack/taaediInvoiceMain.js"></script>
	