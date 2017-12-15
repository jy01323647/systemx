<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addTaaediDeclarationSecondDetailBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delTaaediDeclarationSecondDetailBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addTaaediDeclarationSecondDetailBtn').bind('click', function(){   
 		 var tr =  $("#add_taaediDeclarationSecondDetail_table_template tr").clone();
	 	 $("#add_taaediDeclarationSecondDetail_table").append(tr);
	 	 resetTrNum('add_taaediDeclarationSecondDetail_table');
	 	 return false;
    });  
	$('#delTaaediDeclarationSecondDetailBtn').bind('click', function(){   
      	$("#add_taaediDeclarationSecondDetail_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_taaediDeclarationSecondDetail_table'); 
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
	<a id="addTaaediDeclarationSecondDetailBtn" href="#">添加</a> <a id="delTaaediDeclarationSecondDetailBtn" href="#">删除</a> 
</div>
<div style="overflow:auto">
<table border="0" cellpadding="2" cellspacing="0" id="taaediDeclarationSecondDetail_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">序号</td>
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">操作</td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						主表ID
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						报关发票号
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						海关品编号
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						海关品名称
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						原产国
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						币种
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						本次报关数量
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						原始单价
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						基准单价
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						调整单价
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						运费分摊单价
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						合计单价
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						报关金额
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						税择号
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						特殊审批单
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						动植物审批单
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						特殊物品审批单
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						濒危证
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						免征标志
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
						预警提示
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						备注
				  </td>
	</tr>
	<tbody id="add_taaediDeclarationSecondDetail_table">
	<c:if test="${fn:length(taaediDeclarationSecondDetailList)  <= 0 }">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">1</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
					<input name="taaediDeclarationSecondDetailList[0].id" type="hidden"/>
					<input name="taaediDeclarationSecondDetailList[0].createName" type="hidden"/>
					<input name="taaediDeclarationSecondDetailList[0].createBy" type="hidden"/>
					<input name="taaediDeclarationSecondDetailList[0].createDate" type="hidden"/>
					<input name="taaediDeclarationSecondDetailList[0].updateName" type="hidden"/>
					<input name="taaediDeclarationSecondDetailList[0].updateBy" type="hidden"/>
					<input name="taaediDeclarationSecondDetailList[0].updateDate" type="hidden"/>
					<input name="taaediDeclarationSecondDetailList[0].sysOrgCode" type="hidden"/>
					<input name="taaediDeclarationSecondDetailList[0].sysCompanyCode" type="hidden"/>
					<input name="taaediDeclarationSecondDetailList[0].bpmStatus" type="hidden"/>
					<input name="taaediDeclarationSecondDetailList[0].delflag" type="hidden"/>
					<input name="taaediDeclarationSecondDetailList[0].delDate" type="hidden"/>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].mainId" maxlength="36" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">主表ID</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].customsInvoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">报关发票号</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].customsGoodsNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">海关品编号</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].customsGoodsName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">海关品名称</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].provenance" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">原产国</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].currency" maxlength="10" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">币种</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].customsQuantity" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">本次报关数量</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].unitPriceOriginal" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">原始单价</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].unitPriceBase" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">基准单价</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].unitPriceUpdate" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">调整单价</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].unitPriceShippingfee" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">运费分摊单价</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].untiPriceTotal" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">合计单价</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].customsAmount" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">报关金额</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].hscode" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">税择号</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].licenceSpecial" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">特殊审批单</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].licenceAnimalPlant" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">动植物审批单</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].licenceSpecialgoods" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">特殊物品审批单</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].licenceEndangered" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">濒危证</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].freeFlag" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">免征标志</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].packageType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">包装规格</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].units" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">单位</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].netWeight" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">净重</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].grossWeight" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">毛重</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].dimension" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">长宽高</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].volume" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">体积</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].remarkFlag" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">预警提示</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[0].memo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">备注</label>
					</td>
   			</tr>
	</c:if>
	<c:if test="${fn:length(taaediDeclarationSecondDetailList)  > 0 }">
		<c:forEach items="${taaediDeclarationSecondDetailList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
						<input name="taaediDeclarationSecondDetailList[${stuts.index }].id" type="hidden" value="${poVal.id }"/>
						<input name="taaediDeclarationSecondDetailList[${stuts.index }].createName" type="hidden" value="${poVal.createName }"/>
						<input name="taaediDeclarationSecondDetailList[${stuts.index }].createBy" type="hidden" value="${poVal.createBy }"/>
						<input name="taaediDeclarationSecondDetailList[${stuts.index }].createDate" type="hidden" value="${poVal.createDate }"/>
						<input name="taaediDeclarationSecondDetailList[${stuts.index }].updateName" type="hidden" value="${poVal.updateName }"/>
						<input name="taaediDeclarationSecondDetailList[${stuts.index }].updateBy" type="hidden" value="${poVal.updateBy }"/>
						<input name="taaediDeclarationSecondDetailList[${stuts.index }].updateDate" type="hidden" value="${poVal.updateDate }"/>
						<input name="taaediDeclarationSecondDetailList[${stuts.index }].sysOrgCode" type="hidden" value="${poVal.sysOrgCode }"/>
						<input name="taaediDeclarationSecondDetailList[${stuts.index }].sysCompanyCode" type="hidden" value="${poVal.sysCompanyCode }"/>
						<input name="taaediDeclarationSecondDetailList[${stuts.index }].bpmStatus" type="hidden" value="${poVal.bpmStatus }"/>
						<input name="taaediDeclarationSecondDetailList[${stuts.index }].delflag" type="hidden" value="${poVal.delflag }"/>
						<input name="taaediDeclarationSecondDetailList[${stuts.index }].delDate" type="hidden" value="${poVal.delDate }"/>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].mainId" maxlength="36" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.mainId }"/>
					  <label class="Validform_label" style="display: none;">主表ID</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].customsInvoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.customsInvoiceNo }"/>
					  <label class="Validform_label" style="display: none;">报关发票号</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].customsGoodsNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.customsGoodsNum }"/>
					  <label class="Validform_label" style="display: none;">海关品编号</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].customsGoodsName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.customsGoodsName }"/>
					  <label class="Validform_label" style="display: none;">海关品名称</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].provenance" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.provenance }"/>
					  <label class="Validform_label" style="display: none;">原产国</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].currency" maxlength="10" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.currency }"/>
					  <label class="Validform_label" style="display: none;">币种</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].customsQuantity" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.customsQuantity }"/>
					  <label class="Validform_label" style="display: none;">本次报关数量</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].unitPriceOriginal" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.unitPriceOriginal }"/>
					  <label class="Validform_label" style="display: none;">原始单价</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].unitPriceBase" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.unitPriceBase }"/>
					  <label class="Validform_label" style="display: none;">基准单价</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].unitPriceUpdate" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.unitPriceUpdate }"/>
					  <label class="Validform_label" style="display: none;">调整单价</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].unitPriceShippingfee" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.unitPriceShippingfee }"/>
					  <label class="Validform_label" style="display: none;">运费分摊单价</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].untiPriceTotal" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.untiPriceTotal }"/>
					  <label class="Validform_label" style="display: none;">合计单价</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].customsAmount" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.customsAmount }"/>
					  <label class="Validform_label" style="display: none;">报关金额</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].hscode" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.hscode }"/>
					  <label class="Validform_label" style="display: none;">税择号</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].licenceSpecial" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.licenceSpecial }"/>
					  <label class="Validform_label" style="display: none;">特殊审批单</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].licenceAnimalPlant" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.licenceAnimalPlant }"/>
					  <label class="Validform_label" style="display: none;">动植物审批单</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].licenceSpecialgoods" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.licenceSpecialgoods }"/>
					  <label class="Validform_label" style="display: none;">特殊物品审批单</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].licenceEndangered" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.licenceEndangered }"/>
					  <label class="Validform_label" style="display: none;">濒危证</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].freeFlag" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.freeFlag }"/>
					  <label class="Validform_label" style="display: none;">免征标志</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].packageType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.packageType }"/>
					  <label class="Validform_label" style="display: none;">包装规格</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].units" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.units }"/>
					  <label class="Validform_label" style="display: none;">单位</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].netWeight" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.netWeight }"/>
					  <label class="Validform_label" style="display: none;">净重</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].grossWeight" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.grossWeight }"/>
					  <label class="Validform_label" style="display: none;">毛重</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].dimension" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.dimension }"/>
					  <label class="Validform_label" style="display: none;">长宽高</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].volume" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.volume }"/>
					  <label class="Validform_label" style="display: none;">体积</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].remarkFlag" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.remarkFlag }"/>
					  <label class="Validform_label" style="display: none;">预警提示</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationSecondDetailList[${stuts.index }].memo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.memo }"/>
					  <label class="Validform_label" style="display: none;">备注</label>
				   </td>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
</div>

