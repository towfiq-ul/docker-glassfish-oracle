
<%-- 
    Document   : kycStatusReport
    Created on : May 29, 2013, 5:07:22 PM
    Author     : Hafizur_b0266
--%>



<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "Distributor Wise Report";%>
<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <fieldset >
        <legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>
                <s:if test='target=="DISTRIBUTOR" '>
                    <!--Wallet : <s:property value="cm.ma_wallet"/>,-->
                </s:if>

                <s:if test='target=="SND2" '>
                    Distributor Wallet : <s:property value="cm.amp_MA_WALLET"/>,
                </s:if>
                <s:if test='target=="SND3" '>
                    Distributor Wallet : <s:property value="cm.amp_MA_WALLET"/>,&nbsp; BSA Wallet : <s:property value="cm.amp_RA"/>,
                </s:if>
                &nbsp;Date Range : <s:property value="from_date"/> - <s:property value="to_date"/> &nbsp; TOTAL ROWS:<s:property value="cm.counter"/>
            </b></legend>



        <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND") || request.isUserInRole("SalesOps")) {%>


        <!--
                <div style="text-align: left; font-size: 1em; color: #052b4d; font: Arial, sans-serif;">
                    <b> Enter keyword to Search</b><br/>
                    <input type="text" id="search"/>&nbsp; &nbsp;
        
                </div><br/>
        -->

        <div style="overflow:auto; height:380px; width:999px">


            <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8;">

                <th rowspan="2" style="padding-left: 40px;padding-right: 40px;">SL</th>
                <th rowspan="2" style="padding-left: 40px;padding-right: 40px;">Distributor Wallet</th>
                <th rowspan="2" style="padding-left: 40px;padding-right: 40px;">Channel Name</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px;">Registration Count</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px;">Collected(Distributor Received)</th>

                <th colspan="2">Uncollected</th>
                <th colspan="2">Customer Service Status</th>

                <th rowspan="2" style="padding-left: 10px;padding-right: 10px;">Distributor Received</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px;">PIN Change</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px;">1st Cash In</th>
                <tr >
                    <th style="padding-left: 10px;padding-right: 10px;">Registered</th>
                    <th style="padding-left: 10px;padding-right: 10px;">Distributor Rejected</th>
                    <th style="padding-left: 10px;padding-right: 10px;">Accept</th>
                    <th style="padding-left: 10px;padding-right: 10px;">Reject</th>
                </tr>
                </thead>
                <tbody>
                    <tr >

                        <s:iterator value="cm_list" id="cm_list" >  
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr12_serial"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr12_ma_wallet"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr12_channel_name"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr12_registration_count"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr12_collected_dr"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr12_registered_count"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr12_dist_reject_count"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr12_cs_accept_count"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr12_cs_rejected_count"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr12_dist_receive_count"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr12_pin_change_count"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr12_cash_in_count"/></p></td>


                        </tr>

                    </s:iterator>


                </tbody>


            </table>


        </div>


        <%  }%>

    </fieldset>



    <br/>
    <s:form action="/secure/action/exportkycTrackingRep12Result">



        <%--
        Wallet Number : <s:textfield name="datePickerBean.wallet_no" id="distwallet1" placeholder="Wallet Number" onKeyup="isInteger ('distwallet1')" onChange="mobilenumberformat ('distwallet1')"/>

        --%>




        <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 150px;border: none;margin: 6px;padding: 3;" value="Export To Excel" />

    </s:form><br/>
</center>

<%@ include file="/secure/bottom.jsp" %>
