<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Registration and Balance Report: Agent Wise";%>
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


    <%    if (request.isUserInRole("DISTRIBUTOR")) {%>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>NID Searching Tool</h5></legend><br/>
        <s:form name="NID_Form" action="/secure/action/kycTrackingRep7Result" onsubmit="return validateNIDForm()">
            <%--<s:hidden name="target" value="DISTRIBUTOR" />--%>

            NID : <s:textfield name="nid_no" id="nid_no" placeholder="Enter NID" />


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Search" />

        </s:form><br/>

    </fieldset>



    <%  }%>

    <br/>




</center>

<%@ include file="/secure/bottom.jsp" %>