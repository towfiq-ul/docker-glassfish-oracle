<%-- 
    Document   : exportTrackrep2_kyc_result
    Created on : Aug 7, 2013, 3:15:22 PM
    Author     : Hafizur_b0266
--%>

<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<% String pagename = "Distributor Summary Report : Aging Report";%>

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




    <%    if (request.isUserInRole("SND")|| request.isUserInRole("DISTRIBUTOR")) {%>





    <div style="overflow:scroll; height:400px;">
        
        <table  border="1"  id="tblData"  >


            <thead>
                <tr>
                    <th style="padding-left: 20px;padding-right: 20px;">DISTRIBUTOR NUMBER</th>
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

</center>

