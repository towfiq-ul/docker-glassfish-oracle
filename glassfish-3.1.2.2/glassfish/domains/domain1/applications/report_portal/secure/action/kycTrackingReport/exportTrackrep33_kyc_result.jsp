<%-- 
    Document   : exportTrackrep32_kyc_result
    Created on : Jan 22, 2019, 11:52:21 AM
    Author     : mithun.mondal
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "Distributor_Performance_Summary";

    SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yy hh:mm a");
    String reportFileName = "Distributor_Performance_Summary_" + ft.format(new Date());
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
                <th style="padding-left: 40px;padding-right: 40px;">Distributor</th>
                <th style="padding-left: 40px;padding-right: 40px;">MA Wallet</th>
                <th style="padding-left: 40px;padding-right: 40px;">Active Agent Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">Total Check IN Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">On Place Check IN</th>
                <th style="padding-left: 10px;padding-right: 10px;">Off Place Check IN</th>
                <th style="padding-left: 10px;padding-right: 10px;">Not Collected Check IN</th>
                <th style="padding-left: 40px;padding-right: 40px;">Total B2B Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">Total ON Time B2B</th>
                <th style="padding-left: 40px;padding-right: 40px;">Total OFF Time B2B</th>
                <th style="padding-left: 40px;padding-right: 40px;">Total WCIB B2B</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Receive Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Send Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Receive Amount</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Send Amount</th>
                <th style="padding-left: 40px;padding-right: 40px;">Multiple Service provided (Agent Count)</th>
                <th style="padding-left: 40px;padding-right: 40px;">Performance (%) (on Place Check IN)</th>
                <th style="padding-left: 40px;padding-right: 40px;">Performance (%) (Any B2B)</th>
                <th style="padding-left: 40px;padding-right: 40px;">Performance (%) (On Place Check In and On Time B2B)</th>
                </thead>
                <tbody>
                    <s:iterator value="cm_list" id="cm_list" > 
                        <tr>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr33_distributor"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr33_ma_wallet"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr33_active_agent_cnt"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr33_total_checkin_cnt"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr33_on_place_ckin_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr33_off_place_ckin_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr33_not_col_ckin_count"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr33_total_b2b_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr33_on_time_b2b_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr33_off_time_b2b_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr33_wcib_b2b_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr33_b2b_rcv_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr33_b2b_send_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr33_b2b_rcv_amt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr33_b2b_send_amt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr33_mul_ser_agent_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr33_perf_on_place_ckin"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr33_perf_any_b2b"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr33_perf_on_place_ckin_on_time_b2b"/></p></td>
                        </tr>
                    </s:iterator>
                </tbody>
            </table>

        </div>

        <%  }%>

    </fieldset>

    <br/>

</center>
