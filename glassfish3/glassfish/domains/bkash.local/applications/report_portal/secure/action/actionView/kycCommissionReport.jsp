<%-- 
    Document   : kycCommissionReport
    Created on : Jul 25, 2013, 9:52:18 AM
    Author     : Hafizur_b0266
--%>

<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Detailed KYC COMMISSION Report";%>
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
                        <th>SERIAL</th>
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
    <s:form action="/secure/action/exportKycCommissionReport">

            <s:hidden name="commonModelBean.param" value="number2" />
            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 130px;border: none;margin: 6px;padding: 3;" value="Export To Excel" />

        </s:form><br/>
</center>

<%@ include file="/secure/bottom.jsp" %>
