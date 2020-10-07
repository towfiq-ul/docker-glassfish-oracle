<%-- 
    Document   : role_jsp
    Created on : Sep 17, 2012, 10:32:53 PM
    Author     : Badruddin_b0154
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%
    String[] allRoles = {"ADMINISTRATOR", "BSO", "SND", "CS", "DISTRIBUTOR", "QC", "FINANCE", "BSA", "AGENT","SalesOps","RSM","SM","TM"};
    int temp = 0;
    List userRoles = new ArrayList(allRoles.length);
    for (String role : allRoles) {
        if (request.isUserInRole(role)) {
            if (temp == 0) {
                out.print(role);

            } else {
                out.print(" , " + role);

            }
            temp++;
        }
    };
%>
