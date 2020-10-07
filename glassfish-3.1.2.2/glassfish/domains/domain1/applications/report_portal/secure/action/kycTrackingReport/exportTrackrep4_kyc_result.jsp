<%-- 
    Document   : exportTrackrep4_kyc_result
    Created on : Aug 5, 2013, 2:13:03 PM
    Author     : Hafizur_b0266
--%>



<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>

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
            &nbsp;Date Range : <s:property value="from_date"/> - <s:property value="to_date"/>.   
        </b></legend>



    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")||request.isUserInRole("COMPLIANCE")) {%>



    <div style="overflow:scroll; height:425px;">


        
        
                    <table  border="1"  id="tblData"  >
        
        
                        <thead style="background: #F8F8F8;">
                            <tr>
                                <th style="padding-left: 40px;padding-right: 40px;">BSA NUMBER</th>
                                <th style="padding-left: 40px;padding-right: 40px;">AGENT NUMBER</th>
                                <th  style="padding-left: 70px;padding-right: 70px;">SHOP NAME</th>
                                <th  style="padding-left: 100px;padding-right: 100px;"> PRESENT ADDRESS</th>
                                <th  style="padding-left: 40px;padding-right: 40px;">PRESENT THANA</th>
                                <th  style="padding-left: 40px;padding-right: 40px;background: #EBFFEB">bKash ACCOUNT NUMBER</th>
                                <th  style="padding-left: 40px;padding-right: 40px;background: #FFF9D4">REGISTRATION DATE</th>
                                <th  style="padding-left: 40px;padding-right: 40px;background: #EBFFEB">KYC STATUS</th>
        
                                <th  style="padding-left: 70px;padding-right: 70px;background: #FFF9D4">LAST STATUS CHANGE DATE</th>
        
        
        
                            </tr>
        
                        </thead>
        <s:iterator value="cm_list">
            <tr>
                <td style="text-align: center;"><s:property value="tr4_ra"/> </td>
                <td style="text-align: center;"><s:property value="tr4_agent"/> </td>
                <td style="text-align: center;"><s:property value="tr4_shopname"/> </td>
                <td style="text-align: center;"><s:property value="tr4_pres_adrs"/> </td>
                <td style="text-align: center;"><s:property value="tr4_perm_tha_upz"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="tr4_cus_wallet"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="tr4_reg_date"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="tr4_status"/> </td>
                <td style="text-align: center;"><s:property value="tr4_status_date"/> </td>



            </tr>
        </s:iterator>


    </table>


        


    </div>

    <%  }%>




    <br/>
 
</center>


