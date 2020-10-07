<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Distributor wise all BSA Transaction Report";%>
<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <fieldset class="gradient">

        <legend style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>Distributor : <s:property value="commonModelBean.distributor_name"/>&nbsp;(<s:property value="wallet_no"/>) &nbsp; &nbsp; Total Rows : <s:property value="datePickerBean.counter"/>
                &nbsp; Month : <s:property value="month2"/>     
                </b> </legend>



        <%    if (request.isUserInRole("SND") || request.isUserInRole("DISTRIBUTOR")) {%>

        <p></p>

        <div style="text-align: left; font-size: 1em; color: #052b4d; font: Arial, sans-serif;">
            <b> Enter keyword to Search</b><br/>
            <input type="text" id="search"/>


        </div>
        <br/>
        <div style="overflow:auto; height:380px; width:999px"">

            <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8">
                    <tr>
                        <th  style="padding-left: 10px;padding-right: 10px;">SERIAL</th>
                        <th style="padding-left: 20px;padding-right: 20px;">WALLET NUMBER</th>
                        <th style="padding-left: 20px;padding-right: 20px;">CASH IN COUNT </th>
                        <th style="padding-left: 20px;padding-right: 20px;">CASH IN AMOUNT (TK)</th>
                        <th style="padding-left: 20px;padding-right: 20px;">CASH IN NET COMM.(TK)</th>

                        <th style="padding-left: 20px;padding-right: 20px;">CASH OUT COUNT </th>
                        <th style="padding-left: 20px;padding-right: 20px;">CASH OUT AMOUNT (TK)</th>
                        <th style="padding-left: 20px;padding-right: 20px;">CASH OUT NET COMM.(TK)</th>
                        <th style="padding-left: 20px;padding-right: 20px;">TOTAL TRx COUNT </th>
                        <th style="padding-left: 20px;padding-right: 20px;">TOTAL TRx AMOUNT (TK)</th>
                    </tr>
                </thead>
                <tbody>
                    <tr >

                        <s:iterator value="cm_list" id="cm_list" >  
                            <td style="text-align: center"><p><s:property value="counter"/></p></td>
                            <td style="padding-left: 5px;padding-right: 5px;text-align: center"><p><s:property value="bkdn_WALLET_NUMBER"/></p></td>
                            <td style="padding-left: 5px;padding-right: 5px;text-align: center"><p><s:property value="ccount"/></p></td>

                            <td style="padding-left: 5px;padding-right: 5px;text-align: center"><p><s:property value="camount"/></p></td>

                            <td style="padding-left: 5px;padding-right: 5px;text-align: center"><p><s:property value="new_ndc"/></p></td>

                            <td style="padding-left: 5px;padding-right: 5px;text-align: center"><p><s:property value="cocount"/></p></td>

                            <td style="padding-left: 5px;padding-right: 5px;text-align: center"><p><s:property value="coamount"/></p></td>

                            <td style="padding-left: 5px;padding-right: 5px;text-align: center"><p><s:property value="new_condc"/></p></td>

                            <td style="padding-left: 5px;padding-right: 5px;text-align: center"><p><s:property value="totalcount"/></p></td>

                            <td style="padding-left: 5px;padding-right: 5px;text-align: center"><p><s:property value="totalamount"/></p></td>
                        </tr>

                    </s:iterator>


                </tbody>


            </table>

        </div>

        <%  }%>

    </fieldset>



    <br/>

    <s:form action="/secure/action/exportbsaDetails">

            <s:hidden name="commonModelBean.param" value="number2" />

            <%--
            Wallet Number : <s:textfield name="datePickerBean.wallet_no" id="distwallet1" placeholder="Wallet Number" onKeyup="isInteger ('distwallet1')" onChange="mobilenumberformat ('distwallet1')"/>

            --%>

            

  
            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 130px;border: none;margin: 6px;padding: 3;" value="Export To Excel" />

        </s:form><br/>
</center>

<%@ include file="/secure/bottom.jsp" %>