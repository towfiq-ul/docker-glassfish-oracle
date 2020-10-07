<%-- 
    Document   : exportTrackrep29_kyc_result
    Created on : Dec 23, 2018, 6:07:53 PM
    Author     : mithun.mondal
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "Agent_Wise_Check_IN_and_B2B_report_MTD";

    SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yy hh:mm a");
    String reportFileName = "Agent_Wise_Check_IN_and_B2B_report_MTD_" + ft.format(new Date());
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
                <th style="padding-left: 40px;padding-right: 40px;">Distributor Name</th>
                <th style="padding-left: 40px;padding-right: 40px;">Agent Wallet</th>
                <th style="padding-left: 40px;padding-right: 40px;">RA Wallet</th>
                <th style="padding-left: 40px;padding-right: 40px;">Shop Name</th>
                <th style="padding-left: 10px;padding-right: 10px;">Shop Address</th>
                <th style="padding-left: 40px;padding-right: 40px;">Check IN Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">On Place Check IN Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">Off Place Check IN Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">Not Collected Check IN Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Send Count</th> 
                <th style="padding-left: 40px;padding-right: 40px;">B2B Receive Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Send Amount</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Receive Amount</th>
                <th style="padding-left: 40px;padding-right: 40px;">On Time B2B</th>
                <th style="padding-left: 40px;padding-right: 40px;">Off Time B2B</th>
                <th style="padding-left: 40px;padding-right: 40px;">WICB</th>
                <th style="padding-left: 40px;padding-right: 40px;">Multiple Service Count(In a day)</th>
                <th style="padding-left: 40px;padding-right: 40px;">Multiple Service (in a date range)</th>
                </thead>
                <tbody>
                    <s:iterator value="cm_list" id="cm_list" > 
                        <tr>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr28_distributor"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr28_ag_wlt"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr28_dso_wlt"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr28_shop_name"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr28_shop_address"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr28_checkin_cnt"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr28_ckin_on_place_cnt"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr28_ckin_off_place_cnt"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr28_ckin_not_col_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr28_b2b_send_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr28_b2b_rcv_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr28_b2b_send_amt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr28_b2b_rcv_amt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr28_on_time_b2b_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr28_off_time_b2b_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr28_wcib_b2b_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr28_mul_ser_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr29_mul_ser_day_cnt"/></p></td>
                        </tr>
                    </s:iterator>
                </tbody>
            </table>

        </div>

        <%  }%>

    </fieldset>

    <br/>

</center>

