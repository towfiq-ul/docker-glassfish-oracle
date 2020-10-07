<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Dashboard";%>
<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<fieldset class="gradient">
    <div style="overflow:auto; height:450px; width:1008px">


        <%    if (request.isUserInRole("SND")) {%>

        <!--

        <s:iterator value="cm_list" id="cm_list" >  

            <p style="font-size: 1.2em;color: #052b4d; font: Arial, sans-serif;">Hello <s:property value="loggedin_role"/> member : <s:property value="loggedin"/></p>

            <a href="<s:url action="secure/action/agentcount" />"><p>Total Agent Count</a> : <s:property value="agent_count"/></p>
            <a href="<s:url action="secure/action/bsacount" />"><p>Total BSA Count</a> : <s:property value="bsa_count"/></p>
            <a href="<s:url action="secure/action/distributorcount" />"><p>Total Distributor Count</a> : <s:property value="distributor_count"/></p>


        </s:iterator>
        -->
        <br/>
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">KYC Tracking Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
        <a href="<s:url action="secure/action/kycTrackingRep1Ui" />"><p>Distributor Summary Report : Date Wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep2Ui" />"><p>Distributor Summary Report : Aging Report</p></a>

        <a href="<s:url action="secure/action/kycTrackingRep3Ui" />"><p>Distributor Summary Report : BSA Agent Wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep4Ui" />"><p>Distributor Detailed Report</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep5Ui" />"><p>KYC Lifecycle Report</p></a>
        <br/>

        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">Transaction Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
        <a href="<s:url action="secure/action/monthlyTransaction"/>"><p>Specific Channel Transaction Report</p></a>
        <a href="<s:url action="secure/action/detailsInformation"/>"><p>All Channel Transaction Report</p></a>
        <a href="<s:url action="secure/action/detailsDailyInformation" />"><p>Detailed Daily Transaction Report</p></a>
        <br/>
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">Lift & Refund Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
        <a href="<s:url action="secure/action/monthlyLiftRefund" />"><p>Summary Report</p></a>
        <br/>


        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">KYC Status Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>

        <a href="<s:url action="secure/action/kycStatusSummary" />"><p>Summary Report</p></a>
        <a href="<s:url action="secure/action/kycStatus" />"><p>Detailed Report</p></a>

        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">KYC Commission Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>

        <a href="<s:url action="secure/action/kycCommissionSummary" />"><p>Summary Report</p></a>
        <a href="<s:url action="secure/action/kycCommission" />"><p>Detailed Report</p></a>
        <!--
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">Others<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
        <a href="<s:url action="secure/action/walletBalanceReport_ui" />"><p>Wallet Balance Report</p></a>
        <a href="<s:url action="secure/action/registrationReport_ui" />"><p>Registration Report</p></a>
        <a href="<s:url action="secure/action/liftingAndRefundSummary" />"><p>Lifting & Refund Report</p></a>
        <a href="<s:url action="secure/action/kycStatusOfWallet" />"><p>KYC Status Of Wallet Report</p></a>
        -->

        <br/>




        <%  }%>

        <%    if (request.isUserInRole("DISTRIBUTOR")) {%>

        <!--
        <s:iterator value="cm_list" id="cm_list" >  

            <p style="font-size: 1.2em;color: #052b4d; font: Arial, sans-serif;">Hello <s:property value="loggedin_role"/> : <s:property value="loggedin"/></p>

            <a href="<s:url action="secure/action/agentcount" />"><p>Total Agent Count</a> : <s:property value="agent_count"/></p>
            <a href="<s:url action="secure/action/bsacount" />"><p>Total BSA Count</a> : <s:property value="bsa_count"/></p>


        </s:iterator>
        -->
        <br/>
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">KYC Tracking Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
<!--        <a href="<s:url action="secure/action/kycTrackingRep1Ui" />"><p>Distributor Summary Report : Date Wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep2Ui" />"><p>Distributor Summary Report : Aging Report</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep3Ui" />"><p>Distributor Summary Report : BSA Agent Wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep4Ui" />"><p>Distributor Detailed Report</p></a>-->
        <a href="<s:url action="secure/action/kycTrackingRep5Ui" />"><p>KYC Lifecycle Report</p></a>
        <!--<a href="<s:url action="secure/action/kycTrackingRep6Ui" />"><p>Registration and Balance Report: Agent Wise</p></a>-->
        <a href="<s:url action="secure/action/kycTrackingRep8Ui" />"><p>ID Searching Tool</p></a>


        <a href="<s:url action="secure/action/kycTrackingRep9Ui" />"><p>Registration Summary Report: Date wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep10Ui" />"><p>Registration Summary Report: Agent wise</p></a>

        <a href="<s:url action="secure/action/kycTrackingRep11Ui" />"><p>Registration Summary Report: DSO wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep14Ui" />"><p>Distributor Detailed Report: Customer Account wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep13Ui" />"><p>Daily Registration & Transaction Report: Agent wise</p></a>

        <a href="<s:url action="secure/action/kycTrackingRep16Ui" />"><p>Transaction Summary Report : Date wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep18Ui" />"><p>Transaction Summary Report : DSO wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep19Ui" />"><p>Transaction Summary Report : Agent wise</p></a>

        <a href="<s:url action="secure/action/kycTrackingRep17Ui" />"><p>Agent List</p></a> 

        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">DSO App Monitoring Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>

        <a href="<s:url action="secure/action/kycTrackingRep27Ui" />"><p>Check IN and B2B raw data</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep28Ui" />"><p>Agent Wise- Check IN and B2B report</p></a>  
        <a href="<s:url action="secure/action/kycTrackingRep29Ui" />"><p>Agent Wise- Check IN and B2B report MTD</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep30Ui" />"><p>RA Performance Report </p></a>
        <a href="<s:url action="secure/action/kycTrackingRep31Ui" />"><p>Day wise RA report</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep32Ui" />"><p>Day wise Distributor report</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep33Ui" />"><p>Distributor Performance Summary</p></a>




        <!--<a href="<s:url action="secure/action/kycTrackingRep20Ui" />"><p>Daily Performance Report : DSO wise</p></a>-->


        <br/>
        <!-- dashboarde tramnsaction reporte 3 ta
                lift & refund reporte 1 ta done
                but icha kore deya hoi nai
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">Transaction Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - </p>
        <a href="<s:url action="secure/action/monthlyTransaction" />"><p>Summary Report # 1</p></a>
        <a href="<s:url action="secure/action/detailsInformation" />"><p>Summary Report # 2</p></a>
        <a href="<s:url action="secure/action/detailsDailyInformation" />"><p>Detailed Report</p></a>
        <br/>
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">Lift & Refund Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
        <a href="<s:url action="secure/action/monthlyLiftRefund" />"><p>Summary Report</p></a>
        <br/>
        -->
        <!--
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">KYC Status Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
        <a href="<s:url action="secure/action/kycStatusSummary" />"><p>Summary Report</p></a>
        <a href="<s:url action="secure/action/kycStatus" />"><p>Detailed Report</p></a>

        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">Others<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
        <a href="<s:url action="secure/action/walletBalanceReport_ui" />"><p>Wallet Balance Report</p></a>
        <a href="<s:url action="secure/action/registrationReport_ui" />"><p>Registration Report</p></a>
        <a href="<s:url action="secure/action/liftingAndRefundSummary" />"><p>Lifting & Refund Report</p></a>
        <a href="<s:url action="secure/action/kycStatusOfWallet" />"><p>KYC Status Of Wallet Report</p></a>
        -->

        <br/>



        <%  }%>


        <%    if (request.isUserInRole("BSA")) {%>

        <!--
        <s:iterator value="cm_list" id="cm_list" >  

            <p style="font-size: 1.2em;color: #052b4d; font: Arial, sans-serif;">Hello <s:property value="loggedin_role"/> : <s:property value="loggedin"/></p>

            <a href="<s:url action="secure/action/agentcount" />"><p>Total Agent Count</a> : <s:property value="agent_count"/></p>


        </s:iterator>

        <br/>
        -->
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">Transaction Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
        <a href="<s:url action="secure/action/monthlyTransaction" />"><p>Summary Report # 1</p></a>
        <a href="<s:url action="secure/action/detailsInformation" />"><p>Summary Report # 2</p></a>
        <a href="<s:url action="secure/action/detailsDailyInformation" />"><p>Detailed Report</p></a>
        <br/>


        <%  }%>

        <%    if (request.isUserInRole("AGENT")) {%>


        <s:iterator value="cm_list" id="cm_list" >  

            <p style="font-size: 1.2em;color: #052b4d; font: Arial, sans-serif;">Hello <s:property value="loggedin_role"/> : <s:property value="loggedin"/></p>



        </s:iterator>

        <br/>
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">Transaction Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
        <a href="<s:url action="secure/action/monthlyTransaction" />"><p>Summary Report</p></a>
        <br/>


        <%  }%>

        <%    if (request.isUserInRole("ADMINISTRATOR")) {%>

        <s:iterator value="cm_list" id="cm_list" >  

            <p style="font-size: 1.2em;color: #052b4d; font: Arial, sans-serif;">Hello <s:property value="loggedin_role"/> : <s:property value="loggedin"/></p>



        </s:iterator>

        <%  }%>

        <%    if (request.isUserInRole("COMPLIANCE")) {%>

        <!--
        <s:iterator value="cm_list" id="cm_list" >  

            <p style="font-size: 1.2em;color: #052b4d; font: Arial, sans-serif;">Hello <s:property value="loggedin_role"/> : <s:property value="loggedin"/></p>

            <a href="<s:url action="secure/action/agentcount" />"><p>Total Agent Count</a> : <s:property value="agent_count"/></p>
            <a href="<s:url action="secure/action/bsacount" />"><p>Total BSA Count</a> : <s:property value="bsa_count"/></p>


        </s:iterator>
        -->
        <br/>
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">KYC Tracking Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
<!--        <a href="<s:url action="secure/action/kycTrackingRep1Ui" />"><p>Distributor Summary Report : Date Wise</p></a>

        <a href="<s:url action="secure/action/kycTrackingRep3Ui" />"><p>Distributor Summary Report : BSA Agent Wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep4Ui" />"><p>Distributor Detailed Report</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep6Ui" />"><p>Registration and Balance Report: Agent Wise</p></a>-->

        <a href="<s:url action="secure/action/kycTrackingRep8Ui" />"><p>ID Searching Tool</p></a>


        <!--        <p style="font-size: 1.5em; color: #052b4d; font: Arial, sans-serif;">
                    - - - - - - - - - -New Report- - - - - - - - - -</p>-->

        <a href="<s:url action="secure/action/kycTrackingRep9Ui" />"><p>Registration Summary Report: Date wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep10Ui" />"><p>Registration Summary Report: Agent wise</p></a>

        <a href="<s:url action="secure/action/kycTrackingRep11Ui" />"><p>Registration Summary Report: DSO wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep14Ui" />"><p>Distributor Detailed Report: Customer Account wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep13Ui" />"><p>Daily Registration & Transaction Report: Agent wise</p></a>

        <a href="<s:url action="secure/action/kycTrackingRep16Ui" />"><p>Transaction Summary Report : Date wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep18Ui" />"><p>Transaction Summary Report : DSO wise </p></a>
        <a href="<s:url action="secure/action/kycTrackingRep19Ui" />"><p>Transaction Summary Report : Agent wise</p></a>

        <a href="<s:url action="secure/action/kycTrackingRep17Ui" />"><p>Agent List</p></a>


        <!--<a href="<s:url action="secure/action/kycTrackingRep20Ui" />"><p>Daily Performance Report : DSO wise</p></a>-->


        <br/>





        <%  }%>


        <!--Sales OPS-->
        <%    if (request.isUserInRole("SalesOps")) {%>

        <!--
        <s:iterator value="cm_list" id="cm_list" >  
            <p style="font-size: 1.2em;color: #052b4d; font: Arial, sans-serif;">Hello <s:property value="loggedin_role"/> : <s:property value="loggedin"/></p>
            <a href="<s:url action="secure/action/agentcount" />"><p>Total Agent Count</a> : <s:property value="agent_count"/></p>
            <a href="<s:url action="secure/action/bsacount" />"><p>Total BSA Count</a> : <s:property value="bsa_count"/></p>
        </s:iterator>
        -->
        <br/>
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">KYC Tracking Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>

        <!--RSM TM ASM Mangement-->
        <!--<a href="<s:url action="secure/action/sm_tm_management" />"><p>User Mapping Management</p></a>-->

        <a href="<s:url action="secure/action/kycTrackingRep12Ui" />"><p>Distributor Wise Report</p></a>

        <a href="<s:url action="secure/action/kycTrackingRep15Ui" />"><p>All Distributor Detailed Report: Customer Account wise</p></a>
        <%  }%>

        <!--RSM-->
        <%    if (request.isUserInRole("RSM")) {%>
        <br/>
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">KYC Tracking Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
        <a href="<s:url action="secure/action/kycTrackingRep21Ui" />"><p>Registration Summary Report : Distributor wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep23Ui" />"><p>Transaction Summary Report : Distributor Wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep25Ui" />"><p>Lifting Status Report</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep26Ui" />"><p>Refund Status Report</p></a>  
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">DSO App Monitoring Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
        <a href="<s:url action="secure/action/kycTrackingRep27Ui" />"><p>Check IN and B2B raw data</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep28Ui" />"><p>Agent Wise- Check IN and B2B report</p></a>  
        <a href="<s:url action="secure/action/kycTrackingRep29Ui" />"><p>Agent Wise- Check IN and B2B report MTD</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep30Ui" />"><p>RA Performance Report </p></a>
        <a href="<s:url action="secure/action/kycTrackingRep31Ui" />"><p>Day wise RA report</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep32Ui" />"><p>Day wise Distributor report</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep33Ui" />"><p>Distributor Performance Summary</p></a>
        <%  }%>

        <!--SM-->
        <%    if (request.isUserInRole("SM")) {%>
        <br/>
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">KYC Tracking Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
        <a href="<s:url action="secure/action/kycTrackingRep21Ui" />"><p>Registration Summary Report : Distributor wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep22Ui" />"><p>Registration Summary Report : Agent wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep23Ui" />"><p>Transaction Summary Report : Distributor Wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep24Ui" />"><p>Transaction Summary Report : Agent Wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep25Ui" />"><p>Lifting Status Report</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep26Ui" />"><p>Refund Status Report</p></a>   
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">DSO App Monitoring Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
        <a href="<s:url action="secure/action/kycTrackingRep27Ui" />"><p>Check IN and B2B raw data</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep28Ui" />"><p>Agent Wise- Check IN and B2B report</p></a>  
        <a href="<s:url action="secure/action/kycTrackingRep29Ui" />"><p>Agent Wise- Check IN and B2B report MTD</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep30Ui" />"><p>RA Performance Report </p></a>
        <a href="<s:url action="secure/action/kycTrackingRep31Ui" />"><p>Day wise RA report</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep32Ui" />"><p>Day wise Distributor report</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep33Ui" />"><p>Distributor Performance Summary</p></a>
        <%  }%>

        <!--TM-->
        <%    if (request.isUserInRole("TM")) {%>
        <br/>
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">KYC Tracking Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
        <a href="<s:url action="secure/action/kycTrackingRep21Ui" />"><p>Registration Summary Report : Distributor wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep22Ui" />"><p>Registration Summary Report : Agent wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep23Ui" />"><p>Transaction Summary Report : Distributor Wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep24Ui" />"><p>Transaction Summary Report : Agent Wise</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep25Ui" />"><p>Lifting Status Report</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep26Ui" />"><p>Refund Status Report</p></a>
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">DSO App Monitoring Report<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
        <a href="<s:url action="secure/action/kycTrackingRep27Ui" />"><p>Check IN and B2B raw data</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep28Ui" />"><p>Agent Wise- Check IN and B2B report</p></a>  
        <a href="<s:url action="secure/action/kycTrackingRep29Ui" />"><p>Agent Wise- Check IN and B2B report MTD</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep30Ui" />"><p>RA Performance Report </p></a>
        <a href="<s:url action="secure/action/kycTrackingRep31Ui" />"><p>Day wise RA report</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep32Ui" />"><p>Day wise Distributor report</p></a>
        <a href="<s:url action="secure/action/kycTrackingRep33Ui" />"><p>Distributor Performance Summary</p></a>
        <%  }%>





        <%    if (request.isUserInRole("QC")) {%>

        <!--
        <s:iterator value="cm_list" id="cm_list" >  

            <p style="font-size: 1.2em;color: #052b4d; font: Arial, sans-serif;">Hello <s:property value="loggedin_role"/> : <s:property value="loggedin"/></p>

            <a href="<s:url action="secure/action/agentcount" />"><p>Total Agent Count</a> : <s:property value="agent_count"/></p>
            <a href="<s:url action="secure/action/bsacount" />"><p>Total BSA Count</a> : <s:property value="bsa_count"/></p>


        </s:iterator>
        -->
        <br/>
        <p style="font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;">ID Search<br/>
            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>

        <a href="<s:url action="secure/action/kycTrackingRep8Ui" />"><p>ID Searching Tool</p></a>
        <br/>





        <%  }%>


    </div>
</fieldset>

<br/>


<%@ include file="/secure/bottom.jsp" %>