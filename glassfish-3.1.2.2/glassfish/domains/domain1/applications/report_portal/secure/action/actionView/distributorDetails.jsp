<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<% String pagename = "All Distributor Transaction Report";%>
<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <fieldset>


        <legend style="font-size: 1em;color: #052b4d; font: Arial, sans-serif;"><b>Total Rows : <s:property value="datePickerBean.counter"/>
                &nbsp; Month  : <s:property value="month"/>
            </b> </legend>


        <%    if (request.isUserInRole("SND")) {%>

        <p></p>

        <div style="text-align: left; font-size: 1em; color: #052b4d; font: Arial, sans-serif;">
            <b> Enter keyword to Search</b><br/>
            <input type="text" id="search"/>


        </div>
        <br/>

        <!-- i will put distributordetails here -->
        <div style="overflow:auto; height:380px; width:999px">


            <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8;">
                    <tr>
                        <th  style="padding-left: 20px;padding-right: 20px;">SERIAL</th>
                        <th style="padding-left: 60px;padding-right: 60px;">WALLET NUMBER</th>
                        <th style="padding-left: 60px;padding-right: 60px;">NAME</th>
                        <th style="padding-left: 40px;padding-right: 40px;">CASH IN COUNT </th>
                        <th style="padding-left: 40px;padding-right: 40px;">CASH IN AMOUNT (TK)</th>
                        <th style="padding-left: 40px;padding-right: 40px;">CASH IN NET COMM. (TK)</th>

                        <th style="padding-left: 40px;padding-right: 40px;">CASH OUT COUNT </th>
                        <th style="padding-left: 40px;padding-right: 40px;">CASH OUT AMOUNT (TK)</th>
                        <th style="padding-left: 40px;padding-right: 40px;">CASH OUT NET COMM. (TK)</th>
                        <th style="padding-left:40px;padding-right: 40px;">TOTAL TRx COUNT </th>
                        <th style="padding-left: 40px;padding-right: 40px;">TOTAL TRx AMOUNT (TK)</th>
                    </tr>
                </thead>
                <tbody>
                    <tr >

                        <s:iterator value="cm_list" id="cm_list" >  
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="counter"/></p></td>
                            <td style="padding-left: 60px;padding-right: 60px;text-align: center"><p><s:property value="bkdn_WALLET_NUMBER"/></p></td>
                            <td style="padding-left: 60px;padding-right: 60px;text-align: center"><p><s:property value="bkdn_CHANNEL"/></p></td>
                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="amp_CASHIN_COUNT"/></p></td>

                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="amp_CASHIN_AMOUNT"/></p></td>

                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="amp_ndc"/></p></td>

                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="amp_CASHOUT_COUNT"/></p></td>

                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="amp_CASHOUT_AMOUNT"/></p></td>

                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="co_amp_ndc"/></p></td>

                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="total_count"/></p></td>

                            <td style="padding-left: 40px;padding-right: 40px;text-align: center"><p><s:property value="total_amount"/></p></td>
                        </tr>

                    </s:iterator>


                </tbody>


            </table>


            <!--
            <display:table name="cm_list"  pagesize="10" requestURI="/secure/action/distributorDetails" cellpadding="10px" class="tab tab-drag" id="tblData" >
                <display:column property="counter" title="SERIAL" style="text-align: center;padding-right:15px;"/>
                <display:column property="bkdn_WALLET_NUMBER" title="WALLET NUMBER" style="text-align: center;padding-right:15px;"/>
                <display:column property="bkdn_CHANNEL" title="NAME" style="text-align: center;"/>
                <display:column property="amp_CASHIN_COUNT" title="CASH IN COUNT" style="text-align: center;"/>
                <display:column property="amp_CASHIN_AMOUNT" title="CASH IN AMOUNT" style="text-align: center;"/>
                <display:column property="amp_ndc" title="CASH IN NET COMM." style="text-align: center;"/>

                <display:column property="amp_CASHOUT_COUNT" title="CASH OUT COUNT" style="text-align: center;"/>                
                <display:column property="amp_CASHOUT_AMOUNT" title="CASH OUT AMOUNT" style="text-align: center;"/>
                <display:column property="co_amp_ndc" title="CASH OUT NET COMM." style="text-align: center;"/>                
                <display:column property="total_count" title="TOTAL TRx COUNT" style="text-align: center;"/>                
                <display:column property="total_amount" title="TOTAL TRx AMOUNT" style="text-align: center;"/>                



            </display:table>

            -->
        </div>


        <%  }%>

    </fieldset>



    <br/>
            <s:form action="/secure/action/exportUser">

            <s:hidden name="commonModelBean.param" value="number2" />

            <%--
            Wallet Number : <s:textfield name="datePickerBean.wallet_no" id="distwallet1" placeholder="Wallet Number" onKeyup="isInteger ('distwallet1')" onChange="mobilenumberformat ('distwallet1')"/>

            --%>

            

  
            <s:submit  style="background: #413F3F repeat;color:#E0E0E0;width: 150px;border: none;margin: 6px;padding: 3;" value="Export To Excel" />

        </s:form><br/>
   
</center>

<%@ include file="/secure/bottom.jsp" %>