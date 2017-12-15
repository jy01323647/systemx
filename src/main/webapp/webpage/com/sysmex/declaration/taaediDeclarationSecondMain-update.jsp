<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>二次报关单主表</title>
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
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" tiptype="1" action="taaediDeclarationSecondMainController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${taaediDeclarationSecondMainPage.id }"/>
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right">
				<label class="Validform_label">报关单发票号:</label>
			</td>
			<td class="value">
		     	 <input id="customsInvoiceNo" name="customsInvoiceNo" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.customsInvoiceNo}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">报关单发票号</label>
			</td>
			<td align="right">
				<label class="Validform_label">海关单号:</label>
			</td>
			<td class="value">
		     	 <input id="customsNo" name="customsNo" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.customsNo}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">海关单号</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">提交申请日期:</label>
			</td>
			<td class="value">
		     	 <input id="applicationDate" name="applicationDate" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.applicationDate}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">提交申请日期</label>
			</td>
			<td align="right">
				<label class="Validform_label">贸易方式:</label>
			</td>
			<td class="value">
		     	 <input id="tradeMode" name="tradeMode" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.tradeMode}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">贸易方式</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">报关行:</label>
			</td>
			<td class="value">
		     	 <input id="customsBroker" name="customsBroker" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.customsBroker}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">报关行</label>
			</td>
			<td align="right">
				<label class="Validform_label">报关总金额:</label>
			</td>
			<td class="value">
		     	 <input id="totalAmount" name="totalAmount" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.totalAmount}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">报关总金额</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">备案号:</label>
			</td>
			<td class="value">
		     	 <input id="customsRecordno" name="customsRecordno" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.customsRecordno}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">备案号</label>
			</td>
			<td align="right">
				<label class="Validform_label">进出口公司:</label>
			</td>
			<td class="value">
		     	 <input id="impExpCorp" name="impExpCorp" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.impExpCorp}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">进出口公司</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">运输方式:</label>
			</td>
			<td class="value">
		     	 <input id="shippingType" name="shippingType" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.shippingType}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">运输方式</label>
			</td>
			<td align="right">
				<label class="Validform_label">运输工具名称:</label>
			</td>
			<td class="value">
		     	 <input id="conveyance" name="conveyance" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.conveyance}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">运输工具名称</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">运单号:</label>
			</td>
			<td class="value">
		     	 <input id="waybillNo" name="waybillNo" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.waybillNo}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">运单号</label>
			</td>
			<td align="right">
				<label class="Validform_label">收货单位:</label>
			</td>
			<td class="value">
		     	 <input id="consignee" name="consignee" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.consignee}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">收货单位</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">报关合同号:</label>
			</td>
			<td class="value">
		     	 <input id="contractNo" name="contractNo" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.contractNo}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">报关合同号</label>
			</td>
			<td align="right">
				<label class="Validform_label">征免性质:</label>
			</td>
			<td class="value">
		     	 <input id="freeFlag" name="freeFlag" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.freeFlag}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">征免性质</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">征税比例:</label>
			</td>
			<td class="value">
		     	 <input id="taxRate" name="taxRate" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.taxRate}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">征税比例</label>
			</td>
			<td align="right">
				<label class="Validform_label">许可证号:</label>
			</td>
			<td class="value">
		     	 <input id="licenceNo" name="licenceNo" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.licenceNo}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">许可证号</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">启运国:</label>
			</td>
			<td class="value">
		     	 <input id="countryOfOrigin" name="countryOfOrigin" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.countryOfOrigin}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">启运国</label>
			</td>
			<td align="right">
				<label class="Validform_label">装货港:</label>
			</td>
			<td class="value">
		     	 <input id="loadingPort" name="loadingPort" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.loadingPort}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">装货港</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">进口口岸:</label>
			</td>
			<td class="value">
		     	 <input id="importPort" name="importPort" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.importPort}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">进口口岸</label>
			</td>
			<td align="right">
				<label class="Validform_label">境内目的地:</label>
			</td>
			<td class="value">
		     	 <input id="inlandDestination" name="inlandDestination" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.inlandDestination}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">境内目的地</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">批准文号:</label>
			</td>
			<td class="value">
		     	 <input id="approvalNumber" name="approvalNumber" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.approvalNumber}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">批准文号</label>
			</td>
			<td align="right">
				<label class="Validform_label">成交方式:</label>
			</td>
			<td class="value">
		     	 <input id="dealMode" name="dealMode" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.dealMode}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">成交方式</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">件数:</label>
			</td>
			<td class="value">
		     	 <input id="quantity" name="quantity" type="text" style="width: 150px" class="inputxt"  datatype="n"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.quantity}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">件数</label>
			</td>
			<td align="right">
				<label class="Validform_label">集装箱号:</label>
			</td>
			<td class="value">
		     	 <input id="containerNo" name="containerNo" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.containerNo}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">集装箱号</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">用途:</label>
			</td>
			<td class="value">
		     	 <input id="purpose" name="purpose" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.purpose}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">用途</label>
			</td>
			<td align="right">
				<label class="Validform_label">报关状态:</label>
			</td>
			<td class="value">
		     	 <input id="status" name="status" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.status}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">报关状态</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">报关单:</label>
			</td>
			<td class="value">
		     	 <input id="customsBill" name="customsBill" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.customsBill}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">报关单</label>
			</td>
			<td align="right">
				<label class="Validform_label">税单:</label>
			</td>
			<td class="value">
		     	 <input id="taxBill" name="taxBill" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.taxBill}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">税单</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">进岸清单:</label>
			</td>
			<td class="value">
		     	 <input id="impList" name="impList" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.impList}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">进岸清单</label>
			</td>
			<td align="right">
				<label class="Validform_label">是否紧急标志:</label>
			</td>
			<td class="value">
		     	 <input id="urgentFlag" name="urgentFlag" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.urgentFlag}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">是否紧急标志</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">附件标志:</label>
			</td>
			<td class="value">
		     	 <input id="attachmentFlag" name="attachmentFlag" type="text" style="width: 150px" class="inputxt"  datatype="n"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.attachmentFlag}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">附件标志</label>
			</td>
			<td align="right">
				<label class="Validform_label">预警提示:</label>
			</td>
			<td class="value">
		     	 <input id="remarkFlag" name="remarkFlag" type="text" style="width: 150px" class="inputxt"  datatype="n"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.remarkFlag}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">预警提示</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">备注:</label>
			</td>
			<td class="value">
		     	 <input id="memo" name="memo" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${taaediDeclarationSecondMainPage.memo}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">备注</label>
			</td>
		</tr>
	
			</table>
			<div style="width: auto;height: 200px;">
				<%-- 增加一个div，用于调节页面大小，否则默认太小 --%>
				<div style="width:800px;height:1px;"></div>
				<t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
				 <t:tab href="taaediDeclarationSecondMainController.do?taaediDeclarationSecondPacklistList&id=${taaediDeclarationSecondMainPage.id}" icon="icon-search" title="二次报关箱单明细" id="taaediDeclarationSecondPacklist"></t:tab>
				 <t:tab href="taaediDeclarationSecondMainController.do?taaediDeclarationSecondDetailList&id=${taaediDeclarationSecondMainPage.id}" icon="icon-search" title="二次报关明细" id="taaediDeclarationSecondDetail"></t:tab>
				</t:tabs>
			</div>
			</t:formvalid>
			<!-- 添加 附表明细 模版 -->
		<table style="display:none">
		<tbody id="add_taaediDeclarationSecondPacklist_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].mainId" maxlength="36" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">报关主表ID</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].saleorderNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">销售订单号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].inventoryNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">库存流水号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].customsInvoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">二次报关发票号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].customsQuantity" maxlength="10" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">二次报关数量</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].customsStatus" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">二次报关状态</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].entryInvoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">进境报关发票号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].entryQuantity" maxlength="10" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">进境报关数量</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].entryStatus" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">进境报关状态</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].waybillNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">运单号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].billNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">子订单编码</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].invoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">发票编号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].packNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">装箱单号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].packQuantity" maxlength="10" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">箱单数量</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].packageType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">包装规格</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].units" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">单位</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].netWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">净重 </label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].grossWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">毛重</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].dimension" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">长宽高</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].volume" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">体积</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].itemName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">物品名称</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].itemNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">物品编码</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].itemCategory" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">物品类型</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].vendorNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">供应商编码</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].vendorName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">供应商名称</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].billDate" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">订单日期</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].currency" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">币种</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].poQuantity" maxlength="10" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">订单数量</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].unitPrice" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">单价</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].poAmount" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">订单总金额</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].planArrivalDate" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">预计到货日期</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].billType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">订单类型</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].status" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">订单状态</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].carrierNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">运输商</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].carrierName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">运输商名称</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].shippingType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">运输方式</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].shippingRequirement" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">运输要求</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].tradeTerms" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">贸易条款</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].tradeMode" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">贸易方式</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].remarkFlag" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">预警提示</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondPacklistList[#index#].memo" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">备注</label>
				  </td>
			</tr>
		 </tbody>
		<tbody id="add_taaediDeclarationSecondDetail_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].mainId" maxlength="36" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">主表ID</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].customsInvoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">报关发票号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].customsGoodsNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">海关品编号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].customsGoodsName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">海关品名称</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].provenance" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">原产国</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].currency" maxlength="10" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">币种</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].customsQuantity" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">本次报关数量</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].unitPriceOriginal" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">原始单价</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].unitPriceBase" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">基准单价</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].unitPriceUpdate" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">调整单价</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].unitPriceShippingfee" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">运费分摊单价</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].untiPriceTotal" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">合计单价</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].customsAmount" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">报关金额</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].hscode" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">税择号</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].licenceSpecial" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">特殊审批单</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].licenceAnimalPlant" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">动植物审批单</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].licenceSpecialgoods" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">特殊物品审批单</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].licenceEndangered" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">濒危证</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].freeFlag" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">免征标志</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].packageType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">包装规格</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].units" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">单位</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].netWeight" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">净重</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].grossWeight" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">毛重</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].dimension" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">长宽高</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].volume" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">体积</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].remarkFlag" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">预警提示</label>
				  </td>
				  <td align="left">
					  		<input name="taaediDeclarationSecondDetailList[#index#].memo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">备注</label>
				  </td>
			</tr>
		 </tbody>
		</table>
 </body>
 <script src = "webpage/com/sysmex/declaration/taaediDeclarationSecondMain.js"></script>	
