<%-- 
    Document   : kycStatusOfWallet_result
    Created on : Jul 3, 2013, 4:40:34 PM
    Author     : Hafizur_b0266
--%>


<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Lifting And Refunding Report Summary";%>
<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    



    <%    if (request.isUserInRole("SND") || request.isUserInRole("DISTRIBUTOR")) {%>
    <fieldset class="gradient">
        <legend></legend>
  
    <b>Distributor Name:<s:property value="commonModelBean.ct_AGENT_CHANNEL"/> &nbsp;&nbsp;Wallet : <s:property value="commonModelBean.ma_wallet"/> &nbsp; &nbsp; starting date: <s:property value="datePickerBean.date_from"/>&nbsp; &nbsp; ending date: <s:property value="datePickerBean.date_to"/></b> 

</fieldset>
    <br/><br/><br/>

     <fieldset>
<legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>Lifting And Refund Summary</b></legend>
            <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8;">
                    <tr>
                        <th  style="padding-left: 20px;padding-right: 20px;">MA WALLET</th>
                        <th style="padding-left: 60px;padding-right: 60px;">SHOP NAME</th>
                        <th style="padding-left: 60px;padding-right: 60px;">CHANNEL</th>
                        <th style="padding-left: 40px;padding-right: 40px;">TYPE NAME</th>
                        <th style="padding-left: 40px;padding-right: 40px;">DISTRICT</th>
                        <th style="padding-left: 40px;padding-right: 40px;">DIVISION</th>
                        <th style="padding-left: 40px;padding-right: 40px;">REGISTERED</th>
                        <th style="padding-left: 40px;padding-right: 40px;">RECEIVED</th>
                        <th style="padding-left: 40px;padding-right: 40px;">ACCEPTED</th>
                        <th style="padding-left: 40px;padding-right: 40px;">SCANNED</th>
                        <th style="padding-left: 40px;padding-right: 40px;">REJECTED</th>
                        <th style="padding-left: 40px;padding-right: 40px;">PIPELINE</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <tr >

                        <s:iterator value="cm_list2" id="cm_list2" >  
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="maWallet"/></p></td>
                            <td style="padding-left: 60px;padding-right: 60px;text-align: center"><p><s:property value="shopName"/></p></td>
                            <td style="padding-left: 60px;padding-right: 60px;text-align: center"><p><s:property value="channel"/></p></td>
                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="typeName"/></p></td>
                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="district"/></p></td>
                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="division"/></p></td>
                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="registered"/></p></td>
                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="received"/></p></td>
                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="accepted"/></p></td>
                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="scanned"/></p></td>
                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="rejected"/></p></td>
                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="spipeline"/></p></td>

                        </tr>

                    </s:iterator>


                </tbody>


            </table>

        </fieldset>
<br/><br/><br/>
  
  <%  }%>

        

</center>

<%@ include file="/secure/bottom.jsp" %>
