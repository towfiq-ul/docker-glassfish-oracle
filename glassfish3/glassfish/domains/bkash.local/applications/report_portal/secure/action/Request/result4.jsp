<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>


<% 

response.setContentType("application/vnd.ms-excel");
response.setHeader("Content-Disposition",
"attachment;filename=md_portal_request_results.xls"); 
%>




<table>
      <tr><th style="font-size:15;padding: 6px ;">Batch</th><th style="font-size:15;padding: 6px ;">Owner</th><th style="font-size:15;padding: 6px ;">Wallet</th><th style="font-size:15;padding: 6px ;">Distributor Code</th><th style="font-size:15;padding: 6px ;">Total Amount (BDT.)</th><th style="font-size:15;padding: 6px ;">Total Amount (In Words) </th><th style="font-size:15;padding: 6px ;">Reason </th><th style="font-size:15;padding: 6px ;">Bank Name</th><th style="font-size:15;padding: 6px ;">Bank Account</th><th style="font-size:15;padding: 6px ;">Reject Comment</th><th style="font-size:15;padding: 6px ;">Requested </th><th style="font-size:15;padding: 6px ;">Status</th><th style="font-size:15;padding: 6px ;">Changed</th></tr>
<s:iterator value="data">
     
    <tr>
       
         <td style="font-size:15;padding: 4px ;"> <s:property value="batch_id" /><input type="hidden" value="<s:property value="batch_id" />" name="batch_id_<s:property value="count" />"/></td>
         <td style="font-size:15;padding: 4px ;"> <s:property value="owner" /> </td><td style="font-size:15;padding: 4px ;"><s:property value="source_wallet" /></td><td style="font-size:15;padding: 4px ;"><s:property value="distributor_code" /></td>
        <td style="font-size:15;padding: 4px ;"> <s:property value="total_amount" /></td>
        <td style="font-size:15;padding: 4px ;"> <s:property value="total_amount_in_words" /></td>
<td style="font-size:15;padding: 4px ;"> <s:property value="reason" /></td>
<td style="font-size:15;padding: 4px ;"> <s:property value="bank_name" /></td>
<td style="font-size:15;padding: 4px ;"> <s:property value="bank_account" /></td>
<td style="font-size:15;padding: 4px ;"><s:property value="reject_comment" /></td>
<td style="font-size:15;padding: 4px ;"> on <s:property value="requested_on" /> - by <s:property value="requested_by" /></td>
<td style="font-size:15;padding: 4px ;"><s:property value="definition" /></td>
<td style="font-size:15;padding: 4px ;"> on <s:property value="changed_on" /> - by <s:property value="changed_by" /></td>



 
    </tr>
    
</s:iterator>
</table>

