<%-- 
    Document   : exportTrackrep1_kyc_result
    Created on : Jul 31, 2013, 2:08:18 PM
    Author     : Hafizur_b0266
--%>



<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "KYC Tracking Report : Summary Report (Date Wise)";%>
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
                &nbsp;Date Range: <s:property value="from_date"/> - <s:property value="to_date"/> 
            </b></legend>



        <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND") || request.isUserInRole("COMPLIANCE")) {%>




        <div style="overflow:auto; height:380px; width:999px">


            <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8;">
                    <tr >
                        <th style="padding-left: 40px;padding-right: 40px;">SL.NO</th>
                        <th style="padding-left: 40px;padding-right: 40px;">DATE</th>
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
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="total_count"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr1_reg_date"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr1_reg_count"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr1_dist_recieved"/></p></td>

                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr1_uncollected"/></p></td>

                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr1_cs_received"/></p></td>

                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr1_cs_accepted"/></p></td>

                            
                        </tr>

                    </s:iterator>


                </tbody>


            </table>


        </div>


        <%  }%>

    </fieldset>



    <br/>
    
</center>