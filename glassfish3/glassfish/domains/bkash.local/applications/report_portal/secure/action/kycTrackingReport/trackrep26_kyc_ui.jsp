<%-- 
    Document   : trackrep25_kyc_ui
    Created on : Nov 28, 2016, 3:37:30 PM
    Author     : dni_shahinur
--%>
<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Refund Report";%>
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
            <%    if ((request.isUserInRole("RSM")) || (request.isUserInRole("SM")) || (request.isUserInRole("TM"))) {%>

    <fieldset class="gradient">
        <%    if ((request.isUserInRole("RSM"))) {%>
        <legend style="padding: 4px ;"><h5>Refund Report</h5></legend><br/>
        <% }%>
        <%    if ((request.isUserInRole("SM"))) {%>
        <legend style="padding: 4px ;"><h5>Refund Report</h5></legend><br/>
        <% }%>
        <%    if ((request.isUserInRole("TM"))) {%>
        <legend style="padding: 4px ;"><h5>Refund Report</h5></legend><br/>
        <% }%>
        <s:form action="/secure/action/kycTrackingRep26Result" onsubmit="return checkdate('datepicker_kyc_tr_startdate25','datepicker_kyc_tr_enddate25')">
            <s:hidden name="target" value="DISTRIBUTOR" />
            Start Date : <s:textfield name="from_date" id="datepicker_kyc_tr_startdate25" placeholder="Select date" readonly="true"/>
            &nbsp;  End Date : <s:textfield name="to_date" id="datepicker_kyc_tr_enddate25" placeholder="Select date" readonly="true"/>
            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />
        </s:form><br/>
    </fieldset>
    <%  }%>
    <br/>
</center>
<%@ include file="/secure/bottom.jsp" %>
