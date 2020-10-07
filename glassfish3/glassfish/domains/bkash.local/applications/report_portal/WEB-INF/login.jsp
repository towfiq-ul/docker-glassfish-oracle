<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
         %><%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="cs" lang="cs">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

        <title>Report Portal</title>   
        <link rel="shortcut icon" href="<%=request.getContextPath()%>/images/bkash.ico"/>
        <link href="<%=request.getContextPath()%>/css/default.css" rel="stylesheet" type="text/css" media="screen"/>
        <link href="<%=request.getContextPath()%>/css/grayred.css" rel="stylesheet" type="text/css" media="screen"/>
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

                    Report Generation Portal
                </div>
                <!-- /#user -->  
            </div>
            <!-- /header -->
            <!-- #content -->
            <div id="content">

                <div id="login-logo">
                    <img src="<%=request.getContextPath()%>/images/bkash_x140.jpg" />
                </div>

                <div class="box-cols" style="margin-left:180px;">
                    <div class="box box-col">
                        <div class="headlines" >
                            <h2 ><span>Login</span></h2>
                        </div>
                        <div class="box-content">
                            <form class="formBox" action="j_security_check" method="POST">

                                <fieldset>
                                    <div class="clearfix">                    
                                        <div class="lab"><label for="input-col">Email</label></div>
                                        <div class="con"><input type="text" class="input"  name="j_username" ></div>
                                    </div>
                                    <div class="clearfix">
                                        <div class="lab"><label for="textarea-col">Password</label></div>
                                        <div class="con"><input type="password" class="input"  name="j_password"></div>
                                    </div>
                                    <div class="btn-submit" ><!-- Submit form -->
                                        <input type="submit" value="Login" class="button"/>
                                    </div>
                                </fieldset>
                            </form>   
                            <!-- Warning form message -->            
                            <div class="form-message warning">
                                You are attempting to access a resource which is restricted.
                                Repeated failed login attempts will result in lock out.
                            </div>  

                         
                            <div class="form-message help">
                                For best performance use Google Chrome or Mozilla Firefox.
                            </div>
                            <div id="footer"><p>© 2013 bKash Limited</p></div>            
                        </div>
                    </div>


                </div>


            </div>
            <!-- /#content -->

            <!-- #footer -->

            <!-- /#footer -->
        </div>
        <!-- /#main --> 
    </body>
</html>