<%--
  Created by IntelliJ IDEA.
  Document: trackrep34_kyc_ui
  User: TOWFIQUL ISLAM
  Date: 10/7/20
  Time: 5:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "B2B Request Report";%>
<%@ include file="/secure/top.jsp" %>
<link href="<%=request.getContextPath()%>/css/detailsInformation.css" rel="stylesheet" type="text/css" media="screen"/>

<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message"/>
<center>

    <s:if test="%{!errorMessage.empty}">
        <s:div id="errorMessage" cssClass="form-message error">
            <ul>
                <li><s:property value="errorMessage"/></li>
            </ul>
        </s:div>
    </s:if>
    <% if (request.isUserInRole("RSM") || request.isUserInRole("SM") || request.isUserInRole("TM")
            || request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("COMPLIANCE")) {%>

    <fieldset class="gradient">
        <s:form action="/secure/action/kycTrackingRep34Result" onsubmit="return checkMAAndRAandDate('datepicker_kyc_tr_startdate34','datepicker_kyc_tr_enddate34')">
            <s:hidden name="target" value="DISTRIBUTOR"/>
            <label>Select Distributor: </label>
            <s:select id="multiple-select-ma" multiple="true" list="dsoWallets" listKey="walletNo" listValue="walletNo"
                      name="selectedMAs"/>

            <label>Select RA: </label>
            <select id="multiple-select" multiple="true" name="selectedRAs"></select>
            <br>
            <br>
            Start Date : <s:textfield name="from_date" id="datepicker_kyc_tr_startdate34" placeholder="Select date"
                                      readonly="true"/>
            &nbsp; End Date : <s:textfield name="to_date" id="datepicker_kyc_tr_enddate34" placeholder="Select date"
                                           readonly="true"/>
            <br>
            <br>
            <s:submit
                    style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3; cursor:pointer;"
                    value="Go"/>
        </s:form><br/>
    </fieldset>
    <% }%>
    <br/>
</center>
<%@ include file="/secure/bottom.jsp" %>
