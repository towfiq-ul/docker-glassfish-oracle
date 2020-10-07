<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<% String pagename = "Agent Info";%>
<%@ include file="/secure/top.jsp" %>



<s:property value="message" />


<%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("BSA") || request.isUserInRole("SND")) {%>

<center>


    <div style="overflow:scroll; height:446px">
        <!--
            <table  class="tab tab-drag" id="tblData" >
                <thead >
                    <tr >
                        <th >Serial</th>
                        <th >Agent</th>
                        <th >Shop Name</th>
        
                    </tr>
                </thead>
                <tbody>
        
                    <tr class="odd">
        
        <s:iterator value="cm_list" id="cm_list" > 
            <td><p><s:property value="counter"/></p></td>
            <td><p><s:property value="ct_AGENT"/></p></td>
            <td><p><s:property value="ct_AGENT_CHANNEL"/></p></td>
    
    
    
        </tr>
    
        </s:iterator>
    </tbody>
    
    <tfoot>
        <tr>
            <th>Serial</th>
            <th>Agent</th>
            <th>Shop Name</th>
    
        </tr>
    </tfoot>
    </table>
    
    
        -->

        <display:table name="cm_list"  pagesize="10" requestURI="/secure/action/agentcount" class="tab tab-drag" id="tblData" >
            <display:column property="counter" title="Serial" />
            <display:column property="ct_AGENT" title="Agent"/>
            <display:column property="ct_AGENT_CHANNEL" title="Shop Name"/>

        </display:table>

    </div>



    <%  }%>





    <br/>

</center>


<%@ include file="/secure/bottom.jsp" %>