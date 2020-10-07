<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String  pagename="Update Request - Users"; %>
<%@ include file= "/secure/top.jsp" %>

            
            
          
  
            

        <s:form action="user_add_update" namespace="/secure/action/" method="post" name="Form" theme="simple">
            <label>Email  : </label><s:textfield name="email" size="50" maxlength="50" required="true" key="email"/>
            <br/><br/><label>Level :(BDT.) </label>  <s:select list="options" listKey="id" listValue="des" name="selectOption" label="Status" /><br/><br/>
         
            <s:submit key="submit" value="Add"/>
            <s:submit action="cancel" value="Cancel" name="Cancel"  onclick="form.onsubmit=null"/>  
                    
        </s:form>
       
<%@ include file="/secure/bottom.jsp" %>