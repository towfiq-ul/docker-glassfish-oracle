<%-- 
    Document   : trackrep24_kyc_ui
    Created on : Nov 9, 2016, 10:57:31 AM
    Author     : dni_shahinur
--%>

<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Transaction Summary Report : Agent Wise";%>
<%@ include file="/secure/top.jsp" %>
<link href="<%=request.getContextPath()%>/css/detailsInformation.css" rel="stylesheet" type="text/css" media="screen" />

<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>

    <s:if test="%{!errorMessage.empty}">
        <s:div id="errorMessage" cssClass="form-message error">
            <ul> <li> <s:property value="errorMessage" /> </li> </ul>
                </s:div>
            </s:if>
            <%    if ((request.isUserInRole("SM")) || (request.isUserInRole("TM"))) {%>

    <fieldset class="gradient">
        <%    if ((request.isUserInRole("SM"))) {%>
        <legend style="padding: 4px ;"><h5>Transaction Summary Report : Agent Wise</h5></legend><br/>
        <% }%>
        <%    if ((request.isUserInRole("TM"))) {%>
        <legend style="padding: 4px ;"><h5>Transaction Summary Report : Agent Wise</h5></legend><br/>
        <% }%>
        <s:form action="/secure/action/kycTrackingRep24Result" onsubmit="return checkdate('datepicker_kyc_tr_startdate','datepicker_kyc_tr_enddate')">
            <s:hidden name="target" value="DISTRIBUTOR" />
            <label>Select MA Wallet: </label> <s:select list="maWallets" listKey="walletNo" listValue="distName" name="selectMAWallet" label="Status" />
            Date : <s:textfield name="from_date" id="datepicker_kyc_tr_startdate" placeholder="Select date" readonly="true"/>
            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />
        </s:form><br/>
    </fieldset>
    <%  }%>
    <br/>
</center>
<%@ include file="/secure/bottom.jsp" %>

