<%-- 
    Document   : kycStatusReport
    Created on : May 29, 2013, 5:07:22 PM
    Author     : Hafizur_b0266
--%>

<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Detailed KYC Status Report";%>
<%@ include file="/secure/top.jsp" %>
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



        <div style="text-align: left; font-size: 1em; color: #052b4d; font: Arial, sans-serif;">
            <b> Enter keyword to Search</b><br/>
            <input type="text" id="search"/>&nbsp; &nbsp;

        </div><br/>

    <div style="overflow:auto; height:395px; width:980px">



            <table  border="1"  id="tblData"  >


                <thead style="background: #F8F8F8;">
                    <tr>
                        <th rowspan="2">SERIAL</th>
                        <th rowspan="2" style="padding-left: 20px;padding-right: 20px;">AGENT WALLET</th>
                        <th rowspan="2" style="padding-left: 20px;padding-right: 20px;">SHOP NAME</th>
                        <th rowspan="2" style="padding-left: 40px;padding-right: 40px;">DISTRICT</th>
                        <th rowspan="2" style="padding-left: 40px;padding-right: 40px;">DIVISION</th>
                        <th rowspan="2" style="padding-left: 40px;padding-right: 40px;">RA WALLET</th>
                        <th rowspan="2" style="padding-left: 40px;padding-right: 40px;">MA WALLET</th>
                        <th rowspan="2" style="padding-left: 40px;padding-right: 40px;">AGENT CHANNEL</th>
                      
                        <th rowspan="2" style="padding-left: 40px;padding-right: 40px;">TOTAL REGISTRATION</th>
                        <th colspan="4" style="padding-left: 40px;padding-right: 40px;background: #EBFFEB">KYC Status</th>
                        <th colspan="5" style="padding-left: 40px;padding-right: 40px;background: #FFF9D4">KYC Commission Status</th>

                    </tr>
                    <tr>

                        <th style="padding-left: 40px;padding-right: 40px;">ACCEPTED</th>
                        <th style="padding-left: 40px;padding-right: 40px;">REJECTED</th>
                        <th style="padding-left: 40px;padding-right: 40px;">NOT RECEIVED</th>
                        <th style="padding-left: 40px;padding-right: 40px;">PIPELINE</th>
                        <th style="padding-left: 40px;padding-right: 40px;">PAID PREVIOUSLY</th>
                        <th style="padding-left: 40px;padding-right: 40px;">PAID THIS MONTH</th>
                        <th style="padding-left: 40px;padding-right: 40px;">TOTAL_PAID</th>
                        <th style="padding-left: 40px;padding-right: 40px;">NOT ELIGIBLE</th>
                        <th style="padding-left: 40px;padding-right: 40px;">NOT_YET_PAID</th>
                    </tr>
                </thead>
                <s:iterator value="cm_list2">
                    <tr >
                        <td style="text-align: center;"><s:property value="serial_no"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="AGENT"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="shopName"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="district"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="division"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="BSA"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="ma_wallet"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="agent_channel"/> </td>
                        
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="registered"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="accepted"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="rejected"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="not_received"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="pipeline"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="paid_previously"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="curr_month_paid"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="total_paid"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="not_eligible"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="not_yet_paid"/> </td>
                    </tr>
                </s:iterator>


            </table>
        </div>

        <%  }%>

    </fieldset>



    <br/>
    <s:form action="/secure/action/exportKycStatusReport">

            <s:hidden name="commonModelBean.param" value="number2" />
            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 130px;border: none;margin: 6px;padding: 3;" value="Export To Excel" />

        </s:form><br/>
</center>

<%@ include file="/secure/bottom.jsp" %>
