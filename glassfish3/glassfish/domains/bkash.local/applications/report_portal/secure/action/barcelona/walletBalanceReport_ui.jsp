<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Wallet Balance Report";%>
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

        <legend style="padding: 4px ;"><h5>User Report</h5></legend><br/>
        <s:form action="/secure/action/walletBalanceReport_result" onsubmit="return checkdate('datepicker_kyc_tr_startdate','datepicker_kyc_tr_enddate')">
            <s:hidden name="cmbean.param" value="DISTRIBUTOR1" />

            Start Date : <s:textfield name="datePickerBean.datepicker" id="datepicker_kyc_tr_startdate" placeholder="Select date" readonly="true"/>
            &nbsp;  End Date : <s:textfield name="datePickerBean.datepicker_to" id="datepicker_kyc_tr_enddate" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>BSA Report</h5></legend><br/>
        <s:form action="/secure/action/walletBalanceReport_result" onsubmit="return checkdate('datepicker_kyc_tr_startdate_1','datepicker_kyc_tr_enddate_1') ">
            <s:hidden name="cmbean.param" value="DISTRIBUTOR2" />

            Start Date : <s:textfield name="datePickerBean.datepicker" id="datepicker_kyc_tr_startdate_1" placeholder="Select date" readonly="true"/>
            &nbsp;  End Date : <s:textfield name="datePickerBean.datepicker_to" id="datepicker_kyc_tr_enddate_1" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>Agent Report</h5></legend><br/>
        <s:form action="/secure/action/walletBalanceReport_result" onsubmit="return checkdate('datepicker_kyc_tr_startdate_2','datepicker_kyc_tr_enddate_2') ">
            <s:hidden name="cmbean.param" value="DISTRIBUTOR3" />

            Start Date : <s:textfield name="datePickerBean.datepicker" id="datepicker_kyc_tr_startdate_2" placeholder="Select date" readonly="true"/>
            &nbsp;  End Date : <s:textfield name="datePickerBean.datepicker_to" id="datepicker_kyc_tr_enddate_2" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <%  }%>


    <%    if (request.isUserInRole("SND")) {%>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>Distributor Report</h5></legend><br/>
        <s:form action="/secure/action/walletBalanceReport_result" onsubmit="return checkdate('datepicker_kyc_tr_startdate','datepicker_kyc_tr_enddate') && checkwalletno('distwallet1')">
            <s:hidden name="cmbean.param" value="SND1" />
            Distributor Wallet : <s:textfield name="datePickerBean.wallet_no" id="distwallet1" placeholder="Wallet Number" onKeyup="isInteger ('distwallet1')" onChange="mobilenumberformat ('distwallet1')"/>&nbsp;

            Start Date : <s:textfield name="datePickerBean.datepicker" id="datepicker_kyc_tr_startdate" placeholder="Select date" readonly="true"/>
            &nbsp;  End Date : <s:textfield name="datePickerBean.datepicker_to" id="datepicker_kyc_tr_enddate" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>BSA Report</h5></legend><br/>
        <s:form action="/secure/action/walletBalanceReport_result" onsubmit="return checkdate('datepicker_kyc_tr_startdate_1','datepicker_kyc_tr_enddate_1') && checkwalletno('distwallet2') ">
            <s:hidden name="cmbean.param" value="SND2" />

            Distributor Wallet : <s:textfield name="datePickerBean.wallet_no" id="distwallet2" placeholder="Wallet Number" onKeyup="isInteger ('distwallet2')" onChange="mobilenumberformat ('distwallet2')"/>&nbsp;


            Start Date : <s:textfield name="datePickerBean.datepicker" id="datepicker_kyc_tr_startdate_1" placeholder="Select date" readonly="true"/>
            &nbsp;  End Date : <s:textfield name="datePickerBean.datepicker_to" id="datepicker_kyc_tr_enddate_1" placeholder="Select date" readonly="true"/>


            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

        </s:form><br/>

    </fieldset>

    <fieldset class="gradient">

        <legend style="padding: 4px ;"><h5>Agent Report</h5></legend><br/>
                <s:form action="/secure/action/walletBalanceReport_result" onsubmit="return checkdate('datepicker_kyc_tr_startdate_2','datepicker_kyc_tr_enddate_2') && checkwalletno('distwallet4') ">
                    <s:hidden name="cmbean.param" value="SND3" />
                    Distributor Wallet : <s:textfield name="datePickerBean.wallet_no" id="distwallet4" placeholder="Wallet Number" onKeyup="isInteger ('distwallet4')" onChange="mobilenumberformat ('distwallet4')"/>&nbsp;

                    Start Date : <s:textfield name="datePickerBean.datepicker" id="datepicker_kyc_tr_startdate_2" placeholder="Select date" readonly="true"/>
                    &nbsp;  End Date : <s:textfield name="datePickerBean.datepicker_to" id="datepicker_kyc_tr_enddate_2" placeholder="Select date" readonly="true"/>


                    <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3;" value="Go" />

                </s:form><br/>

                </fieldset>


                <%  }%>


                <br/>




                </center>

                <%@ include file="/secure/bottom.jsp" %>