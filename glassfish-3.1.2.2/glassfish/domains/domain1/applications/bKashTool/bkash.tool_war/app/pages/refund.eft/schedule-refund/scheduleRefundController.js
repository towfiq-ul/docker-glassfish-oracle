angular.module("app")
    .controller("scheduleRefundController", scheduleRefundController);

function scheduleRefundController(scheduleRefundService) {
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

    vm.onGeneratedFiles = function () {
        alertify.confirm("Do you want to generate files?", function(isConfirmed){
            if(isConfirmed){
                vm.sendScheduleRefundFiles();
            }
        })
    };


    function displayResult() {
        var slot_no = vm.slot_no;
        return scheduleRefundService.generateFiles(slot_no).then(
            function(data) {
                vm.status =data;
            },
            function(error) {
                console.log('error found');
            }
        );
    }
    function displayChargeRedsult() {
        var chargeSlot_no = vm.chargeSlot_no;
        return scheduleRefundService.generateChargeFiles(chargeSlot_no).then(
            function(data) {
                vm.chargeStatus =data;
            },
            function(error) {
                console.log('error found');
            }
        );
    }
    function displayScheduleRefundResult() {
        let element = document.getElementById("responses");
                element.innerText = 'Sending...';
        return scheduleRefundService.sendScheduleRefundFiles().then(
            function(data) {
                vm.scheduleRefundStatus =data;
                element.innerText = data;
            },
            function(error) {
                console.log('error found');
            }
        );
    }
}