<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String  pagename="User Permission"; %>
<%@ include file="/secure/top.jsp" %>


<s:property value="message" />

<br/>
<center>
<a href="<%=request.getContextPath() %>/secure/action/user_edit">Add / Modify user access</a>
<br/><br/>
<table>
      <tr><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">User : </th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Min : (BDT.)</th><th style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;">Max : (BDT.)</th></tr>
<s:iterator value="data">
    <tr>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="user" /></td>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="min" /></td>
        <td style="font-size:15;padding: 9px ;border-bottom:2px solid #DEDED8;"> <s:property value="max" /></td>
 
    </tr>
</s:iterator>
</table>
</center>


<%@ include file="/secure/bottom.jsp" %>