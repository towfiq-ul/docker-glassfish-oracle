<%-- 
    Document   : kycStatusReport
    Created on : May 29, 2013, 5:07:22 PM
    Author     : Hafizur_b0266
--%>

<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "KYC Tracking Report : KYC Lifecycle Report";%>
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
            &nbsp;Date Range  : <s:property value="from_date"/> - <s:property value="to_date"/> &nbsp; Total Rows: <s:property value="cm.counter"/> 
        </b></legend>



    <%    if (request.isUserInRole("SND") || request.isUserInRole("DISTRIBUTOR")) {%>




    <div style="overflow:scroll; height:422px;">


        
        
                    <table  border="1"  id="tblData"  >
        
        
                        <thead style="background: #F8F8F8;">
                            <tr>
                                <th style="padding-left: 40px;padding-right: 40px;">BSA NUMBER</th>
        
                                <th  style="padding-left: 70px;padding-right: 70px;">SHOP NAME</th>
                                <th  style="padding-left: 100px;padding-right: 100px;">PRESENT ADDRESS</th>
                                <th  style="padding-left: 40px;padding-right: 40px;"> PRESENT THANA</th>
                                <th  style="padding-left: 40px;padding-right: 40px;">bKash ACCOUNT NUMBER</th>
                                <th  style="padding-left: 40px;padding-right: 40px;">REGISTRATION DATE (1)</th>
                                <th  style="padding-left: 40px;padding-right: 40px;background: #EBFFEB">DISTRIBUTOR PART : RECEIVED DATE (2)</th>
        
                                <th  style="padding-left: 70px;padding-right: 70px;background: #FFF9D4">CS PART : RECEIVED DATE (3)</th>
                                <th  style="padding-left: 70px;padding-right: 70px;background: #EBFFEB">(2-1) IN DAYS</th>
                                <th  style="padding-left: 70px;padding-right: 70px;background: #FFF9D4">(3-2) IN DAYS</th>
        
        
        
        
        
                            </tr>
        
                        </thead>
        <s:iterator value="cm_list">
            <tr>
                <td style="text-align: center;"><s:property value="tr5_ra"/> </td>
                

                <td style="text-align: center;"><s:property value="tr5_shopname"/> </td>
                <td style="text-align: center;"><s:property value="tr5_pres_adrs"/> </td>
                <td style="text-align: center;"><s:property value="tr5_perm_tha_upz"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="tr5_cus_wallet"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="tr5_reg_date"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="tr5_ds_received_date"/> </td>
                <td style="text-align: center;"><s:property value="tr5_cs_received_date"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="tr5_days_1"/> </td>
                <td style="text-align: center;"><s:property value="tr5_days_2"/> </td>



            </tr>
        </s:iterator>


    </table>
    
        

   
    </div>

    <%  }%>




    <br/>
  <s:form action="/secure/action/exportkycTrackingRep5Result">
           
            

            <%--
            Wallet Number : <s:textfield name="datePickerBean.wallet_no" id="distwallet1" placeholder="Wallet Number" onKeyup="isInteger ('distwallet1')" onChange="mobilenumberformat ('distwallet1')"/>

            --%>

            

  
            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 150px;border: none;margin: 6px;padding: 3;" value="Export To Excel" />

        </s:form><br/>
</center>

<%@ include file="/secure/bottom.jsp" %>
