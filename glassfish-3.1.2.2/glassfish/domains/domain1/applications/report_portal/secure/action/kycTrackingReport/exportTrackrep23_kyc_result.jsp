<%-- 
    Document   : exportTrackrep1_kyc_result
    Created on : Jul 31, 2013, 2:08:18 PM
    Author     : Hafizur_b0266
--%>



<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "Transaction Summary Report : Distributor Wise";

String reportFileName = "exportkycTrackingRep23Result";
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
                <th style="padding-left: 40px;padding-right: 40px;">SL</th>
                <th style="padding-left: 40px;padding-right: 40px;">MA Wallet</th>
                <th style="padding-left: 40px;padding-right: 40px;">Distributor Name</th>
                <th style="padding-left: 40px;padding-right: 40px;">Trx. Active</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Active</th>
                <th style="padding-left: 40px;padding-right: 40px;">CI Amount</th>
                <th style="padding-left: 40px;padding-right: 40px;">CO Amount</th>
                <th style="padding-left: 40px;padding-right: 40px;">CI Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">CO Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Send Amount</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Received Amount</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Send Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">B2B Received Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">Total Transaction Amount</th>
                <th style="padding-left: 40px;padding-right: 40px;">Total B2B Amount</th>
                </thead>
                <tbody>
                    <s:iterator value="cm_list" id="cm_list" > 
                        <tr>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr23_serial"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr23_ma_wallet"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr23_distributor_name"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr23_trx_active"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr23_b2b_active"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr23_ci_amount"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr23_co_amount"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr23_ci_count"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr23_co_count"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr23_b2b_send_amount"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr23_b2b_receive_amount"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr23_b2b_send_count"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr23_b2b_receive_count"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr23_total_trx_amount"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr23_total_b2b_amount"/></p></td>
                        </tr>
                    </s:iterator>
                </tbody>
            </table>

        </div>


        <%  }%>

    </fieldset>



    <br/>
    
</center>