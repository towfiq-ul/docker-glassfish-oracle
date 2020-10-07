<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String  pagename="Money Disburse Request"; %>
<%@ include file= "/secure/top.jsp" %>

            
            
          
  
            

        <s:form action="disburse_option" namespace="/secure/action/" method="post" name="Form" theme="simple">
           
         
            <label style="font-size:15;padding: 6px ;">Select a disburse product :</label>  <s:select list="options" listKey="id" listValue="des" name="selectOption" label="Status" /><br/><br/>
         
            <s:submit key="submit" value="Submit"/>
            <s:submit action="cancel" value="Cancel" name="Cancel"  onclick="form.onsubmit=null"/>  
                    
        </s:form>
       
<%@ include file="/secure/bottom.jsp" %>