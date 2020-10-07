<%-- 
    Document   : liftingAndRefundSummary_result
    Created on : Jul 2, 2013, 11:00:07 AM
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
  
    <b>Distributor Name:<s:property value="commonModelBean.distributor_name"/> &nbsp;&nbsp;Wallet : <s:property value="commonModelBean.ma_wallet"/> &nbsp; &nbsp; Chosen Month:--Format (MM-YYYY): <s:property value="datePickerBean.datepicker"/></b> 

</fieldset>
    <br/><br/><br/>

     <fieldset>
<legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>Lifting And Refund Summary</b></legend>
            <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8;">
                    <tr>
                        <th  style="padding-left: 20px;padding-right: 20px;">DISTRIBUTOR NAME</th>
                        <th style="padding-left: 60px;padding-right: 60px;">LIFT COUNT</th>
                        <th style="padding-left: 60px;padding-right: 60px;">LIFT AMOUNT</th>
                        <th style="padding-left: 40px;padding-right: 40px;">REFUND COUNT</th>
                        <th style="padding-left: 40px;padding-right: 40px;">REFUND AMOUNT</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <tr >

                        <s:iterator value="cm_list2" id="cm_list2" >  
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="distributor_name"/></p></td>
                            <td style="padding-left: 60px;padding-right: 60px;text-align: center"><p><s:property value="issue_count"/></p></td>
                            <td style="padding-left: 60px;padding-right: 60px;text-align: center"><p><s:property value="issue_amount"/></p></td>
                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="refund_count"/></p></td>
                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="refund_amount"/></p></td>

                        </tr>

                    </s:iterator>


                </tbody>


            </table>

        </fieldset>
<br/><br/><br/>
  
  <%  }%>

        

</center>

<%@ include file="/secure/bottom.jsp" %>
