<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addTaaediDeclarationDetailBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delTaaediDeclarationDetailBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addTaaediDeclarationDetailBtn').bind('click', function(){   
 		 var tr =  $("#add_taaediDeclarationDetail_table_template tr").clone();
	 	 $("#add_taaediDeclarationDetail_table").append(tr);
	 	 resetTrNum('add_taaediDeclarationDetail_table');
	 	 return false;
    });  
	$('#delTaaediDeclarationDetailBtn').bind('click', function(){   
      	$("#add_taaediDeclarationDetail_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_taaediDeclarationDetail_table'); 
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
	<a id="addTaaediDeclarationDetailBtn" href="#">添加</a> <a id="delTaaediDeclarationDetailBtn" href="#">删除</a> 
</div>
<div style="overflow:auto">
<table border="0" cellpadding="2" cellspacing="0" id="taaediDeclarationDetail_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">序号</td>
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">操作</td>
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
					单位
				</td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						原产国
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
						币种
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						免征标志
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						包装规格
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
				 <%-- <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						是否紧急标志
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						附件标志
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						预警提示
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						备注
				  </td>--%>
	</tr>
	<tbody id="add_taaediDeclarationDetail_table">
	<c:if test="${fn:length(taaediDeclarationDetailList)  <= 0 }">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">1</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
					<input name="taaediDeclarationDetailList[0].id" type="hidden"/>
					<input name="taaediDeclarationDetailList[0].createName" type="hidden"/>
					<input name="taaediDeclarationDetailList[0].createBy" type="hidden"/>
					<input name="taaediDeclarationDetailList[0].createDate" type="hidden"/>
					<input name="taaediDeclarationDetailList[0].updateName" type="hidden"/>
					<input name="taaediDeclarationDetailList[0].updateBy" type="hidden"/>
					<input name="taaediDeclarationDetailList[0].updateDate" type="hidden"/>
					<input name="taaediDeclarationDetailList[0].sysOrgCode" type="hidden"/>
					<input name="taaediDeclarationDetailList[0].sysCompanyCode" type="hidden"/>
					<input name="taaediDeclarationDetailList[0].bpmStatus" type="hidden"/>
					<input name="taaediDeclarationDetailList[0].delflag" type="hidden"/>
					<input name="taaediDeclarationDetailList[0].delDate" type="hidden"/>
					<input name="taaediDeclarationDetailList[0].mainId" type="hidden"/>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].customsInvoiceNo" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">报关发票号</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].customsGoodsNum" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">海关品编号</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].customsGoodsName" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">海关品名称</label>
					</td>
				<td align="left">
					<input name="taaediDeclarationDetailList[0].units" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					<label class="Validform_label" style="display: none;">单位</label>
				</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].provenance" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">原产国</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].customsQuantity" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">本次报关数量</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].unitPriceOriginal" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">原始单价</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].unitPriceBase" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">基准单价</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].unitPriceUpdate" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">调整单价</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].unitPriceShippingfee" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">运费分摊单价</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].untiPriceTotal" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">合计单价</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].customsAmount" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">报关金额</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].hscode" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">税择号</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].licenceSpecial" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">特殊审批单</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].licenceAnimalPlant" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">动植物审批单</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].licenceSpecialgoods" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">特殊物品审批单</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].licenceEndangered" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">濒危证</label>
					</td>
				  <td align="left">
					     <input name="taaediDeclarationDetailList[0].currency" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					   <label class="Validform_label" style="display: none;">币种</label>
				  </td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].freeFlag" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">免征标志</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].packageType" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">包装规格</label>
					</td>

				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].netWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">净重</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].grossWeight" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">毛重</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].dimension" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">长宽高</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].volume" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">体积</label>
					</td>
				  <%--<td align="left">
					  	<input name="taaediDeclarationDetailList[0].urgentFlag" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">是否紧急标志</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].attachmentFlag" maxlength="3" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">附件标志</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].remarkFlag" maxlength="3" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">预警提示</label>
					</td>
				  <td align="left">
					  	<input name="taaediDeclarationDetailList[0].memo" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">备注</label>
					</td>--%>
   			</tr>
	</c:if>
	<c:if test="${fn:length(taaediDeclarationDetailList)  > 0 }">
		<c:forEach items="${taaediDeclarationDetailList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
						<input name="taaediDeclarationDetailList[${stuts.index }].id" type="hidden" value="${poVal.id }"/>
						<input name="taaediDeclarationDetailList[${stuts.index }].createName" type="hidden" value="${poVal.createName }"/>
						<input name="taaediDeclarationDetailList[${stuts.index }].createBy" type="hidden" value="${poVal.createBy }"/>
						<input name="taaediDeclarationDetailList[${stuts.index }].createDate" type="hidden" value="${poVal.createDate }"/>
						<input name="taaediDeclarationDetailList[${stuts.index }].updateName" type="hidden" value="${poVal.updateName }"/>
						<input name="taaediDeclarationDetailList[${stuts.index }].updateBy" type="hidden" value="${poVal.updateBy }"/>
						<input name="taaediDeclarationDetailList[${stuts.index }].updateDate" type="hidden" value="${poVal.updateDate }"/>
						<input name="taaediDeclarationDetailList[${stuts.index }].sysOrgCode" type="hidden" value="${poVal.sysOrgCode }"/>
						<input name="taaediDeclarationDetailList[${stuts.index }].sysCompanyCode" type="hidden" value="${poVal.sysCompanyCode }"/>
						<input name="taaediDeclarationDetailList[${stuts.index }].bpmStatus" type="hidden" value="${poVal.bpmStatus }"/>
						<input name="taaediDeclarationDetailList[${stuts.index }].delflag" type="hidden" value="${poVal.delflag }"/>
						<input name="taaediDeclarationDetailList[${stuts.index }].delDate" type="hidden" value="${poVal.delDate }"/>
						<input name="taaediDeclarationDetailList[${stuts.index }].mainId" type="hidden" value="${poVal.mainId }"/>
				   <td align="left">
					  <%--<label class="Validform_label" style="display: none;">报关发票号</label>--%>
						   ${poVal.customsInvoiceNo}
				   </td>
				   <td align="left">
					  <%--<label class="Validform_label" style="display: none;">海关品编号</label>--%>
						   ${poVal.customsGoodsNum }
				   </td>
				   <td align="left">
					 <%-- <label class="Validform_label" style="display: none;">海关品名称</label>--%>
						   ${poVal.customsGoodsName }
				   </td>
					<td align="left">
							<%--<label class="Validform_label" style="display: none;">单位</label>--%>
							${poVal.units }
					</td>
				   <td align="left">
					 <%-- <label class="Validform_label" style="display: none;">原产国</label>--%>
							 ${poVal.provenance }
				   </td>

				   <td align="left">
					  	<input name="taaediDeclarationDetailList[${stuts.index }].customsQuantity" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.customsQuantity }"/>
					  <label class="Validform_label" style="display: none;">报关数量</label>
				   </td>
				   <td align="left">
					  <%--<label class="Validform_label" style="display: none;">原始单价</label>--%>
						   ${poVal.unitPriceOriginal }
				   </td>
				   <td align="left">
					  <%--<label class="Validform_label" style="display: none;">基准单价</label>--%>
						   ${poVal.unitPriceBase }
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationDetailList[${stuts.index }].unitPriceUpdate" maxlength="20" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.unitPriceUpdate }"/>
					  <label class="Validform_label" style="display: none;">调整单价</label>
				   </td>
				   <td align="left">
					  <%--<label class="Validform_label" style="display: none;">运费分摊单价</label>--%>
						   ${poVal.unitPriceShippingfee }
				   </td>
				   <td align="left">
					  <%--<label class="Validform_label" style="display: none;">合计单价</label>--%>
						   ${poVal.untiPriceTotal }
				   </td>
				   <td align="left">
					  <%--<label class="Validform_label" style="display: none;">报关金额</label>--%>
						   ${poVal.customsAmount }
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationDetailList[${stuts.index }].hscode" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.hscode }"/>
					  <label class="Validform_label" style="display: none;">税择号</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationDetailList[${stuts.index }].licenceSpecial" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.licenceSpecial }"/>
					  <label class="Validform_label" style="display: none;">特殊审批单</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationDetailList[${stuts.index }].licenceAnimalPlant" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.licenceAnimalPlant }"/>
					  <label class="Validform_label" style="display: none;">动植物审批单</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationDetailList[${stuts.index }].licenceSpecialgoods" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.licenceSpecialgoods }"/>
					  <label class="Validform_label" style="display: none;">特殊物品审批单</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationDetailList[${stuts.index }].licenceEndangered" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.licenceEndangered }"/>
					  <label class="Validform_label" style="display: none;">濒危证</label>
				   </td>
				   <td align="left">
						<%-- <label class="Validform_label" style="display: none;">币种</label>--%>
						${poVal.currency }
				   </td>
				   <td align="left">
					  <%--<label class="Validform_label" style="display: none;">免征标志</label>--%>
						   ${poVal.freeFlag }
				   </td>
				   <td align="left">
					  <%--<label class="Validform_label" style="display: none;">包装规格</label>--%>
						   ${poVal.packageType }
				   </td>
				   <td align="left">
					  <%--<label class="Validform_label" style="display: none;">净重</label>--%>
						   ${poVal.netWeight }
				   </td>
				   <td align="left">
					  <%--<label class="Validform_label" style="display: none;">毛重</label>--%>
						   ${poVal.grossWeight }
				   </td>
				   <td align="left">
					 <%-- <label class="Validform_label" style="display: none;">长宽高</label>--%>
						   ${poVal.dimension }
				   </td>
				   <td align="left">
					 <%-- <label class="Validform_label" style="display: none;">体积</label>--%>
						   ${poVal.volume }
				   </td>
				   <%--<td align="left">
					  	<input name="taaediDeclarationDetailList[${stuts.index }].urgentFlag" maxlength="50" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.urgentFlag }"/>
					  <label class="Validform_label" style="display: none;">是否紧急标志</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationDetailList[${stuts.index }].attachmentFlag" maxlength="3" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore"  value="${poVal.attachmentFlag }"/>
					  <label class="Validform_label" style="display: none;">附件标志</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationDetailList[${stuts.index }].remarkFlag" maxlength="3" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore"  value="${poVal.remarkFlag }"/>
					  <label class="Validform_label" style="display: none;">预警提示</label>
				   </td>
				   <td align="left">
					  	<input name="taaediDeclarationDetailList[${stuts.index }].memo" maxlength="500" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.memo }"/>
					  <label class="Validform_label" style="display: none;">备注</label>
				   </td>--%>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
</div>
