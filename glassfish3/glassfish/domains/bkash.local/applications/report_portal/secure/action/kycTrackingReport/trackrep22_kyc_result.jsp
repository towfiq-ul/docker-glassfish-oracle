<%-- 
    Document   : kycStatusReport
    Created on : May 29, 2013, 5:07:22 PM
    Author     : Hafizur_b0266
--%>

<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "Registration Summary Report : Agent Wise";%>
<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <fieldset >
        <legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>
                MA Wallet: <s:property value="ma_wallet"/>&nbsp;Date Range : <s:property value="from_date"/> - <s:property value="to_date"/>  &nbsp; Total Rows: <s:property value="cm.counter"/>
            </b>
        </legend>



        <%    if (request.isUserInRole("SM") || request.isUserInRole("TM")) {%>


        <!--
                <div style="text-align: left; font-size: 1em; color: #052b4d; font: Arial, sans-serif;">
                    <b> Enter keyword to Search</b><br/>
                    <input type="text" id="search"/>&nbsp; &nbsp;
        
                </div><br/>
        -->

        <div style="overflow:auto; height:380px; width:999px">


            <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8;">

                <th rowspan="2" style="padding-left: 40px;padding-right: 40px; ">SL</th>
                <th rowspan="2" style="padding-left: 40px;padding-right: 40px; ">MA Wallet</th>
                <th rowspan="2" style="padding-left: 40px;padding-right: 40px; ">Distributor Name</th>
                <th rowspan="2" style="padding-left: 40px;padding-right: 40px; ">Agent Account</th>
                <th rowspan="2" style="padding-left: 40px;padding-right: 40px; ">Agent Shop Name</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px; ">DSO Account</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px; ">Registration Count</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px; ">Collected KYC Count</th>
                <th colspan="2">Uncollected KYC Count</th>
                <th colspan="2">Customer Service Status</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px;  ">Distributor Received</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px;  ">Others</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px; ">PIN Change</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px;  ">1st Cash IN</th>
                <tr>
                    <th style="padding-left: 10px;padding-right: 10px;">Registered(KYC at agent point)</th>
                    <th style="padding-left: 10px;padding-right: 10px;">Distributor Rejected</th>
                    <th style="padding-left: 10px;padding-right: 10px;  ">Accept</th>
                    <th  style="padding-left: 10px;padding-right: 10px; ">Reject</th>
                </tr>
                </thead>
                <tbody>

                <s:iterator value="cm_list" id="cm_list" >
                    <tr>
                        <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr22_serial"/></p></td>
                        <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr22_ma_wallet"/></p></td>
                        <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr22_distributor_name"/></p></td>
                        <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr22_agent_wallet"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr22_shop_name"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr22_ra_wallet"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr22_registration_cnt"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr22_col_kyc_cnt"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr22_reg_kyc_cnt"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr22_dist_reject_cnt"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr22_accept_cnt"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr22_reject_cnt"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr22_curr_dist_receive_cnt"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr22_others_cnt"/></p></td>                           
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr22_pin_cnt"/></p></td>                           
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr22_ci_cnt"/></p></td>                           
                    </tr>

                </s:iterator>


                </tbody>


            </table>


        </div>


        <%  }%>

    </fieldset>



    <br/>
    <s:form action="/secure/action/exportkycTrackingRep22Result">



        <%--
        Wallet Number : <s:textfield name="datePickerBean.wallet_no" id="distwallet1" placeholder="Wallet Number" onKeyup="isInteger ('distwallet1')" onChange="mobilenumberformat ('distwallet1')"/>

        --%>




        <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 150px;border: none;margin: 6px;padding: 3;" value="Export To Excel" />

    </s:form><br/>
</center>

<%@ include file="/secure/bottom.jsp" %>
