<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% 

response.setContentType("application/vnd.ms-excel");
response.setHeader("Content-Disposition",
"attachment;filename=md_portal_batch_data.xls"); 
%>

<table>
      <tr><th style="font-size:15;padding: 6px ;">Batch</th><th style="font-size:15;padding: 6px ;">Req ID</th><th style="font-size:15;padding: 6px ;">Wallet</th><th style="font-size:15;padding: 6px ;">Amount (BDT.)</th><th style="font-size:15;padding: 6px ;">Amount In Words</th><th style="font-size:15;padding: 6px ;">Status</th><th style="font-size:15;padding: 6px ;">Requested</th><th style="font-size:15;padding: 6px ;">Changed</th></tr>
<s:iterator value="data">
    <tr>
         <td style="font-size:15;padding: 4px ;"> <s:property value="batch_id" /></td>
        <td style="font-size:15;padding: 4px ;"> <s:property value="req_id" /></td>
        <td style="font-size:15;padding: 4px ;"> <s:property value="dest_wallet" /></td>
        <td style="font-size:15;padding: 4px ;"> <s:property value="amount" /></td>
        
        <td style="font-size:15;padding: 4px ;"> <s:property value="amount_in_words" /></td>

<td style="font-size:15;padding: 4px ;"> <s:property value="status" /></td>
<td style="font-size:15;padding: 4px ;"> on <s:property value="requested_on" /> - by <s:property value="requested_by" /></td>
<td style="font-size:15;padding: 4px ;"> on <s:property value="changed_on" /> - by <s:property value="changed_by" /></td>
    </tr>
</s:iterator>
</table>
