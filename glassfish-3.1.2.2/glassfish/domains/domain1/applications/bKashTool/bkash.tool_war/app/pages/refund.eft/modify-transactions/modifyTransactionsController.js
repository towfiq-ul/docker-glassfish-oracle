angular.module("app")
        .controller("modifyTransactionsController", modifyTransactionsController);

function modifyTransactionsController() {

    var vm = this;
    vm.message = "Hello from modifyTransactions";
    loadJTableMasterData(null);
//    vm.bank = 'printReady';
//    getRefundData();

    vm.reloadData = function reloadData() {
        $('#jtableMasterTable').jtable('destroy');
        loadJTableMasterData(vm.refundNo);
    };



//    function getRefundData() {
//        return listTransactionsService.getBalanceHistory().then(
//                function(data) {
//                    var obj = jQuery.parseJSON(data);
//                    if(obj.status==="OK"){
//                              vm.queueData = obj;
//                    }
//                    else {
//                         var noMenuHtml = '<center><h3 id="bodyParagraph">Access Denied</h3></center>';
//
//                                document.getElementById("injectedDiv").innerHTML = noMenuHtml;
//                    }
//              
//                },
//                function(error) {
//                    vm.errorMessage = 'A problem has occured ! Try Again !';
//                }
//        );
//    }
//    vm.exportReport = function exportReport() {
//        var date = new Date();
//        var yyyy = date.getFullYear();
//        var mm = date.getMonth() < 9 ? "0" + (date.getMonth() + 1) : (date.getMonth() + 1); // getMonth() is zero-based
//        var dd = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
//        var hh = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
//        var min = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
//        var datestring = 'Refund_Data_' + yyyy + '_' + mm + '_' + dd + '_' + hh + '_' + min;
//        $(".reference").table2excel({
//            exclude: ".noExl",
//            name: "Excel Document Name",
//            filename: datestring
//        });
//    };


// $('#jtableMasterTable').jtable('destroy');
//
//    $("#searchByRmCode").click(function() {
//        $('#jtableMasterTable').jtable('destroy');
//        var rmCode = document.getElementById("searchRmCode").value;
//        if (rmCode.length <= 0)
//            rmCode = 'RM';
//        console.log("Found RM Code : " + rmCode);
//        loadJTableMasterData(rmCode);
//
//    });
    function loadJTableMasterData(refundNo)
    {
        $('#jtableMasterTable').jtable({
            title: 'Refund List Today',
            paging: true, //Enable paging
            pageSize: 10, //Set page size (default: 10)
//            selecting: true, //Enable selecting
//            multiselect: true, //Allow multiple selecting
//            selectingCheckboxes: true, //Show checkboxes on first column
//            selectOnRowClick: true, //Enable this to only select using checkboxes
            actions: {
                listAction: function(postData, jtParams) {
                    //  console.log("Loading from custom function...");

                    return $.Deferred(function($dfd) {
                        $.ajax({
                            url: 'https://' + window.location.host + '/bkash.tool/api/refund_eft/refund_today?jtStartIndex=' + jtParams.jtStartIndex + '&jtPageSize=' + jtParams.jtPageSize + '&refundNo=' + refundNo,
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
                updateAction: 'RefundModify'
            },
            fields: {
                requestId: {
                    title: 'RequestId',
                    key: true,
                    edit: false,
                    list: true
                },
                refundNo: {
                    title: 'RefundNo',
                    edit: false,
                    list: true
                },
                maWalletNumber: {
                    title: 'MA Wallet',
                    edit: false,
                    list: true
                },
                requestedAmountNumeric: {
                    title: 'Amount',
                    edit: false
                },
                trxRef: {
                    title: 'TrxRef',
                    edit: false
                },
                bankAccountName: {
                    title: 'BankAccountName'
                },
                bankAccountNumber: {
                    title: 'BankAccountNo'
                },
                bankname: {
                    title: 'BankName'
                },
                branch: {
                    title: 'Branch'
                },
                routingCode: {
                    title: 'RoutingCode'
                },
                branchSolCode: {
                    title: 'BranchSolCode'
                },
                sourceBankName: {
                    title: 'SourceBank',
                    options: {'THE CITY BANK LTD.': 'THE CITY BANK LTD.', 'RTGS THE CITY BANK LTD.': 'RTGS THE CITY BANK LTD.', 'BRAC BANK LTD.': 'BRAC BANK LTD.', 'BEFTN BRAC BANK LTD.': 'BEFTN BRAC BANK LTD.', 'SOUTHEAST BANK LTD.': 'SOUTHEAST BANK LTD.', 'JAMUNA BANK LTD.': 'JAMUNA BANK LTD.', 'MUTUAL TRUST BANK LTD.': 'MUTUAL TRUST BANK LTD.', 'UNITED COMMERCIAL BANK LTD.': 'UNITED COMMERCIAL BANK LTD.', 'DHAKA BANK LTD.': 'DHAKA BANK LTD.', 'NATIONAL CREDIT & COMMERCE BANK LTD.': 'NATIONAL CREDIT & COMMERCE BANK LTD.'}
                },
                uploadDate: {
                    title: 'UploadDate'
                },
                slotNo: {
                    title: 'SlotNo',
                    options: {'Slot 1': 'Slot 1', 'Slot 2': 'Slot 2', 'Slot 3': 'Slot 3', 'Slot 4': 'Slot 4', 'Slot 5': 'Slot 5'}
                },
                status: {
                    title: 'Status',
                    list: false
                }
            }
        });
        $('#jtableMasterTable').jtable('load');
    }

}