<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String  pagename="Update Request - Accounts"; %>
<%@ include file= "/secure/top.jsp" %>

              <s:if test="hasActionErrors()">
      
            <s:actionerror/>
  
        </s:if>
            
          <s:property value="message" />
  
          <table>

        <s:form action="account_form_submit" namespace="/secure/action/" method="post" name="Form" theme="simple">
            <tr> <td style="font-size:15;padding: 6px ;"><label>Owner: </label> </td><td style="font-size:15;padding: 6px ;"><s:property value="owner" /></td></tr>
            <tr> <td style="font-size:15;padding: 6px ;"><label>Wallet: </label> </td><td style="font-size:15;padding: 6px ;"><s:property value="wallet" /></td></tr>
            <tr> <td style="font-size:15;padding: 6px ;"> <label>Client code: </label> </td><td style="font-size:15;padding: 6px ;"><s:property value="client_code" /></td></tr>
            <tr> <td style="font-size:15;padding: 6px ;"><label>Account alias: </label></td><td style="font-size:15;padding: 6px ;"> <s:property value="account_alias" /></td></tr>
            <s:hidden property="wallet" name="wallet"/>
            <s:hidden property="owner" name="owner"/>
            <s:hidden property="client_code" name="client_code"/>
             <s:hidden property="account_alias" name="account_alias"/>
            <tr> <td style="font-size:15;padding: 6px ;"> <label>Role: </label></td><td>
             <select name="role" id="role" onchange="rolep()" class="searchSelect" property="role" >
                  <option value="Master Agent" selected="selected">Master Agent</option>
                                  <option value="Merchant">Merchant</option>
                                 
  
                                  </select> </td></tr>
                <tr> <td style="font-size:15;padding: 6px ;"><label>Product:</label></td><td>
                                  <select name="product" class="searchSelect" id="product" property="product">
                                   
                                  </select></td></tr>
             <tr> <td style="font-size:15;padding: 6px ;"> <label>SND access: </label></td><td>
             <select name="snd_access" id="snd_access" class="searchSelect" property="snd_access" >
                  <option value="Y" selected="selected">Yes</option>
                                  <option value="N">No</option>
                                 
  
                                  </select> </td></tr>
             
               <tr> <td style="font-size:15;padding: 6px ;">    <label>Distributor code: </label></td><td><s:textfield name="dist_code" size="30" maxlength="30" required="true" key="dist_code"/><br/></td></tr>
               <tr> <td style="font-size:15;padding: 6px ;">   <label>Disburse product: </label> </td><td> <s:select list="options" listKey="id" listValue="des" name="disb_prod" /><br/></td></tr>
                <tr> <td style="font-size:15;padding: 6px ;">    <label>Bulk base path: </label></td><td><s:textfield name="bulk_path" size="30" maxlength="30" required="true" key="bulk_path"/><br/></td></tr>
  <tr><td></td><td></td></tr>
         <tr><td></td><td></td></tr>
            <tr> <td style="font-size:15;padding: 6px ;">   <s:submit key="submit" value="Submit"/></td><td style="font-size:15;padding: 6px ;">
            <s:submit action="cancel" value="Cancel" name="Cancel"  onclick="form.onsubmit=null"/>  </td></tr>
                   
        </s:form>
       </table>
<%@ include file="/secure/bottom.jsp" %>