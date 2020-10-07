$(document).ready(function() {
    loadJTableMasterData('RM');
    loadJTableChangeData();
});


$("#searchByRmCode").click(function() {
    $('#jtableMasterTable').jtable('destroy');
    var rmCode = document.getElementById("searchRmCode").value;
    if (rmCode.length <= 0)
        rmCode = 'RM';
    console.log("Found RM Code : " + rmCode);
    loadJTableMasterData(rmCode);

});
function loadJTableMasterData(rmCode)
{
    $('#jtableMasterTable').jtable({
        title: 'Retail Merchant Master Table',
        paging: true, //Enable paging
        pageSize: 10, //Set page size (default: 10)
        selecting: true, //Enable selecting
        multiselect: true, //Allow multiple selecting
        selectingCheckboxes: true, //Show checkboxes on first column
        selectOnRowClick: true, //Enable this to only select using checkboxes
        actions: {
//            listAction: 'https://' + window.location.host + '/mr_portal/api/merchantreport/rm_masterdata'
            listAction: function(postData, jtParams) {
                //  console.log("Loading from custom function...");

                return $.Deferred(function($dfd) {
                    $.ajax({
                        url: 'https://' + window.location.host + '/mr_portal/api/merchantreport/rm_masterdata?jtStartIndex=' + jtParams.jtStartIndex + '&jtPageSize=' + jtParams.jtPageSize + '&rmCode=' + rmCode,
                        type: 'POST',
                        dataType: 'json',
                        data: postData,
                        success: function(data) {
                            $dfd.resolve(data);
                        },
                        error: function() {
                            $dfd.reject();
                        }
                    });
                });
            },
//            createAction: 'http://' + window.location.host + '/learn/api/learn/create',
//            updateAction: 'http://' + window.location.host + '/learn/api/learn/update',
//            deleteAction: 'http://' + window.location.host + '/learn/api/learn/delete'
        },
        toolbar: {
            items: [{
                    tooltip: 'Click here to export this table to excel',
                    icon: 'resources/images/excel-icon.png',
                    text: 'Export to Excel',
                    click: function() {
                        window.location = "RMFullData";
//                       exportRmMasterData();
                    }
                }]
        },
        fields: {
            merchantCode: {
                title: 'MerchantCode', key: true,
                create: true,
                edit: false,
                list: true
            },
            merchantId: {
                title: 'MerchantID'
                        // width: '40%'
            },
//            walletNo: {
//                title: 'WalletNO',
//                key: true,
//                create: true,
//                edit: false,
//                list: true
////                width: '40%'
//            },
            serviceFee: {
                title: 'ServiceFee(%)'
                        // width: '20%'
            },
            merchantName: {
                title: 'MerchantName'
                        // width: '20%'
            },
            bankName: {
                title: 'BankName'
                        // width: '20%'
            },
            branchName: {
                title: 'BranchName'
                        // width: '20%'
            },
            bankAccountName: {
                title: 'BankAccountName'
                        // width: '20%'
            },
            bankAccountNo: {
                title: 'BankAccountNo'
                        // width: '20%'
            },
            merchantType: {
                title: 'MerchantType'
                        // width: '20%'
            },
            subLedger: {
                title: 'Subledger'
                        // width: '20%'
            },
            routingNumber: {
                title: 'RoutingNo'
//                width: '10%'
            }
        }

    });
    $('#jtableMasterTable').jtable('load');
}

