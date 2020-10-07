<%-- 
    Document   : logout
    Created on : Jun 2, 2016, 11:04:20 AM
    Author     : dni_shahinur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    request.getSession().invalidate();
    response.sendRedirect(request.getContextPath());

%>
