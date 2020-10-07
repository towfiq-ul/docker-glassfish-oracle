<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String  pagename="Money Disburse Request"; %>
<%@ include file= "/secure/top.jsp" %>

            
            
          
      <s:if test="hasActionErrors()">
      
            <s:actionerror/>
  
        </s:if>
            
          <s:property value="message" />
       
     
        <s:form action="disburse_opt" namespace="/secure/action/" method="post" name="Form" theme="simple">
              <table>   
                  <tr><td style="font-size:15;padding: 6px ;"><label>Product Name: </label></td><td style="font-size:15;padding: 6px ;"><s:property value="product_name" /></td></tr>
            <s:hidden property="product" name="product"/>
            <tr><td style="font-size:15;padding: 6px ;"><label>Account:</label> </td><td style="font-size:15;padding: 6px ;"> <s:select list="options" listKey="id" listValue="des" name="selectOption" label="Status" onChange="document.getElementById('wallet').innerHTML=this.value;"/></td></tr>
            <tr><td style="font-size:15;padding: 6px ;"><label>Wallet: </td><td style="font-size:15;padding: 6px ;"></label><div id="wallet"></div></td></tr>
            <tr><td style="font-size:15;padding: 6px ;"><label>Total Amount :</label> </td><td style="font-size:15;padding: 6px ;"> <s:textfield name="amount_taka" size="30" maxlength="30" required="true" key="amount_taka" onChange="document.getElementById('amount_paisa').value='00';" /> . <s:textfield name="amount_paisa" id="amount_paisa" size="2" maxlength="2" required="true" key="amount_paisa"/> <s:property value="user_limit" /></td></tr>
      </table> <br/><s:submit key="submit" value="Submit"/>
            <s:submit action="cancel" value="Cancel" name="Cancel"  onclick="form.onsubmit=null"/>         
        </s:form>
       
<%@ include file="/secure/bottom.jsp" %>