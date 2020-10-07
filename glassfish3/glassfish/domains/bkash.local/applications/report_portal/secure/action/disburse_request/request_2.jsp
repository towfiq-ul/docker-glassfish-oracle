<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String  pagename="Money Disburse Request"; %>
<%@ include file= "/secure/top.jsp" %>

            
            
          
      <s:if test="hasActionErrors()">
      
            <s:actionerror/>
  
        </s:if>
            
          <s:property value="message" />
       
     
        <s:form action="disburse_req" namespace="/secure/action/" method="post" theme="simple" enctype="multipart/form-data">
              <table>  
                  <tr><td style="font-size:15;padding: 6px ;"><label>Batch Id: </label></td><td style="font-size:15;padding: 6px ;"><s:property value="batch_id" /></td></tr>
                  <tr><td style="font-size:15;padding: 6px ;"><label>Product Name: </label></td><td style="font-size:15;padding: 6px ;"><s:property value="product_name" /></td></tr>
            <s:hidden property="product" name="product"/>
            <s:hidden property="wallet" name="wallet"/>
            <s:hidden property="account_alias" name="account_alias"/>
            <s:hidden property="total_amount" name="total_amount"/>
           <s:hidden property="amount_in_word" name="amount_in_word"/>
           <s:hidden property="batch_id" name="batch_id"/>
           <s:hidden property="fee_amount" name="fee_amount"/>
            <tr><td style="font-size:15;padding: 6px ;"><label>Wallet: </td><td style="font-size:15;padding: 6px ;"></label><s:property value="wallet" /></td></tr>
            <tr><td style="font-size:15;padding: 6px ;"><label>Total Amount :</label> </td><td style="font-size:15;padding: 6px ;"> <s:property value="amount_taka" />.<s:property value="amount_paisa" /></td> </tr>
                        <tr><td style="font-size:15;padding: 6px ;"><label>Fee Amount:</label> </td><td style="font-size:15;padding: 6px ;"><s:property value="fee_amount" /></td> </tr>

           
            <tr><td style="font-size:15;padding: 6px ;"><label>Total Amount to be deducted:</label> </td><td style="font-size:15;padding: 6px ;"> <s:property value="total_amount_fee" /></td> </tr>
             <tr><td style="font-size:15;padding: 6px ;"><label>In words:</label> </td><td style="font-size:15;padding: 6px ;"> <s:property value="amount_in_word" /></td> </tr>
             <tr><td style="font-size:15;padding: 6px ;"><label>Reason:</label> </td><td style="font-size:15;padding: 6px ;"> <s:textfield name="reason" size="30" maxlength="30" required="true" key="reason" /> </td></tr>
             <tr><td style="font-size:15;padding: 6px ;"><label>Bank Name:</label> </td><td style="font-size:15;padding: 6px ;"> <s:textfield name="bank_name" size="30" maxlength="30" required="true" key="bank_name" /> </td></tr>
              <tr><td style="font-size:15;padding: 6px ;"><label>Bank Account:</label> </td><td style="font-size:15;padding: 6px ;"> <s:textfield name="bank_account" size="30" maxlength="30" required="true" key="bank_account" /> </td></tr>
                <tr><td style="font-size:15;padding: 6px ;"><label>Beneficiary File:</label> </td><td style="font-size:15;padding: 6px ;"> <s:file name="userFile" />(*.csv or *.txt format and 10,000 entries)</td></tr>
          </table> <br/>
          <fieldset>
              <legend>File Content Sample</legend>
                01800000000,400.00<br/>
                01800000001,100.00<br/>
                01800000002,300.00<br/>
                01800000003,400.00<br/>
                ...
          </fieldset><br/>
          <s:submit key="submit" value="Submit"/>
            <s:submit action="cancel" value="Cancel" name="Cancel"  onclick="form.onsubmit=null"/> 
                   
        </s:form>
       
<%@ include file="/secure/bottom.jsp" %>