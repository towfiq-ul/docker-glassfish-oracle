

<head>

    <meta name="robots" content="all, follow" />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <title>Report Portal</title>   
    <script src="<%=request.getContextPath()%>/javascript/datetimepicker_css.js" type="text/javascript"></script>
    <%@ include file="/WEB-INF/includes/head/jquery.jsp" %>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/js/jquery/jquery-ui.css" />
    <script src="<%=request.getContextPath()%>/js/jquery/jquery-ui.js"></script>
    <link rel="shortcut icon" href="<%=request.getContextPath()%>/images/bkash.ico"/>
    <link href="<%=request.getContextPath()%>/css/default.css" rel="stylesheet" type="text/css" media="screen" />
    <link href="<%=request.getContextPath()%>/css/jquery.selectBoxIt.css" rel="stylesheet" type="text/css" media="screen" />
    <link href="<%=request.getContextPath()%>/css/grayred.css" rel="stylesheet" type="text/css" media="screen" />
    <link href="<%=request.getContextPath()%>/css/jquery.multiselect.css" rel="stylesheet" type="text/css" media="screen" />


    <script src="<%=request.getContextPath()%>/js/jquery/jquery.multiselect.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath()%>/javascript/date.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath()%>/js/json2.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath()%>/js/date.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath()%>/js/smoke/smoke.js"></script>
    <script src="<%=request.getContextPath()%>/js/jquery.selectBoxIt.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath()%>/js/bootstrap.js" type="text/javascript"></script>   





    <script>
        $(function() {
            $("#demo4").datepicker({dateFormat: 'dd-mm-yy',
                maxDate: "0d"
            });

            $("#multiple-select-ma").multiselect({
                height: 175,
                noneSelectedText: 'Select Wallet',
                classes: 'custom-ui-multiselect-header',
                closeIcon: '',
                click: function(event, ui) {
                    getRaListByMaWallet(getSelectedRas());
                },
                checkAll: function() {
                    $('input[name="multiselect_multiple-select-ma"]').each(function(i, v) {
                        $(v).addClass('selected');
                    });
                    getRaListByMaWallet(getSelectedRas());
                },
                uncheckAll: function() {
                    $('input[name="multiselect_multiple-select-ma"]').each(function(i, v) {
                        $(v).removeClass('selected');
                    });
                    getRaListByMaWallet(getSelectedRas());
                },
//                beforeclose: function() {
//                    getRaListByMaWallet(getSelectedRas());
//                }
            });

            $("#multiple-select").multiselect({
                height: 175,
                noneSelectedText: 'Select Wallet',
                classes: 'custom-ui-multiselect-header',
                closeIcon: '',
                checkAll: function() {
                    $('input[name="multiselect_multiple-select"]').each(function(i, v) {
                        $(v).addClass('selected');
                    });
                },
                uncheckAll: function() {
                    $('input[name="multiselect_multiple-select"]').each(function(i, v) {
                        $(v).removeClass('selected');
                    });
                }
            });

            $('#checkbox-MTD').on('change', function() {
                $('#datepicker_kyc_tr_startdate27').datepicker('setDate', null);
                $('#datepicker_kyc_tr_enddate27').datepicker('setDate', null);
            })

        });

    </script>
    <script type="text/javascript">
        function validateNIDForm() {
            var x = document.forms["NID_Form"]["nid_no"].value;
            if (x == null || x == "") {
                alert("NID must be filled out");
                return false;
            }
        }
        function validateIDForm() {
            var x = document.forms["ID_Form"]["photo_id_no"].value;
            var y = document.forms["ID_Form"]["photo_id_type"].value;
            if (x == null || x == "" || y == null || y == "") {
                alert("Photo ID/Type must be filled out");
                return false;
            }
            else if (y === 'National ID') {
                if (x.length === 13 || x.length === 17) {
                    if (x.length === 17) {
                        var year = x.substring(0, 2);
                        if (year !== '19') {
                            alert('Invalid National ID Number.ID Number must start with 19');
                            return false;
                        }
                    }
                }
                else {
                    alert("Invalid National ID Length.Length Must be 13/17 Digit");
                    return false;
                }
            }
        }
        function rolep() {

            var role = document.getElementById("role");
            var product = document.getElementById("product");
            var option1 = document.createElement("option");
            option1.text = "Channel Wallet";
            option1.value = "Channel Wallet";
            var option2 = document.createElement("option");
            option2.text = "Retail Merchant Wallet";
            option2.value = "Retail Merchant Wallet";
            var option3 = document.createElement("option");
            option3.text = "Mega Merchant Wallet";
            option3.value = "Mega Merchant Wallet";
            if (role.value == "Master Agent") {
                product.options.length = 0;
                product.add(option1, null);
            } else if (role.value == "Merchant") {
                product.options.length = 0;
                product.add(option2, null);
                product.add(option3, null);
            }
        }

        function rolepload() {


            var product = document.getElementById("product");
            var option1 = document.createElement("option");
            option1.text = "Channel Wallet";
            option1.value = "Channel Wallet";

            if (product) {
                product.options.length = 0;
                product.add(option1, null);
            }
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
                            window.location.replace("http://" + window.location.host + "<%=request.getContextPath()%>");
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
        });


    </script>

</head>   
<body onload="rolepload()">
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
                <script type="text/javascript">date();</script> - <a id="logout" href="<%=request.getContextPath()%>/secure/action/logout" >Logout</a> - 
                <a id="pwd_chng" href="<%=request.getContextPath()%>/secure/action/change" >Change password</a>
            </div>
            <!-- /#user -->  
        </div>
        <!-- /header -->
        <!-- #content -->
        <div id="content">

            <!-- breadcrumbs -->
            <div class="breadcrumbs">

            </div>
            <!-- /breadcrumbs -->



            <!-- box -->
            <div class="box">
                <div class="headlines">
                    <h2><span><%out.print(pagename);%></span></h2>
                </div>
                <div class="box-content">