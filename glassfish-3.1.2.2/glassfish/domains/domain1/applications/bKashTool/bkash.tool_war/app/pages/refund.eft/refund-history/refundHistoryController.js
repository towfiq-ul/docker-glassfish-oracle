angular.module("app")
        .controller("refundHistoryController", refundHistoryController);

function refundHistoryController() {
    var vm = this;
    vm.today = getToday();

//    vm.downloadFiles = function downloadFiles() {
//        var fromDate = document.getElementById("fromDate").value;
//        var parameter = "date=" + fromDate;
//        window.location = "RefundHistory?" + parameter;
//    };

    vm.downloadFiles1 = function downloadFiles1() {
        var fromDate = document.getElementById("fromDate").value;
        var toDate = document.getElementById("toDate").value;
        var parameter = "fromDate=" + fromDate + "&toDate=" + toDate;
        window.location = "RefundHistoryDetails?" + parameter;
    };

    vm.downloadFiles2 = function downloadFiles2() {
        var fromDate = document.getElementById("fromDate2").value;
        var toDate = document.getElementById("toDate2").value;
        var parameter = "fromDate=" + fromDate + "&toDate=" + toDate;
        window.location = "RefundListDetails?" + parameter;
    };


    function getToday() {
        var date = new Date();
        var yyyy = date.getFullYear();
        var mm = date.getMonth() < 9 ? "0" + (date.getMonth() + 1) : (date.getMonth() + 1); // getMonth() is zero-based
        var dd = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
        var datestring = yyyy + '-' + mm + '-' + dd;
        return datestring;
    }

}