<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Monthly Lift & Refund Report";%>
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

        <legend style="padding: 4px ;"><h5>User Report</h5></legend><br/>
        <s:form action="/secure/action/monthlyLiftRefundResult" onsubmit="return checkBlankTextBox('datepicker')">

            Month : <s:textfield name="datePickerBean.datepicker" id="datepicker98" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" /><br/><br/>

        </s:form><br/>

    </fieldset>

    <%  }%>

    <%    if (request.isUserInRole("SND")) {%>


    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>Generate Report</h5></legend><br/>
        <s:form action="/secure/action/monthlyLiftRefundResult" onsubmit="return checkBlankTextBox('datepicker1')">

            Distributor Name : <s:select name="datePickerBean.wallet_no" label="Dist list" list="cm_list" listValue="bkdn_CHANNEL+'    ('+ct_MA_WALLET+')' " listKey="ct_MA_WALLET+'%'+bkdn_CHANNEL" />

            &nbsp; &nbsp; Month: <s:textfield name="datePickerBean.datepicker" id="datepicker99" placeholder="Select Month" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" /><br/><br/>

        </s:form><br/>

    </fieldset>

    <%  }%>

    <br/>




</center>

<%@ include file="/secure/bottom.jsp" %>