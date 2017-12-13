<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>报关单主表</title>
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
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" tiptype="1" action="taaediDeclarationMainController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${taaediDeclarationMainPage.id }"/>
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right">
				<label class="Validform_label">是否紧急:</label>
			</td>
			<td class="value">
				<%--<input id="urgentFlag" name="urgentFlag" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.urgentFlag}' />--%>
				<t:dictSelect field="urgentFlag" type="list"   typeGroupCode="sf_yn"  defaultVal="${taaediDeclarationMainPage.urgentFlag}" hasLabel="false"  title="币种"></t:dictSelect>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">是否紧急</label>
			</td>
			<td align="right">
				<label class="Validform_label">进出口公司:</label>
			</td>
			<td class="value">
				<input id="impExpCorp" name="impExpCorp" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.impExpCorp}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">进出口公司</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">发票号:</label>
			</td>
			<td class="value">
				<input id="customsInvoiceNo" name="customsInvoiceNo" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.customsInvoiceNo}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">发票号</label>
			</td>

			<td align="right">
				<label class="Validform_label">报关合同号:</label>
			</td>
			<td class="value">
				<input id="contractNo" name="contractNo" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.contractNo}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">报关合同号</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">报关行:</label>
			</td>
			<td class="value">
				<input id="customsBroker" name="customsBroker" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.customsBroker}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">报关行</label>
			</td>
			<td align="right">
				<label class="Validform_label">报关单:</label>
			</td>
			<td class="value">
				<input id="customsBill" name="customsBill" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.customsBill}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">报关单</label>
			</td>

		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">提交申请日期:</label>
			</td>
			<td class="value">
				<input id="applicationDate" name="applicationDate" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.applicationDate}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">提交申请日期</label>
			</td>
			<td align="right">
				<label class="Validform_label">备注:</label>
			</td>
			<td class="value">
				<input id="memo" name="memo" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.memo}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">备注</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">海关单号:</label>
			</td>
			<td class="value">
				<input id="customsNo" name="customsNo" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.customsNo}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">海关单号</label>
			</td>
			<td align="right">
				<label class="Validform_label">报关总金额:</label>
			</td>
			<td class="value">
				<input id="totalAmount" name="totalAmount" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.totalAmount}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">报关总金额</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">贸易方式:</label>
			</td>
			<td class="value">
				<input id="tradeMode" name="tradeMode" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.tradeMode}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">贸易方式</label>
			</td>
			<td align="right">
				<label class="Validform_label">备案号:</label>
			</td>
			<td class="value">
				<input id="customsRecordno" name="customsRecordno" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.customsRecordno}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">备案号</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">进口口岸:</label>
			</td>
			<td class="value">
				<input id="importPort" name="importPort" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.importPort}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">进口口岸</label>
			</td>
			<td align="right">
				<label class="Validform_label">运输方式:</label>
			</td>

			<td class="value">
				<input id="shippingType" name="shippingType" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.impExpCorp}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">运输方式</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">运输工具名称:</label>
			</td>
			<td class="value">
				<input id="conveyance" name="conveyance" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.conveyance}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">运输工具名称</label>
			</td>
			<td align="right">
				<label class="Validform_label">运单号:</label>
			</td>
			<td class="value">
				<input id="waybillNo" name="waybillNo" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.waybillNo}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">运单号</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">收货单位:</label>
			</td>
			<td class="value">
				<input id="consignee" name="consignee" type="text" style="width: 250px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.consignee}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">收货单位</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">征免性质:</label>
			</td>
			<td class="value">
				<input id="freeFlag" name="freeFlag" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.freeFlag}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">征免性质</label>
			</td>
			<td align="right">
				<label class="Validform_label">征税比例:</label>
			</td>
			<td class="value">
				<input id="taxRate" name="taxRate" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.taxRate}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">征税比例</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">许可证号:</label>
			</td>
			<td class="value">
				<input id="licenceNo" name="licenceNo" type="text" style="width: 150px" class="inputxt"  ignore="ignore" value='${taaediDeclarationMainPage.impExpCorp}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">许可证号</label>
			</td>

			<td align="right">
				<label class="Validform_label">启运国:</label>
			</td>
			<td class="value">
				<input id="countryOfOrigin" name="countryOfOrigin" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationMainPage.countryOfOrigin}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">启运国</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">装货港:</label>
			</td>
			<td class="value">
				<input id="loadingPort" name="loadingPort" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationMainPage.loadingPort}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">装货港</label>
			</td>
			<td align="right">
				<label class="Validform_label">境内目的地:</label>
			</td>
			<td class="value">
				<input id="inlandDestination" name="inlandDestination" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationMainPage.inlandDestination}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">境内目的地</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">批准文号:</label>
			</td>
			<td class="value">
				<input id="approvalNumber" name="approvalNumber" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationMainPage.approvalNumber}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">批准文号</label>
			</td>
			<td align="right">
				<label class="Validform_label">成交方式:</label>
			</td>
			<td class="value">
				<input id="dealMode" name="dealMode" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationMainPage.dealMode}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">成交方式</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">件数:</label>
			</td>
			<td class="value">
				<input id="quantity" name="quantity" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationMainPage.quantity}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">件数</label>
			</td>
			<td align="right">
				<label class="Validform_label">集装箱号:</label>
			</td>
			<td class="value">
				<input id="containerNo" name="containerNo" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationMainPage.containerNo}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">集装箱号</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">随附单证:</label>
			</td>
			<td class="value">
				随附单证
			</td>
			<td align="right">
				<label class="Validform_label">用途:</label>
			</td>
			<td class="value">
				<input id="purpose" name="purpose" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationMainPage.purpose}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">用途</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">报关费用:</label>
			</td>
			<td class="value">
				100?
			</td>
		</tr>
	
	</table>
			<div style="width: auto;height: 200px;">
				<%-- 增加一个div，用于调节页面大小，否则默认太小 --%>
				<div style="width:800px;height:1px;"></div>
				<t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
				 <t:tab href="taaediDeclarationMainController.do?taaediDeclarationDetailList&id=${taaediDeclarationMainPage.id}" icon="icon-search" title="报关明细" id="taaediDeclarationDetail"></t:tab>
				 <t:tab href="taaediDeclarationMainController.do?taaediDeclarationPackDetailList&id=${taaediDeclarationMainPage.id}" icon="icon-search" title="箱单明细" id="taaediDeclarationPackDetail"></t:tab>
				</t:tabs>
			</div>
			</t:formvalid>
			<!-- 添加 附表明细 模版 -->
		<table style="display:none">
		<tbody id="add_taaediDeclarationPackDetail_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].customsInvoiceNo" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">报关发票号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].waybillNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">运单号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].billNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">子订单编码</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].invoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">发票编号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].packNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">装箱单号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].customsQuantity" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">本次报关数量</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].packQuantity" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">箱单数量</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].packageType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">包装规格</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].units" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">单位</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].netWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">净重 </label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].grossWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">毛重</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].dimension" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">长宽高</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].volume" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">体积</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].itemName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">物品名称</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].itemNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">物品编码</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].itemCategory" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">物品类型</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].vendorNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">供应商编码</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].vendorName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">供应商名称</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].billDate" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">订单日期</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].currency" maxlength="10" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">币种</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].poQuantity" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">订单数量</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].unitPrice" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">单价</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].poAmount" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">订单总金额</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].pArrivalDate" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">预计到货日期</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].billType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">订单类型</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].status" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">订单状态</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].carrierNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">运输商</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].carrierName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">运输商名称</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].shippingType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">运输方式</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].shippingRequirement" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">运输要求</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].tradeTerms" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">贸易条款</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].tradeMode" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">贸易方式</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].urgentFlag" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">是否紧急标志</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].attachmentFlag" maxlength="3" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">附件标志</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].remarkFlag" maxlength="3" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">预警提示</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationPackDetailList[#index#].memo" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">备注</label>
				  </td>
			</tr>
		 </tbody>
		<tbody id="add_taaediDeclarationDetail_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].customsInvoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">报关发票号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].customsGoodsNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">海关品编号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].customsGoodsName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">海关品名称</label>
				  </td>
					<td align="left">
						<input name="taaediDeclarationDetailList[#index#].units" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
						<label class="Validform_label" style="display: none;">单位</label>
					</td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].provenance" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">原产国</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].customsQuantity" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">本次报关数量</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].unitPriceOriginal" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">原始单价</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].unitPriceBase" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">基准单价</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].unitPriceUpdate" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">调整单价</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].unitPriceShippingfee" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">运费分摊单价</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].untiPriceTotal" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">合计单价</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].customsAmount" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">报关金额</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].hscode" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">税择号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].licenceSpecial" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">特殊审批单</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].licenceAnimalPlant" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">动植物审批单</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].licenceSpecialgoods" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">特殊物品审批单</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].licenceEndangered" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">濒危证</label>
				  </td>
				  <td align="left">
					        <input name="taaediDeclarationDetailList[#index#].currency" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					   <label class="Validform_label" style="display: none;">币种</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].freeFlag" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">免征标志</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].packageType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">包装规格</label>
				  </td>

				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].netWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">净重</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].grossWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">毛重</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].dimension" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">长宽高</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].volume" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">体积</label>
				  </td>
				 <%-- <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].urgentFlag" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">是否紧急标志</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].attachmentFlag" maxlength="3" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">附件标志</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].remarkFlag" maxlength="3" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">预警提示</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationDetailList[#index#].memo" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">备注</label>
				  </td>--%>
			</tr>
		 </tbody>
		</table>
 </body>
 <script src = "webpage/com/sysmex/declaration/taaediDeclarationMain.js"></script>	
