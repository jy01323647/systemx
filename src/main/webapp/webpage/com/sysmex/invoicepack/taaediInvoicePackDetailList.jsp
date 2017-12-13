<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addTaaediInvoicePackDetailBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delTaaediInvoicePackDetailBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addTaaediInvoicePackDetailBtn').bind('click', function(){   
 		 var tr =  $("#add_taaediInvoicePackDetail_table_template tr").clone();
	 	 $("#add_taaediInvoicePackDetail_table").append(tr);
	 	 resetTrNum('add_taaediInvoicePackDetail_table');
	 	 return false;
    });  
	$('#delTaaediInvoicePackDetailBtn').bind('click', function(){   
      	$("#add_taaediInvoicePackDetail_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_taaediInvoicePackDetail_table'); 
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
	<a id="addTaaediInvoicePackDetailBtn" href="#">添加</a> <a id="delTaaediInvoicePackDetailBtn" href="#">删除</a> 
</div>
<table border="0" cellpadding="2" cellspacing="0" id="taaediInvoicePackDetail_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">序号</td>
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">操作</td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						子订单编码
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						装箱单号
				  </td>
		<td align="left" bgcolor="#EEEEEE" style="width: 126px;">
			物品名称
		</td>
		<td align="left" bgcolor="#EEEEEE" style="width: 126px;">
			物品编码
		</td>
		<td align="left" bgcolor="#EEEEEE" style="width: 126px;">
			物品类型
		</td>

				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						规格
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						单位
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						净重 
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						毛重
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						长宽高
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						体积
				  </td>

				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						运输方式
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						运输要求
				  </td>
		<td align="left" bgcolor="#EEEEEE" style="width: 126px;">
			贸易方式
		</td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						贸易条款
				  </td>


	</tr>
	<tbody id="add_taaediInvoicePackDetail_table">
	<c:if test="${fn:length(taaediInvoicePackDetailList)  <= 0 }">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">1</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
					<input name="taaediInvoicePackDetailList[0].id" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].createName" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].createBy" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].createDate" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].updateName" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].updateBy" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].updateDate" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].sysOrgCode" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].sysCompanyCode" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].bpmStatus" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].invoiceNo" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].vendorNum" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].vendorName" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].billDate" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].currency" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].poQuantity" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].unitPrice" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].totalAmount" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].planArrivalDate" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].billType" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].status" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].carrierNum" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].carrierName" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].urgentFlag" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].attachmentFlag" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].remarkFlag" type="hidden"/>
					<input name="taaediInvoicePackDetailList[0].memo" type="hidden"/>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[0].billNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">子订单编码</label>
					</td>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[0].packNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">装箱单号</label>
					</td>
				<td align="left">
					<input name="taaediInvoicePackDetailList[0].itemName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					<label class="Validform_label" style="display: none;">物品名称</label>
				</td>
				<td align="left">
					<input name="taaediInvoicePackDetailList[0].itemNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					<label class="Validform_label" style="display: none;">物品编码</label>
				</td>

				<td align="left">
					<input name="taaediInvoicePackDetailList[0].itemCategory" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					<label class="Validform_label" style="display: none;">物品类型</label>
				</td>
				<%--<td align="left">
					<t:dictSelect field="taaediInvoicePackDetailList[0].itemCategory" type="list"   typeGroupCode=""  defaultVal="${taaediInvoicePackDetailPage.itemCategory}" hasLabel="false"  title="物品类型"></t:dictSelect>
					<label class="Validform_label" style="display: none;">物品类型</label>
				</td>--%>
				 <%-- <td align="left">
					  	<input name="taaediInvoicePackDetailList[0].packQuantity" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">箱单数量</label>
					</td>--%>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[0].packageType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">规格</label>
					</td>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[0].units" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">单位</label>
					</td>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[0].netWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">净重 </label>
					</td>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[0].grossWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">毛重</label>
					</td>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[0].dimension" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">长宽高</label>
					</td>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[0].volume" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">体积</label>
					</td>

				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[0].shippingType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">运输方式</label>
					</td>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[0].shippingRequirement" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">运输要求</label>
					</td>
				<td align="left">
					<input name="taaediInvoicePackDetailList[0].tradeMode" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					<label class="Validform_label" style="display: none;">贸易方式</label>
				</td>
				  <td align="left">
					  	<input name="taaediInvoicePackDetailList[0].tradeTerms" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">贸易条款</label>
					</td>


   			</tr>
	</c:if>
	<c:if test="${fn:length(taaediInvoicePackDetailList)  > 0 }">
		<c:forEach items="${taaediInvoicePackDetailList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
						<input name="taaediInvoicePackDetailList[${stuts.index }].id" type="hidden" value="${poVal.id }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].createName" type="hidden" value="${poVal.createName }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].createBy" type="hidden" value="${poVal.createBy }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].createDate" type="hidden" value="${poVal.createDate }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].updateName" type="hidden" value="${poVal.updateName }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].updateBy" type="hidden" value="${poVal.updateBy }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].updateDate" type="hidden" value="${poVal.updateDate }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].sysOrgCode" type="hidden" value="${poVal.sysOrgCode }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].sysCompanyCode" type="hidden" value="${poVal.sysCompanyCode }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].bpmStatus" type="hidden" value="${poVal.bpmStatus }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].invoiceNo" type="hidden" value="${poVal.invoiceNo }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].vendorNum" type="hidden" value="${poVal.vendorNum }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].vendorName" type="hidden" value="${poVal.vendorName }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].billDate" type="hidden" value="${poVal.billDate }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].currency" type="hidden" value="${poVal.currency }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].poQuantity" type="hidden" value="${poVal.poQuantity }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].unitPrice" type="hidden" value="${poVal.unitPrice }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].totalAmount" type="hidden" value="${poVal.totalAmount }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].planArrivalDate" type="hidden" value="${poVal.planArrivalDate }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].billType" type="hidden" value="${poVal.billType }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].status" type="hidden" value="${poVal.status }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].carrierNum" type="hidden" value="${poVal.carrierNum }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].carrierName" type="hidden" value="${poVal.carrierName }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].urgentFlag" type="hidden" value="${poVal.urgentFlag }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].attachmentFlag" type="hidden" value="${poVal.attachmentFlag }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].remarkFlag" type="hidden" value="${poVal.remarkFlag }"/>
						<input name="taaediInvoicePackDetailList[${stuts.index }].memo" type="hidden" value="${poVal.memo }"/>
				   <td align="left">
					  	<input name="taaediInvoicePackDetailList[${stuts.index }].billNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.billNo }"/>
					  <label class="Validform_label" style="display: none;">子订单编码</label>
				   </td>
				   <td align="left">
					  	<input name="taaediInvoicePackDetailList[${stuts.index }].packNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.packNo }"/>
					  <label class="Validform_label" style="display: none;">装箱单号</label>
				   </td>
				<td align="left">
					<input name="taaediInvoicePackDetailList[${stuts.index }].itemName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.itemName }"/>
					<label class="Validform_label" style="display: none;">物品名称</label>
				</td>
				<td align="left">
					<input name="taaediInvoicePackDetailList[${stuts.index }].itemNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.itemNum }"/>
					<label class="Validform_label" style="display: none;">物品编码</label>
				</td>
				<td align="left">
					<input name="taaediInvoicePackDetailList[${stuts.index }].itemCategory" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.itemNum }"/>
					<label class="Validform_label" style="display: none;">物品类型</label>
				</td>

				   <td align="left">
					  	<input name="taaediInvoicePackDetailList[${stuts.index }].packageType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.packageType }"/>
					  <label class="Validform_label" style="display: none;">规格</label>
				   </td>
				   <td align="left">
					  	<input name="taaediInvoicePackDetailList[${stuts.index }].units" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.units }"/>
					  <label class="Validform_label" style="display: none;">单位</label>
				   </td>
				   <td align="left">
					  	<input name="taaediInvoicePackDetailList[${stuts.index }].netWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.netWeight }"/>
					  <label class="Validform_label" style="display: none;">净重 </label>
				   </td>
				   <td align="left">
					  	<input name="taaediInvoicePackDetailList[${stuts.index }].grossWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.grossWeight }"/>
					  <label class="Validform_label" style="display: none;">毛重</label>
				   </td>
				   <td align="left">
					  	<input name="taaediInvoicePackDetailList[${stuts.index }].dimension" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.dimension }"/>
					  <label class="Validform_label" style="display: none;">长宽高</label>
				   </td>
				   <td align="left">
					  	<input name="taaediInvoicePackDetailList[${stuts.index }].volume" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.volume }"/>
					  <label class="Validform_label" style="display: none;">体积</label>
				   </td>

				   <td align="left">
					  	<input name="taaediInvoicePackDetailList[${stuts.index }].shippingType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.shippingType }"/>
					  <label class="Validform_label" style="display: none;">运输方式</label>
				   </td>
				   <td align="left">
					  	<input name="taaediInvoicePackDetailList[${stuts.index }].shippingRequirement" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.shippingRequirement }"/>
					  <label class="Validform_label" style="display: none;">运输要求</label>
				   </td>
				<td align="left">
					<input name="taaediInvoicePackDetailList[${stuts.index }].tradeMode" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.tradeMode }"/>
					<label class="Validform_label" style="display: none;">贸易方式</label>
				</td>
				   <td align="left">
					  	<input name="taaediInvoicePackDetailList[${stuts.index }].tradeTerms" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.tradeTerms }"/>
					  <label class="Validform_label" style="display: none;">贸易条款</label>
				   </td>


   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
