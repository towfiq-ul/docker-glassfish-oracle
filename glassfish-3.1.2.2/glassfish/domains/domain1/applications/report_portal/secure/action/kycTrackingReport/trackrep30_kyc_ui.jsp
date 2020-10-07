<%-- 
    Document   : trackrep30_kyc_ui
    Created on : Jan 20, 2019, 2:14:40 PM
    Author     : mithun.mondal
--%>

<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "RA Performance Report";%>
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
            <%    if (request.isUserInRole("RSM") || request.isUserInRole("SM") || request.isUserInRole("TM") || request.isUserInRole("DISTRIBUTOR")) {%>

    <fieldset class="gradient">
        <s:form action="/secure/action/kycTrackingRep30Result" onsubmit="return checkMAAndRAandMTDAndDate('checkbox-MTD', 'datepicker_kyc_tr_startdate27','datepicker_kyc_tr_enddate27')">
            <s:hidden name="target" value="DISTRIBUTOR" />
            <label>Select Distributor: </label> 
            <s:select id="multiple-select-ma" multiple="true" list="dsoWallets" listKey="walletNo" listValue="walletNo" name="selectedMAs" />
            <label>Select RA: </label>
            <select id="multiple-select" multiple="true" name="selectedRAs"></select>
            <br>
            <br>
            <span style="margin-left:20px;margin-right:20px;">
                <label for="checkbox-MTD">MTD</label>
                <s:checkbox style="vertical-align: text-bottom;" name="mtd" id="checkbox-MTD" />
            </span>
            Start Date : <s:textfield name="from_date" id="datepicker_kyc_tr_startdate27" placeholder="Select date" readonly="true"/>
            &nbsp;  End Date : <s:textfield name="to_date" id="datepicker_kyc_tr_enddate27" placeholder="Select date" readonly="true"/>
            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3; cursor:pointer;" value="Go" />
        </s:form><br/>
    </fieldset>
    <%  }%>
    <br/>
</center>
<%@ include file="/secure/bottom.jsp" %>
