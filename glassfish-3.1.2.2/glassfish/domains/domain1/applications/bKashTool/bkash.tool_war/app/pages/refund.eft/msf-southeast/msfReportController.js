angular.module("app")
        .controller("msfReportController", msfReportController);

function msfReportController(msfReportService) {

    var vm = this;
    vm.message = "Hello from msfReportService";
    vm.bank = 'printReady';
   
    msfReportData();
    
    vm.getmsfreport = function getmsfreport() {
        msfReportData();
    };


    function msfReportData() {
        return msfReportService.getMsfReportData().then(
                function(data) {   
                    
                    if(data.status==="Ok"){
                        
                             console.log(data.data);
                             vm.reportlist=data.data;
                    }
                    else {
                        // var noMenuHtml = '<center><h3 id="bodyParagraph">Access Denied</h3></center>';
                        //   document.getElementById("injectedDiv").innerHTML = noMenuHtml;
                    }
              
                },
                function(error) {
                    vm.errorMessage = 'A problem has occured ! Try Again !';
                }
        );
    }


}