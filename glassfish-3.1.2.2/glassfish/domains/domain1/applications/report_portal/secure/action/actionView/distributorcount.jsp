<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Distributor Info";%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@ include file="/secure/top.jsp" %>


<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>

    <%    if (request.isUserInRole("SND")) {%>

    <!--
    <div style="text-align: left; font-size: 1em; color: #052b4d; font: Arial, sans-serif;">
        <b> Enter keyword to Search</b><br/>
        <input type="text" id="search"/>

        <br/>
    </div><br/>
    -->
    <div style="overflow:scroll; height:446px">
        <!--
        <table  class="tab tab-drag" id="tblData" >
            <thead>
                <tr>
                    <th >Serial</th>
                    <th >Distributor</th>
                    <th>Distributor Channel</th>

                </tr>
            </thead>
            <tbody>
                <tr class="odd">

        <s:iterator value="cm_list" id="cm_list" >
            <td><p><s:property value="counter"/></p></td>
            <td><p><s:property value="ct_MA_WALLET"/></p></td>
            <td><p><s:property value="bkdn_CHANNEL"/></p></td>



        </tr>

        </s:iterator>
    </tbody>

    <tfoot>
        <tr>
            <th>Serial</th>
            <th>Distributor</th>
            <th>Distributor Channel</th>

        </tr>
    </tfoot>
</table>
        -->

        <display:table name="cm_list"  pagesize="10" requestURI="/secure/action/distributorcount" class="tab tab-drag" id="tblData" >
            <display:column property="counter" title="Serial" />
            <display:column property="ct_MA_WALLET" title="Distributor"/>
            <display:column property="bkdn_CHANNEL" title="Distributor Channel"/>

        </display:table>
    </div>



    <%  }%>




    <br/>

</center>

<%@ include file="/secure/bottom.jsp" %>