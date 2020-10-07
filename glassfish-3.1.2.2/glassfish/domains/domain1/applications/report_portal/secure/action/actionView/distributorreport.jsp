<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Specific Distributor Transaction Report";%>
<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>

    <%    if (request.isUserInRole("SND")) {%>

    <fieldset class="gradient">

        <legend></legend>
        <b >Distributor  : <s:property value="datePickerBean.name"/>&nbsp;(<s:property value="datePickerBean.wallet_no"/>)&nbsp; &nbsp; Month : <s:property value="datePickerBean.dp_month"/>  </b><br/>


    </fieldset><br/><br/><br/>

    <%  }%>
    <%    if (request.isUserInRole("SND")) {%>



    <table  border="1"  id="tblData1" >
        <thead style="background: #F8F8F8;">
            <tr>
                <th ></th>
                <th>TRANSACTION COUNT</th>
                <th>TRANSACTION AMOUNT (Tk)</th>
                <th>GROSS DISTRIBUTOR COMMISSION (Tk)</th>
                <th>AIT (10%) (Tk)</th>
                <th>NET DISTRIBUTOR COMMISSION (Tk)</th>
            </tr>
        </thead>
        <tbody>
            <tr >

                <td style="text-align: center;padding: 5px 25px 5px 25px;"><p>CASH IN</p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.ccount"/></p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.camount"/></p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.ccomm"/></p></td>

                <td style="text-align: center"><p><s:property value="commonModelBean.new_ait"/></p></td>

                <td style="text-align: center"><p><s:property value="commonModelBean.new_ndc"/></p></td>




            </tr>

            <tr >

                <td style="text-align: center;padding: 5px 25px 5px 25px;"><p>CASH OUT</p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.cocount"/></p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.coamount"/></p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.cocomm"/></p></td>

                <td style="text-align: center"><p><s:property value="commonModelBean.new_coait"/></p></td>

                <td style="text-align: center"><p><s:property value="commonModelBean.new_condc"/></p></td>




            </tr>

            <tr >

                <td style="text-align: center;padding: 5px 25px 5px 25px;"><p>TOTAL</p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.totalcount"/></p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.totalamount"/></p></td>
                <td style="text-align: center"><p><s:property value="commonModelBean.totalcomm"/></p></td>

                <td style="text-align: center"><p><s:property value="commonModelBean.totalait"/></p></td>

                <td style="text-align: center"><p><s:property value="commonModelBean.totatlndc"/></p></td>




            </tr>

        </tbody>


    </table>




    <%  }%>



    <br/>

</center>

<%@ include file="/secure/bottom.jsp" %>