<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Photo Id Searching Tool UI";%>
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


    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("COMPLIANCE") || request.isUserInRole("QC")|| request.isUserInRole("SalesOps")) {%>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>ID Searching Tool</h5></legend><br/>
        <s:form name="ID_Form" action="/secure/action/kycTrackingRep8Result" onsubmit="return validateIDForm()">
            <%--<s:hidden name="target" value="DISTRIBUTOR" />--%>

            ID No: <s:textfield name="photo_id_no" id="photo_id_no" placeholder="Enter ID" />
            Select Id Type: <select id="photo_id_type" name="photo_id_type">
                <!--<option value="">Select ID Type</option>-->
                <option value="National ID">National ID</option>
            </select>
            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Search" />

        </s:form><br/>

    </fieldset>

    <%  }%>

    <br/>




</center>

<%@ include file="/secure/bottom.jsp" %>