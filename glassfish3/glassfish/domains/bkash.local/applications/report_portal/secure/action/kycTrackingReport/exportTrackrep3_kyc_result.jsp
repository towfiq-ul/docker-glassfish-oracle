<%-- 
    Document   : exportTrackrep3_kyc_result
    Created on : Aug 1, 2013, 3:54:58 PM
    Author     : Hafizur_b0266
--%>

<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "KYC Tracking Report : Distributor Summary Report (Agent Wise)";%>

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
                    &nbsp;Date Range : <s:property value="from_date"/> --<s:property value="to_date"/> &nbsp; TOTAL ROWS: <s:property value="cm.counter"/>
            </b></legend>



        <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND") ||request.isUserInRole("COMPLIANCE")) {%>


        <!--
                <div style="text-align: left; font-size: 1em; color: #052b4d; font: Arial, sans-serif;">
                    <b> Enter keyword to Search</b><br/>
                    <input type="text" id="search"/>&nbsp; &nbsp;
        
                </div><br/>
        -->

        <div style="overflow:auto; height:380px; width:999px">


 <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8;">
                    <tr >
                        <th style="padding-left: 40px;padding-right: 40px;">BSA NUMBER</th>
                        <th style="padding-left: 40px;padding-right: 40px;">AGENT NUMBER</th>
                        <th style="padding-left: 10px;padding-right: 10px;">SHOP NAME</th>
                        <th style="padding-left: 10px;padding-right: 10px;">PRESENT ADDRESS</th>
                        <th style="padding-left: 10px;padding-right: 10px;">PERMANENT THANA</th>
                        <th style="padding-left: 10px;padding-right: 10px;">REGISTRATION COUNT</th>
                        <th style="padding-left: 10px;padding-right: 10px;">DISTRIBUTOR PART:RECEIVED</th>
                        <th style="padding-left: 10px;padding-right: 10px;">UNCOLLECTED</th>
                        <th style="padding-left: 10px;padding-right: 10px;">CS PART:RECEIVED</th>
                        <th style="padding-left: 10px;padding-right: 10px;">CS PART:ACCEPT</th>
                    </tr>
                </thead>
                <tbody>
                    <tr >

                        <s:iterator value="cm_list" id="cm_list" >  
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr3_ra"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr3_agent"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr3_shopname"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr3_pres_adrs"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr3_perm_tha_upz"/></p></td>
                           
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr3_reg_count"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr3_dist_rcvd"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr3_uncollected"/></p></td>

                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr3_cs_rcvd"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr3_accepted"/></p></td>
                            

                        </tr>

                    </s:iterator>


                </tbody>


            </table>


        </div>


        <%  }%>

    </fieldset>



    <br/>

</center>


