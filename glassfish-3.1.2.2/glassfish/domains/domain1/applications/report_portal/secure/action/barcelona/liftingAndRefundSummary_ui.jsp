<%-- 
    Document   : liftingAndRefundSummary_ui
    Created on : Jul 2, 2013, 10:59:50 AM
    Author     : Hafizur_b0266
--%>


<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Lift & Refund Report (Summary)";%>
<%@ include file="/secure/top.jsp" %>
<link href="<%=request.getContextPath()%>/css/monthlyTransaction.css" rel="stylesheet" type="text/css" media="screen" />

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

        <legend style="padding: 4px ;"><h5>Lifting And Refund Report</h5></legend><br/>
        <s:form action="/secure/action/liftingAndSummaryResult" onsubmit="return checkBlankTextBox('datepicker')">

            Date : <s:textfield name="datePickerBean.datepicker" id="datepicker" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" /><br/><br/>

        </s:form><br/>

    </fieldset>

    <%  }%>

    <%    if (request.isUserInRole("SND")) {%>


    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>Lifting And Refund Report</h5></legend><br/>
        <s:form action="/secure/action/liftingAndSummaryResult" onsubmit="return checkBlankTextBox('datepicker1')">

            Distributor Name : <s:select  name="datePickerBean.wallet_no" label="Dist list" list="cm_list" listValue="bkdn_CHANNEL" listKey="ct_MA_WALLET" value="cm_list.ct_MA_WALLET" />

            &nbsp; &nbsp; Date : <s:textfield name="datePickerBean.datepicker" id="datepicker1" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" /><br/><br/>

        </s:form><br/>

    </fieldset>

    <%  }%>

    <br/>




</center>

<%@ include file="/secure/bottom.jsp" %>