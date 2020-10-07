<%-- 
    Document   : kyc_commission_summary_result
    Created on : Jul 30, 2013, 10:58:25 AM
    Author     : Hafizur_b0266
--%>
<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "KYC Commission Report (Summary)";%>
<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {%>

    <fieldset class="gradient">

        <legend></legend>
        <b >Name : <s:property value="commonModelBean.ct_AGENT_CHANNEL"/> &nbsp; &nbsp;Wallet : <s:property value="wallet_no"/> &nbsp; &nbsp; Months : <s:property value="month"/>  </b><br/>


    </fieldset><br/>

    <%  }%>


    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {%>




    
            
            <br/><br/>
            <table  border="1"  id="tblData1"  >


                <thead style="background: #F8F8F8;">
                    <tr>

                      


                    </tr>
                    <tr>

                        <th style="padding-left: 20px;padding-right: 20px;">AGENT_TYPE</th>
                        <th style="padding-left: 20px;padding-right: 20px;">NO. OF CUSTOMER WALLET</th>
                        <th style="padding-left: 40px;padding-right: 40px;">COMMISSION RATE</th>
                        <th style="padding-left: 40px;padding-right: 40px;">GROSS COMMISSION</th>
                        <th style="padding-left: 40px;padding-right: 40px;">AIT(10%)</th>
                        <th style="padding-left: 40px;padding-right: 40px;">NET COMMISSION PAYABLE</th>


                    </tr>
                </thead>
                <s:iterator value="cm_list2">
                    <tr>

                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="agent"/> </td>  
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="no_cust_wallet"/> </td>  
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="comm_rate"/> </td>  
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="gross_comm"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="ait"/> </td>
                        <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="net_commission"/> </td>


                    </tr>
                </s:iterator>


            </table><br/><br/>
        
 <br/>

    <%  }%>


    <s:form action="/secure/action/exportKycCommissionSummaryReport">

            <s:hidden name="commonModelBean.param" value="number2" />
            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 130px;border: none;margin: 6px;padding: 3;" value="Export To Excel" />

        </s:form><br/>
</center>


<%@ include file="/secure/bottom.jsp" %>

