<%--
  Created by IntelliJ IDEA.
  Document: exportTrackrep35_kyc_result
  User: TOWFIQUL ISLAM
  Date: 10/7/20
  Time: 5:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "B2B Acknowledgement Report";

    SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yy hh:mm a");
    String reportFileName = "B2B_Acknowledgement_Report_" + ft.format(new Date());
    response.setHeader("Content-Disposition", "attachment; filename=" + reportFileName + ".xls");

%>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message"/>
<center>
    <fieldset>
        <% if (request.isUserInRole("RSM") || request.isUserInRole("SM") || request.isUserInRole("TM") || request.isUserInRole("DISTRIBUTOR")) {%>

        <div style="overflow:auto; height:380px; width:999px">
            <table border="1" id="tblData">
                <thead style="background: #F8F8F8;">
                    <th style="padding-left: 20px;padding-right: 20px;">Transaction Date Time</th>
                    <th style="padding-left: 20px;padding-right: 20px;">Acknowledgement Date Time</th>
                    <th style="padding-left: 20px;padding-right: 20px;">Agent Wallet</th>
                    <th style="padding-left: 20px;padding-right: 20px;">DSO Wallet</th>
                    <th style="padding-left: 20px;padding-right: 20px;">Transaction Type</th>
                    <th style="padding-left: 20px;padding-right: 20px;">Transaction Amount</th>
                    <th style="padding-left: 20px;padding-right: 20px;">Transaction ID</th>
                    <th style="padding-left: 20px;padding-right: 20px;">Status</th>
                    <th style="padding-left: 20px;padding-right: 20px;">Rating</th>
                </thead>
                <tbody>
                    <s:iterator value="cm_list" id="cm_list">
                        <tr>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center">
                                <p><s:property value="tr35_transaction_dateTime"/></p>
                            </td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center">
                                <p><s:property value="tr35_acknowledgement_dateTime"/></p>
                            </td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center">
                                <p><s:property value="tr35_agent_wallet"/></p>
                            </td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center">
                                <p><s:property value="tr35_checkin_verification_status"/></p>
                            </td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center">
                                <p><s:property value="tr35_dso_wallet"/></p>
                            </td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center">
                                <p><s:property value="tr35_transaction_type"/></p>
                            </td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center">
                                <p><s:property value="tr35_transaction_amountt"/></p>
                            </td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center">
                                <p><s:property value="tr35_transaction_id"/></p>
                            </td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center">
                                <p><s:property value="tr35_status"/></p>
                            </td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center">
                                <p><s:property value="tr35_rating"/></p>
                            </td>

                        </tr>
                    </s:iterator>
                </tbody>
            </table>
        </div>

        <% }%>

    </fieldset>

    <br/>

</center>