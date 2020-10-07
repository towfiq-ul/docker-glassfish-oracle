<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Specific Channel Transaction Report";%>
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

    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("AGENT") || request.isUserInRole("BSA")) {%>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>User Report</h5></legend><br/>
        <s:form action="/secure/action/datePicker">

            Month : <s:textfield name="datePickerBean.datepicker" id="datepicker98" placeholder="Select month" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <%  }%>

    <%    if (request.isUserInRole("SND")) {%>


    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>Specific Distributor Report</h5></legend><br/>
        <s:form action="/secure/action/distributorReport">

            Distributor Name : <s:select name="datePickerBean.wallet_no" label="Dist list" list="cm_list" listValue="bkdn_CHANNEL+'    ('+ct_MA_WALLET+')' " listKey="ct_MA_WALLET+'%'+bkdn_CHANNEL" />


            <%--
            Wallet Number : <s:textfield name="datePickerBean.wallet_no" id="distwallet1" placeholder="Wallet Number" onKeyup="isInteger ('distwallet1')" onChange="mobilenumberformat ('distwallet1')"/>

            --%>
            &nbsp; &nbsp; Month : <s:textfield name="datePickerBean.datepicker" id="datepicker98" placeholder="Select Month" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>Specific BSA Report</h5></legend><br/>
        <s:form action="/secure/action/bsaReport" onsubmit="return checkwalletno('distwallet2')">

            BSA Wallet : <s:textfield name="datePickerBean.wallet_no" id="distwallet2" placeholder="Wallet Number" onKeyup="isInteger ('distwallet2')" onChange="mobilenumberformat ('distwallet2')"/>

            &nbsp; &nbsp; Month : <s:textfield name="datePickerBean.datepicker" id="datepicker99" placeholder="Select Month" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>Specific Agent Report</h5></legend><br/>
        <s:form action="/secure/action/agentReport" onsubmit="return checkwalletno('distwallet3')">

            Agent Wallet : <s:textfield  name="datePickerBean.wallet_no" id="distwallet3" placeholder="Wallet Number" onKeyup="isInteger ('distwallet3')" onChange="mobilenumberformat ('distwallet3')"/>

            &nbsp; &nbsp; Month : <s:textfield name="datePickerBean.datepicker" id="datepicker97" placeholder="Select Month" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <%  }%>


    <%    if (request.isUserInRole("DISTRIBUTOR")) {%>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>BSA Report</h5></legend><br/>
        <s:form action="/secure/action/bsaReport" onsubmit="return checkwalletno('bsawallet1')">

            Wallet Number : <s:textfield name="datePickerBean.wallet_no" id="bsawallet1" placeholder="Wallet Number" onKeyup="isInteger ('bsawallet1')" onChange="mobilenumberformat ('bsawallet1')"/>

            &nbsp; &nbsp; Month : <s:textfield name="datePickerBean.datepicker" id="datepicker99" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>Agent Report</h5></legend><br/>
        <s:form action="/secure/action/agentReport" onsubmit="return checkwalletno('agentwallet1')">

            Wallet Number : <s:textfield  name="datePickerBean.wallet_no" id="agentwallet1" placeholder="Wallet Number" onKeyup="isInteger ('agentwallet1')" onChange="mobilenumberformat ('agentwallet1')"/>

            &nbsp; &nbsp; Month : <s:textfield name="datePickerBean.datepicker" id="datepicker97" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <%  }%>



    <%    if (request.isUserInRole("BSA")) {%>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>Agent Report</h5></legend>
        <s:form action="/secure/action/agentReport" onsubmit="return checkwalletno('agentwallet2')">


            Wallet Number : <s:textfield name="datePickerBean.wallet_no" id="agentwallet2"  onKeyup="isInteger ('agentwallet2')" onChange="mobilenumberformat ('agentwallet2')" placeholder="Wallet Number"/>

            &nbsp; &nbsp; Month : <s:textfield name="datePickerBean.datepicker" id="datepicker97" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />


        </s:form><br/>

    </fieldset>
    <%  }%>


    <br/>




</center>

<%@ include file="/secure/bottom.jsp" %>