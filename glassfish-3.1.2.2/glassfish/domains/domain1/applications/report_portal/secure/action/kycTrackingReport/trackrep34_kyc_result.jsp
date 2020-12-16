<%--
  Created by IntelliJ IDEA.
  Document: trackrep34_kyc_result
  User: TOWFIQUL ISLAM
  Date: 10/7/20
  Time: 5:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "B2B Request Report";%>
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


        <% if (request.isUserInRole("RSM") || request.isUserInRole("SM") || request.isUserInRole("TM") || request.isUserInRole("DISTRIBUTOR")) {%>

        <div style="text-align: left; font-size: 1em; color: #052b4d; font: Arial, sans-serif;">
            <b>Enter keyword to Search</b>
            <br/>
            <input type="text" id="search"/>&nbsp; &nbsp;

        </div>
        <br/>

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
                        <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property
                                value="tr34_request_time"/></p></td>
                        <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property
                                value="tr34_agent_number"/></p></td>
                        <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property
                                value="tr34_request_amount"/></p></td>
                        <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property
                                value="tr34_request_type"/></p></td>
                        <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property
                                value="tr34_dso_wlt"/></p></td>
                    </tr>
                </s:iterator>
                </tbody>
            </table>
        </div>

        <% }%>

    </fieldset>

    <br/>
    <s:form action="/secure/action/exportkycTrackingRep34Result">

        <%--
        Wallet Number : <s:textfield name="datePickerBean.wallet_no" id="distwallet1" placeholder="Wallet Number" onKeyup="isInteger ('distwallet1')" onChange="mobilenumberformat ('distwallet1')"/>

        --%>

        <s:submit
                style="background: #413F3F repeat;color:#E0E0E0;width: 150px;border: none;margin: 6px;padding: 3; cursor:pointer; "
                value="Export To Excel"/>

    </s:form><br/>
</center>

<%@ include file="/secure/bottom.jsp" %>

