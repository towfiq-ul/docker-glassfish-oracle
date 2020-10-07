<%-- 
    Document   : kycStatusReport
    Created on : May 29, 2013, 5:07:22 PM
    Author     : Hafizur_b0266
--%>

<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Photo ID Searching Tool";%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;">

        <b>
            <!--        
                    
            <s:if test='target=="SND2" '>
                Distributor Wallet : <s:property value="cm.amp_MA_WALLET"/>,
            </s:if>
            <s:if test='target=="SND3" '>
                Distributor Wallet : <s:property value="cm.amp_MA_WALLET"/>,&nbsp; BSA Wallet : <s:property value="cm.amp_RA"/>,
            </s:if>
            &nbsp;Date : <s:property value="from_date"/>  &nbsp;-->

            <!--        <p>Balance has been taken around 6 o'clock</p>-->
        </b></legend>

    <%    if (request.isUserInRole("QC") || request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("COMPLIANCE")|| request.isUserInRole("SalesOps")) {%>




    <div>

<!--        Photo Id No: <s:property value="cm.photo_id_no"/><br/>
        Photo Id Type: <s:property value="cm.photo_id_type"/><br/>
        Photo Id Flag: <s:property value="cm.photo_id_flag"/><br>-->


        <!--These are for table output--> 
        <b>
        <table  border="2"  id="tblData" style="width:50%">
            <tr>
                <td style="text-align: right">PHOTO ID NO</td>
                <td><s:property value="cm.photo_id_no"/></td>
            </tr>
            <tr>
                <td style="text-align: right">PHOTO ID TYPE</td>
                <td><s:property value="cm.photo_id_type"/></td>
            </tr>
            <tr>
                <td style="text-align: right">PHOTO ID FLAG</td>
                <td>
                    <%--<s:property value="cm.photo_id_flag"/>--%>
                    <%
                        String value = request.getAttribute("cm.photo_id_flag").toString();

                        if (value.equals("YES")) {
                            out.println("<div class='form-message success'>Proceed for QC</div>");
                        } else {
                            out.println("<div class='form-message error'>Rejected</div>");
                        }
                    %> 
                </td>
            </tr>
        </table></b>
       <a href="<s:url action="secure/action/kycTrackingRep8Ui" />"><p>Search Another ID</p></a>

      <!--Photo Id Flag:<div class='form-message success'><s:property value="cm.photo_id_flag"/></div> 
           
        <!--        <table  border="1"  id="tblData"  >
        
        
                    <thead style="background: #F8F8F8;">
                        <tr>
                            <th style="padding-left: 40px;padding-right: 40px;">Photo ID</th>
        
                            <th  style="padding-left: 70px;padding-right: 70px;">No of Wallets Registered</th>
                            <th  style="padding-left: 40px;padding-right: 40px;">MIX Cat Ind</th>
                            <th  style="padding-left: 20px;padding-right: 20px;">No of Registering Agent </th>
                            <th  style="padding-left: 40px;padding-right: 40px;">Active</th>
                            <th  style="padding-left: 40px;padding-right: 40px;">Suspended</th>
                            <th  style="padding-left: 40px;padding-right: 40px;background: #EBFFEB">Dormanted</th>       
                            <th  style="padding-left: 70px;padding-right: 70px;background: #FFF9D4">Closed</th>
                            <th  style="padding-left: 70px;padding-right: 70px;background: #FFF9D4">Others</th>
                        </tr>
        
                    </thead>
        <s:iterator value="cm_list">
            <tr>
                <td style="text-align: center;"><s:property value="photo_id"/> </td>


                <td style="text-align: center;"><s:property value="wlt_cnt"/> </td>
                <td style="text-align: right;"><s:property value="mix_cat_ind"/> </td>
                <td style="text-align: center;"><s:property value="ag_wlt_cnt"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="as_act"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="as_sus"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="as_dor"/> </td>
                <td style="text-align: center;"><s:property value="as_clo"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="as_oth"/> </td>

            </tr>
        </s:iterator>


    </table>-->




    </div>

    <%  }%>




    <br/>

</center>

<%@ include file="/secure/bottom.jsp" %>
