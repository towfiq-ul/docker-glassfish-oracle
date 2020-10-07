<%-- 
    Document   : rsm_tm_user_export
    Created on : Oct 31, 2016, 10:18:41 AM
    Author     : dni_shahinur
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.security.Principal"%>
<%@page import="com.bkash.model.usermanagement.TmRsmManagement"%>
<%@page import="com.bkash.model.usermanagement.dto.UserData"%>
<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String pagename = "Export User List";%>
<%
    SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy");
    Date date = new Date();
    String sDate = sdf.format(date);
    String reportFileName = "TM_RSM_ASM_LIST" + "_" + sDate;
    //Set File Name
    int count = TmRsmManagement.countData();
    List<UserData> users = TmRsmManagement.getListData(0 + "", count + "");
    response.setHeader("Content-Disposition", "attachment; filename=" + reportFileName + ".xls");
    out.println("<html><head><title>Hello</title></head>");
    out.println("<body style='font-family: Calibri; font-size:10pt;'>");
    out.println("<table  style='border: 1px solid black;border-collapse: collapse;'  border='1' bordercolor='black'>");
    out.println("<tr>");
    out.println("<th>Distributor Name</th>");
    out.println("<th>MA Wallet</th>");
    out.println("<th>RSM Email</th>");
    out.println("<th>ASM Email</th>");
    out.println("<th>TM Email</th>");
    out.println("</tr>");

    for (UserData user : users) {
        out.println("<tr>");
        out.println("<td>" + user.getDistributorName() + "</td>");
        out.println("<td>" + user.getMaWallet()+ "</td>");
        out.println("<td>" + user.getRsmEmail()+ "</td>");
        out.println("<td>" + user.getAsmEmail()+ "</td>");
        out.println("<td>" + user.getTmEmail()+ "</td>");
        out.println("</tr>");
    }
    out.println("</table>");
    out.println("</body>");
    out.println("</html>");
%>
