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

        <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-1.9.1.js"></script>

        <script src="<%=request.getContextPath()%>/resources/jtable/jquery-ui-1.9.2.custom.min.js" type="text/javascript"></script>
        <link href="<%=request.getContextPath()%>/resources/jtable/jquery-ui-1.9.2.custom.min.css" rel="stylesheet" type="text/css" />
        <link href="<%=request.getContextPath()%>/resources/jtable/themes/metro/blue/jtable.css" rel="stylesheet" type="text/css" />
        <script src="<%=request.getContextPath()%>/resources/jtable/jquery.jtable.js" type="text/javascript"></script>

        <script type="text/javascript">
            $(document).ready(function() {
                //  alert('Hi index.js is alive');
                loadJTableUserMappingData();
            });

            function loadJTableUserMappingData() {
                $('#jTableCrud').jtable({
                    title: 'User Mapping Table',
                    paging: true, //Enable paging
                    pageSize: 10, //Set page size (default: 10)
                    actions: {
                        listAction: '<%=request.getContextPath()%>/services/auth/tm_list',
                        createAction: '<%=request.getContextPath()%>/services/auth/tm_create',
                        updateAction: '<%=request.getContextPath()%>/services/auth/tm_update',
                        deleteAction: '<%=request.getContextPath()%>/services/auth/tm_delete'
                    },
                    toolbar: {
                        items: [{
                                tooltip: 'Click here to export this table to excel',
                                icon: '<%=request.getContextPath()%>/resources/images/excel-icon.png',
                                text: 'Export to Excel',
                                click: function() {
                                    window.location = "<%=request.getContextPath()%>/secure/action/export_tm_rsm_list";

                                }
                            }]
                    },
                    fields: {
                        id: {
                            title: 'ID',
                            key: true,
                            create: false,
                            edit: false,
                            list: false
                        },
                        distributorName: {
                            title: 'Distributor Name'
//                            width: '15%'
                        },
                        maWallet: {
                            title: 'MA Wallet'
                        },
                        rsmEmail: {
                            title: 'RSM Email'
                        },
                        asmEmail: {
                            title: 'ASM Email'
                        },
                        tmEmail: {
                            title: 'TM Email'
                        }
                    }
                });
                $('#jTableCrud').jtable('load');
            }
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
                <div class="box_new">
                    <!--<center>-->
                    <div id="jTableCrud">

                    </div>
                    <!--</center>-->
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
                    <li class="first"><a href="<%=request.getContextPath()%>/secure/action/dashboard">Dashboard</a></li>

                </ul>       
                <!-- /.mainmenu -->

            </div>
            <!-- /#sidebar -->
            <!-- #footer -->
            <div id="footer">
                <!--<p>© 2013 bKash Limited</p>-->
            </div>
            <!-- /#footer -->
        </div>
        <!-- /#main --> 
    </body>
</html>