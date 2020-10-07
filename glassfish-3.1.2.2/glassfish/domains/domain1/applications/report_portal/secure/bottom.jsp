



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
    <%@ include file="/secure/menu.jsp" %>
    <%@  page import="java.util.Calendar" %> 
    <!-- /.mainmenu -->

</div>
<!-- /#sidebar -->
<!-- #footer -->

<!-- /#footer -->
</div>
<!-- /#main --> 

<script>

    $(function() {


        function validdate(a, b) {
            var startDate = document.getElementById(a).value;
            var endDate = document.getElementById(b).value;
            if (Date.parse(endDate) < Date.parse(startDate)) {
                alert("Invalid date range!\n Please choose a date that is not later than today!\n Please choose start date earlier than end date");
                return false;
            }
            if ((startDate == false) && (endDate == false)) {
                alert("please select both Start and End Date")
                return false;
            }
            if (startDate == false) {
                alert("please select a Start Date")
                return false;
            }
            if (endDate == false) {
                alert("please select a End Date")
                return false;
            }

        }



        var date = new Date();
        var currentTime = new Date();

        date.setMonth(date.getMonth(), 0);
        var date = new Date();
        date.setMonth(date.getMonth(), 0);
        var mindate = new Date();
        mindate.setMonth(date.getMonth() - 2);
        $("#datepicker").datepicker({
            maxDate: date,
            dateFormat: 'mm-yy',
            changeMonth: true,
            changeYear: true,
            showButtonPanel: true,
            onClose: function(dateText, inst) {
                var month = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
                var year = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
                $(this).datepicker('setDate', new Date(year, month, 1));
            }
        });

        $("#datepicker20,#datepicker21").datepicker({
            dateFormat: 'yy-mm-dd',
            minDate: -90,
            maxDate: -1,
            changeMonth: true,
            changeYear: true,
        });

        $("#datepicker19").datepicker({
            dateFormat: 'dd-mm-y',
            minDate: -90,
            maxDate: -1,
            changeMonth: true,
            changeYear: true,
        });

        $("#datepicker98").datepicker({
            maxDate: date,
            minDate: mindate,
            dateFormat: 'M-y',
            changeMonth: true,
            changeYear: true,
            showButtonPanel: true,
            onClose: function(dateText, inst) {
                var month = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
                var year = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
                $(this).datepicker('setDate', new Date(year, month, 1));
            }
        });


        $("#datepicker1").datepicker({
            maxDate: date,
            dateFormat: 'mm-yy',
            changeMonth: true,
            changeYear: true,
            showButtonPanel: true,
            onClose: function(dateText, inst) {
                var month = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
                var year = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
                $(this).datepicker('setDate', new Date(year, month, 1));
            }});


        $("#datepicker99,#datepicker97").datepicker({
            maxDate: date,
            minDate: mindate,
            dateFormat: 'M-y',
            changeMonth: true,
            changeYear: true,
            showButtonPanel: true,
            onClose: function(dateText, inst) {
                var month = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
                var year = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
                $(this).datepicker('setDate', new Date(year, month, 1));
            }
        });

        $("#datepicker2").datepicker({
            maxDate: date,
            dateFormat: 'mm-yy',
            changeMonth: true,
            changeYear: true,
            showButtonPanel: true,
            onClose: function(dateText, inst) {
                var month = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
                var year = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
                $(this).datepicker('setDate', new Date(year, month, 1));
            }});

        $("#datepicker3").datepicker({
            maxDate: date,
            dateFormat: 'mm-yy',
            changeMonth: true,
            changeYear: true,
            showButtonPanel: true,
            onClose: function(dateText, inst) {
                var month = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
                var year = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
                $(this).datepicker('setDate', new Date(year, month, 1));
            }});
        $("#datepicker4").datepicker({
            maxDate: date,
            dateFormat: 'mm-yy',
            changeMonth: true,
            changeYear: true,
            showButtonPanel: true,
            onClose: function(dateText, inst) {
                var month = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
                var year = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
                $(this).datepicker('setDate', new Date(year, month, 1));
            }});

        $("#datepicker5").datepicker({
            maxDate: date,
            dateFormat: 'mm-yy',
            changeMonth: true,
            changeYear: true,
            showButtonPanel: true,
            onClose: function(dateText, inst) {
                var month = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
                var year = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
                $(this).datepicker('setDate', new Date(year, month, 1));
            }});

        $("#datepicker7,#datepicker7_1").datepicker({
            maxDate: -1,
            dateFormat: 'mm/dd/yy',
            changeMonth: true,
            changeYear: true,
        });
        $("#datepicker8,#datepicker8_1").datepicker({
            maxDate: -1,
            dateFormat: 'mm/dd/yy',
            changeMonth: true,
            changeYear: true
        });

        $("#datepicker_kyc_tr_startdate,#datepicker_kyc_tr_enddate,\n\
        \n\
#datepicker_kyc_tr_startdate_1,#datepicker_kyc_tr_enddate_1,\n\
\n\
#datepicker_kyc_tr_startdate_2,#datepicker_kyc_tr_enddate_2").datepicker({
            maxDate: -1,
            minDate: -90,
            dateFormat: 'dd-M-y',
            changeMonth: true,
            changeYear: true
        });

        $("#datepicker_kyc_tr_startdate27,#datepicker_kyc_tr_enddate27").datepicker({
            maxDate: -1,
            minDate: -35,
            dateFormat: 'dd-M-y',
            changeMonth: true,
            changeYear: false,
            onSelect: function() {
                $('#checkbox-MTD').prop('checked', false);
            }
        });


        $("#datepicker_kyc_tr_startdate15,#datepicker_kyc_tr_enddate15").datepicker({
            maxDate: -1,
            minDate: -90,
            dateFormat: 'dd-M-y',
            changeMonth: true,
            changeYear: true
        });
        $("#datepicker_kyc_tr_startdate25,#datepicker_kyc_tr_enddate25").datepicker({
            maxDate: 0,
            minDate: -7,
            dateFormat: 'dd-M-y',
            changeMonth: true,
            changeYear: true
        });

        $("#datepicker17,#datepicker18").datepicker({
            maxDate: -1,
            dateFormat: 'mm/dd/yy',
            changeMonth: true,
            changeYear: true,
        });



        $("#datepicker9,#datepicker9_1").datepicker({
            maxDate: -1,
            dateFormat: 'mm/dd/yy',
            changeMonth: true,
            changeYear: true

        });

        $("#datepicker6").datepicker({
            maxDate: date,
            dateFormat: 'mm-yy',
            changeMonth: true,
            changeYear: true,
            showButtonPanel: true,
            onClose: function(dateText, inst) {
                var month = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
                var year = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
                $(this).datepicker('setDate', new Date(year, month, 1));
            }});



    });
