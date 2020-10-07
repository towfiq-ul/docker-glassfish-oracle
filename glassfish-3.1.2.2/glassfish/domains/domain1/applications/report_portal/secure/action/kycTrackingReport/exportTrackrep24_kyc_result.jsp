<%-- 
    Document   : exportTrackrep24_kyc_result
    Created on : Nov 9, 2016, 10:56:59 AM
    Author     : dni_shahinur
--%>


<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "Transaction Summary Report : Agent Wise";

String reportFileName = "exportkycTrackingRep24Result";
response.setHeader("Content-Disposition", "attachment; filename=" + reportFileName + ".xls");



%>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <fieldset >
        <legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>
                MA Wallet: <s:property value="ma_wallet"/>&nbsp;Date : <s:property value="from_date"/>  
            </b></legend>


        <%    if (request.isUserInRole("SM") || request.isUserInRole("TM")) {%>

        <div style="overflow:auto; height:380px; width:999px">

                        <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8;">
                <th style="padding-left: 40px;padding-right: 40px;">SL</th>
                <th style="padding-left: 40px;padding-right: 40px;">MA Wallet</th>
                <th style="padding-left: 40px;padding-right: 40px;">Distributor Name</th>
                <th style="padding-left: 40px;padding-right: 40px;">Agent Account</th>
                <th style="padding-left: 40px;padding-right: 40px;">Shop Name</th>
                <th style="padding-left: 40px;padding-right: 40px;">DSO Account</th>
                <th style="padding-left: 40px;padding-right: 40px;">Account Status</th>
                <th style="padding-left: 40px;padding-right: 40px;">Agent Account Balance(6 AM)</th>
                <th style="padding-left: 40px;padding-right: 40px;">Agent Account Balance(4 PM,Previous Date)</th>
                <th style="padding-left: 40px;padding-right: 40px;">CI Amount(Last Day)</th>
                <th style="padding-left: 40px;padding-right: 40px;">MTD CI Amount</th>
                <th style="padding-left: 40px;padding-right: 40px;">MTD CI Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">CO Amount(Last Day)</th>
                <th style="padding-left: 40px;padding-right: 40px;">MTD CO Amount</th>
                <th style="padding-left: 40px;padding-right: 40px;">MTD CO Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Send By Agent(Last Day)</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Send By Agent(MTD)</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Send By Agent Count(MTD)</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Receive By Agent(Last Day)</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Receive By Agent(MTD)</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Receive By Agent Count(MTD)</th>
                </thead>
                <tbody>
                    <s:iterator value="cm_list" id="cm_list" > 
                        <tr>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr24_serial"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr24_ma_wallet"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr24_distributor_name"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr24_agent_wallet"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr24_shop_name"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr24_dso_account"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr24_account_status"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr24_bal_td"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr24_bal_ld"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr24_ci_amt_ld"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr24_ci_amt_mtd"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr24_ci_cnt_mtd"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr24_co_amt_ld"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr24_co_amt_mtd"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr24_co_cnt_mtd"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr24_b2b_send_amt_ld"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr24_b2b_send_amt_mtd"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr24_b2b_send_cnt_mtd"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr24_b2b_recv_amt_ld"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr24_b2b_recv_amt_mtd"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr24_b2b_recv_cnt_mtd"/></p></td>
                        </tr>
                    </s:iterator>
                </tbody>
            </table>
        </div>


        <%  }%>

    </fieldset>



    <br/>

</center>