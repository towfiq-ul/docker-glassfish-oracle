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

            function validateForm()
            {
                var x = document.forms["registerForm"]["email"].value;
                var atpos = x.indexOf("@");
                var dotpos = x.lastIndexOf(".");
                if (atpos < 1 || dotpos < atpos + 2 || dotpos + 2 >= x.length)
                {
                    alert("Not a valid e-mail address");
                    return false;
                }
            }

            function isInteger(t)
            {
                var i;
                var ss;
                ss = document.getElementById(t).value;
                ss = ss.toString();
                for (i = 0; i < ss.length; i++)
                {
                    var c = ss.charAt(i);
                    if (isNaN(c))
                    {


                        document.getElementById(t).value = "";



                    }
                }



            }


            function mobilenumberformat(t)
            {
                var i;
                var ss;
                var it;
                ss = document.getElementById(t).value;
                ss = ss.toString();

                if (ss.length != 11) {
                    document.getElementById(t).value = "";
                    alert("Invalid Wallet Number format");
                    // oh what now?


                }




            }


            function checkwalletno(t)
            {


                var i;
                var ss;
                var it;
                ss = document.getElementById(t).value;
                ss = ss.toString();

                if (ss.length == 0) {


                    alert("Please Enter Wallet Number first");
                    return (false);
                }



                return true;
            }

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
                        fname: this.fname.value,
                        lname: this.lname.value,
                        email: this.email.value,
                        groups: this.groups.value,
                        wallet_no: this.wallet_no.value

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
                    <script type="text/javascript">date();</script> - <a id="logoutLink" href="<%=request.getContextPath()%>/secure/action/logout" >Logout</a>-
                    <a id="pwd_chng" href="<%=request.getContextPath()%>/secure/action/change" >Change password</a>
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
                        <h2><span>Register</span></h2>
                    </div>
                    <div class="box-content">
                        <div class="form-message help">
                            Please wait few seconds after you press 'Register' button.In some cases,it might take some time to complete the process.
                        </div> 
                        <div id="stat">
                        </div>
                        <div class="register">
                            <form id="registerForm" name="registerForm" action="<%=request.getContextPath()%>/services/auth/register" method="post" onsubmit="return checkwalletno('wallet_no') && validateForm()">
                                <fieldset>
                                    <legend>Registration Form</legend>

                                    <table>   
                                        <div>
                                            <tr> <th> <label for="fname">First Name: </label> </th><td>
                                                    <input type="text" id="fname" name="fname"/></td></tr>
                                        </div>
                                        <div>
                                            <tr> <th><label for="lname">Last Name: </label> </th><td>
                                                    <input type="text" id="lname" name="lname"/></td></tr>
                                        </div>

                                        <div>
                                            <tr> <th><label for="email">Email: </label> </th><td>
                                                    <input type="text" id="email" name="email"/></td></tr>
                                        </div>
                                        <div>
                                            <tr> <th><label for="email">Wallet Number: </label> </th><td>
                                                    <input type="text" id="wallet_no" name="wallet_no" onKeyup="isInteger('wallet_no')" onChange="mobilenumberformat('wallet_no')"/></td></tr>
                                        </div>
                                        <div>
                                            <tr> <th> <label for="groups">Group: </label> </th><td>
                                                    <select id="groups" name="groups">
                                                        <option value="ADMINISTRATOR">ADMINISTRATOR</option>
                                                        <option value="SND">SND</option>
                                                        <option value="DISTRIBUTOR">DISTRIBUTOR</option>

                                                        <option value="BSA">BSA</option>
                                                        <option value="AGENT">AGENT</option>
                                                        <option value="COMPLIANCE">COMPLIANCE</option>
                                                        <option value="SalesOps">SalesOps</option>
                                                        <option value="RSM">RSM</option>
                                                        <option value="SM">SM</option>
                                                        <option value="TM">TM</option>
                                                        
<!--                                                        <option value="QC">QC</option>-->

                                                    </select></td></tr>
                                        </div>

                                        <tr></tr>
                                        <div class="buttonRow">

                                            <tr> <td>  <input type="submit"  style="background: #413F3F repeat;color:#E0E0E0;height:25px;width: 80px;border: none;margin: 6px;padding: 3;" value="Register" /></td></tr>
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
                    <li class="first"><a href="<%=request.getContextPath()%>">Go Back</a></li>
                    <li><a href="Account.jsp">New Account</a></li>
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