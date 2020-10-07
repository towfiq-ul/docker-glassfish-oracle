<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "All Channel Transaction Report";%>
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


        <legend style="padding: 4px ;"><h5>ALL DISTRIBUTORS </h5></legend><br/>

        <s:form action="/secure/action/distributorDetails"  onsubmit="return checkBlankTextBox('datepicker97')">

            <s:hidden name="commonModelBean.param" value="number1" />

            <%--
            Wallet Number : <s:textfield name="datePickerBean.wallet_no" id="distwallet1" placeholder="Wallet Number" onKeyup="isInteger ('distwallet1')" onChange="mobilenumberformat ('distwallet1')"/>

            --%>

            Month :  <s:textfield name="month" id="datepicker97" placeholder="Select Month" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

        <div class="form-message help">
            This report will show the monthly performance of all the distributors
        </div>
    </fieldset>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>All BSA PER DISTRIBUTOR</h5></legend><br/>
        <s:form action="/secure/action/bsaDetails" onsubmit="return checkBlankTextBox('datepicker98') &&  checkwalletno('distwallet1')">
          <s:hidden name="commonModelBean.param" value="number3" />
            Distributor Wallet : <s:textfield name="wallet_no" id="distwallet1" placeholder="Wallet Number" onKeyup="isInteger ('distwallet1')" onChange="mobilenumberformat ('distwallet1')"/>&nbsp;
            Month :<s:textfield name="month2" id="datepicker98" placeholder="Select Month" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>
        <div class="form-message help">
            This report will show the monthly performance of all the bsa under a particular distributor
        </div>
    </fieldset>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>ALL AGENTS PER BSA & DISTRIBUTOR</h5></legend><br/>
        <s:form action="/secure/action/agentDetails" onsubmit="return checkBlankTextBox('datepicker99') && checkwalletno('distwallet2') && checkwalletno('distwallet3') ">
            <s:hidden name="commonModelBean.param" value="number4" />
            Distributor Wallet : <s:textfield name="wallet_no" id="distwallet2" placeholder="Wallet Number" onKeyup="isInteger ('distwallet2')" onChange="mobilenumberformat ('distwallet2')"/>&nbsp;
            BSA Wallet : <s:textfield name="wallet_no_bsa" id="distwallet3" placeholder="Wallet Number" onKeyup="isInteger ('distwallet3')" onChange="mobilenumberformat ('distwallet3')"/>&nbsp;
            Month : <s:textfield name="month3" id="datepicker99" placeholder="Select Month" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

        <div class="form-message help">
            This report will show the monthly performance of all the agents under a particular bsa of a distributor
        </div>
    </fieldset>

    <%  }%>


    <%    if (request.isUserInRole("DISTRIBUTOR")) {%>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>ALL BSA</h5></legend><br/>
        <s:form action="/secure/action/bsaDetails">


            Month : <s:textfield name="datePickerBean.datepicker" id="datepicker97" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>ALL AGENTS</h5></legend><br/>
        <s:form action="/secure/action/agentDetails">


            Month : <s:textfield name="datePickerBean.datepicker" id="datepicker98" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <%  }%>



    <%    if (request.isUserInRole("BSA")) {%>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>ALL AGENTS</h5></legend>
        <s:form action="/secure/action/agentDetails">



            Month : <s:textfield name="datePickerBean.datepicker" id="datepicker97" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />


        </s:form><br/>

    </fieldset>
    <%  }%>


    <br/>




</center>

<%@ include file="/secure/bottom.jsp" %>