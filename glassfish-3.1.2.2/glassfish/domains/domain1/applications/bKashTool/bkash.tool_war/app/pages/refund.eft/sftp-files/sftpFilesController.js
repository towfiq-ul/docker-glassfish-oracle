angular.module("app")
        .controller("sftpFilesController", sftpFilesController);

function sftpFilesController(sftpFilesService) {

    var vm = this;
    vm.message = "Hello from sftpFiles";
    vm.slot_no = 'Slot_1';

//    vm.fileListing = function() {
//        var test = '';
//        var inp = document.getElementById('file');
//        for (var i = 0; i < inp.files.length; i++) {
//            var name = inp.files.item(i).name;
//            test = test + '<li>' + name + '</li>';
//        }
//        document.getElementById("fileListPrint").innerHTML = '<ul>' + test + '</ul>';
//
//    };

    vm.addLifting = function() {

//        var fileName = $("#file").val();
//        console.log('fileName : ' + fileName);
        console.log('slot_no : ' + vm.slot_no);
//
//        fileName = fileName.replace(/C:\\fakepath\\/i, '');
//        console.log('RE-fileName : ' + fileName);

        var valid = true;
//        var message = '';
//        if (fileName !== null && fileName!=='') {
//            valid = true;
//        }
//        else {
//            message = 'Please Upload file';
//            valid = false;
//        }

        if (valid)
        {
//            var formData = new FormData(document.getElementById('statusCheckFormId'));
            return sftpFilesService.checkTrxStatus(vm.slot_no).then(
                    function(data) {
                        vm.status = data;
//                        var createMSG = null;
//                        // console.log('TRX Status Check Success: ' + data);
//                        document.getElementById("statusCheckFormId").reset();
//                        document.getElementById("fileListPrint").innerHTML = "";
//                        if (data.code === '0000') {
//                            createMSG = "<div class='form-message success'>" + data.message + "</div>";
//                        }
//                        else {
//                            createMSG = "<div class='form-message error'>" + data.message + "</div>";
//
//                        }
//
//                        document.getElementById("createMsg").innerHTML = createMSG;

                    },
                    function(error) {
                        console.log('error found');
                    }
            );
        }
        else
            alertify.alert(message);
    };

}
