<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "User Transaction Report  (Summary)";%>
<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("AGENT") || request.isUserInRole("BSA")) {%>

    <fieldset class="gradient">

        <legend></legend>
        <b >Month : <s:property value="datePickerBean.dp_month"/>  &nbsp; &nbsp; Year : <s:property value="datePickerBean.dp_year"/></b><br/>


    </fieldset><br/><br/><br/>

    <%  }%>


    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("AGENT") || request.isUserInRole("BSA")) {%>



    <table  border="1"  id="tblData" >
        <thead style="background: #F8F8F8;">
            <tr>
                <th></th>
                <th>COUNT OF TRANSACTION</th>
                <th>AMOUNT OF TRANSACTION</th>
                <th>GROSS DISTRIBUTOR COMMISSION</th>
                <th>AIT (10%)</th>
                <th>NET DISTRIBUTOR COMMISSION</th>
            </tr>
        </thead>
        <tbody>
            <tr >

                <td style="text-align: center;padding: 5px 25px 5px 25px;"><p>CASH IN</p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.amp_CASHIN_COUNT"/></p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.amp_CASHIN_AMOUNT"/></p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.amp_CASHIN_COMM"/></p></td>

                <td style="text-align: center"><p><s:property value="commonModelBean.amp_ait"/></p></td>

                <td style="text-align: center"><p><s:property value="commonModelBean.amp_ndc"/></p></td>




            </tr>

            <tr >

                <td style="text-align: center;padding: 5px 25px 5px 25px;"><p>CASH OUT</p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.amp_CASHOUT_COUNT"/></p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.amp_CASHOUT_AMOUNT"/></p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.amp_CASHOUT_COMM"/></p></td>

                <td style="text-align: center"><p><s:property value="commonModelBean.co_amp_ait"/></p></td>

                <td style="text-align: center"><p><s:property value="commonModelBean.co_amp_ndc"/></p></td>




            </tr>

            <tr >

                <td style="text-align: center;padding: 5px 25px 5px 25px;"><p>TOTAL</p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.total_count"/></p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.total_amount"/></p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.total_comm"/></p></td>

                <td style="text-align: center"><p><s:property value="commonModelBean.total_ait"/></p></td>

                <td style="text-align: center"><p><s:property value="commonModelBean.total_ndc"/></p></td>




            </tr>

        </tbody>


    </table>




    <%  }%>




    <br/>

</center>

<%@ include file="/secure/bottom.jsp" %>