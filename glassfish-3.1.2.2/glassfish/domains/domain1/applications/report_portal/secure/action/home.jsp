<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Dashboard";%>
<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <fieldset class="gradient">

        <legend style="font-size:20;padding: 4px ;">Today's Total Transactions</legend>

        <table>
            <tr><th style="font-size:15;padding: 4px ;">Request Status</th><th style="font-size:15;padding: 4px ;">No. of Requests's</th><th style="font-size:15;padding: 4px ;">Amount in Taka </th></tr>
            <tr><td style="font-size:15;padding: 4px ;"><a href="<%=request.getContextPath()%>/secure/action/entries?wallet=none&date=today&exec_stat=none&page=1&date_type=changed">Total Request:</a></td><td style="font-size:15;padding: 4px ;"><s:property value="total_count" /></td><td style="font-size:15;padding: 4px ;"><s:property value="total_amount" /></td></tr>
            <tr><td style="font-size:15;padding: 4px ;"><a href="<%=request.getContextPath()%>/secure/action/entries?wallet=none&date=today&exec_stat=0002&page=1&date_type=changed">Pending Request at Finance:</a></td><td style="font-size:15;padding: 4px ;"><s:property value="pending_finance_count" /></td><td style="font-size:15;padding: 4px ;"><s:property value="pending_finance_amount" /></td></tr>
            <tr><td style="font-size:15;padding: 4px ;"><a href="<%=request.getContextPath()%>/secure/action/entries?wallet=none&date=today&exec_stat=0004&page=1&date_type=changed">In Process:</a></td><td style="font-size:15;padding: 4px ;"><s:property value="in_process_count" /></td><td style="font-size:15;padding: 4px ;"><s:property value="in_process_amount" /></td></tr>
            <tr><td style="font-size:15;padding: 4px ;"><a href="<%=request.getContextPath()%>/secure/action/entries?wallet=none&date=today&exec_stat=0031&page=1&date_type=changed">Exception or Failed Request:</a></td><td style="font-size:15;padding: 4px ;"><s:property value="failed_count" /></td><td style="font-size:15;padding: 4px ;"><s:property value="failed_amount" /></td></tr>
            <tr><td style="font-size:15;padding: 4px ;"><a href="<%=request.getContextPath()%>/secure/action/entries?wallet=none&date=today&exec_stat=0000&page=1&date_type=changed">Executed Successfully:</a></td><td style="font-size:15;padding: 4px ;"><s:property value="successful_count" /></td><td style="font-size:15;padding: 4px ;"><s:property value="successful_amount" /></td></tr>

        </table>


    </fieldset>
    <br/>
    <fieldset class="gradient">

        <legend style="font-size:20;padding: 4px ;">Previous Transactions</legend>

        <table>
            <tr><th style="font-size:15;padding: 4px ;">Request Status</th><th style="font-size:15;padding: 4px ;">No. of Requests's</th><th style="font-size:15;padding: 4px ;">Amount in Taka </th></tr>

            <tr><td style="font-size:15;padding: 4px ;"><a href="<%=request.getContextPath()%>/secure/action/entries?wallet=none&date=previous&exec_stat=0002&page=1&date_type=changed">Pending Request at Finance:</a></td><td style="font-size:15;padding: 4px ;"><s:property value="prev_pending_finance_count" /></td><td style="font-size:15;padding: 4px ;"><s:property value="prev_pending_finance_amount" /></td></tr>

        </table>

</center>
</fieldset>
<%@ include file="/secure/bottom.jsp" %>