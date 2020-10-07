<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String  pagename="Money Disburse Request"; %>
<%@ include file= "/secure/top.jsp" %>

            
            
          
      <s:if test="hasActionErrors()">
      
            <s:actionerror/>
  
        </s:if>
            
<p style="font-size:15;padding: 6px ;"><b><s:property value="message" /></b></p>
       
     
       
              <table>  
                  <tr><td style="font-size:15;padding: 6px ;"><label>Batch Id: </label></td><td style="font-size:15;padding: 6px ;"><s:property value="batch_id" /></td></tr>
                  <tr><td style="font-size:15;padding: 6px ;"><label>Product Name: </label></td><td style="font-size:15;padding: 6px ;"><s:property value="product_name" /></td></tr>
         
            <tr><td style="font-size:15;padding: 6px ;"><label>Wallet: </td><td style="font-size:15;padding: 6px ;"></label><s:property value="wallet" /></td></tr>
           
                        <tr><td style="font-size:15;padding: 6px ;"><label>Fee Amount:</label> </td><td style="font-size:15;padding: 6px ;"><s:property value="fee_amount" /></td> </tr>

           
            <tr><td style="font-size:15;padding: 6px ;"><label>Total Amount to be deducted:</label> </td><td style="font-size:15;padding: 6px ;"> <s:property value="total_amount_fee" /></td> </tr>
             <tr><td style="font-size:15;padding: 6px ;"><label>In words:</label> </td><td style="font-size:15;padding: 6px ;"> <s:property value="amount_in_word" /></td> </tr>
             <tr><td style="font-size:15;padding: 6px ;"><label>Reason:</label> </td><td style="font-size:15;padding: 6px ;">  <s:property value="reason" /></td></tr>
             <tr><td style="font-size:15;padding: 6px ;"><label>Bank Name:</label> </td><td style="font-size:15;padding: 6px ;">  <s:property value="bank_name" /> </td></tr>
              <tr><td style="font-size:15;padding: 6px ;"><label>Bank Account:</label> </td><td style="font-size:15;padding: 6px ;">  <s:property value="bank_account" /></td></tr>
                <tr><td style="font-size:15;padding: 6px ;"><label>File:</label> </td><td style="font-size:15;padding: 6px ;">  <s:property value="userFileFileName" /></td></tr>
                <tr><td style="font-size:15;padding: 6px ;"><label>Beneficiary Sample Text:</label> </td><td style="font-size:15;padding: 6px ;">  <s:property value="notif_text" /></td></tr>
          </table> <br/>
       
<%@ include file="/secure/bottom.jsp" %>