function loadJTableChangeData()
{
    $('#jtableChangeData').jtable({
        title: 'Change Data List',
        paging: true, //Enable paging
        pageSize: 10, //Set page size (default: 10)
        selecting: true, //Enable selecting
        multiselect: true, //Allow multiple selecting
        selectingCheckboxes: true, //Show checkboxes on first column
        selectOnRowClick: true, //Enable this to only select using checkboxes
        actions: {
            listAction: 'https://' + window.location.host + '/mr_portal/api/merchantreport/rm_temp_masterdata_maker',
            createAction: 'RmTempJtableCreateData',
            updateAction: 'RmTempJtableUpdateData',
            deleteAction: 'https://' + window.location.host + '/mr_portal/api/merchantreport/rm_temp_delete'
        },
        fields: {
            merchantCode: {
                title: 'MerchantCode',
                key: true,
                create: true,
                edit: false,
                list: true
            },
            merchantId: {
                title: 'MerchantID'
                        // width: '40%'
            },
//            walletNo: {
//                title: 'WalletNO',
//                key: true,
//                create: true,
//                edit: false,
//                list: true
////                width: '40%'
//            },
            serviceFee: {
                title: 'ServiceFee(%)'
                        // width: '20%'
            },
            merchantName: {
                title: 'MerchantName'
                        // width: '20%'
            },
            bankName: {
                title: 'BankName'
                        // width: '20%'
            },
            branchName: {
                title: 'BranchName'
                        // width: '20%'
            },
            bankAccountName: {
                title: 'BankAccountName'
                        // width: '20%'
            },
            bankAccountNo: {
                title: 'BankAccountNo'
                        // width: '20%'
            },
            merchantType: {
                title: 'MerchantType'
                        // width: '20%'
            },
            subLedger: {
                title: 'Subledger'
                        // width: '20%'
            },
            routingNumber: {
                title: 'RoutingNo'
                        //  options: { '1': 'Primary school', '2': 'High school', '3': 'University' }
//                width: '10%'
            },
            requestType: {
                title: 'ReqType',
                edit: false,
                create: false

//                width: '10%'
            },
            isSubmitted: {
                title: 'Submitted',
                edit: false,
                create: false,
                list: false
//                width: '10%'
            },
            createdBy: {
                title: 'CreatedBy',
                edit: false,
                create: false
//                width: '10%'
            },
            createdOn: {
                title: 'CreatedOn',
                edit: false,
                create: false
//                width: '10%'
            }

        }
    });
    $('#jtableChangeData').jtable('load');
}
//Sales 2nd Table Generation

