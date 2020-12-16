<%--
  Created by IntelliJ IDEA.
  Document: trackrep35_kyc_result
  User: TOWFIQUL ISLAM
  Date: 10/7/20
  Time: 5:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "B2B Acknowledgement Report";%>
<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message"/>
<center>
    <fieldset>
        <legend style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>
            Total Rows: <s:property value="cm.counter"/>
        </b></legend>


        <% if (request.isUserInRole("RSM") || request.isUserInRole("SM") || request.isUserInRole("TM")
                || request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("COMPLIANCE")) {%>

        <div style="text-align: left; font-size: 1em; color: #052b4d; font: Arial, sans-serif;">
            <b>Enter keyword to Search</b>
            <br/>
            <input type="text" id="search"/>&nbsp; &nbsp;

        </div>
        <br/>

        <div style="overflow:auto; height:380px; width:999px">

            <table border="1" id="tblData">
                <thead style="background: #F8F8F8;">
                <th style="padding-left: 20px;padding-right: 20px;">Transaction DateTime</th>
                <th style="padding-left: 20px;padding-right: 20px;">Acknowledgement DateTime</th>
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
                        <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property
                                value="tr35_transaction_dateTime"/></p></td>
                        <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property
                                value="tr35_acknowledgement_dateTime"/></p></td>
                        <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property
                                value="tr35_agent_wallet"/></p></td>
                        <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property
                                value="tr35_dso_wallet"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property
                                value="tr35_transaction_type"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property
                                value="tr35_transaction_amount"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property
                                value="tr35_transaction_id"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property
                                value="tr35_status"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property
                                value="tr35_rating"/></p></td>

                    </tr>
                </s:iterator>
                </tbody>
            </table>
        </div>

        <% }%>

    </fieldset>

    <br/>
    <s:form action="/secure/action/exportkycTrackingRep35Result">
        <s:submit
                style="background: #413F3F repeat;color:#E0E0E0;width: 150px;border: none;margin: 6px;padding: 3; cursor:pointer; "
                value="Export To Excel"/>

    </s:form><br/>
</center>

<%@ include file="/secure/bottom.jsp" %>

