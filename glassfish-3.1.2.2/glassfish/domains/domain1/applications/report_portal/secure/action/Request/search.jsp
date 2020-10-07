<%@ page language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String  pagename="Search"; %>
<%@ include file= "/secure/top.jsp" %>

            
            
          
  
            

        <s:form action="entries" namespace="/secure/action/" method="post" name="Form" theme="simple">
             <table>
                       <tr>
                           <td style="font-size:15;padding: 6px ;">
                               <label>Source Wallet No:</label></td><td style="font-size:15;padding: 6px ;"><input type="text" id="twotabsearchtextbox" maxlength="11" name="wallet" value="" /></td> </tr> 
                 <tr><td style="font-size:15;padding: 6px ;">or</td></tr><tr><td style="font-size:15;padding: 6px ;"><label>by Date type:</label></td><td style="font-size:15;padding: 6px ;">
                     <input type="radio" name="date_type" id="date_type" value="requested" checked="checked"/>Requested on
                      <input type="radio" name="date_type" id="date_type" value="changed"/>Last updated
                     </td></tr>
                       <tr><td style="font-size:15;padding: 6px ;">
                            <label>Date (dd-mm-yyyy):</label></td><td style="font-size:15;padding: 6px ;">
                            <input type="Text" name="date" id="demo4" maxlength="25" readonly="true"  />
                    
                                                   </td>
                       </tr>
                       <tr><td style="font-size:15;padding: 6px ;"><label>Request type:</label></td><td style="font-size:15;padding: 6px ;">
                           <select name="exec_stat">
                 <option value="none">All</option>
                 <option value="0002">Pending at Finance</option>
                 <option value="0004">In Process</option>
                 <option value="0000">Successful</option>
                 <option value="0031">Rejected or Failed</option>
</select>
                           </td></tr>
                       <tr><td style="font-size:15;padding: 6px ;"><br/></td></tr>
                      </table>
            <s:submit key="submit" value="Search"/>
            <s:submit action="cancel" value="Cancel" name="Cancel"  onclick="form.onsubmit=null"/>  
                    
        </s:form>
       
<%@ include file="/secure/bottom.jsp" %>