<%@page import="java.security.Principal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' 
           %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="cs" lang="cs">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="robots" content="all, follow" />
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <title>Report Portal</title>   
        <link rel="shortcut icon" href="<%=request.getContextPath()%>/images/bkash.ico"/>
        <link href="<%=request.getContextPath()%>/css/default.css" rel="stylesheet" type="text/css" media="screen" />
        <link href="<%=request.getContextPath()%>/css/grayred.css" rel="stylesheet" type="text/css" media="screen" />
        <script src="<%=request.getContextPath()%>/javascript/date.js" type="text/javascript"></script>
        <script src="<%=request.getContextPath()%>/js/json2.js" type="text/javascript"></script>

        <%@ include file="/WEB-INF/includes/head/jquery.jsp" %>

        <script type="text/javascript">
            $(function() {
                "use strict";
                $('#logoutLink').click(function() {

                    var destinationUrl = this.href;

                    $.ajax({
                        url: destinationUrl,
                        type: "GET",
                        cache: false,
                        dataType: "json",
                        success: function(data, textStatus, jqXHR) {
                            //alert("success");
                            if (data.status == "SUCCESS") {
                                //redirect to welcome page
                                window.location.replace("http://" + window.location.host + "<%=request.getContextPath()%>/welcome.jsp");
                            } else {
                                alert("failed");
                            }
                        },
                        error: function(jqXHR, textStatus, errorThrown) {
                            alert("error - HTTP STATUS: " + jqXHR.status);
                        },
                        complete: function(jqXHR, textStatus) {
                            //alert("complete");
                        }
                    });

                    return false;
                });
                $(document.forms['registerForm']).submit(function(event) {
                    var data = {
                        email: this.email.value,
                        groups: this.groups.value

                    };
                    var destinationUrl = this.action;

                    $.ajax({
                        url: destinationUrl,
                        type: "POST",
                        //data: data,
                        data: JSON.stringify(data),
                        contentType: "application/json",
                        cache: false,
                        dataType: "json",
                        success: function(data, textStatus, jqXHR) {
                            //alert("success");
                            if (data.status == "SUCCESS") {
                                //redirect to secured page
                                document.getElementById("registerForm").reset();

                                document.getElementById("stat").innerHTML = "<div class=\"form-message success\">" + "Action successful</div>";
                            } else {
                                document.getElementById("stat").innerHTML = "<div class=\"form-message error\">" + "Failed :" + data.errorMsg + "</div>";
                            }
                        },
                        error: function(jqXHR, textStatus, errorThrown) {
                            document.getElementById("stat").innerHTML = "<div class=\"form-message error\"> error - HTTP STATUS: " + jqXHR.status + "</div>";

                        },
                        complete: function(jqXHR, textStatus) {
                            //alert("complete");
                            //i.e. hide loading spinner
                        },
                        statusCode: {
                            404: function() {
                                alert("page not found");
                            }
                        }


                    });

                    //event.preventDefault();
                    return false;
                });


            });
        </script>

    </head>   
    <body>
        <!-- #main -->
        <div id="main">
            <!-- #header -->
            <div id="header"> 
                <!-- #logo --> 
                <div id="logo" style="color:#fff;font-weight:normal;font-size:23px;font-family: Verdana,Arial;padding:0 0 0 12px;">
                    Report Portal
                </div>
                <!-- /#logo -->
                <!-- #user -->                        
                <div id="user">
                    <h2><%out.print(request.getUserPrincipal().getName());%> <span>(<%@ include file="role.jsp" %>)</span></h2>
                    <script type="text/javascript">date();</script> - <a id="logoutLink" href="<%=request.getContextPath()%>/secure/action/logout" >Logout</a>
                </div>
                <!-- /#user -->  
            </div>
            <!-- /header -->
            <!-- #content -->
            <div id="content">

                <!-- breadcrumbs -->

                <!-- /breadcrumbs -->

                <!-- Warning form message -->            


                <!-- box -->
                <div class="box">
                    <div class="headlines">
                        <h2><span>Reset</span></h2>
                    </div>
                    <div class="box-content">

                        <div id="stat">
                        </div>

                        <div class="register">
                            <form id="registerForm" name="registerForm" action="<%=request.getContextPath()%>/services/auth/reset" method="post">
                                <fieldset>
                                    <legend>Reset</legend>



                                    <table>

                                        <div>
                                            <tr> <th> <label for="email">Email: </label></th> <td>
                                                    <input type="text" id="email" name="email"/></td></tr>
                                        </div>
                                        <div>
                                            <tr> <th><label for="groups">Group: </label> </th> <td>
                                                    <select id="groups" name="groups">
                                                        <option value="ADMINISTRATOR">ADMINISTRATOR</option>

                                                        <option value="BSO">BSO</option>
                                                        <option value="SND">SND</option>
                                                        <option value="FINANCE">FINANCE</option>

                                                    </select></td></tr>
                                        </div>


                                        <div class="buttonRow">
                                            <tr> <td> <input type="submit" value="Reset" /></td></tr>
                                        </div>
                                    </table>  
                                </fieldset>
                            </form> 
                        </div>

                        <br/><br/><br/>


                    </div><!-- /box-content -->
                </div>
                <!-- /box -->

            </div>
            <!-- /#content -->
            <!-- #sidebar -->
            <div id="sidebar">
                <div id="page-logo">
                    <img src="<%=request.getContextPath()%>/images/bkash_x140.jpg" />
                </div>

                <!-- mainmenu -->
                <ul id="floatMenu" class="mainmenu" style="top: 0px; ">
                    <li class="first"><a href="<%=request.getContextPath()%>">Home</a></li>
                    <li><a href="Account.jsp">Go Back</a></li>
                    <li><a href="Account_all.jsp">All Users</a></li>
                    <li><a href="Account_remove.jsp">Remove Account</a></li>


                </ul>       
                <!-- /.mainmenu -->

            </div>
            <!-- /#sidebar -->
            <!-- #footer -->
            <div id="footer">
                <p>© 2013 bKash Limited</p>
            </div>
            <!-- /#footer -->
        </div>
        <!-- /#main --> 
    </body>
</html>