  <%-- 
    Document   : kyc_status_summary_ui
    Created on : May 29, 2013, 5:07:22 PM
    Author     : Hafizur_b0266
--%>
-



<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Detailed KYC Status Report ";%>
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

    <%    if (request.isUserInRole("SND")) {%>


    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>SELECT A MONTH TO GENERATE KYC STATUS REPORT</h5></legend><br/><br/>
        <s:form action="/secure/action/kycStatusSummaryResult" onsubmit="return checkdate('datepicker17','datepicker18')">
        <s:hidden name="commonModelBean.param" value="number1" />
            Distributor Name :  <s:select name="wallet_no" label="Dist list" list="cm_list" listValue="bkdn_CHANNEL" listKey="ct_MA_WALLET" value="cm_list.ct_MA_WALLET"/><br/><br/>
            Month : <s:textfield name="month" id="datepicker98" placeholder="Select Month" readonly="true"/>
           <br/><br/>
            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>


    </fieldset>
    <%  }%>
    <%    if (request.isUserInRole("DISTRIBUTOR")) {%>
    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>SELECT A DATE RANGE (FORMAT - MM/DD/YYYY) TO GENERATE KYC STATUS REPORT</h5></legend><br/><br/>
        <s:form action="/secure/action/kycStatusReportResult" onsubmit="return checkdate('datepicker17','datepicker18')">

            Start Date : <s:textfield name="datePickerBean.startdate" id="datepicker17" placeholder="Select date" readonly="true"/>
           &nbsp; &nbsp; End Date   : <s:textfield name="datePickerBean.enddate" id="datepicker18" placeholder="Select date"readonly="true"/><br/><br/>
            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>




    </fieldset>
    <%  }%>
</center>

<%@ include file="/secure/bottom.jsp" %>

