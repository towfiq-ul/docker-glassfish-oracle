<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<% String pagename = "BSA Info";%>
<%@ include file="/secure/top.jsp" %>


<s:if test="hasActionErrors()">

    <s:actionerror/>

</s:if>
<s:property value="message" />
<center>

    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {%>

    <!--
    <div style="text-align: left; font-size: 1em; color: #052b4d; font: Arial, sans-serif;">
        <b> Enter keyword to Search</b><br/>
        <input type="text" id="search"/>

        <br/>
    </div><br/>

    -->
    <div style="overflow:scroll; height:446px">

        <!--
        <table  border="0" class="tab tab-drag" id="tblData">
            <thead>
                <tr>
                    <th >Serial</th>

                    <th >BSA</th>
                    <th>BSA Channel</th>

                </tr>
            </thead>
            <tbody>
                <tr class="odd">

        <s:iterator value="cm_list" id="cm_list" >  
            <td><p><s:property value="counter"/></p></td>

            <td><p><s:property value="ct_RA"/></p></td>
            <td><p><s:property value="ct_RA_CHANNEL"/></p></td>



        </tr>

        </s:iterator>
    </tbody>

    <tfoot>
        <tr>
            <th>Serial</th>
            <th>BSA</th>
            <th>BSA Channel</th>

        </tr>
    </tfoot>
</table>
        -->


        <display:table name="cm_list"  pagesize="10" requestURI="/secure/action/bsacount" class="tab tab-drag" id="tblData" >
            <display:column property="counter" title="Serial" />
            <display:column property="ct_RA" title="BSA"/>
            <display:column property="ct_RA_CHANNEL" title="BSA Channel"/>

        </display:table>
    </div>

    <%  }%>




    <br/>

</center>

<%@ include file="/secure/bottom.jsp" %>