<%-- 
    Document   : kycStatusReport
    Created on : May 29, 2013, 5:07:22 PM
    Author     : Hafizur_b0266
--%>

<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<% String pagename = "Wallet Balance Report";%>
<%@ include file="/secure/top.jsp" %>
<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>
    <fieldset >

        <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {%>

        &nbsp;Date Range (Format - DD/MON/YY) : <s:property value="datePickerBean.date_from"/> - <s:property value="datePickerBean.date_to"/>.   

        <s:if test='target=="DISTRIBUTOR1" || target=="SND1"'>
            <div style="overflow:auto; height:446px;">



                <display:table name="cm_list"  pagesize="10" requestURI="/secure/action/walletBalanceReport_result" class="tab tab-drag" id="tblData"   >
                    <display:column property="barca_dis_name" title="Distributor Name" />
                    <display:column property="barca_dis_wallet" title="Distributor Wallet"/>
                    <display:column property="barca_dis_wallet_balance" title="Distributor Wallet Balance"/>

                </display:table>

            </div>
        </s:if>

        <s:if test='target=="DISTRIBUTOR2" || target=="SND2"'>
            <div style="overflow:auto; height:446px;">



                <display:table name="cm_list"  pagesize="10" requestURI="/secure/action/walletBalanceReport_result" class="tab tab-drag" id="tblData"   >
                    <display:column property="barca_dis_name" title="Distributor Name" />
                    <display:column property="barca_dis_wallet" title="Distributor Wallet"/>
                    <display:column property="barca_ra_wallet" title="RA Wallet"/>

                    <display:column property="barca_ra_balance" title="RA Wallet Balance"/>

                </display:table>

            </div>        
        </s:if>
        <s:if test='target=="DISTRIBUTOR3" || target=="SND3"'>
            <div style="overflow:auto; height:446px;">



                <display:table name="cm_list"  pagesize="10" requestURI="/secure/action/walletBalanceReport_result" class="tab tab-drag" id="tblData"   >
                    <display:column property="barca_dis_name" title="Distributor Name" />
                    <display:column property="barca_dis_wallet" title="Distributor Wallet"/>
                    <display:column property="barca_agent_wallet" title="Agent Wallet"/>
                    <display:column property="barca_agent_shop_name" title="Agent Shop Name"/>

                    <display:column property="barca_agent_balance" title="Agent Wallet Balance"/>

                </display:table>

            </div>   
        </s:if>




        <%  }%>

    </fieldset>



    <br/>

</center>

<%@ include file="/secure/bottom.jsp" %>