</script>

<script>
    $(document).ready(function()
    {
        $('#search').keyup(function()
        {
            searchTable($(this).val());
        });
    });

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

    function checkBlankTextBox(x) {

        var ss;

        ss = document.getElementById(x).value;
        ss = ss.toString();

        if (ss.length == 0) {
            alert("Please pick the month first !");

            return (false);

        }

        return true;

    }

    function checkdate(r, t)
    {
        var rr;
        var ss;

        ss = document.getElementById(t).value;
        ss = ss.toString();
        rr = document.getElementById(r).value;
        rr = rr.toString();


        if (ss.length == 0 || rr.length == 0) {


            alert("You can't leave a date textbox empty ! Please try again !");


            return (false);
        }


        var d1 = Date.parse(ss);
        var d2 = Date.parse(rr);


        var x = Date.parse(ss);
        x.add(-30).days();



        if (d2 < x) {

            alert("You can pull data of 30 days max !");

            return (false);

        }


        if (d2 > d1) {
            alert("Please pick a valid date range first !");

            return (false);
        }



        return true;
    }


    function checkdate15(r, t)
    {


        var rr;
        var ss;

        ss = document.getElementById(t).value;
        ss = ss.toString();
        rr = document.getElementById(r).value;
        rr = rr.toString();


        if (ss.length == 0 || rr.length == 0) {


            alert("You can't leave a date textbox empty ! Please try again !");


            return (false);
        }


        var d1 = Date.parse(ss);
        var d2 = Date.parse(rr);


        var x = Date.parse(ss);
        x.add(-5).days();



        if (d2 < x) {

            alert("You can pull data of 5 days max !");

            return (false);

        }


        if (d2 > d1) {
            alert("Please pick a valid date range first !");

            return (false);
        }



        return true;
    }


    function searchTable(inputVal)
    {
        var table = $('#tblData');
        table.find('tr').each(function(index, row)
        {
            var allCells = $(row).find('td');
            if (allCells.length > 0)
            {
                var found = false;
                allCells.each(function(index, td)
                {
                    var regExp = new RegExp(inputVal, 'i');
                    if (regExp.test($(td).text()))
                    {
                        found = true;
                        return false;
                    }
                });
                if (found == true)
                    $(row).show();
                else
                    $(row).hide();
            }
        });
    }

    function checkDistributorAndMTDAndDate(c, s, e) {
        return checkDistributor() && checkMTDAndDate(c, s, e);
    }
    
    function checkMAAndRAandMTDAndDate(c, s, e) {
        return checkMA() && checkRA() && checkMTDAndDate(c, s, e);
    }
    
    function checkMAAndRAandDate(s, e){
        return checkMA() && checkRAandDate(s, e);
    }

    function checkRAandMTDAndDate(c, s, e) {
        return checkRA() && checkMTDAndDate(c, s, e);
    }

    function checkRAandDate(s, e) {
        return checkRA() && checkdate(s, e);
    }

    function checkRAandMTD(c) {
        return checkRA() && checkMTD(c);
    }

    function checkMTD(c) {
        if (!$('#' + c).is(':checked')) {
            alert("You have to select MTD to proceed ! Please try again !");
            return false;
        }
        return true;
    }

    function checkMTDAndDate(c, s, e) {
        if (!$('#' + c).is(':checked') && !$('#' + s).val() && !$('#' + e).val()) {
            alert("You have to select MTD or date range to proceed ! Please try again !");
            return false;
        }
        else if ($('#' + c).is(':checked')) {
            return true;
        }
        else {
            return checkdate(s, e);
        }
    }
    
    function checkMA() {
        var ras = [];
        $('input[name="multiselect_multiple-select-ma"]').each(function(i, v) {
            if ($(v).is(":checked") || $(v).hasClass('selected'))
                ras.push(v.value);
        });
        if (!ras.length) {
            alert("You haven't selected any Distributor! Please try again !");
            return false;
        }

        return true;
    }

    function checkDistributor() {
        var ras = [];
        $('input[name="multiselect_multiple-select"]').each(function(i, v) {
            if ($(v).is(":checked") || $(v).hasClass('selected'))
                ras.push(v.value);
        });
        if (!ras.length) {
            alert("You haven't selected any Distributor! Please try again !");
            return false;
        }

        return true;
    }

    function checkRA() {
        var ras = [];
        $('input[name="multiselect_multiple-select"]').each(function(i, v) {
            if ($(v).is(":checked") || $(v).hasClass('selected'))
                ras.push(v.value);
        });
//        console.log(ras);
        if (!ras.length) {
            alert("You haven't selected any RA! Please try again !");
            return false;
        }

        return true;
    }

    function getSelectedRas() {
        var ras = [];
        $('input[name="multiselect_multiple-select-ma"]').each(function(i, v) {
            if ($(v).is(":checked") || $(v).hasClass('selected'))
                ras.push(v.value);
        });

        return ras.join(',');
    }

    function getRaListByMaWallet(ma_wallet) {
        if (ma_wallet) {
            $.ajax({
                type: "POST",
                url: "<%=request.getContextPath()%>/services/auth/ra_list_by_ma_wallet",
                data: ma_wallet,
                contentType: "application/json;",
                dataType: "json",
                success: function(msg) {
                    console.log('getRaListByMaWallet: ', msg);
                    $("#multiple-select").get(0).options.length = 0;

                    $.each(msg.data, function(index, item) {
                        $("#multiple-select").get(0).options[$("#multiple-select").get(0).options.length] = new Option(item.walletNo, item.walletNo);
                    });

                    $("#multiple-select").multiselect('refresh');
                },
                error: function() {
                    $("#multiple-select").get(0).options.length = 0;
                    alert("Failed to load RAs");
                }
            });
        } else {
            $("#multiple-select").get(0).options.length = 0;
            $("#multiple-select").multiselect('refresh');
        }
    }

</script>
</body>
</html>