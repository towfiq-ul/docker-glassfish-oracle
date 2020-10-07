angular.module("app")
        .controller("generateFilesController", generateFilesController);

function generateFilesController(generateFilesService) {
    var vm = this;
    vm.balance = '';
    vm.message = "Hello from Current Balance";
    vm.slot_no = 'Slot_1';
    vm.chargeSlot_no = 'Slot_1';
    //displayBalance();

    vm.generateFiles = function generateFiles() {
        displayResult();
    };
    vm.generateChargeFiles = function generateChargeFiles(){
        displayChargeRedsult();
    };
    vm.sendScheduleRefundFiles = function sendScheduleRefundFiles(){
        displayScheduleRefundResult();
    };
    

    function displayResult() {
        var slot_no = vm.slot_no;
        let element = document.getElementById("responses");
        element.innerText = 'Sending...';
        return generateFilesService.generateFiles(slot_no).then(
                function(data) {
                    vm.status =data;
                    element.innerText = data;
                },
                function(error) {
                    console.log('error found');
                }
        );
    }
    function displayChargeRedsult() {
        var chargeSlot_no = vm.chargeSlot_no;
        return generateFilesService.generateChargeFiles(chargeSlot_no).then(
                function(data) {
                    vm.chargeStatus =data;
                },
                function(error) {
                    console.log('error found');
                }
        );
    }
    function displayScheduleRefundResult() {
        return generateFilesService.sendScheduleRefundFiles().then(
                function(data) {
                    vm.scheduleRefundStatus =data;
                },
                function(error) {
                    console.log('error found');
                }
        );
    }
}