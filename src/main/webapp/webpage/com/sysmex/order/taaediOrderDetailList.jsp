<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addTaaediOrderDetailBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delTaaediOrderDetailBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addTaaediOrderDetailBtn').bind('click', function(){   
 		 var tr =  $("#add_taaediOrderDetail_table_template tr").clone();
	 	 $("#add_taaediOrderDetail_table").append(tr);
	 	 resetTrNum('add_taaediOrderDetail_table');
	 	 return false;
    });  
	$('#delTaaediOrderDetailBtn').bind('click', function(){   
      	$("#add_taaediOrderDetail_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_taaediOrderDetail_table'); 
        return false;
    }); 
    $(document).ready(function(){
    	$(".datagrid-toolbar").parent().css("width","auto");
    	if(location.href.indexOf("load=detail")!=-1){
			$(":input").attr("disabled","true");
			$(".datagrid-toolbar").hide();
		}
    });
</script>
<div style="padding: 3px; height: 25px;width:auto;" class="datagrid-toolbar">
	<a id="addTaaediOrderDetailBtn" href="#">添加</a> <a id="delTaaediOrderDetailBtn" href="#">删除</a> 
</div>
<table border="0" cellpadding="2" cellspacing="0" id="taaediOrderDetail_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">序号</td>
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">操作</td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						物品名称
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						物品编码
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						供应商编码
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						供应商名称
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						单据日期
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						币种
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						订单数量
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						箱单数量
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						单价
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						预计到货日期
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						订单类型
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						运输商名称
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						运输方式
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						运输要求
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						贸易条款
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						贸易方式
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						备注
				  </td>
	</tr>
	<tbody id="add_taaediOrderDetail_table">
	<c:if test="${fn:length(taaediOrderDetailList)  <= 0 }">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">1</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
					<input name="taaediOrderDetailList[0].id" type="hidden"/>
					<input name="taaediOrderDetailList[0].createName" type="hidden"/>
					<input name="taaediOrderDetailList[0].createBy" type="hidden"/>
					<input name="taaediOrderDetailList[0].createDate" type="hidden"/>
					<input name="taaediOrderDetailList[0].updateName" type="hidden"/>
					<input name="taaediOrderDetailList[0].updateBy" type="hidden"/>
					<input name="taaediOrderDetailList[0].updateDate" type="hidden"/>
					<input name="taaediOrderDetailList[0].sysOrgCode" type="hidden"/>
					<input name="taaediOrderDetailList[0].sysCompanyCode" type="hidden"/>
					<input name="taaediOrderDetailList[0].bpmStatus" type="hidden"/>
					<input name="taaediOrderDetailList[0].mBillNo" type="hidden"/>
					<input name="taaediOrderDetailList[0].billNo" type="hidden"/>
					<input name="taaediOrderDetailList[0].itemCategory" type="hidden"/>
					<input name="taaediOrderDetailList[0].tAmount" type="hidden"/>
					<input name="taaediOrderDetailList[0].status" type="hidden"/>
					<input name="taaediOrderDetailList[0].carrierNum" type="hidden"/>
					<input name="taaediOrderDetailList[0].urgentFlag" type="hidden"/>
					<input name="taaediOrderDetailList[0].attachmentFlag" type="hidden"/>
					<input name="taaediOrderDetailList[0].remarkFlag" type="hidden"/>
					<input name="taaediOrderDetailList[0].delflag" type="hidden"/>
					<input name="taaediOrderDetailList[0].delDate" type="hidden"/>
				  <td align="left">
					  	<input name="taaediOrderDetailList[0].itemName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">物品名称</label>
					</td>
				  <td align="left">
					  	<input name="taaediOrderDetailList[0].itemNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">物品编码</label>
					</td>
				  <td align="left">
					  	<input name="taaediOrderDetailList[0].vendorNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">供应商编码</label>
					</td>
				  <td align="left">
					  	<input name="taaediOrderDetailList[0].vendorName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">供应商名称</label>
					</td>
				  <td align="left">
							<input name="taaediOrderDetailList[0].billDate" maxlength="32"  type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">单据日期</label>
					</td>
				  <td align="left">
							<t:dictSelect field="taaediOrderDetailList[0].currency" type="list"   typeGroupCode="currency"  defaultVal="${taaediOrderDetailPage.currency}" hasLabel="false"  title="币种"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">币种</label>
					</td>
				  <td align="left">
					  	<input name="taaediOrderDetailList[0].quantity" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">订单数量</label>
					</td>
				  <td align="left">
					  	<input name="taaediOrderDetailList[0].packQuantity" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">箱单数量</label>
					</td>
				  <td align="left">
					  	<input name="taaediOrderDetailList[0].unitPrice" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">单价</label>
					</td>
				  <td align="left">
							<input name="taaediOrderDetailList[0].pArrivalDate" maxlength="32"  type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">预计到货日期</label>
					</td>
				  <td align="left">
							<t:dictSelect field="taaediOrderDetailList[0].billType" type="list"   typeGroupCode="bill_type"  defaultVal="${taaediOrderDetailPage.billType}" hasLabel="false"  title="订单类型"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">订单类型</label>
					</td>
				  <td align="left">
					  	<input name="taaediOrderDetailList[0].carrierName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">运输商名称</label>
					</td>
				  <td align="left">
							<t:dictSelect field="taaediOrderDetailList[0].shippingType" type="list"   typeGroupCode="shiptype"  defaultVal="${taaediOrderDetailPage.shippingType}" hasLabel="false"  title="运输方式"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">运输方式</label>
					</td>
				  <td align="left">
					  	<input name="taaediOrderDetailList[0].shippingRequirement" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">运输要求</label>
					</td>
				  <td align="left">
					  	<input name="taaediOrderDetailList[0].tradeTerms" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">贸易条款</label>
					</td>
				  <td align="left">
							<t:dictSelect field="taaediOrderDetailList[0].tradeMode" type="list"   typeGroupCode="trade_mode"  defaultVal="${taaediOrderDetailPage.tradeMode}" hasLabel="false"  title="贸易方式"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">贸易方式</label>
					</td>
				  <td align="left">
					  	<input name="taaediOrderDetailList[0].memo" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">备注</label>
					</td>
   			</tr>
	</c:if>
	<c:if test="${fn:length(taaediOrderDetailList)  > 0 }">
		<c:forEach items="${taaediOrderDetailList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
						<input name="taaediOrderDetailList[${stuts.index }].id" type="hidden" value="${poVal.id }"/>
						<input name="taaediOrderDetailList[${stuts.index }].createName" type="hidden" value="${poVal.createName }"/>
						<input name="taaediOrderDetailList[${stuts.index }].createBy" type="hidden" value="${poVal.createBy }"/>
						<input name="taaediOrderDetailList[${stuts.index }].createDate" type="hidden" value="${poVal.createDate }"/>
						<input name="taaediOrderDetailList[${stuts.index }].updateName" type="hidden" value="${poVal.updateName }"/>
						<input name="taaediOrderDetailList[${stuts.index }].updateBy" type="hidden" value="${poVal.updateBy }"/>
						<input name="taaediOrderDetailList[${stuts.index }].updateDate" type="hidden" value="${poVal.updateDate }"/>
						<input name="taaediOrderDetailList[${stuts.index }].sysOrgCode" type="hidden" value="${poVal.sysOrgCode }"/>
						<input name="taaediOrderDetailList[${stuts.index }].sysCompanyCode" type="hidden" value="${poVal.sysCompanyCode }"/>
						<input name="taaediOrderDetailList[${stuts.index }].bpmStatus" type="hidden" value="${poVal.bpmStatus }"/>
						<input name="taaediOrderDetailList[${stuts.index }].mBillNo" type="hidden" value="${poVal.mBillNo }"/>
						<input name="taaediOrderDetailList[${stuts.index }].billNo" type="hidden" value="${poVal.billNo }"/>
						<input name="taaediOrderDetailList[${stuts.index }].itemCategory" type="hidden" value="${poVal.itemCategory }"/>
						<input name="taaediOrderDetailList[${stuts.index }].tAmount" type="hidden" value="${poVal.tAmount }"/>
						<input name="taaediOrderDetailList[${stuts.index }].status" type="hidden" value="${poVal.status }"/>
						<input name="taaediOrderDetailList[${stuts.index }].carrierNum" type="hidden" value="${poVal.carrierNum }"/>
						<input name="taaediOrderDetailList[${stuts.index }].urgentFlag" type="hidden" value="${poVal.urgentFlag }"/>
						<input name="taaediOrderDetailList[${stuts.index }].attachmentFlag" type="hidden" value="${poVal.attachmentFlag }"/>
						<input name="taaediOrderDetailList[${stuts.index }].remarkFlag" type="hidden" value="${poVal.remarkFlag }"/>
						<input name="taaediOrderDetailList[${stuts.index }].delflag" type="hidden" value="${poVal.delflag }"/>
						<input name="taaediOrderDetailList[${stuts.index }].delDate" type="hidden" value="${poVal.delDate }"/>
				   <td align="left">
					  	<input name="taaediOrderDetailList[${stuts.index }].itemName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.itemName }"/>
					  <label class="Validform_label" style="display: none;">物品名称</label>
				   </td>
				   <td align="left">
					  	<input name="taaediOrderDetailList[${stuts.index }].itemNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.itemNum }"/>
					  <label class="Validform_label" style="display: none;">物品编码</label>
				   </td>
				   <td align="left">
					  	<input name="taaediOrderDetailList[${stuts.index }].vendorNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.vendorNum }"/>
					  <label class="Validform_label" style="display: none;">供应商编码</label>
				   </td>
				   <td align="left">
					  	<input name="taaediOrderDetailList[${stuts.index }].vendorName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.vendorName }"/>
					  <label class="Validform_label" style="display: none;">供应商名称</label>
				   </td>
				   <td align="left">
							<input name="taaediOrderDetailList[${stuts.index }].billDate" maxlength="32" type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"   ignore="ignore"  value="<fmt:formatDate value='${poVal.billDate}' type="date" pattern="yyyy-MM-dd"/>"/>
					  <label class="Validform_label" style="display: none;">单据日期</label>
				   </td>
				   <td align="left">
							<t:dictSelect field="taaediOrderDetailList[${stuts.index }].currency" type="list"   typeGroupCode="currency"  defaultVal="${poVal.currency }" hasLabel="false"  title="币种"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">币种</label>
				   </td>
				   <td align="left">
					  	<input name="taaediOrderDetailList[${stuts.index }].quantity" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value="${poVal.quantity }"/>
					  <label class="Validform_label" style="display: none;">订单数量</label>
				   </td>
				   <td align="left">
					  	<input name="taaediOrderDetailList[${stuts.index }].packQuantity" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value="${poVal.packQuantity }"/>
					  <label class="Validform_label" style="display: none;">箱单数量</label>
				   </td>
				   <td align="left">
					  	<input name="taaediOrderDetailList[${stuts.index }].unitPrice" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value="${poVal.unitPrice }"/>
					  <label class="Validform_label" style="display: none;">单价</label>
				   </td>
				   <td align="left">
							<input name="taaediOrderDetailList[${stuts.index }].pArrivalDate" maxlength="32" type="text" class="Wdate" onClick="WdatePicker()"  style="width:120px;"   ignore="ignore"  value="<fmt:formatDate value='${poVal.pArrivalDate}' type="date" pattern="yyyy-MM-dd"/>"/>
					  <label class="Validform_label" style="display: none;">预计到货日期</label>
				   </td>
				   <td align="left">
							<t:dictSelect field="taaediOrderDetailList[${stuts.index }].billType" type="list"   typeGroupCode="bill_type"  defaultVal="${poVal.billType }" hasLabel="false"  title="订单类型"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">订单类型</label>
				   </td>
				   <td align="left">
					  	<input name="taaediOrderDetailList[${stuts.index }].carrierName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.carrierName }"/>
					  <label class="Validform_label" style="display: none;">运输商名称</label>
				   </td>
				   <td align="left">
							<t:dictSelect field="taaediOrderDetailList[${stuts.index }].shippingType" type="list"   typeGroupCode="shiptype"  defaultVal="${poVal.shippingType }" hasLabel="false"  title="运输方式"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">运输方式</label>
				   </td>
				   <td align="left">
					  	<input name="taaediOrderDetailList[${stuts.index }].shippingRequirement" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.shippingRequirement }"/>
					  <label class="Validform_label" style="display: none;">运输要求</label>
				   </td>
				   <td align="left">
					  	<input name="taaediOrderDetailList[${stuts.index }].tradeTerms" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.tradeTerms }"/>
					  <label class="Validform_label" style="display: none;">贸易条款</label>
				   </td>
				   <td align="left">
							<t:dictSelect field="taaediOrderDetailList[${stuts.index }].tradeMode" type="list"   typeGroupCode="trade_mode"  defaultVal="${poVal.tradeMode }" hasLabel="false"  title="贸易方式"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">贸易方式</label>
				   </td>
				   <td align="left">
					  	<input name="taaediOrderDetailList[${stuts.index }].memo" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.memo }"/>
					  <label class="Validform_label" style="display: none;">备注</label>
				   </td>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
