<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String  pagename="Account Owner"; %>
<%@ include file="/secure/top.jsp" %>
<center>

<s:property value="message" />
<br/><br/>
<a href="<%=request.getContextPath() %>/secure/action/accountmod" style="font-size:15;">Add more accounts</a>
<br/>
<br/>
<table>
      <tr><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Owner </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Wallet</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Role </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Product </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Client Code</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Account Alias </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">SND Access </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Distributor Code </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Disburse Product </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Bulk path </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Created on </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Created by </th></tr>
<s:iterator value="data">
    <tr>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="owner" /></td>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="wallet" /></td>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="role" /></td>
         <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="product" /></td>
         <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="client_code" /></td>
         <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="account_alias" /></td>
         <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="snd_access" /></td>
         <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="distributor_code" /></td>
         <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="disburse_prod_id" /></td>
         <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="bulk_base_path" /></td>
         <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="created_on" /></td>
         <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="created_by" /></td>
    </tr>
</s:iterator>
</table>
</center>
<%@ include file="/secure/bottom.jsp" %>