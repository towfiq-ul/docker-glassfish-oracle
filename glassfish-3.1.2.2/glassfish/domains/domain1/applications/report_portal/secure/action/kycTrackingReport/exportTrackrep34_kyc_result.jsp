<%--
  Created by IntelliJ IDEA.
  Document: exportTrackrep34_kyc_result
  User: TOWFIQUL ISLAM
  Date: 10/7/20
  Time: 5:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "B2B Request Report";

    SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yy hh:mm a");
    String reportFileName = "B2B_Request_Report_" + ft.format(new Date());
    response.setHeader("Content-Disposition", "attachment; filename=" + reportFileName + ".xls");

%>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message"/>
<center>
    <fieldset>
        <% if (request.isUserInRole("RSM") || request.isUserInRole("SM") || request.isUserInRole("TM")
                || request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("COMPLIANCE")) {%>

        <div style="overflow:auto; height:380px; width:999px">
            <table border="1" id="tblData">
                <thead style="background: #F8F8F8;">
                    <th style="padding-left: 20px;padding-right: 20px;">Request Time</th>
                    <th style="padding-left: 20px;padding-right: 20px;">Agent Number</th>
                    <th style="padding-left: 20px;padding-right: 20px;">Request Amount</th>
                    <th style="padding-left: 20px;padding-right: 20px;">Request Type</th>
                    <th style="padding-left: 20px;padding-right: 20px;">DSO Wallet</th>
                </thead>
                <tbody>
                    <s:iterator value="cm_list" id="cm_list">
                        <tr>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center">
                                <p><s:property value="tr34_request_time"/></p>
                            </td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center">
                                <p><s:property value="tr34_agent_number"/></p>
                            </td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center">
                                <p><s:property value="tr34_request_amount"/></p>
                            </td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center">
                                <p><s:property value="tr34_request_type"/></p>
                            </td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center">
                                <p><s:property value="tr34_dso_wlt"/></p>
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