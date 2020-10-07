<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String  pagename="Queue"; %>
<%@ include file="/secure/top.jsp" %>
<center>

    <b style="display: inline;width:100px"><s:property value="message" /></b>
 <s:form action="queue_submit" namespace="/secure/action/" method="post" name="Form" theme="simple">
<table>
      <tr><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Batch</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Owner</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Total Amount (BDT.)</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Total Amount (In Words) </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Reason </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Bank Name</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Bank Account</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Requested </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Changed </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Accept</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Reject</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Reject Comment (if any)</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"></th></tr>
<s:iterator value="data">
     
    <tr>
       
         <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="batch_id" /><input type="hidden" value="<s:property value="batch_id" />" name="batch_id_<s:property value="count" />"/></td>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="owner" /> (<s:property value="wallet" />) (<s:property value="dist_code" />)</td>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="total_amount" /></td>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="total_amount_in_words" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="reason" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="bank_name" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="bank_account" /></td>

<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> on <s:property value="requested_on" /> - by <s:property value="requested_by" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> on <s:property value="changed_on" /> - by <s:property value="changed_by" /></td>


<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"><input type="radio" name="result_<s:property value="count" />" value="acpt" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"><input type="radio" name="result_<s:property value="count" />" value="rej" /></td>
<td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"><input type="text" name="rej_cmt_<s:property value="count" />" value="" maxlength="40" size="12" /></td>
    <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">

    <a href="<%=request.getContextPath() %>/secure/action/disburse_listdatafile?batch=<s:property value="batch_id" />">See more</a>

</td>
    </tr>
    <tr></tr>
</s:iterator>
</table>
</center>
<s:hidden property="countno" name="countno"/>
<br/>
     <s:submit key="submit" value="Submit"/>
            <s:submit action="cancel" value="Cancel" name="Cancel"  onclick="form.onsubmit=null"/>  
                   
        </s:form>
<%@ include file="/secure/bottom.jsp" %>