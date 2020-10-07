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
                    DSO Wallet : <s:property value="dso_wallet"/>,
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

                <th style="padding-left: 40px;padding-right: 40px;">SL</th>
                <th style="padding-left: 40px;padding-right: 40px;">Date</th>
                <th style="padding-left: 40px;padding-right: 40px;">Agent Count</th>
                <th style="padding-left: 40px;padding-right: 40px;">Active Agent</th>
                <th style="padding-left: 40px;padding-right: 40px;">Dormant Agent</th>
                <th style="padding-left: 10px;padding-right: 10px;">Transaction Active</th>
                <th style="padding-left: 10px;padding-right: 10px;">Registration Active</th>
                <th style="padding-left: 10px;padding-right: 10px;">B2B Active</th>
                <th style="padding-left: 10px;padding-right: 10px;">B2B Send Amount</th>
                <th style="padding-left: 10px;padding-right: 10px;">B2B Received Amount</th>
                <th style="padding-left: 10px;padding-right: 10px;">B2B Send Count</th>
                <th style="padding-left: 10px;padding-right: 10px;">B2B Received Count</th>
                <th style="padding-left: 10px;padding-right: 10px;">Registration Count</th>



                </thead>
                <tbody>
                    <tr >

                        <s:iterator value="cm_list" id="cm_list" >  
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr20_serial"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr20_trx_date"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr20_tot_ag_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr20_act_ag_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr20_dor_ag_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr20_tran_ag_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr20_reg_ag_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr20_b2b_ag_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr20_b2b_send_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr20_b2b_send_amt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr20_b2b_receive_cnt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr20_b2b_receive_amt"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr20_reg_cnt"/></p></td>


                        </tr>

                    </s:iterator>


                </tbody>


            </table>

        </div>


        <%  }%>

    </fieldset>



    <br/>

</center>