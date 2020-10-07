<%-- 
    Document   : exportTrackrep1_kyc_result
    Created on : Jul 31, 2013, 2:08:18 PM
    Author     : Hafizur_b0266
--%>



<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<% String pagename = "Agent Report";%>
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
               
            </b></legend>



        <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND") || request.isUserInRole("COMPLIANCE")) {%>




        <div style="overflow:auto; height:380px; width:999px">


            <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8;">

                <th style="padding-left: 40px;padding-right: 40px;">SL</th>
                <th style="padding-left: 40px;padding-right: 40px;">Agent Wallet</th>
                <th style="padding-left: 40px;padding-right: 40px;">Shop Name</th>
                <th style="padding-left: 40px;padding-right: 40px;">Address</th>
                <th style="padding-left: 40px;padding-right: 40px;">Thana</th>
                <th style="padding-left: 40px;padding-right: 40px;">DSO Wallet</th>
                <th style="padding-left: 40px;padding-right: 40px;">Account Status</th>
                <th style="padding-left: 40px;padding-right: 40px;">Account Type</th>
                <th style="padding-left: 40px;padding-right: 40px;">Registration Date</th>


                </thead>
                <tbody>
                    <tr >

                        <s:iterator value="cm_list" id="cm_list" >  
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr17_serial"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr17_agent_wallet"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr17_shop_name"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr17_address"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr17_thana"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="tr17_dso_wallet"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr17_account_status"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr17_account_type"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="tr17_registration_date"/></p></td>


                        </tr>

                    </s:iterator>

                </tbody>
            </table>

        </div>
        <%  }%>

    </fieldset>



    <br/>

</center>