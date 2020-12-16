<%--
  Created by IntelliJ IDEA.
  Document: trackrep35_kyc_ui
  User: TOWFIQUL ISLAM
  Date: 10/7/20
  Time: 5:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "B2B Acknowledgement Report";%>
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
        <s:form action="/secure/action/kycTrackingRep35Result" onsubmit="return checkMAAndRA()">
            <s:hidden name="target" value="DISTRIBUTOR"/>
            <label>Select Distributor: </label>
            <s:select id="multiple-select-ma" multiple="true" list="dsoWallets" listKey="walletNo" listValue="walletNo"
                      name="selectedMAs"/>
            <label>Select RA: </label>
            <select id="multiple-select" multiple="true" name="selectedRAs"></select>
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
