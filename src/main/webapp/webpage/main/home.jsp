<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style type="text/css">
	tr.odd-cell  {color: #000000; background-color: #F7F3E7; font-size: 11px;} /*C0C8D0  #fefadf, F7F3E7*/
	tr.even-cell {color: #000000; background-color: #ffffff; font-size: 11px;}
</style>
<table class="" border="0" cellspacing="0" cellpadding="0" width="95%" align="center" valign="middle">
	<tbody><tr bgcolor="">
		<td width="40%" align="center" valign="top">
			<!--start-->
			<table class="" border="0" cellspacing="0" cellpadding="0" style="width:600px">
				<tbody><tr bgcolor="">
					<td style="background-color: #7E9BBC;color: #ffffff; font: bold 11px/20px Verdana, Arial, Helvetica; height: 23px;text-align:left;" width="90%">&nbsp;&nbsp;&nbsp;待处理操作&nbsp;&nbsp;&nbsp;</td>
					<td style="background-color: #7E9BBC;color: #ffffff; font: bold 11px/20px Verdana, Arial, Helvetica; height: 23px;text-align:right;cursor: pointer;" onclick="goURL('message/message_list.html');" title="浏览更多" width="10%" align="right">&nbsp;</td>
				</tr>
				<tr>
					<td height="220" valign="top" colspan="2">
						<table class="table-outer-border" style="padding-top: 8px;" cellspacing="0" cellpadding="0" border="0" width="100%">



							<tbody><tr class="even-cell">
								<td width="80" align="left" nowrap="">
									<table cellspacing="0" cellpadding="0" border="0" width="100%">
										<tbody><tr>
											<td align="center" valign="top"><strong>采购订单</strong></td>
										</tr>
										</tbody></table>
								</td>
								<td class="td-cell" width="90%" align="left" nowrap="">
									<table cellspacing="0" cellpadding="0" border="0" width="100%">
										<tbody><tr height="25">
											<td width="120" align="left">SAP境外采购订单</td>
											<td width="120" align="left">待确认生成发票箱单</td>
											<td width="120" align="left">5</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">SAP境外采购订单</td>
											<td width="120" align="left">待SCH确认运输商</td>
											<td width="120" align="left">2</td>
										</tr>

										<tr height="25">
											<td width="120" align="left">非SAP境外采购订单</td>
											<td width="120" align="left">待确认生成发票箱单</td>
											<td width="120" align="left">5</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">SAP境外采购订单</td>
											<td width="120" align="left">非待SCH确认运输商</td>
											<td width="120" align="left">2</td>
										</tr>

										<tr height="25">
											<td width="120" align="left">SAP国内采购订单</td>
											<td width="120" align="left">待确认生成发票箱单</td>
											<td width="120" align="left">5</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">SAP国内采购订单</td>
											<td width="120" align="left">非待SCH确认运输商</td>
											<td width="120" align="left">2</td>
										</tr>
										</tbody></table>
								</td>


							</tr>
							<tr class="odd-cell">
								<td width="80" align="left" nowrap="">
									<table cellspacing="0" cellpadding="0" border="0" width="100%">
										<tbody><tr>
											<td align="center" valign="top"><strong>发票箱单</strong></td>
										</tr>
										</tbody></table>
								</td>


								<td class="td-cell" width="90%" align="left" nowrap="">
									<table cellspacing="0" cellpadding="0" border="0" width="100%">
										<tbody><tr height="25">
											<td width="120" align="left">SAP境外采购发票箱单</td>
											<td width="120" align="left">未生成报关资料</td>
											<td width="120" align="left">5</td>
										</tr>

										<tr height="25">
											<td width="120" align="left">非SAP境外采购发票箱单</td>
											<td width="120" align="left">未生成报关资料</td>
											<td width="120" align="left">5</td>
										</tr>


										<tr height="25">
											<td width="120" align="left">NRI发票箱单</td>
											<td width="120" align="left">未生成报关资料</td>
											<td width="120" align="left">5</td>
										</tr>
										</tbody></table>
								</td>
							</tr>



							<tr class="even-cell">
								<td width="80" align="left" nowrap="">
									<table cellspacing="0" cellpadding="0" border="0" width="100%">
										<tbody><tr>
											<td align="center" valign="top"><strong>运单</strong></td>
										</tr>
										</tbody></table>
								</td>
								<td class="td-cell" width="90%" align="left" nowrap="">
									<table cellspacing="0" cellpadding="0" border="0" width="100%">
										<tbody><tr height="25">
											<td width="120" align="left">境外运单</td>
											<td width="120" align="left">待发货</td>
											<td width="120" align="left">5</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">境外运单</td>
											<td width="120" align="left">待到货</td>
											<td width="120" align="left">3</td>
										</tr>

										<tr height="25">
											<td width="120" align="left">境内运单</td>
											<td width="120" align="left">待发货</td>
											<td width="120" align="left">3</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">境内运单</td>
											<td width="120" align="left">待到货</td>
											<td width="120" align="left">5</td>
										</tr>

										</tbody></table>
								</td>
							</tr>

							<tr class="odd-cell">
								<td width="80" align="left" nowrap="">
									<table cellspacing="0" cellpadding="0" border="0" width="100%">
										<tbody><tr>
											<td align="center" valign="top"><strong>报关资料</strong></td>
										</tr>
										</tbody></table>
								</td>


								<td class="td-cell" width="90%" align="left" nowrap="">
									<table cellspacing="0" cellpadding="0" border="0" width="100%">
										<tbody><tr height="25">
											<td width="120" align="left">境外采购</td>
											<td width="120" align="left">待提交代理（SCH）</td>
											<td width="120" align="left">2</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">境外采购</td>
											<td width="120" align="left">待批准（SCH）</td>
											<td width="120" align="left">5</td>
										</tr>

										<tr height="25">
											<td width="120" align="left">境外采购</td>
											<td width="120" align="left">待报关（代理）</td>
											<td width="120" align="left">3</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">境外采购</td>
											<td width="120" align="left">待完成（代理）</td>
											<td width="120" align="left">3</td>
										</tr>

										<tr height="25">
											<td width="120" align="left">口岸进境</td>
											<td width="120" align="left">待提交代理（SCH）</td>
											<td width="120" align="left">3</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">口岸进境</td>
											<td width="120" align="left">待批准（SCH）</td>
											<td width="120" align="left">5</td>
										</tr>

										<tr height="25">
											<td width="120" align="left">口岸进境</td>
											<td width="120" align="left">待报关（代理）</td>
											<td width="120" align="left">3</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">口岸进境</td>
											<td width="120" align="left">待完成（代理）</td>
											<td width="120" align="left">3</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">NRI仓库进境</td>
											<td width="120" align="left">待提交代理（SCH）</td>
											<td width="120" align="left">3</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">NRI仓库进境</td>
											<td width="120" align="left">待批准（SCH）</td>
											<td width="120" align="left">5</td>
										</tr>

										<tr height="25">
											<td width="120" align="left">NRI仓库进境</td>
											<td width="120" align="left">待报关（代理）</td>
											<td width="120" align="left">3</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">NRI仓库进境</td>
											<td width="120" align="left">待完成（代理）</td>
											<td width="120" align="left">3</td>
										</tr>

										<tr height="25">
											<td width="120" align="left">仪器配件二次报关</td>
											<td width="120" align="left">待提交代理（SCH）</td>
											<td width="120" align="left">3</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">仪器配件二次报关</td>
											<td width="120" align="left">待批准（SCH）</td>
											<td width="120" align="left">5</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">仪器配件二次报关</td>
											<td width="120" align="left">待报关（代理）</td>
											<td width="120" align="left">3</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">仪器配件二次报关</td>
											<td width="120" align="left">待完成（代理）</td>
											<td width="120" align="left">3</td>
										</tr>

										<tr height="25">
											<td width="120" align="left">外贸</td>
											<td width="120" align="left">待提交代理（SCH）</td>
											<td width="120" align="left">3</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">外贸</td>
											<td width="120" align="left">待批准（SCH）</td>
											<td width="120" align="left">5</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">外贸</td>
											<td width="120" align="left">待报关（代理）</td>
											<td width="120" align="left">3</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">外贸</td>
											<td width="120" align="left">待完成（代理）</td>
											<td width="120" align="left">3</td>
										</tr>

										<tr height="25">
											<td width="120" align="left">内贸</td>
											<td width="120" align="left">待提交代理（SCH）</td>
											<td width="120" align="left">3</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">内贸</td>
											<td width="120" align="left">待批准（SCH）</td>
											<td width="120" align="left">5</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">内贸</td>
											<td width="120" align="left">待报关（代理）</td>
											<td width="120" align="left">3</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">内贸</td>
											<td width="120" align="left">待完成（代理）</td>
											<td width="120" align="left">3</td>
										</tr>


										</tbody></table>
								</td>
							</tr>

							<tr class="even-cell">
								<td width="80" align="left" nowrap="">
									<table cellspacing="0" cellpadding="0" border="0" width="100%">
										<tbody><tr>
											<td align="center" valign="top"><strong>销售订单</strong></td>
										</tr>
										</tbody></table>
								</td>
								<td class="td-cell" width="90%" align="left" nowrap="">
									<table cellspacing="0" cellpadding="0" border="0" width="100%">
										<tbody><tr height="25">
											<td width="120" align="left">美金订单</td>
											<td width="120" align="left">待分货（SCH）</td>
											<td width="120" align="left">3</td>
										</tr>
										<tr height="25">
											<td width="120" align="left">人民币订单</td>
											<td width="120" align="left">待分货</td>
											<td width="120" align="left">3</td>
										</tr>

										</tbody></table>
								</td>
							</tr>



							</tbody></table>
					</td>
				</tr>
				</tbody></table>
			<!--end-->
		</td>

	</tr>
	</tbody></table>