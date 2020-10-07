<%-- 
    Document   : exportKycCommissionReport
    Created on : Jul 25, 2013, 2:42:03 PM
    Author     : Hafizur_b0266
--%>

<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Detailed KYC Status Report";%>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <fieldset >
        <legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>
                Name : <s:property value="commonModelBean.ct_AGENT_CHANNEL"/>,
                &nbsp;Wallet : <s:property value="wallet_no"/>,
                &nbsp;Month <s:property value="month"/>   
            </b></legend>



        <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {%>


<br/>

    <div style="overflow:auto; height:395px; width:980px">



            <table  border="1"  id="tblData"  >


                <thead style="background: #F8F8F8;">
                    <tr>
                        <th>SERIAL</th>
                        <th style="padding-left: 20px;padding-right: 20px;">MONTHS</th>
                        <th style="padding-left: 20px;padding-right: 20px;">AGENT WALLET</th>
                        <th style="padding-left: 20px;padding-right: 20px;">AGENT TYPE</th>
                        <th style="padding-left: 40px;padding-right: 40px;">AGENT NAME</th>
                        <th style="padding-left: 40px;padding-right: 40px;">DISTRICT</th>
                        <th style="padding-left: 40px;padding-right: 40px;">DIVISION</th>
                        <th style="padding-left: 40px;padding-right: 40px;">MA WALLET</th>
                        <th style="padding-left: 40px;padding-right: 40px;">AGENT CHANNEL</th>
                        <th style="padding-left: 40px;padding-right: 40px;">ELIGIBLE KYC COUNT(REGISTRATION)</th>
                        <th style="padding-left: 40px;padding-right: 40px;">ELIGIBLE KYC COUNT(REGISTRATION+CASH IN)</th>
                        <th style="padding-left: 40px;padding-right: 40px;">TOTAL COMMISSION</th>
                        <th style="padding-left: 40px;padding-right: 40px;">AIT</th>
                        <th style="padding-left: 40px;padding-right: 40px;">NET COMMISSION</th>
                        <th style="padding-left: 40px;padding-right: 40px;">NOT ELIGIBLE(FAKE) KYC COUNT FOR COMM.</th>
                    </tr>
                </thead>
                <s:iterator value="cm_list2">
                    <tr >
                        <td style="text-align: center;"><s:property value="serial_no"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="months"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="AGENT"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="agent_type"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="shopName"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="district"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="division"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="ma_wallet"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="agent_channel"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="eligible_kyc_count"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="reg_cashin_count"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="total_commission"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="ait"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="net_commission"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="not_elg_count"/> </td>
                    </tr>
                </s:iterator>


            </table>
        </div>

        <%  }%>

    </fieldset>



    <br/>
 
</center>

<%@ include file="/secure/bottom.jsp" %>
