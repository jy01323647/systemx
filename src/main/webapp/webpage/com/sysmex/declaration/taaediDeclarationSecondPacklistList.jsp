<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addTaaediDeclarationSecondPacklistBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delTaaediDeclarationSecondPacklistBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addTaaediDeclarationSecondPacklistBtn').bind('click', function(){   
 		 var tr =  $("#add_taaediDeclarationSecondPacklist_table_template tr").clone();
	 	 $("#add_taaediDeclarationSecondPacklist_table").append(tr);
	 	 resetTrNum('add_taaediDeclarationSecondPacklist_table');
	 	 return false;
    });  
	$('#delTaaediDeclarationSecondPacklistBtn').bind('click', function(){   
      	$("#add_taaediDeclarationSecondPacklist_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_taaediDeclarationSecondPacklist_table'); 
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
	<a id="addTaaediDeclarationSecondPacklistBtn" href="#">添加</a> <a id="delTaaediDeclarationSecondPacklistBtn" href="#">删除</a> 
</div>
<div style="overflow:auto">
<table border="0" cellpadding="2" cellspacing="0" id="taaediDeclarationSecondPacklist_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">序号</td>
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">操作</td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						报关主表ID
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						销售订单号
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						库存流水号
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						二次报关发票号
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						二次报关数量
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						二次报关状态
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						进境报关发票号
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						进境报关数量
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						进境报关状态
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						运单号
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						子订单编码
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						发票编号
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						装箱单号
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						箱单数量
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						包装规格
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
						物品名称
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						物品编码
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						物品类型
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						供应商编码
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						供应商名称
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						订单日期
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						币种
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						订单数量
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						单价
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						订单总金额
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						预计到货日期
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						订单类型
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						订单状态
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						运输商
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
						预警提示
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						备注
				  </td>
	</tr>
	<tbody id="add_taaediDeclarationSecondPacklist_table">
	<c:if test="${fn:length(taaediDeclarationSecondPacklistList)  <= 0 }">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">1</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
					<input name="taaediDeclarationSecondPacklistList[0].id" type="hidden"/>
					<input name="taaediDeclarationSecondPacklistList[0].createName" type="hidden"/>
					<input name="taaediDeclarationSecondPacklistList[0].createBy" type="hidden"/>
					<input name="taaediDeclarationSecondPacklistList[0].createDate" type="hidden"/>
					<input name="taaediDeclarationSecondPacklistList[0].updateName" type="hidden"/>
					<input name="taaediDeclarationSecondPacklistList[0].updateBy" type="hidden"/>
					<input name="taaediDeclarationSecondPacklistList[0].updateDate" type="hidden"/>
					<input name="taaediDeclarationSecondPacklistList[0].sysOrgCode" type="hidden"/>
					<input name="taaediDeclarationSecondPacklistList[0].sysCompanyCode" type="hidden"/>
					<input name="taaediDeclarationSecondPacklistList[0].bpmStatus" type="hidden"/>
					<input name="taaediDeclarationSecondPacklistList[0].delflag" type="hidden"/>
					<input name="taaediDeclarationSecondPacklistList[0].delDate" type="hidden"/>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].mainId" maxlength="36" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">报关主表ID</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].saleorderNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">销售订单号</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].inventoryNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">库存流水号</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].customsInvoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">二次报关发票号</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].customsQuantity" maxlength="10" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">二次报关数量</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].customsStatus" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">二次报关状态</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].entryInvoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">进境报关发票号</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].entryQuantity" maxlength="10" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">进境报关数量</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].entryStatus" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">进境报关状态</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].waybillNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">运单号</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].billNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">子订单编码</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].invoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">发票编号</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].packNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">装箱单号</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].packQuantity" maxlength="10" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">箱单数量</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].packageType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">包装规格</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].units" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">单位</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].netWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">净重 </label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].grossWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">毛重</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].dimension" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">长宽高</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].volume" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">体积</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].itemName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">物品名称</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].itemNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">物品编码</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].itemCategory" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">物品类型</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].vendorNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">供应商编码</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].vendorName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">供应商名称</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].billDate" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">订单日期</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].currency" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">币种</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].poQuantity" maxlength="10" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">订单数量</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].unitPrice" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">单价</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].poAmount" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">订单总金额</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].planArrivalDate" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">预计到货日期</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].billType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">订单类型</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].status" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">订单状态</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].carrierNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">运输商</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].carrierName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">运输商名称</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].shippingType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">运输方式</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].shippingRequirement" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">运输要求</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].tradeTerms" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">贸易条款</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].tradeMode" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">贸易方式</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].remarkFlag" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">预警提示</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[0].memo" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">备注</label>
					</td>
   			</tr>
	</c:if>
	<c:if test="${fn:length(taaediDeclarationSecondPacklistList)  > 0 }">
		<c:forEach items="${taaediDeclarationSecondPacklistList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
						<input name="taaediDeclarationSecondPacklistList[${stuts.index }].id" type="hidden" value="${poVal.id }"/>
						<input name="taaediDeclarationSecondPacklistList[${stuts.index }].createName" type="hidden" value="${poVal.createName }"/>
						<input name="taaediDeclarationSecondPacklistList[${stuts.index }].createBy" type="hidden" value="${poVal.createBy }"/>
						<input name="taaediDeclarationSecondPacklistList[${stuts.index }].createDate" type="hidden" value="${poVal.createDate }"/>
						<input name="taaediDeclarationSecondPacklistList[${stuts.index }].updateName" type="hidden" value="${poVal.updateName }"/>
						<input name="taaediDeclarationSecondPacklistList[${stuts.index }].updateBy" type="hidden" value="${poVal.updateBy }"/>
						<input name="taaediDeclarationSecondPacklistList[${stuts.index }].updateDate" type="hidden" value="${poVal.updateDate }"/>
						<input name="taaediDeclarationSecondPacklistList[${stuts.index }].sysOrgCode" type="hidden" value="${poVal.sysOrgCode }"/>
						<input name="taaediDeclarationSecondPacklistList[${stuts.index }].sysCompanyCode" type="hidden" value="${poVal.sysCompanyCode }"/>
						<input name="taaediDeclarationSecondPacklistList[${stuts.index }].bpmStatus" type="hidden" value="${poVal.bpmStatus }"/>
						<input name="taaediDeclarationSecondPacklistList[${stuts.index }].delflag" type="hidden" value="${poVal.delflag }"/>
						<input name="taaediDeclarationSecondPacklistList[${stuts.index }].delDate" type="hidden" value="${poVal.delDate }"/>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].mainId" maxlength="36" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.mainId }"/>
					  <label class="Validform_label" style="display: none;">报关主表ID</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].saleorderNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.saleorderNo }"/>
					  <label class="Validform_label" style="display: none;">销售订单号</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].inventoryNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.inventoryNo }"/>
					  <label class="Validform_label" style="display: none;">库存流水号</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].customsInvoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.customsInvoiceNo }"/>
					  <label class="Validform_label" style="display: none;">二次报关发票号</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].customsQuantity" maxlength="10" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore"  value="${poVal.customsQuantity }"/>
					  <label class="Validform_label" style="display: none;">二次报关数量</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].customsStatus" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.customsStatus }"/>
					  <label class="Validform_label" style="display: none;">二次报关状态</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].entryInvoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.entryInvoiceNo }"/>
					  <label class="Validform_label" style="display: none;">进境报关发票号</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].entryQuantity" maxlength="10" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore"  value="${poVal.entryQuantity }"/>
					  <label class="Validform_label" style="display: none;">进境报关数量</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].entryStatus" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.entryStatus }"/>
					  <label class="Validform_label" style="display: none;">进境报关状态</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].waybillNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.waybillNo }"/>
					  <label class="Validform_label" style="display: none;">运单号</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].billNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.billNo }"/>
					  <label class="Validform_label" style="display: none;">子订单编码</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].invoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.invoiceNo }"/>
					  <label class="Validform_label" style="display: none;">发票编号</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].packNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.packNo }"/>
					  <label class="Validform_label" style="display: none;">装箱单号</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].packQuantity" maxlength="10" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore"  value="${poVal.packQuantity }"/>
					  <label class="Validform_label" style="display: none;">箱单数量</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].packageType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.packageType }"/>
					  <label class="Validform_label" style="display: none;">包装规格</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].units" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.units }"/>
					  <label class="Validform_label" style="display: none;">单位</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].netWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.netWeight }"/>
					  <label class="Validform_label" style="display: none;">净重 </label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].grossWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.grossWeight }"/>
					  <label class="Validform_label" style="display: none;">毛重</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].dimension" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.dimension }"/>
					  <label class="Validform_label" style="display: none;">长宽高</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].volume" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.volume }"/>
					  <label class="Validform_label" style="display: none;">体积</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].itemName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.itemName }"/>
					  <label class="Validform_label" style="display: none;">物品名称</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].itemNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.itemNum }"/>
					  <label class="Validform_label" style="display: none;">物品编码</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].itemCategory" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.itemCategory }"/>
					  <label class="Validform_label" style="display: none;">物品类型</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].vendorNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.vendorNum }"/>
					  <label class="Validform_label" style="display: none;">供应商编码</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].vendorName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.vendorName }"/>
					  <label class="Validform_label" style="display: none;">供应商名称</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].billDate" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.billDate }"/>
					  <label class="Validform_label" style="display: none;">订单日期</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].currency" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.currency }"/>
					  <label class="Validform_label" style="display: none;">币种</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].poQuantity" maxlength="10" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore"  value="${poVal.poQuantity }"/>
					  <label class="Validform_label" style="display: none;">订单数量</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].unitPrice" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.unitPrice }"/>
					  <label class="Validform_label" style="display: none;">单价</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].poAmount" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.poAmount }"/>
					  <label class="Validform_label" style="display: none;">订单总金额</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].planArrivalDate" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.planArrivalDate }"/>
					  <label class="Validform_label" style="display: none;">预计到货日期</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].billType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.billType }"/>
					  <label class="Validform_label" style="display: none;">订单类型</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].status" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.status }"/>
					  <label class="Validform_label" style="display: none;">订单状态</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].carrierNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.carrierNum }"/>
					  <label class="Validform_label" style="display: none;">运输商</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].carrierName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.carrierName }"/>
					  <label class="Validform_label" style="display: none;">运输商名称</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].shippingType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.shippingType }"/>
					  <label class="Validform_label" style="display: none;">运输方式</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].shippingRequirement" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.shippingRequirement }"/>
					  <label class="Validform_label" style="display: none;">运输要求</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].tradeTerms" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.tradeTerms }"/>
					  <label class="Validform_label" style="display: none;">贸易条款</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].tradeMode" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.tradeMode }"/>
					  <label class="Validform_label" style="display: none;">贸易方式</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].remarkFlag" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.remarkFlag }"/>
					  <label class="Validform_label" style="display: none;">预警提示</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondPacklistList[${stuts.index }].memo" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.memo }"/>
					  <label class="Validform_label" style="display: none;">备注</label>
				   </td>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
</div>

