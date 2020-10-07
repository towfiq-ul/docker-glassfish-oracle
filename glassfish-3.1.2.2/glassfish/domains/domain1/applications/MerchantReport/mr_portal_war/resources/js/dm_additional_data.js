$(document).ready(function() {
    loadJTableDmAdditionalData('DM', '01');
});

$("#searchDmInfo").click(function() {
    $('#jtableDmAdditionalData').jtable('destroy');
    var clientCode = document.getElementById("searchClientCode").value;
    if (clientCode.length <= 0)
        clientCode = 'DM';
    var clientAccount = document.getElementById("searchClientAccount").value;
    if (clientAccount.length <= 0)
        clientAccount = '01';
    console.log("Found DM Info : " + clientCode);
    loadJTableDmAdditionalData(clientCode, clientAccount);
});

function loadJTableDmAdditionalData(clientCode, clientAccount) {
    $('#jtableDmAdditionalData').jtable({
        title: 'Disbursement Merchant Additional Data',
        paging: true, //Enable paging
        pageSize: 10, //Set page size (default: 10)
        actions: {
//            listAction: 'https://' + window.location.host + '/mr_portal/api/merchantreport/all_dm_additional_info',

            listAction: function(postData, jtParams) {
                //  console.log("Loading from custom function...");

                return $.Deferred(function($dfd) {
                    $.ajax({
                        url: 'https://' + window.location.host + '/mr_portal/api/merchantreport/all_dm_additional_info?jtStartIndex=' + jtParams.jtStartIndex + '&jtPageSize=' + jtParams.jtPageSize + '&clientCode=' + clientCode + '&clientAccount=' + clientAccount,
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
            createAction: 'https://' + window.location.host + '/mr_portal/api/merchantreport/dm_additional_info_create',
            updateAction: 'https://' + window.location.host + '/mr_portal/api/merchantreport/dm_additional_info_update',
            deleteAction: 'https://' + window.location.host + '/mr_portal/api/merchantreport/dm_additional_info_delete'
        },
        toolbar: {
            items: [{
                    tooltip: 'Click here to export this table to excel',
                    icon: 'resources/images/excel-icon.png',
                    text: 'Export to Excel',
                    click: function() {
                        window.location = "DMAdditionalFullData";

//                        exportDmAdditionalData();
                    }
                }]
        },
        fields: {
            dmCode: {
                title: 'Client Code',
                key: true,
                create: true,
                edit: false,
                list: true
            },
            dmName: {
                title: 'Client Name'
                        // width: '40%'
            },
            dmWallet: {
                title: 'Client Account'
                        // width: '40%'
            },
            reportSample: {
                title: 'Report Sample',
                options: {'sample 1': 'sample 1', 'sample 2': 'sample 2', 'sample 3': 'sample 3', 'sample 4': 'sample 4', 'sample 5': 'sample 5', 'sample 6': 'sample 6', 'sample 7': 'sample 7'}

//                width: '40%'
            },
            purpose: {
                title: 'Purpose'

//                width: '40%'
            },
            merchantType: {
                title: 'Merchant Type'
                        // width: '20%'
            }
        }
    });
    $('#jtableDmAdditionalData').jtable('load');

}



function exportDmAdditionalData() {
    var date = new Date();
    var yyyy = date.getFullYear();
    var mm = date.getMonth() < 9 ? "0" + (date.getMonth() + 1) : (date.getMonth() + 1); // getMonth() is zero-based
    var dd = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
    var hh = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
    var min = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
//    var datestring = reportName + '_' + yyyy + '_' + mm + '_' + dd + '_' + hh + '_' + min;
    var datestring = 'DmAdditionalData' + '_' + yyyy + '_' + mm + '_' + dd;
    $(".jtable").table2excel({
        exclude: ".noExl",
        name: "Excel Document Name",
        filename: datestring
    });
}