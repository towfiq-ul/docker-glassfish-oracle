<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String  pagename="Batch Processing Status"; %>
<%@ include file="/secure/top.jsp" %>
<center>

<s:property value="message" />

<table>
      <tr><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Batch</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Owner</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Total Amount (BDT.)</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Total Amount (In Words) </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Reason </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Bank Name</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Bank Account</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Status</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Requested </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"></th></tr>
<s:iterator value="data">
     
    <tr>
       
         <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="batch_id" /></td>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="owner" /> (<s:property value="wallet" />) (<s:property value="dist_code" />)</td>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="total_amount" /></td>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="total_amount_in_words" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="reason" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="bank_name" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="bank_account" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="status" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> on <s:property value="requested_on" /> - by <s:property value="requested_by" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">
     
    <s:if test="%{status.compareTo(\"in process\")!=0}">
    <a href="<%=request.getContextPath() %>/secure/action/disburse_listdata?batch=<s:property value="batch_id" />">See more</a>
 </s:if>
    
</td>
    </tr>
    
</s:iterator>
</table>
</center>
<%@ include file="/secure/bottom.jsp" %>