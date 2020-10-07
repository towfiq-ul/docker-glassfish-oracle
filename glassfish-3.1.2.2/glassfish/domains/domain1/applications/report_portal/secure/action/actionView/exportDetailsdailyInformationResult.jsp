<%-- 
    Document   : exportDetailsdailyInformationResult
    Created on : Jul 24, 2013, 10:43:25 AM
    Author     : Hafizur_b0266
--%>



<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Detailed Daily Agent Transaction Report";%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <fieldset class="gradient">





        <%    if (request.isUserInRole("SND")) {%>

        <b> Start Date  : <s:property value="from_date"/> &nbsp;&nbsp End Date:<s:property value="to_date"/>     
            &nbsp;  Distributor  : <s:property value="wallet_no"/>&nbsp; (<s:property value="commonModelBean.channel"/>)
            &nbsp;  BSA  : <s:property value="wallet_no_bsa"/></b>

        <%  }%>

        <%    if (request.isUserInRole("DISTRIBUTOR")) {%>

        Date (Format - DD-MM-Y) : <s:property value="datePickerBean.datepicker"/>     
        &nbsp;  BSA Wallet Number : <s:property value="datePickerBean.wallet_no_bsa"/>

        <%  }%>

        <%    if (request.isUserInRole("BSA")) {%>

        Date (Format - DD-MM-Y) : <s:property value="datePickerBean.datepicker"/>     


        <%  }%>
        <p></p>


        <br/>

        <div style="overflow:auto; height:380px; width:999px">


            <table  border ="1" id="tblData" >
                <thead style="background: #F8F8F8;">
                    <tr >
                        <th  style="padding-left: 20px;padding-right: 20px;">AGENT</th>
                        <th style="padding-left: 40px;padding-right: 40px;">DATE</th>
                        <th style="padding-left: 10px;padding-right: 10px;">CI COUNT</th>
                        <th style="padding-left: 10px;padding-right: 10px;">CI AMOUNT</th>
                        <th style="padding-left: 10px;padding-right: 10px;">CI COMM.</th>
                        <th style="padding-left: 10px;padding-right: 10px;">CO COUNT</th>

                        <th style="padding-left: 10px;padding-right: 10px;">CO AMOUNT</th>
                        <th style="padding-left: 10px;padding-right: 10px;">CO COMM.</th>
                        <th style="padding-left: 10px;padding-right: 10px;">TOTAL COUNT</th>
                        <th style="padding-left: 10px;padding-right: 10px;">TOTAL AMOUNT</th>
                        <th style="padding-left: 10px;padding-right: 10px;">TOTAL COMM.</th>
                    </tr>
                </thead>
                <tbody>
                    <tr >

                        <s:iterator value="cm_list" id="cm_list" >  
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="agent"/></p></td>
                            <td style="padding-left: 20px;padding-right: 20px;text-align: center"><p><s:property value="date"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="ci_count"/></p></td>
                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="ci_amount"/></p></td>

                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="ci_comm"/></p></td>

                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="co_count"/></p></td>

                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="co_amount"/></p></td>

                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="co_comm"/></p></td>

                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="total_Count"/></p></td>

                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="total_Amount"/></p></td>

                            <td style="padding-left: 10px;padding-right: 10px;text-align: center"><p><s:property value="total_Comm"/></p></td>
                        </tr>

                    </s:iterator>


                </tbody>


            </table>


        </div>

        <!--

        <display:table name="cm_list"  pagesize="10" requestURI="/secure/action/detailsDailyInformationResult"  class="tab tab-drag" id="tblData"  >
            <display:column property="agent" title="AGENT" />

            <display:column property="date" title="DATE" />

            <display:column property="ci_count" title="CI COUNT"/>
            <display:column property="ci_amount" title="CI AMOUNT"/>
            <display:column property="ci_comm" title="CI COMM."/>
            <display:column property="co_count" title="CO COUNT"/>
            <display:column property="co_amount" title="CO AMOUNT"/>

            <display:column property="co_comm" title="CO COMM."/>
            <display:column property="total_Count" title="TOTAL COUNT"/>
            <display:column property="total_Amount" title="TOTAL AMOUNT"/>

            <display:column property="total_Comm" title="TOTAL COMM."/>




        </display:table>



        -->

    </fieldset>



    <br/>

</center>

