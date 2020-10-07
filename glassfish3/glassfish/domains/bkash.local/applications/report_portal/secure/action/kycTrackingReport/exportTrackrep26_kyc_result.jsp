<%-- 
    Document   : exportTrackrep25_kyc_result
    Created on : Nov 28, 2016, 3:37:57 PM
    Author     : dni_shahinur
--%>

<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "Refund Report";

String reportFileName = "exportkycTrackingRep26Result";
response.setHeader("Content-Disposition", "attachment; filename=" + reportFileName + ".xls");

%>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <fieldset >
        <legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>
                <!--MA Wallet: <s:property value="ma_wallet"/>&nbsp;-->
                Date Range: <s:property value="from_date"/> - <s:property value="to_date"/> 
            </b></legend>


        <%    if (request.isUserInRole("RSM") || request.isUserInRole("SM") || request.isUserInRole("TM")) {%>

        <div style="overflow:auto; height:380px; width:999px">
            <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8;">
                <th style="padding-left: 40px;padding-right: 40px;">SL</th>
                <th style="padding-left: 40px;padding-right: 40px;">Request ID</th>
                <th style="padding-left: 40px;padding-right: 40px;">Distributor Code</th>
                <th style="padding-left: 40px;padding-right: 40px;">MA Wallet</th>
                <th style="padding-left: 40px;padding-right: 40px;">Channel</th>
                <th style="padding-left: 40px;padding-right: 40px;">Amount TK</th>
                <th style="padding-left: 40px;padding-right: 40px;">Bank Account No.</th>
                <th style="padding-left: 40px;padding-right: 40px;">Bank Name</th>
                <th style="padding-left: 40px;padding-right: 40px;">Branch</th>
                <th style="padding-left: 40px;padding-right: 40px;">Requested On</th>
                <th style="padding-left: 40px;padding-right: 40px;">Status</th>
                <th style="padding-left: 40px;padding-right: 40px;">Transaction Date</th>
                </thead>
                <tbody>
                    <s:iterator value="cm_list" id="cm_list" >
                        <tr>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr26_serial"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr26_request_id"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr26_distributor_code"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr26_ma_wallet"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr26_ma_name"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr26_amount"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr26_bank_account_no"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr26_bank_name"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr26_branch"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr26_requested_on"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr26_status"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr26_status_changed_on"/></p></td>
                        </tr>
                    </s:iterator>
                </tbody>
            </table>
            
        </div>


        <%  }%>

    </fieldset>



    <br/>

</center>