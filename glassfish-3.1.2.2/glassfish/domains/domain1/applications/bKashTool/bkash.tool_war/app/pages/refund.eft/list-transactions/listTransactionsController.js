angular.module("app")
        .controller("listTransactionsController", listTransactionsController);

function listTransactionsController(listTransactionsService) {

    var vm = this;
    vm.message = "Hello from listTransactions";
    vm.bank = 'printReady';
    getRefundData();
    
    vm.getRefund = function getRefund() {
        getRefundData();
    };



    function getRefundData() {
        return listTransactionsService.getBalanceHistory().then(
                function(data) {
                    var obj = jQuery.parseJSON(data);
                    if(obj.status==="OK"){
                              vm.queueData = obj;
                    }
                    else {
                         var noMenuHtml = '<center><h3 id="bodyParagraph">Access Denied</h3></center>';

                                document.getElementById("injectedDiv").innerHTML = noMenuHtml;
                    }
              
                },
                function(error) {
                    vm.errorMessage = 'A problem has occured ! Try Again !';
                }
        );
    }
    vm.exportReport = function exportReport() {
        var date = new Date();
        var yyyy = date.getFullYear();
        var mm = date.getMonth() < 9 ? "0" + (date.getMonth() + 1) : (date.getMonth() + 1); // getMonth() is zero-based
        var dd = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
        var hh = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
        var min = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
        var datestring = 'Refund_Data_' + yyyy + '_' + mm + '_' + dd + '_' + hh + '_' + min;
        $(".reference").table2excel({
            exclude: ".noExl",
            name: "Excel Document Name",
            filename: datestring
        });
    };

}