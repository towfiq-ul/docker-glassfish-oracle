<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String  pagename="Results"; %>
<%@ include file="/secure/top.jsp" %>

<a href="<%=request.getContextPath() %>/secure/action/entriesex?wallet=<s:property value="wallet" />&date=<s:property value="date" />&exec_stat=<s:property value="exec_stat" />&page=<s:property value="page_next"/>&date_type=<s:property value="date_type" />">Get Excel</a>
<br/>
<br/>
<a href="<%=request.getContextPath() %>/secure/action/entries?wallet=<s:property value="wallet" />&date=<s:property value="date" />&exec_stat=<s:property value="exec_stat" />&page=<s:property value="page_prev"/>&date_type=<s:property value="date_type" />"><< prev</a> | <a href="<%=request.getContextPath() %>/secure/action/entries?wallet=<s:property value="wallet" />&date=<s:property value="date" />&exec_stat=<s:property value="exec_stat" />&page=<s:property value="page_next"/>&date_type=<s:property value="date_type" />">next >></a><br/>



<center>

<s:property value="message" /><br/>
<s:property value="results" /><br/>
Pages <s:iterator value="data2">
     -
     <a href="<%=request.getContextPath() %>/secure/action/entries?wallet=<s:property value="wallet" />&date=<s:property value="date" />&exec_stat=<s:property value="exec_stat" />&page=<s:property />&date_type=<s:property value="date_type" />"><s:property /></a>
     
  </s:iterator>
<br/>
<table>
      <tr><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Batch</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Owner</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Total Amount (BDT.)</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Total Amount (In Words) </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Reason </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Bank Name</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Bank Account</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Reject Comment</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Requested </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Status</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Changed</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"></th></tr>
<s:iterator value="data">
     
    <tr>
       
         <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="batch_id" /><input type="hidden" value="<s:property value="batch_id" />" name="batch_id_<s:property value="count" />"/></td>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="owner" /> (<s:property value="source_wallet" />) (<s:property value="distributor_code" />)</td>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="total_amount" /></td>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="total_amount_in_words" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="reason" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="bank_name" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="bank_account" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"><s:property value="reject_comment" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> on <s:property value="requested_on" /> - by <s:property value="requested_by" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"><s:property value="definition" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> on <s:property value="changed_on" /> - by <s:property value="changed_by" /></td>



    <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">

    <a href="<%=request.getContextPath() %>/secure/action/disburse_listdatafile?batch=<s:property value="batch_id" />">See more</a>

</td>
    </tr>
    
</s:iterator>
</table>
</center>
<br/>
<br/>
<a href="<%=request.getContextPath() %>/secure/action/entries?wallet=<s:property value="wallet" />&date=<s:property value="date" />&exec_stat=<s:property value="exec_stat" />&page=<s:property value="page_prev"/>&date_type=<s:property value="date_type" />"><< prev</a> | <a href="<%=request.getContextPath() %>/secure/action/entries?wallet=<s:property value="wallet" />&date=<s:property value="date" />&exec_stat=<s:property value="exec_stat" />&page=<s:property value="page_next"/>&date_type=<s:property value="date_type" />">next >></a><br/>
<%@ include file="/secure/bottom.jsp" %>