<%-- 
    Document   : trackrep27_kyc_result
    Created on : Dec 5, 2018, 2:24:15 PM
    Author     : mithun.mondal
--%>

<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "Check IN and B2B raw data";%>
<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <fieldset >
        <legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>
                <!--MA Wallet: <s:property value="ma_wallet"/>&nbsp;-->
                Date Range : <s:property value="from_date"/> - <s:property value="to_date"/>  &nbsp; Total Rows: <s:property value="cm.counter"/>
            </b></legend>


        <%    if (request.isUserInRole("RSM") || request.isUserInRole("SM") || request.isUserInRole("TM") || request.isUserInRole("DISTRIBUTOR")) {%>

        <div style="overflow:auto; height:380px; width:999px">

            <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8;">
                <th style="padding-left: 20px;padding-right: 20px;">Record</th>
                <th style="padding-left: 40px;padding-right: 40px;">Date</th>
                <th style="padding-left: 40px;padding-right: 40px;">MA Wallet</th>
                <th style="padding-left: 40px;padding-right: 40px;">Distributor</th>
                <th style="padding-left: 40px;padding-right: 40px;">RA Wallet</th>
                <th style="padding-left: 40px;padding-right: 40px;">Agent Wallet</th>
                <th style="padding-left: 40px;padding-right: 40px;">Check IN ID</th>
                <th style="padding-left: 40px;padding-right: 40px;">Check IN Time</th>
                <th style="padding-left: 40px;padding-right: 40px;">Check IN Verification Status</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B TRX ID</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Time</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Send Amount</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Received Amount</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Type</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Verification Status</th> 
                </thead>
                <tbody>
                    <s:iterator value="cm_list" id="cm_list" > 
                        <tr>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr27_serial"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr27_part_date"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr27_ma_wlt"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr27_distributor"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr27_dso_wlt"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr27_ag_wlt"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr27_checking_id"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr27_checking_time"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr27_checkin_verification_status"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr27_bsns_trx_id"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr27_b2b_time"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr27_b2b_send_amount"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr27_b2b_received_amount"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr27_b2b_type"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr27_b2b_veri_status"/></p></td>

                        </tr>
                    </s:iterator>
                </tbody>
            </table>
        </div>

        <%  }%>

    </fieldset>

    <br/>
    <s:form action="/secure/action/exportkycTrackingRep27Result">

        <%--
        Wallet Number : <s:textfield name="datePickerBean.wallet_no" id="distwallet1" placeholder="Wallet Number" onKeyup="isInteger ('distwallet1')" onChange="mobilenumberformat ('distwallet1')"/>

        --%>

        <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 150px;border: none;margin: 6px;padding: 3; cursor:pointer; " value="Export To Excel" />

    </s:form><br/>
</center>

<%@ include file="/secure/bottom.jsp" %>

