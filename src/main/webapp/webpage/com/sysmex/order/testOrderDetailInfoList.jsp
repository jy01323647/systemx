<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addTestOrderDetailInfoBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delTestOrderDetailInfoBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addTestOrderDetailInfoBtn').bind('click', function(){   
 		 var tr =  $("#add_testOrderDetailInfo_table_template tr").clone();
	 	 $("#add_testOrderDetailInfo_table").append(tr);
	 	 resetTrNum('add_testOrderDetailInfo_table');
	 	 return false;
    });  
	$('#delTestOrderDetailInfoBtn').bind('click', function(){   
      	$("#add_testOrderDetailInfo_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_testOrderDetailInfo_table'); 
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
	<a id="addTestOrderDetailInfoBtn" href="#">添加</a> <a id="delTestOrderDetailInfoBtn" href="#">删除</a> 
</div>
<table border="0" cellpadding="2" cellspacing="0" id="testOrderDetailInfo_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">序号</td>
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">操作</td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						物料名称
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						物料编码
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						物料数量
				  </td>
	</tr>
	<tbody id="add_testOrderDetailInfo_table">
	<c:if test="${fn:length(testOrderDetailInfoList)  <= 0 }">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">1</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
					<input name="testOrderDetailInfoList[0].id" type="hidden"/>
					<input name="testOrderDetailInfoList[0].createName" type="hidden"/>
					<input name="testOrderDetailInfoList[0].createBy" type="hidden"/>
					<input name="testOrderDetailInfoList[0].createDate" type="hidden"/>
					<input name="testOrderDetailInfoList[0].updateName" type="hidden"/>
					<input name="testOrderDetailInfoList[0].updateBy" type="hidden"/>
					<input name="testOrderDetailInfoList[0].updateDate" type="hidden"/>
					<input name="testOrderDetailInfoList[0].sysOrgCode" type="hidden"/>
					<input name="testOrderDetailInfoList[0].sysCompanyCode" type="hidden"/>
					<input name="testOrderDetailInfoList[0].bpmStatus" type="hidden"/>
					<input name="testOrderDetailInfoList[0].orderId" type="hidden"/>
				  <td align="left">
					  	<input name="testOrderDetailInfoList[0].productName" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">物料名称</label>
					</td>
				  <td align="left">
					  	<input name="testOrderDetailInfoList[0].productCode" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">物料编码</label>
					</td>
				  <td align="left">
					  	<input name="testOrderDetailInfoList[0].productCount" maxlength="11" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">物料数量</label>
					</td>
   			</tr>
	</c:if>
	<c:if test="${fn:length(testOrderDetailInfoList)  > 0 }">
		<c:forEach items="${testOrderDetailInfoList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
						<input name="testOrderDetailInfoList[${stuts.index }].id" type="hidden" value="${poVal.id }"/>
						<input name="testOrderDetailInfoList[${stuts.index }].createName" type="hidden" value="${poVal.createName }"/>
						<input name="testOrderDetailInfoList[${stuts.index }].createBy" type="hidden" value="${poVal.createBy }"/>
						<input name="testOrderDetailInfoList[${stuts.index }].createDate" type="hidden" value="${poVal.createDate }"/>
						<input name="testOrderDetailInfoList[${stuts.index }].updateName" type="hidden" value="${poVal.updateName }"/>
						<input name="testOrderDetailInfoList[${stuts.index }].updateBy" type="hidden" value="${poVal.updateBy }"/>
						<input name="testOrderDetailInfoList[${stuts.index }].updateDate" type="hidden" value="${poVal.updateDate }"/>
						<input name="testOrderDetailInfoList[${stuts.index }].sysOrgCode" type="hidden" value="${poVal.sysOrgCode }"/>
						<input name="testOrderDetailInfoList[${stuts.index }].sysCompanyCode" type="hidden" value="${poVal.sysCompanyCode }"/>
						<input name="testOrderDetailInfoList[${stuts.index }].bpmStatus" type="hidden" value="${poVal.bpmStatus }"/>
						<input name="testOrderDetailInfoList[${stuts.index }].orderId" type="hidden" value="${poVal.orderId }"/>
				   <td align="left">
					  	<input name="testOrderDetailInfoList[${stuts.index }].productName" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.productName }"/>
					  <label class="Validform_label" style="display: none;">物料名称</label>
				   </td>
				   <td align="left">
					  	<input name="testOrderDetailInfoList[${stuts.index }].productCode" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.productCode }"/>
					  <label class="Validform_label" style="display: none;">物料编码</label>
				   </td>
				   <td align="left">
					  	<input name="testOrderDetailInfoList[${stuts.index }].productCount" maxlength="11" type="text" class="inputxt"  style="width:120px;"  datatype="n"  ignore="ignore"  value="${poVal.productCount }"/>
					  <label class="Validform_label" style="display: none;">物料数量</label>
				   </td>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
