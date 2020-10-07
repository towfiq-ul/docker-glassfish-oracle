<%-- 
    Document   : detailsDailyInformation
    Created on : Jul 16, 2013, 9:44:04 AM
    Author     : Hafizur_b0266
--%>

<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Detailed Daily Transaction Report";%>
<%@ include file="/secure/top.jsp" %>
<!--<link href="<%=request.getContextPath()%>/css/monthlyTransaction.css" rel="stylesheet" type="text/css" media="screen" />-->

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

        <legend style="padding: 4px ;"><h5>Agent Daily Details</h5></legend><br/>
        <s:form action="/secure/action/detailsDailyInformationResult" onsubmit="return checkBlankTextBox('datepicker20') && checkBlankTextBox('datepicker21') && checkwalletno('distwallet2') && checkwalletno('distwallet3') && checkdate('datepicker20','datepicker21')">
           <s:hidden name="commonModelBean.param" value="number1" />
            Distributor Wallet : <s:textfield name="wallet_no" id="distwallet2" placeholder="Wallet Number" onKeyup="isInteger ('distwallet2')" onChange="mobilenumberformat ('distwallet2')"/>&nbsp;
            BSA Wallet : <s:textfield name="wallet_no_bsa" id="distwallet3" placeholder="Wallet Number" onKeyup="isInteger ('distwallet3')" onChange="mobilenumberformat ('distwallet3')"/>&nbsp;<br/><br/>
            Start Date : <s:textfield name="from_date" id="datepicker20" placeholder="Select date" readonly="true"/>&nbsp; &nbsp; 
            End Date : <s:textfield name="to_date" id="datepicker21" placeholder="Select date" readonly="true"/>

            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

        <div class="form-message help">
            This report will show last 90 days Transaction Report of all Agents under a specified BSA of a Distributor.
        </div>
        <div class="form-message help">
            <b>* Only any 30 days report could be viewed or exported at a time.</b>
        </div>
    </fieldset>

    <%  }%>

    <%    if (request.isUserInRole("DISTRIBUTOR")) {%>
    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>Agent Daily Details</h5></legend><br/>
        <s:form action="/secure/action/detailsDailyInformationResult" onsubmit="return checkBlankTextBox('datepicker19')  && checkwalletno('distwallet5') ">


            BSA Wallet : <s:textfield name="datePickerBean.wallet_no_bsa" id="distwallet5" placeholder="Wallet Number" onKeyup="isInteger ('distwallet5')" onChange="mobilenumberformat ('distwallet5')"/>&nbsp;
            Date : <s:textfield name="datePickerBean.datepicker" id="datepicker19" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <%  }%>

    <%    if (request.isUserInRole("BSA")) {%>
    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>Agent Daily Details</h5></legend><br/>
        <s:form action="/secure/action/detailsDailyInformationResult" onsubmit="return checkBlankTextBox('datepicker19')  ">



            Date : <s:textfield name="datePickerBean.datepicker" id="datepicker19" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <%  }%>


    <%@ include file="/secure/bottom.jsp" %>