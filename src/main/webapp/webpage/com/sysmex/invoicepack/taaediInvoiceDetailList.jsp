<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addTaaediInvoiceDetailBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delTaaediInvoiceDetailBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addTaaediInvoiceDetailBtn').bind('click', function(){   
 		 var tr =  $("#add_taaediInvoiceDetail_table_template tr").clone();
	 	 $("#add_taaediInvoiceDetail_table").append(tr);
	 	 resetTrNum('add_taaediInvoiceDetail_table');
	 	 return false;
    });  
	$('#delTaaediInvoiceDetailBtn').bind('click', function(){   
      	$("#add_taaediInvoiceDetail_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_taaediInvoiceDetail_table'); 
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
	<a id="addTaaediInvoiceDetailBtn" href="#">添加</a> <a id="delTaaediInvoiceDetailBtn" href="#">删除</a> 
</div>
<table border="0" cellpadding="2" cellspacing="0" id="taaediInvoiceDetail_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">序号</td>
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">操作</td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						发票编号
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						物品名称
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						物品编码
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						币种
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						开票数量
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						单价
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						开票金额
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						备注
				  </td>
	</tr>
	<tbody id="add_taaediInvoiceDetail_table">
	<c:if test="${fn:length(taaediInvoiceDetailList)  <= 0 }">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">1</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
					<input name="taaediInvoiceDetailList[0].id" type="hidden"/>
					<input name="taaediInvoiceDetailList[0].createName" type="hidden"/>
					<input name="taaediInvoiceDetailList[0].createBy" type="hidden"/>
					<input name="taaediInvoiceDetailList[0].createDate" type="hidden"/>
					<input name="taaediInvoiceDetailList[0].updateName" type="hidden"/>
					<input name="taaediInvoiceDetailList[0].updateBy" type="hidden"/>
					<input name="taaediInvoiceDetailList[0].updateDate" type="hidden"/>
					<input name="taaediInvoiceDetailList[0].sysOrgCode" type="hidden"/>
					<input name="taaediInvoiceDetailList[0].sysCompanyCode" type="hidden"/>
					<input name="taaediInvoiceDetailList[0].bpmStatus" type="hidden"/>
					<input name="taaediInvoiceDetailList[0].billNo" type="hidden"/>
					<input name="taaediInvoiceDetailList[0].urgentFlag" type="hidden"/>
					<input name="taaediInvoiceDetailList[0].attachmentFlag" type="hidden"/>
					<input name="taaediInvoiceDetailList[0].remarkFlag" type="hidden"/>
					<input name="taaediInvoiceDetailList[0].delflag" type="hidden"/>
					<input name="taaediInvoiceDetailList[0].delDate" type="hidden"/>
				  <td align="left">
					  	<input name="taaediInvoiceDetailList[0].invoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">发票编号</label>
					</td>
				  <td align="left">
					  	<input name="taaediInvoiceDetailList[0].itemName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">物品名称</label>
					</td>
				  <td align="left">
					  	<input name="taaediInvoiceDetailList[0].itemNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">物品编码</label>
					</td>
				  <td align="left">
							<t:dictSelect field="taaediInvoiceDetailList[0].currency" type="list"   typeGroupCode="currency"  defaultVal="${taaediInvoiceDetailPage.currency}" hasLabel="false"  title="币种"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">币种</label>
					</td>
				  <td align="left">
					  	<input name="taaediInvoiceDetailList[0].quantity" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">开票数量</label>
					</td>
				  <td align="left">
					  	<input name="taaediInvoiceDetailList[0].unitPrice" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">单价</label>
					</td>
				  <td align="left">
					  	<input name="taaediInvoiceDetailList[0].totalAmount" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">开票金额</label>
					</td>
				  <td align="left">
					  	<input name="taaediInvoiceDetailList[0].memo" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">备注</label>
					</td>
   			</tr>
	</c:if>
	<c:if test="${fn:length(taaediInvoiceDetailList)  > 0 }">
		<c:forEach items="${taaediInvoiceDetailList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
						<input name="taaediInvoiceDetailList[${stuts.index }].id" type="hidden" value="${poVal.id }"/>
						<input name="taaediInvoiceDetailList[${stuts.index }].createName" type="hidden" value="${poVal.createName }"/>
						<input name="taaediInvoiceDetailList[${stuts.index }].createBy" type="hidden" value="${poVal.createBy }"/>
						<input name="taaediInvoiceDetailList[${stuts.index }].createDate" type="hidden" value="${poVal.createDate }"/>
						<input name="taaediInvoiceDetailList[${stuts.index }].updateName" type="hidden" value="${poVal.updateName }"/>
						<input name="taaediInvoiceDetailList[${stuts.index }].updateBy" type="hidden" value="${poVal.updateBy }"/>
						<input name="taaediInvoiceDetailList[${stuts.index }].updateDate" type="hidden" value="${poVal.updateDate }"/>
						<input name="taaediInvoiceDetailList[${stuts.index }].sysOrgCode" type="hidden" value="${poVal.sysOrgCode }"/>
						<input name="taaediInvoiceDetailList[${stuts.index }].sysCompanyCode" type="hidden" value="${poVal.sysCompanyCode }"/>
						<input name="taaediInvoiceDetailList[${stuts.index }].bpmStatus" type="hidden" value="${poVal.bpmStatus }"/>
						<input name="taaediInvoiceDetailList[${stuts.index }].billNo" type="hidden" value="${poVal.billNo }"/>
						<input name="taaediInvoiceDetailList[${stuts.index }].urgentFlag" type="hidden" value="${poVal.urgentFlag }"/>
						<input name="taaediInvoiceDetailList[${stuts.index }].attachmentFlag" type="hidden" value="${poVal.attachmentFlag }"/>
						<input name="taaediInvoiceDetailList[${stuts.index }].remarkFlag" type="hidden" value="${poVal.remarkFlag }"/>
						<input name="taaediInvoiceDetailList[${stuts.index }].delflag" type="hidden" value="${poVal.delflag }"/>
						<input name="taaediInvoiceDetailList[${stuts.index }].delDate" type="hidden" value="${poVal.delDate }"/>
				   <td align="left">
					  	<input name="taaediInvoiceDetailList[${stuts.index }].invoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.invoiceNo }"/>
					  <label class="Validform_label" style="display: none;">发票编号</label>
				   </td>
				   <td align="left">
					  	<input name="taaediInvoiceDetailList[${stuts.index }].itemName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.itemName }"/>
					  <label class="Validform_label" style="display: none;">物品名称</label>
				   </td>
				   <td align="left">
					  	<input name="taaediInvoiceDetailList[${stuts.index }].itemNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.itemNum }"/>
					  <label class="Validform_label" style="display: none;">物品编码</label>
				   </td>
				   <td align="left">
							<t:dictSelect field="taaediInvoiceDetailList[${stuts.index }].currency" type="list"   typeGroupCode="currency"  defaultVal="${poVal.currency }" hasLabel="false"  title="币种"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">币种</label>
				   </td>
				   <td align="left">
					  	<input name="taaediInvoiceDetailList[${stuts.index }].quantity" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value="${poVal.quantity }"/>
					  <label class="Validform_label" style="display: none;">开票数量</label>
				   </td>
				   <td align="left">
					  	<input name="taaediInvoiceDetailList[${stuts.index }].unitPrice" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value="${poVal.unitPrice }"/>
					  <label class="Validform_label" style="display: none;">单价</label>
				   </td>
				   <td align="left">
					  	<input name="taaediInvoiceDetailList[${stuts.index }].totalAmount" maxlength="20" type="text" class="inputxt"  style="width:120px;"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  value="${poVal.totalAmount }"/>
					  <label class="Validform_label" style="display: none;">开票金额</label>
				   </td>
				   <td align="left">
					  	<input name="taaediInvoiceDetailList[${stuts.index }].memo" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.memo }"/>
					  <label class="Validform_label" style="display: none;">备注</label>
				   </td>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
