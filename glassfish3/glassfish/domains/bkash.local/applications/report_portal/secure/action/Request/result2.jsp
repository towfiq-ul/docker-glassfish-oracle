<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String  pagename="Batch Content "; %>
<%@ include file="/secure/top.jsp" %>
<A HREF="javascript:history.go(-1)"> [Go Back]</A>
<br/>
<br/>
<a href="<%=request.getContextPath() %>/secure/action/disburse_listdatafileex?batch=<s:property value="batch" />">Get Excel</a>
<center>

<s:property value="message" /><br/>
<table>
      <tr><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Batch</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Req ID</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Wallet</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Amount (BDT.)</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Amount In Words</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Status</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Requested</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Changed</th></tr>
<s:iterator value="data">
    <tr>
         <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="batch_id" /></td>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="req_id" /></td>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="dest_wallet" /></td>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="amount" /></td>
        
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="amount_in_words" /></td>

<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="status" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> on <s:property value="requested_on" /> - by <s:property value="requested_by" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> on <s:property value="changed_on" /> - by <s:property value="changed_by" /></td>
    </tr>
</s:iterator>
</table>
</center>
<%@ include file="/secure/bottom.jsp" %>