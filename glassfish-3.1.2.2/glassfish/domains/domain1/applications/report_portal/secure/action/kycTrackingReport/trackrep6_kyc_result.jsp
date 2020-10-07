<%-- 
    Document   : kycStatusReport
    Created on : May 29, 2013, 5:07:22 PM
    Author     : Hafizur_b0266
--%>

<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Registration and Balance Report: Agent Wise";%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@ include file="/secure/top.jsp" %>
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
            &nbsp;Date : <s:property value="from_date"/>  &nbsp; Total Rows: <s:property value="cm.counter"/>
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
  <s:form action="/secure/action/exportkycTrackingRep6Result">
           
            

            <%--
            Wallet Number : <s:textfield name="datePickerBean.wallet_no" id="distwallet1" placeholder="Wallet Number" onKeyup="isInteger ('distwallet1')" onChange="mobilenumberformat ('distwallet1')"/>

            --%>

            

  
            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 150px;border: none;margin: 6px;padding: 3;" value="Export To Excel" />

        </s:form><br/>
</center>

<%@ include file="/secure/bottom.jsp" %>
