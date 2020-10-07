<%-- 
    Document   : trackrep28_kyc_result
    Created on : Dec 23, 2018, 1:10:40 PM
    Author     : mithun.mondal
--%>

<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "Agent Wise- Check IN and B2B report";%>
<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <fieldset >
        <legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>
                <!--MA Wallet: <s:property value="ma_wallet"/>&nbsp;-->
                Date Range : <s:property value="from_date"/> - <s:property value="to_date"/>  &nbsp; Total Rows: <s:property value="cm.counter"/>
            </b></legend>


        <%    if (request.isUserInRole("RSM") || request.isUserInRole("SM") || request.isUserInRole("TM") || request.isUserInRole("DISTRIBUTOR")) {%>

        <div style="overflow:auto; height:380px; width:999px">

            <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8;">
                <th style="padding-left: 40px;padding-right: 20px;">Distributor Name</th>
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
                <th style="padding-left: 40px;padding-right: 40px;">On Time B2B Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">Off Time B2B Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">Without Check IN B2B Count (WCIB)</th>
                <th style="padding-left: 40px;padding-right: 40px;">Multiple Service Count(In a day)</th>
                <th style="padding-left: 40px;padding-right: 40px;">Remarks (First B2B Transaction)</th>
                </thead>
                <tbody>
                    <s:iterator value="cm_list" id="cm_list" status="cmStatus"> 
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
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr28_fst_b2b_remarks"/></p></td>
                        </tr>                     
                    </s:iterator>
                </tbody>
            </table>
        </div>

        <%  }%>

    </fieldset>

    <br/>
    <s:form action="/secure/action/exportkycTrackingRep28Result">
        <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 150px;border: none;margin: 6px;padding: 3; cursor:pointer; " value="Export To Excel" />
    </s:form><br/>
</center>

<%@ include file="/secure/bottom.jsp" %>

