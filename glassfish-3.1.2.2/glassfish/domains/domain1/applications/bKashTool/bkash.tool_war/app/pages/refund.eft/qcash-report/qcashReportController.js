angular.module("app")
        .controller("qcashReportController", qcashReportController);

function qcashReportController(qcashReportService) {
    var vm = this;
    //vm.balance = '';
    vm.message = "Hello from Current Balance";
   // vm.slot_no = 'Slot_1';
   // vm.chargeSlot_no = 'Slot_1';
    //displayBalance();

    vm.generateFiles = function generateFiles() {
        displayResult();
    };

    function displayResult() {
        return qcashReportService.generateFiles().then(
                function(data) {
                    vm.status =data;
                },
                function(error) {
                    console.log('error found');
                }
        );
    }    
}