$("#append_md").click(function() {

//    $("#append_md").prop('disabled', true);
    //   $("#rejectButtonId").prop('disabled', true);

    var selectedRows = $('#jtableMasterTable').jtable('selectedRows');
    // alert('Found Request ' + selectedRows.length);
    var finalJson = {};
    var approvedWallets = [];

    if (selectedRows.length > 0) {
        //Show selected rows
        selectedRows.each(function() {
            var record = $(this).data('record');
            var merchantCode = record.merchantCode;
            var merchantId = record.merchantId;
            //  var walletNo = record.walletNo;
            var serviceFee = record.serviceFee;
            var merchantName = record.merchantName;
            var bankName = record.bankName;
            var branchName = record.branchName;
            var bankAccountName = record.bankAccountName;
            var bankAccountNo = record.bankAccountNo;
            var merchantType = record.merchantType;
            var subLedger = record.subLedger;
            var routingNumber = record.routingNumber;

            item = {};
            item["merchantCode"] = merchantCode;
            item["merchantId"] = merchantId;
            //  item["walletNo"] = walletNo;
            item["serviceFee"] = serviceFee;
            item["merchantName"] = merchantName;
            item["bankName"] = bankName;
//            item["currentBalance"] = parseFloat(currentBalance).toFixed(2);
            item["branchName"] = branchName;
            item["bankAccountName"] = bankAccountName;
            item["bankAccountNo"] = bankAccountNo;
            item["merchantType"] = merchantType;
            item["subLedger"] = subLedger;
            item["routingNumber"] = routingNumber;
            approvedWallets.push(item);
        });


        //
        var userInfo = getUsername();

        var data = jQuery.parseJSON(userInfo);
        var username = data.username;
        var role = data.role;

        finalJson["username"] = username;
        finalJson["role"] = role;
        finalJson["reqType"] = "update";
        finalJson["businessWallets"] = approvedWallets;
        console.log(JSON.stringify(finalJson));
        //
        $.ajax({
            url: 'https://' + window.location.host + '/mr_portal/api/merchantreport/rm_append',
            contentType: 'application/json; charset=UTF-8', //Sending Type
            dataType: 'text', //Accept Type
            type: 'POST',
            data: JSON.stringify(finalJson),
            success: function(data)
            {
//                alert("Your request has been append");
                //   alert(data);
                loadJTableChangeData();
                console.log("OnSuccess");

            },
            error: function(data)
            {
                //  alert(data);
                // alert("Your request has been submitted!Please go to dashboard for details.");
                loadJTableChangeData();

            }, complete: function(data) {
                //    console.log("Oncomplete in accept");
//                $("#acceptButtonId").prop('disabled', false);
//                $("#rejectButtonId").prop('disabled', false);
            }

        });
    }
});
$("#submit_md").click(function() {

//    $("#append_md").prop('disabled', true);
    //   $("#rejectButtonId").prop('disabled', true);

    var selectedRows = $('#jtableChangeData').jtable('selectedRows');
//    alert('Found Request ' + selectedRows.length);
    var finalJson = {};
    var approvedWallets = [];

    if (selectedRows.length > 0) {
        //Show selected rows
        selectedRows.each(function() {
            var record = $(this).data('record');
            var merchantCode = record.merchantCode;
            var merchantId = record.merchantId;
            // var walletNo = record.walletNo;
            var serviceFee = record.serviceFee;
            var merchantName = record.merchantName;
            var bankName = record.bankName;
            var branchName = record.branchName;
            var bankAccountName = record.bankAccountName;
            var bankAccountNo = record.bankAccountNo;
            var merchantType = record.merchantType;
            var subLedger = record.subLedger;
            var routingNumber = record.routingNumber;

            var requestType = record.requestType;
            var isSubmitted = record.isSubmitted;
            var createdOn = record.createdOn;
            var createdBy = record.createdBy;

            item = {};
            item["merchantCode"] = merchantCode;
            item["merchantId"] = merchantId;
            //  item["walletNo"] = walletNo;
            item["serviceFee"] = serviceFee;
            item["merchantName"] = merchantName;
            item["bankName"] = bankName;
//            item["currentBalance"] = parseFloat(currentBalance).toFixed(2);
            item["branchName"] = branchName;
            item["bankAccountName"] = bankAccountName;
            item["bankAccountNo"] = bankAccountNo;
            item["merchantType"] = merchantType;
            item["subLedger"] = subLedger;
            item["routingNumber"] = routingNumber;

            item["requestType"] = requestType;
//            item["isSubmitted"] = isSubmitted;
            item["isSubmitted"] = "Y";
            item["createdOn"] = createdOn;
            item["createdBy"] = createdBy;

            approvedWallets.push(item);
        });


        //
        var userInfo = getUsername();

        var data = jQuery.parseJSON(userInfo);
        var username = data.username;
        var role = data.role;

        finalJson["username"] = username;
        finalJson["role"] = role;
        finalJson["reqType"] = "submit";
        finalJson["businessWallets"] = approvedWallets;
        console.log(JSON.stringify(finalJson));
        //
        $.ajax({
            url: 'https://' + window.location.host + '/mr_portal/api/merchantreport/rm_submit',
            contentType: 'application/json; charset=UTF-8', //Sending Type
            dataType: 'text', //Accept Type
            type: 'POST',
            data: JSON.stringify(finalJson),
            success: function(data)
            {
                alertify.alert(data);
                // alert("Your request has been append");
                loadJTableChangeData();
                console.log("OnSuccess");

            },
            error: function(data)
            {
                alertify.alert(data);
                loadJTableChangeData();

            }, complete: function(data) {
                //    console.log("Oncomplete in accept");
//                $("#acceptButtonId").prop('disabled', false);
//                $("#rejectButtonId").prop('disabled', false);
            }

        });

    }
});


function exportRmMasterData() {
    var date = new Date();
    var yyyy = date.getFullYear();
    var mm = date.getMonth() < 9 ? "0" + (date.getMonth() + 1) : (date.getMonth() + 1); // getMonth() is zero-based
    var dd = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
    var hh = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
    var min = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
//    var datestring = reportName + '_' + yyyy + '_' + mm + '_' + dd + '_' + hh + '_' + min;
    var datestring = 'Rm_MasterData' + '_' + yyyy + '_' + mm + '_' + dd;
    $(".jtable").table2excel({
        exclude: ".noExl",
        name: "Excel Document Name",
        filename: datestring
    });
}






