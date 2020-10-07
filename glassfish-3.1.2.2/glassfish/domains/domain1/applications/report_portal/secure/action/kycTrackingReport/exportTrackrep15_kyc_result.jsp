<%-- 
    Document   : exportTrackrep1_kyc_result
    Created on : Jul 31, 2013, 2:08:18 PM
    Author     : Hafizur_b0266
--%>



<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "KYC Tracking Report : Summary Report (Date Wise)";%>
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
                &nbsp;Date Range: <s:property value="from_date"/> - <s:property value="to_date"/> 
            </b></legend>



        <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SalesOps") || request.isUserInRole("COMPLIANCE")) {%>




        <div style="overflow:auto; height:380px; width:999px">


            <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8;">

                <th style="padding-left: 40px;padding-right: 40px;">SL</th>
                <th style="padding-left: 40px;padding-right: 40px;">Customer Account Numner</th>
                <th style="padding-left: 40px;padding-right: 40px;">Agent Account Numner</th>
                <th style="padding-left: 40px;padding-right: 40px;">Shop Name</th>
                <th style="padding-left: 40px;padding-right: 40px;">DSO Account</th>
                <th style="padding-left: 40px;padding-right: 40px;">Distirbutor Account</th>
                <th style="padding-left: 10px;padding-right: 10px;">Registration Date</th>
                <th style="padding-left: 10px;padding-right: 10px;">KYC Status</th>
                <th style="padding-left: 10px;padding-right: 10px;">Last Status Change Date</th>
                <th style="padding-left: 10px;padding-right: 10px;">Pin Change(Date)</th>
                <th style="padding-left: 10px;padding-right: 10px;">1st Cash In(Date)</th>
                <th style="padding-left: 10px;padding-right: 10px;">Reason for Rejection(If Rejected)</th>
                </thead>
                <tbody>
                    <tr >

                        <s:iterator value="cm_list" id="cm_list" >  
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr14_serial"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr14_customer_account"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr14_agent_account"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr14_shop_name"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr14_dso_account"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr14_ma_account"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr14_registration_date"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr14_kyc_status"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr14_last_status_change_date"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr14_pin_change_date"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr14_1st_cash_in"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr14_reject_reason"/></p></td>


                        </tr>

                    </s:iterator>


                </tbody>


            </table>


        </div>


        <%  }%>

    </fieldset>



    <br/>

</center>