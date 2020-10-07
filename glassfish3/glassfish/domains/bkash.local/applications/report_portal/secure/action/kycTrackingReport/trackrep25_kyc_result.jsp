<%-- 
    Document   : trackrep23_kyc_result
    Created on : Nov 8, 2016, 11:24:09 AM
    Author     : dni_shahinur
--%>

<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "Lifting Report";%>
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



        <%    if (request.isUserInRole("RSM") || request.isUserInRole("SM") || request.isUserInRole("TM")) {%>


        <!--
                <div style="text-align: left; font-size: 1em; color: #052b4d; font: Arial, sans-serif;">
                    <b> Enter keyword to Search</b><br/>
                    <input type="text" id="search"/>&nbsp; &nbsp;
        
                </div><br/>
        -->

        <div style="overflow:auto; height:380px; width:999px">


            <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8;">
                <th style="padding-left: 40px;padding-right: 40px;">SL</th>
                <th style="padding-left: 40px;padding-right: 40px;">Distributor Code</th>
                <th style="padding-left: 40px;padding-right: 40px;">MA Wallet</th>
                <th style="padding-left: 40px;padding-right: 40px;">Channel</th>
                <th style="padding-left: 40px;padding-right: 40px;">Amount TK</th>
                <th style="padding-left: 40px;padding-right: 40px;">Bank Name</th>
                <th style="padding-left: 40px;padding-right: 40px;">Status</th>
                <th style="padding-left: 40px;padding-right: 40px;">Transaction (Date & Time)</th>
                </thead>
                <tbody>
                    <s:iterator value="cm_list" id="cm_list" > 
                        <tr>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr25_serial"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr25_distributor_code"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr25_ma_wallet"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr25_channel"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr25_amount"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr25_bank_name"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr25_status"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr25_status_changed_on"/></p></td>
                        </tr>
                    </s:iterator>
                </tbody>
            </table>


        </div>


        <%  }%>

    </fieldset>



    <br/>
    <s:form action="/secure/action/exportkycTrackingRep25Result">



        <%--
        Wallet Number : <s:textfield name="datePickerBean.wallet_no" id="distwallet1" placeholder="Wallet Number" onKeyup="isInteger ('distwallet1')" onChange="mobilenumberformat ('distwallet1')"/>

        --%>




        <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 150px;border: none;margin: 6px;padding: 3;" value="Export To Excel" />

    </s:form><br/>
</center>

<%@ include file="/secure/bottom.jsp" %>

