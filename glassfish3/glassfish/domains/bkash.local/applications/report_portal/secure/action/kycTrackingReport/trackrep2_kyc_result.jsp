<%-- 
    Document   : dsr_aging_report_result
    Created on : Jun 16, 2013, 12:19:28 PM
    Author     : hafizur_b0266
--%>

<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<% String pagename = "Distributor Summary Report : Aging Report";%>
<%@ include file="/secure/top.jsp" %>
<link href="<%=request.getContextPath()%>/css/table_header_fix.css" rel="stylesheet" type="text/css" media="screen" />
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>

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
                    &nbsp;Date Range : <s:property value="from_date"/> - <s:property value="to_date"/> &nbsp; Total Rows: <s:property value="cm.counter"/>
            </b></legend>




    <%    if (request.isUserInRole("SND") || request.isUserInRole("DISTRIBUTOR")) {%>





    <div style="overflow:scroll; height:400px;">
        
        <table  border="1"  id="tblData"  >


            <thead>
                <tr>
                    <th style="padding-left: 20px;padding-right: 20px;">Distributor Number</th>
                    <th style="padding-left: 40px;padding-right: 40px;">3 DAYS</th>
                    <th style="padding-left: 40px;padding-right: 40px;">5 DAYS</th>
                    <th style="padding-left: 40px;padding-right: 40px;">7 DAYS</th>
                    <th style="padding-left: 40px;padding-right: 40px;">10 DAYS</th>
                    <th style="padding-left: 40px;padding-right: 40px;">15 DAYS</th>
                    <th style="padding-left: 40px;padding-right: 40px;">1 MONTH</th>
                    <th style="padding-left: 40px;padding-right: 40px;">2 MONTH</th>
                    <th style="padding-left: 40px;padding-right: 40px;">2 MONTH+</th>
                </tr>
            </thead>
        <s:iterator value="cm_list">
            <tr>


                <td style="padding-left: 40px;padding-right: 40px;"><s:property value="ma_wallet"/> </td>         
                <td style="padding-left: 40px;padding-right: 40px;"><s:property value="days_3"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;"><s:property value="days_5"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;"><s:property value="days_7"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;"><s:property value="days_10"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;"><s:property value="days_15"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;"><s:property value="days_30"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;"><s:property value="days_60"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;"><s:property value="days_above_60"/> </td>
            </tr>
        </s:iterator>


    </table>
        
        <br/>
        
        
    </div>        

    <%  }%>




    <br/>
<s:form action="/secure/action/exportkycTrackingRep2Result">
           
            

            <%--
            Wallet Number : <s:textfield name="datePickerBean.wallet_no" id="distwallet1" placeholder="Wallet Number" onKeyup="isInteger ('distwallet1')" onChange="mobilenumberformat ('distwallet1')"/>

            --%>

            

  
            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 150px;border: none;margin: 6px;padding: 3;" value="Export To Excel" />

        </s:form><br/>
</center>

<%@ include file="/secure/bottom.jsp" %>



