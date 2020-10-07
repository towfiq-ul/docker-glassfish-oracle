$(document).ready(function() {
    loadJTableMasterData('01');
    loadJTableChangeData();
});

$("#searchByDmWallet").click(function() {
    $('#jtableMasterTable').jtable('destroy');
    var dmWallet = document.getElementById("searchDmWallet").value;
    if (dmWallet.length <= 0)
        dmWallet = '01';
    console.log("Found DM Wallet : " + dmWallet);
    loadJTableMasterData(dmWallet);

});


function loadJTableMasterData(dmWallet)
{
    $('#jtableMasterTable').jtable({
        title: 'Disbursement Merchant Master Table',
        paging: true, //Enable paging
        pageSize: 10, //Set page size (default: 10)
        selecting: true, //Enable selecting
        multiselect: true, //Allow multiple selecting
        selectingCheckboxes: true, //Show checkboxes on first column
        selectOnRowClick: true, //Enable this to only select using checkboxes
        actions: {
//            listAction: 'https://' + window.location.host + '/mr_portal/api/merchantreport/dm_masterdata'
             listAction: function(postData, jtParams) {
                //  console.log("Loading from custom function...");

                return $.Deferred(function($dfd) {
                    $.ajax({
                        url: 'https://' + window.location.host + '/mr_portal/api/merchantreport/dm_masterdata?jtStartIndex=' + jtParams.jtStartIndex + '&jtPageSize=' + jtParams.jtPageSize + '&dmWallet=' + dmWallet,
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
                        window.location = "DMFullData";
//                        exportDmMasterData();
                    }
                }]
        },
        fields: {
            merAcc: {
                title: 'MerchantAccount',
                key: true,
                create: true,
                edit: false,
                list: true
            },
            coFeePerc: {
                title: 'CashoutFeePer'
                        // width: '40%'
            },
            coFeePercBy: {
                title: 'CashoutFeePerBy'
                        // width: '40%'
            },
            bkShareFeePerc: {
                title: 'bKashShareFeePer'

//                width: '40%'
            },
            bkShareFeePercBy: {
                title: 'bKashShareFeePerBy'

//                width: '40%'
            },
            meShareFeePerc: {
                title: 'MeShareFeePerc'
                // width: '20%'
            },
            meShareFeePercBy: {
                title: 'MeShareFeePercBy'
                // width: '20%'
            },
            servFeeFeePerc: {
                title: 'ServFeeFeePerc'
                // width: '20%'
            },
            servFeeFeePercBy: {
                title: 'ServFeeFeePercBy'
                // width: '20%'
            },
            aitFeePerc: {
                title: 'AitFeePerc'
                // width: '20%'
            },
            aitFeePercBy: {
                title: 'AitFeePercBy'
                // width: '20%'
            },
            merAitFeePerc: {
                title: 'MerAitFeePerc'
                // width: '20%'
            },
            merAitFeePercBy: {
                title: 'MerAitFeePercBy'
                // width: '20%'
            },
            totCalcFr: {
                title: 'TotCalcFr'
                // width: '20%'
            },
            totCalcFrAitServFee: {
                title: 'TotCalcFrAitServFee'
                // width: '20%'
            },
            balanceCalcFr: {
                title: 'BalanceCalcFr'
                // width: '20%'
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
            listAction: 'https://' + window.location.host + '/mr_portal/api/merchantreport/dm_temp_masterdata_maker',
            createAction: 'DmTempJtableCreateData',
            updateAction: 'DmTempJtableUpdateData',
            deleteAction: 'https://' + window.location.host + '/mr_portal/api/merchantreport/dm_temp_delete'
        },
        fields: {
            merAcc: {
                title: 'MerchantAccount',
                key: true,
                create: true,
                edit: false,
                list: true
            },
            coFeePerc: {
                title: 'CashoutFeePer'
                        // width: '40%'
            },
            coFeePercBy: {
                title: 'CashoutFeePerBy'
                        // width: '40%'
            },
            bkShareFeePerc: {
                title: 'bKashShareFeePer'

//                width: '40%'
            },
            bkShareFeePercBy: {
                title: 'bKashShareFeePerBy'

//                width: '40%'
            },
            meShareFeePerc: {
                title: 'MeShareFeePerc'
                // width: '20%'
            },
            meShareFeePercBy: {
                title: 'MeShareFeePercBy'
                // width: '20%'
            },
            servFeeFeePerc: {
                title: 'ServFeeFeePerc'
                // width: '20%'
            },
            servFeeFeePercBy: {
                title: 'ServFeeFeePercBy'
                // width: '20%'
            },
            aitFeePerc: {
                title: 'AitFeePerc'
                // width: '20%'
            },
            aitFeePercBy: {
                title: 'AitFeePercBy'
                // width: '20%'
            },
            merAitFeePerc: {
                title: 'MerAitFeePerc'
                // width: '20%'
            },
            merAitFeePercBy: {
                title: 'MerAitFeePercBy'
                // width: '20%'
            },
            totCalcFr: {
                title: 'TotCalcFr'
               // options: {'1': 'F', '2': 'G', '3': 'H'}

                // width: '20%'
            },
            totCalcFrAitServFee: {
                title: 'TotCalcFrAitServFee'
             //   options: {'1': 'O', '2': 'P', '3': 'Q'}

                // width: '20%'
            },
            balanceCalcFr: {
                title: 'BalanceCalcFr'
             //   options: {'1': 'F', '2': 'G', '3': 'H','4': 'O', '5': 'P', '6': 'Q'}
                // width: '20%'
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
                create: false
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

            var merAcc = record.merAcc;
            var coFeePerc = record.coFeePerc;
            var coFeePercBy = record.coFeePercBy;
            var bkShareFeePerc = record.bkShareFeePerc;
            var bkShareFeePercBy = record.bkShareFeePercBy;
            var meShareFeePerc = record.meShareFeePerc;
            var meShareFeePercBy = record.meShareFeePercBy;
            var servFeeFeePerc = record.servFeeFeePerc;
            var servFeeFeePercBy = record.servFeeFeePercBy;
            var aitFeePerc = record.aitFeePerc;
            var aitFeePercBy = record.aitFeePercBy;
            var merAitFeePerc = record.merAitFeePerc;
            var merAitFeePercBy = record.merAitFeePercBy;
            var totCalcFr = record.totCalcFr;
            var totCalcFrAitServFee = record.totCalcFrAitServFee;
            var balanceCalcFr = record.balanceCalcFr;


            item = {};
            item["merAcc"] = merAcc;
            item["coFeePerc"] = coFeePerc;
            item["coFeePercBy"] = coFeePercBy;
            item["bkShareFeePerc"] = bkShareFeePerc;
            item["bkShareFeePercBy"] = bkShareFeePercBy;
            item["meShareFeePerc"] = meShareFeePerc;
            item["meShareFeePercBy"] = meShareFeePercBy;
            item["servFeeFeePerc"] = servFeeFeePerc;
            item["servFeeFeePercBy"] = servFeeFeePercBy;
            item["aitFeePerc"] = aitFeePerc;
            item["aitFeePercBy"] = aitFeePercBy;
            item["merAitFeePerc"] = merAitFeePerc;
            item["merAitFeePercBy"] = merAitFeePercBy;
            item["totCalcFr"] = totCalcFr;
            item["totCalcFrAitServFee"] = totCalcFrAitServFee;
            item["balanceCalcFr"] = balanceCalcFr;
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
            url: 'https://' + window.location.host + '/mr_portal/api/merchantreport/dm_append',
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

            var merAcc = record.merAcc;
            var coFeePerc = record.coFeePerc;
            var coFeePercBy = record.coFeePercBy;
            var bkShareFeePerc = record.bkShareFeePerc;
            var bkShareFeePercBy = record.bkShareFeePercBy;
            var meShareFeePerc = record.meShareFeePerc;
            var meShareFeePercBy = record.meShareFeePercBy;
            var servFeeFeePerc = record.servFeeFeePerc;
            var servFeeFeePercBy = record.servFeeFeePercBy;
            var aitFeePerc = record.aitFeePerc;
            var aitFeePercBy = record.aitFeePercBy;
            var merAitFeePerc = record.merAitFeePerc;
            var merAitFeePercBy = record.merAitFeePercBy;
            var totCalcFr = record.totCalcFr;
            var totCalcFrAitServFee = record.totCalcFrAitServFee;
            var balanceCalcFr = record.balanceCalcFr;

            var requestType = record.requestType;
            var isSubmitted = record.isSubmitted;
            var createdOn = record.createdOn;
            var createdBy = record.createdBy;

            item = {};
            item["merAcc"] = merAcc;
            item["coFeePerc"] = coFeePerc;
            item["coFeePercBy"] = coFeePercBy;
            item["bkShareFeePerc"] = bkShareFeePerc;
            item["bkShareFeePercBy"] = bkShareFeePercBy;
            item["meShareFeePerc"] = meShareFeePerc;
            item["meShareFeePercBy"] = meShareFeePercBy;
            item["servFeeFeePerc"] = servFeeFeePerc;
            item["servFeeFeePercBy"] = servFeeFeePercBy;
            item["aitFeePerc"] = aitFeePerc;
            item["aitFeePercBy"] = aitFeePercBy;
            item["merAitFeePerc"] = merAitFeePerc;
            item["merAitFeePercBy"] = merAitFeePercBy;
            item["totCalcFr"] = totCalcFr;
            item["totCalcFrAitServFee"] = totCalcFrAitServFee;
            item["balanceCalcFr"] = balanceCalcFr;




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
            url: 'https://' + window.location.host + '/mr_portal/api/merchantreport/dm_submit',
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

function exportDmMasterData() {
    var date = new Date();
    var yyyy = date.getFullYear();
    var mm = date.getMonth() < 9 ? "0" + (date.getMonth() + 1) : (date.getMonth() + 1); // getMonth() is zero-based
    var dd = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
    var hh = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
    var min = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
//    var datestring = reportName + '_' + yyyy + '_' + mm + '_' + dd + '_' + hh + '_' + min;
    var datestring = 'Dm_MasterData' + '_' + yyyy + '_' + mm + '_' + dd;
    $(".jtable").table2excel({
        exclude: ".noExl",
        name: "Excel Document Name",
        filename: datestring
    });
}









