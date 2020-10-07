
<%-- 
    Document   : kycStatusReport
    Created on : May 29, 2013, 5:07:22 PM
    Author     : Hafizur_b0266
--%>



<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "Distributor Detailed Report :Customer Account wise";%>
<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <fieldset >
        <legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>
                <s:if test='target=="DISTRIBUTOR" '>
                    Wallet : <s:property value="cm.ma_wallet"/>,
                </s:if>

                <s:if test='target=="SND2" '>
                    Distributor Wallet : <s:property value="cm.amp_MA_WALLET"/>,
                </s:if>
                <s:if test='target=="SND3" '>
                    Distributor Wallet : <s:property value="cm.amp_MA_WALLET"/>,&nbsp; BSA Wallet : <s:property value="cm.amp_RA"/>,
                </s:if>
                &nbsp;Date Range : <s:property value="from_date"/> - <s:property value="to_date"/> &nbsp; TOTAL ROWS:<s:property value="cm.counter"/>
            </b></legend>



        <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND") || request.isUserInRole("COMPLIANCE")) {%>


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
                <th style="padding-left: 40px;padding-right: 40px;">Date</th>
                <th style="padding-left: 40px;padding-right: 40px;">CI Amount</th>
                <th style="padding-left: 40px;padding-right: 40px;">CO Amount</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Send Amount</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Receive Amount</th>
                <th style="padding-left: 10px;padding-right: 10px;">Lifting</th>
                <th style="padding-left: 10px;padding-right: 10px;">Refund</th>
                <th style="padding-left: 10px;padding-right: 10px;">Agent Balance@12AM</th>
                <th style="padding-left: 10px;padding-right: 10px;">Distributor Opening Balance(MA+RA)@6AM</th>
                </thead>
                <tbody>
                    <tr >

                        <s:iterator value="cm_list" id="cm_list" >  
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr16_serial"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr16_trx_date"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr16_ci_amt"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr16_co_amt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr16_b2b_send_amt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr16_b2b_recv_amt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr16_lifting_amt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr16_refund_amt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr16_agent_balance"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr16_ma_balance"/></p></td>
                        </tr>

                    </s:iterator>


                </tbody>


            </table>


        </div>


        <%  }%>

    </fieldset>



    <br/>
    <s:form action="/secure/action/exportkycTrackingRep16Result">



        <%--
        Wallet Number : <s:textfield name="datePickerBean.wallet_no" id="distwallet1" placeholder="Wallet Number" onKeyup="isInteger ('distwallet1')" onChange="mobilenumberformat ('distwallet1')"/>

        --%>




        <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 150px;border: none;margin: 6px;padding: 3;" value="Export To Excel" />

    </s:form><br/>
</center>

<%@ include file="/secure/bottom.jsp" %>
