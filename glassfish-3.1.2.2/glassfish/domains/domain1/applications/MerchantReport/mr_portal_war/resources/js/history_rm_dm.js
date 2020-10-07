$(document).ready(function() {
    // alert('Hello World');
});



$('#searchReportRm').click(function() {
    $("#report_table_rm td").remove();
    $("#no_data_rm").html('');
    var go = true;

    var merchantCode = document.getElementById("merchantCode").value;
    var from_date = document.getElementById("txt_from_date").value;
    var to_date = document.getElementById("txt_to_date").value;

   // console.log('Merchant Code: ' + merchantCode + ' From Date: ' + from_date + ' To Date: ' + to_date);
    if (merchantCode.length <= 0) {
        if (from_date.length <= 0 || to_date.length <= 0) {
            alertify.alert('Please choose an option');
            go = false;
        }
    }
    if (go) {
        $.ajax(
                {
                    url: 'HistoryRm',
                    dataType: 'text',
                    Accept: "text/html",
                    type: 'POST',
                    data: {"merchantCode": merchantCode, "from_date": from_date, "to_date": to_date},
                    success: function(data)
                    {
                        obj = jQuery.parseJSON(data);
//                    console.log(obj);
                        if (obj.length > 0) {
                            for (var i = 0; i < obj.length; i++) {
                                var row = "<tr>";
                                row += "<td>" + obj[i].merchantCode + "</td>";
                                row += "<td>" + obj[i].merchantId + "</td>";
//                            row += "<td>" + obj[i].walletNo + "</td>";
                                row += "<td>" + obj[i].serviceFee + "</td>";
                                row += "<td>" + obj[i].merchantName + "</td>";
                                row += "<td>" + obj[i].bankName + "</td>";
                                row += "<td>" + obj[i].branchName + "</td>";
                                row += "<td>" + obj[i].bankAccountName + "</td>";
                                row += "<td>" + obj[i].bankAccountNo + "</td>";
                                row += "<td>" + obj[i].merchantType + "</td>";
                                row += "<td>" + obj[i].subLedger + "</td>";
                                row += "<td>" + obj[i].routingNumber + "</td>";

                                row += "<td>" + obj[i].requestType + "</td>";
                                row += "<td>" + obj[i].requestBy + "</td>";
                                row += "<td>" + obj[i].requestOn + "</td>";
                                row += "<td>" + obj[i].checkedBy + "</td>";
                                row += "<td>" + obj[i].checkedOn + "</td>";
                                row += "<td>" + obj[i].status + "</td>";
                                row += "</tr>";
                                $('#report_table_rm').append(row);
                            }
                        }
                        else
                        {
                            document.getElementById("no_data_rm").innerHTML = "No Data Found";
                        }

                    },
                    error: function(data)
                    {

                    }
                });
    }
});

$('#searchReportDm').click(function() {
    $("#report_table_dm td").remove();
    $("#no_data_dm").html('');
    var go = true;

    var merchantWallet = document.getElementById("merchantWallet").value;
    var from_date = document.getElementById("txt_from_date_dm").value;
    var to_date = document.getElementById("txt_to_date_dm").value;

    //  console.log('Merchant Wallet: ' + merchantWallet + ' From Date: ' + from_date + ' To Date: ' + to_date);
    if (merchantCode.length <= 0) {
        if (from_date.length <= 0 || to_date.length <= 0) {
            alertify.alert('Please choose an option');
            go = false;
        }
    }
    if (go) {
        $.ajax(
                {
                    url: 'HistoryDm',
                    dataType: 'text',
                    Accept: "text/html",
                    type: 'POST',
                    data: {"merchantWallet": merchantWallet, "from_date": from_date, "to_date": to_date},
                    success: function(data)
                    {
                        obj = jQuery.parseJSON(data);
                        console.log(obj);
                        if (obj.length > 0) {
                            for (var i = 0; i < obj.length; i++) {
                                var row = "<tr>";
                                row += "<td>" + obj[i].merAcc + "</td>";
                                row += "<td>" + obj[i].coFeePerc + "</td>";
                                row += "<td>" + obj[i].coFeePercBy + "</td>";
                                row += "<td>" + obj[i].bkShareFeePerc + "</td>";
                                row += "<td>" + obj[i].bkShareFeePercBy + "</td>";
                                row += "<td>" + obj[i].meShareFeePerc + "</td>";
                                row += "<td>" + obj[i].meShareFeePercBy + "</td>";
                                row += "<td>" + obj[i].servFeeFeePerc + "</td>";
                                row += "<td>" + obj[i].servFeeFeePercBy + "</td>";
                                row += "<td>" + obj[i].aitFeePerc + "</td>";
                                row += "<td>" + obj[i].aitFeePercBy + "</td>";
                                row += "<td>" + obj[i].merAitFeePerc + "</td>";
                                row += "<td>" + obj[i].merAitFeePercBy + "</td>";
                                row += "<td>" + obj[i].totCalcFr + "</td>";
                                row += "<td>" + obj[i].totCalcFrAitServFee + "</td>";
                                row += "<td>" + obj[i].balanceCalcFr + "</td>";

                                row += "<td>" + obj[i].requestType + "</td>";
                                row += "<td>" + obj[i].requestBy + "</td>";
                                row += "<td>" + obj[i].requestOn + "</td>";
                                row += "<td>" + obj[i].checkedBy + "</td>";
                                row += "<td>" + obj[i].checkedOn + "</td>";
                                row += "<td>" + obj[i].status + "</td>";
                                row += "</tr>";
                                $('#report_table_dm').append(row);
                            }
                        }
                        else
                        {
                            document.getElementById("no_data_dm").innerHTML = "No Data Found";
                        }

                    },
                    error: function(data)
                    {

                    }
                });
    }
});