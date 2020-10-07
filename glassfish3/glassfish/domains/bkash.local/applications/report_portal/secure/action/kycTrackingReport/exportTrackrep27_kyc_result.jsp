<%-- 
    Document   : exportTrackrep27_kyc_result
    Created on : Dec 11, 2018, 5:04:58 PM
    Author     : mithun.mondal
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "Check IN and B2B raw data";

    SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yy hh:mm a");
    String reportFileName = "Check_IN_and_B2B_raw_data_" + ft.format(new Date());
    response.setHeader("Content-Disposition", "attachment; filename=" + reportFileName + ".xls");

%>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <fieldset >
        <legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>
                Date Range: <s:property value="from_date"/> - <s:property value="to_date"/> 
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

</center>