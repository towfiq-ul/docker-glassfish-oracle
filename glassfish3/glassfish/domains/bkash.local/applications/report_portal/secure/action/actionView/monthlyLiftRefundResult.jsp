<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Lift & Refund Report (Summary)";%>
<%@ include file="/secure/top.jsp" %>
<link href="<%=request.getContextPath()%>/css/monthlyTransaction.css" rel="stylesheet" type="text/css" media="screen" />

<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>

    <s:if test="%{!errorMessage.empty}">
        <s:div id="errorMessage" cssClass="form-message error">
            <ul> <li> <s:property value="errorMessage" /> </li> </ul>
                </s:div>
            </s:if>

    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {%>

    <fieldset class="gradient">

        <legend></legend>
        <b>Name : <s:property value="commonModelBean.ct_AGENT_CHANNEL"/> &nbsp; &nbsp;Month : <s:property value="datePickerBean.dp_month"/> </b><br/>


    </fieldset><br/>

    <%  }%>


    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {%>

    <fieldset>

        <legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>Lifting Report</b></legend>

        <br/><br/>
        <table  border="1"  id="tblData1"  >


            <thead style="background: #F8F8F8;">
                <tr>

                    <th colspan="4" style="padding-left: 20px;padding-right: 20px;background: #EBFFEB">Lifting Report</th>


                </tr>
                <tr>

                    <th style="padding-left: 20px;padding-right: 20px;">LIFT COUNT</th>
                    <th style="padding-left: 20px;padding-right: 20px;">LIFT AMOUNT (Tk)</th>
                    <th style="padding-left: 40px;padding-right: 40px;">AVG. AMOUNT PER LIFTING (Tk)</th>
                    <th style="padding-left: 40px;padding-right: 40px;">AVG. LIFTING (AMOUNT) PER DAY (Tk)</th>


                </tr>
            </thead>
            <tr>

                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="commonModelBean.lift_count"/> </td>         
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="commonModelBean.lift_new_amount"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="commonModelBean.avg_new_amount_per_lift"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="commonModelBean.avg_new_lift_per_day"/>


            </tr>


        </table><br/><br/>



    </fieldset><br/>

    <%  }%>

    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {%>

    <fieldset >

        <legend  style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>Refund Report</b></legend>

        <br/><br/>
        <table  border="1"  id="tblData2"  >


            <thead style="background: #F8F8F8;">
                <tr>

                    <th colspan="4" style="padding-left: 20px;padding-right: 20px;background: #FFF9D4">Refund Report</th>


                </tr>
                <tr>

                    <th style="padding-left: 20px;padding-right: 20px;">REFUND COUNT</th>
                    <th style="padding-left: 20px;padding-right: 20px;">REFUND AMOUNT (Tk)</th>
                    <th style="padding-left: 40px;padding-right: 40px;">AVG. AMOUNT PER REFUND (Tk)</th>
                    <th style="padding-left: 40px;padding-right: 40px;">AVG. REFUND (AMOUNT) PER DAY (Tk)</th>


                </tr>
            </thead>
            <tr>

                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="commonModelBean.refund_count"/> </td>         
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="commonModelBean.refund_new_amount"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="commonModelBean.avg_new_amount_per_refund"/> </td>
                <td style="padding-left: 40px;padding-right: 40px;text-align: center;"><s:property value="commonModelBean.avg_new_refund_per_day"/>


            </tr>


        </table><br/><br/>





    </fieldset>

    <%  }%>




    <br/>




</center>

<%@ include file="/secure/bottom.jsp" %>