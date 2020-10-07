<%-- 
    Document   : exportTrackrep5_kyc_result
    Created on : Aug 5, 2013, 3:25:24 PM
    Author     : Hafizur_b0266
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%
    SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy");
    Date date = new Date();
    String sDate = sdf.format(date);
    String reportFileName = "Registration_Balance_Report" + "_" + sDate;
    response.setHeader("Content-Disposition", "attachment; filename=" + reportFileName + ".xls");
%> 
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Registration and Balance Report: Agent Wise";%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>


            <s:if test='target=="SND2" '>
                Distributor Wallet : <s:property value="cm.amp_MA_WALLET"/>,
            </s:if>
            <s:if test='target=="SND3" '>
                Distributor Wallet : <s:property value="cm.amp_MA_WALLET"/>,&nbsp; BSA Wallet : <s:property value="cm.amp_RA"/>,
            </s:if>
            &nbsp;Date  : <s:property value="from_date"/>
            <p>Balance has been taken around 6 o'clock</p>
        </b></legend>



    <%    if (request.isUserInRole("SND") || request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("COMPLIANCE")) {%>




    <div style="overflow:scroll; height:422px;">




        <table  border="1"  id="tblData"  >


            <thead style="background: #F8F8F8;">
                <tr>
                    <th style="padding-left: 40px;padding-right: 40px;">AGENT WALLET</th>

                    <th  style="padding-left: 70px;padding-right: 70px;">ACCOUNT STATUS</th>
                    <th  style="padding-left: 40px;padding-right: 40px;">WALLET BALANCE</th>
                    <th  style="padding-left: 20px;padding-right: 20px;">REGISTRATION COUNT</th>
                    <th  style="padding-left: 40px;padding-right: 40px;">REBALANCING WALLET</th>
                    <th  style="padding-left: 40px;padding-right: 40px;">MASTER AGENT WALLET</th>
                    <th  style="padding-left: 40px;padding-right: 40px;background: #EBFFEB">MASTER AGENT NAME</th>       
                    <th  style="padding-left: 70px;padding-right: 70px;background: #FFF9D4">DATE</th>
                    <th  style="padding-left: 70px;padding-right: 70px;background: #FFF9D4">SHOP NAME</th>
                </tr>

            </thead>
            <s:iterator value="cm_list">
                <tr>
                    <td style="text-align: center;"><s:property value="tr6_ag_wlt"/> </td>


                    <td style="text-align: center;"><s:property value="tr6_acc_stat"/> </td>
                    <td style="text-align: right;"><s:property value="tr6_wlt_blnc"/> </td>
                    <td style="text-align: center;"><s:property value="tr6_reg_cnt"/> </td>
                    <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="tr6_ra_wlt"/> </td>
                    <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="tr6_ma_wlt"/> </td>
                    <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="tr6_ma_name"/> </td>
                    <td style="text-align: center;"><s:property value="tr6_part_date"/> </td>
                    <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="tr6_shop_name"/> </td>

                </tr>
            </s:iterator>


        </table>


    </div>

    <%  }%>




    <br/>

</center>


