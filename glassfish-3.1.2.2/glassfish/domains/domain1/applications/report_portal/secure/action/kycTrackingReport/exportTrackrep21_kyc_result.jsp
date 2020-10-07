<%-- 
    Document   : exportTrackrep1_kyc_result
    Created on : Jul 31, 2013, 2:08:18 PM
    Author     : Hafizur_b0266
--%>



<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "Registration Summary Report : Distributor Wise";


String reportFileName = "exportkycTrackingRep21Result";
response.setHeader("Content-Disposition", "attachment; filename=" + reportFileName + ".xls");


%>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <fieldset >
        <legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>
                &nbsp;Date Range: <s:property value="from_date"/> - <s:property value="to_date"/> 
            </b></legend>



        <%    if (request.isUserInRole("RSM") || request.isUserInRole("SM") || request.isUserInRole("TM")) {%>




        <div style="overflow:auto; height:380px; width:999px">


                        <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8;">

                <th rowspan="2" style="padding-left: 40px;padding-right: 40px; ">SL</th>
                <th rowspan="2" style="padding-left: 40px;padding-right: 40px; ">MA Wallet</th>
                <th rowspan="2" style="padding-left: 40px;padding-right: 40px; ">Channel</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px; ">Registration Count</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px; ">E-KYC Registration Count</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px; ">Collected KYC Count</th>
                <th colspan="2">Uncollected KYC Count</th>
                <th colspan="2">Customer Service Status</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px;  ">Currently Distributor Received</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px;  ">Others</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px; ">PIN Change</th>
                <th rowspan="2" style="padding-left: 10px;padding-right: 10px;  ">Cash IN</th>
                <tr>
                    <th style="padding-left: 10px;padding-right: 10px;">Registered</th>
                    <th style="padding-left: 10px;padding-right: 10px;">Distributor Rejected</th>
                    <th style="padding-left: 10px;padding-right: 10px;  ">Accept (Scanned+Accepted)</th>
                    <th  style="padding-left: 10px;padding-right: 10px; ">Reject</th>
                </tr>
                </thead>
                <tbody>

                <s:iterator value="cm_list" id="cm_list" >  
                    <tr>
                        <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr21_serial"/></p></td>
                        <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr21_dist_wallet"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr21_dist_channel"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr21_registration_cnt"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr21_ekyc_registration_count"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr21_col_kyc_cnt"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr21_registered_cnt"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr21_dist_reject_cnt"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr21_accept_cnt"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr21_reject_cnt"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr21_curr_dist_receive_cnt"/></p></td>
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr21_others_cnt"/></p></td>                           
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr21_pin_cnt"/></p></td>                           
                        <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr21_ci_cnt"/></p></td>                           
                    </tr>

                </s:iterator>


                </tbody>


            </table>


        </div>


        <%  }%>

    </fieldset>



    <br/>
    
</center>