<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Registration Summary Report: Agent wise";%>
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


    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("COMPLIANCE")) {%>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>Registration Summary Report: Agent wise</h5></legend><br/>
        <s:form action="/secure/action/kycTrackingRep10Result" onsubmit="return checkdate('datepicker_kyc_tr_startdate','datepicker_kyc_tr_enddate')">
            <s:hidden name="target" value="DISTRIBUTOR" />

            Start Date : <s:textfield name="from_date" id="datepicker_kyc_tr_startdate" placeholder="Select date" readonly="true"/>
            &nbsp;  End Date : <s:textfield name="to_date" id="datepicker_kyc_tr_enddate" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>



    <%  }%>


    <%    if (request.isUserInRole("SND")) {%>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>Registration Summary Report: Agent wise</h5></legend><br/>
        <s:form action="/secure/action/kycTrackingRep10Result" onsubmit="return checkdate('datepicker_kyc_tr_startdate','datepicker_kyc_tr_enddate')">
            <s:hidden name="target" value="SND1" />

            Start Date : <s:textfield name="from_date" id="datepicker_kyc_tr_startdate" placeholder="Select date" readonly="true"/>
            &nbsp;  End Date : <s:textfield name="to_date" id="datepicker_kyc_tr_enddate" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>Registration Summary Report: Agent wise</h5></legend><br/>
        <s:form action="/secure/action/kycTrackingRep10Result" onsubmit="return checkdate('datepicker_kyc_tr_startdate_1','datepicker_kyc_tr_enddate_1') && checkwalletno('distwallet1')">
            <s:hidden name="target" value="SND2" />

            Distributor Wallet : <s:textfield name="wallet_num" id="distwallet1" placeholder="Wallet Number" onKeyup="isInteger ('distwallet1')" onChange="mobilenumberformat ('distwallet1')"/>&nbsp;

            Start Date : <s:textfield name="from_date" id="datepicker_kyc_tr_startdate_1" placeholder="Select date" readonly="true"/>
            &nbsp;  End Date : <s:textfield name="to_date" id="datepicker_kyc_tr_enddate_1" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>Registration Summary Report: Agent wise</h5></legend><br/>
        <s:form action="/secure/action/kycTrackingRep10Result" onsubmit="return checkdate('datepicker_kyc_tr_startdate_2','datepicker_kyc_tr_enddate_2') && checkwalletno('distwallet2') && checkwalletno('distwallet3')">
            <s:hidden name="target" value="SND3" />
            Distributor Wallet : <s:textfield name="wallet_num" id="distwallet2" placeholder="Wallet Number" onKeyup="isInteger ('distwallet2')" onChange="mobilenumberformat ('distwallet2')"/>&nbsp;
            BSA Wallet : <s:textfield name="wallet_num_ra" id="distwallet3" placeholder="Wallet Number" onKeyup="isInteger ('distwallet3')" onChange="mobilenumberformat ('distwallet3')"/><br/><br/>

            Start Date : <s:textfield name="from_date" id="datepicker_kyc_tr_startdate_2" placeholder="Select date" readonly="true"/>
            &nbsp;  End Date : <s:textfield name="to_date" id="datepicker_kyc_tr_enddate_2" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>


    <%  }%>


    <br/>




</center>

<%@ include file="/secure/bottom.jsp" %>
