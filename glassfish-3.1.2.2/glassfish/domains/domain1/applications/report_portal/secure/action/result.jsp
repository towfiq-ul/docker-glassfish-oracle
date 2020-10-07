<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String  pagename="Info"; %>
<%@ include file="/secure/top.jsp" %>
  <s:if test="hasActionErrors()">
      
        <b>    <s:actionerror/></b>
  
        </s:if>
 <b style="display: inline;width:100px"><s:property value="message" /></b>

<%@ include file="/secure/bottom.jsp" %>