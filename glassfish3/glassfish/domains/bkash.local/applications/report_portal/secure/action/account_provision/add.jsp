<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String  pagename="Update Request - Accounts"; %>
<%@ include file= "/secure/top.jsp" %>

              <s:if test="hasActionErrors()">
      
            <s:actionerror/>
  
        </s:if>
            
          <s:property value="message" />
  
            
          <table>
        <s:form action="account_check" namespace="/secure/action/" method="post" name="Form" theme="simple">
            <tr> <td style="font-size:15;padding: 6px ;">    <label>Owner: </label></td><td><s:textfield name="owner" size="30" maxlength="30" required="true" key="owner"/><br/></td></tr>
         <tr>  <td style="font-size:15;padding: 6px ;">   <label>Wallet: </label></td><td><s:textfield name="wallet" size="11" maxlength="11" required="true" key="wallet"/><br/></td></tr>
         <tr><td></td><td></td></tr>
         <tr><td></td><td></td></tr>
         <tr>  <td style="font-size:15;padding: 6px ;">     <s:submit key="submit" value="Submit"/></td><td style="font-size:15;padding: 6px ;">
            <s:submit action="cancel" value="Cancel" name="Cancel"  onclick="form.onsubmit=null"/>  </td>  </tr>
                    
        </s:form>
            </table>
<%@ include file="/secure/bottom.jsp" %>