<%-- 
    Document   : kycStatusReport
    Created on : May 29, 2013, 5:07:22 PM
    Author     : Hafizur_b0266
--%>

<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "KYC Status Report (Summary)";%>
<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {%>

    <fieldset class="gradient">

        <legend></legend>
        <b >Name : <s:property value="commonModelBean.ct_AGENT_CHANNEL"/> &nbsp; &nbsp;Wallet : <s:property value="wallet_no"/> &nbsp; &nbsp; Months : <s:property value="month"/>  </b><br/>


    </fieldset><br/>

    <%  }%>


    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {%>

   <fieldset class="gradient">

        <legend></legend>
        <b >TOTAL REGISTRATION : <s:property value="commonModelBean.registered"/> </b><br/>


    </fieldset><br/>


        <fieldset >
            <legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>KYC Status</b></legend>
            <br/><br/>
            <table  border="1"  id="tblData1"  >


                <thead style="background: #F8F8F8;">
                    <tr>

                        <th colspan="4" style="padding-left: 20px;padding-right: 20px;background: #EBFFEB">KYC Status</th>


                    </tr>
                    <tr>

                        <th style="padding-left: 20px;padding-right: 20px;">ACCEPTED</th>
                        <th style="padding-left: 20px;padding-right: 20px;">REJECTED</th>
                        <th style="padding-left: 40px;padding-right: 40px;">NOT RECEIVED</th>
                        <th style="padding-left: 40px;padding-right: 40px;">PIPELINE</th>


                    </tr>
                </thead>
                <s:iterator value="cm_list2">
                    <tr>

                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="accepted"/> </td>         
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="rejected"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="not_received"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="pipeline"/> </td>


                    </tr>
                </s:iterator>


            </table><br/><br/>
        </fieldset><br/>
        <fieldset>
            <legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>KYC Commission Status</b></legend>
            <br/><br/>
            <table  border="1"  id="tblData2"  >


                <thead style="background: #F8F8F8;">
                    <tr>


                        <th colspan="5" style="padding-left: 20px;padding-right: 20px;background: #FFF9D4">KYC Commission Status</th>


                    </tr>
                    <tr>


                        <th style="padding-left: 40px;padding-right: 40px;">PAID PREVIOUSLY</th>
                        <th style="padding-left: 40px;padding-right: 40px;">PAID CURRENT MONTH</th>
                        <th style="padding-left: 40px;padding-right: 40px;">TOTAL PAID</th>
                        <th style="padding-left: 40px;padding-right: 40px;">NOT ELIGIBLE</th>
                        <th style="padding-left: 40px;padding-right: 40px;">NOT YET PAID</th>

                    </tr>
                </thead>
                <s:iterator value="cm_list2">
                    <tr>


                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="paid_previously"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="curr_month_paid"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="total_paid"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="not_eligible"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="not_yet_paid"/> </td>

                    </tr>
                </s:iterator>


            </table>
            <br/><br/>
        </fieldset><br/>

    <%  }%>


    <s:form action="/secure/action/exportKycStatusSummaryReport">

            <s:hidden name="commonModelBean.param" value="number2" />
            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 130px;border: none;margin: 6px;padding: 3;" value="Export To Excel" />

        </s:form><br/>
</center>


<%@ include file="/secure/bottom.jsp" %>
