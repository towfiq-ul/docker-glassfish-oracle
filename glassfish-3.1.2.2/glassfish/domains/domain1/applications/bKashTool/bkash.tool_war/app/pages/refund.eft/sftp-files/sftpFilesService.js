/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

angular.module("app")
        .factory("sftpFilesService", sftpFilesService);

function sftpFilesService($http, $q) {
    var main = {};


    main.checkTrxStatus = checkTrxStatus;
    

    

    function checkTrxStatus(slot_no) {


        var deferred = $q.defer();

//        $http.post('LiftingRequest', formData2)
//                .success(function(data) {
//            deferred.resolve(data);
//        })
//                .error(function(err) {
//            console.log('error -> ' + err);
//            deferred.reject(err);
//        });
        $.ajax({
            type: "POST",
//            dataType: 'JSON',
            url: "SFTPEftFiles",
            data: {"slot_no":slot_no},
            success: function(result) {
                deferred.resolve(result);
            },
            error: function(err) {
                deferred.reject(err);
            }
        });
        return deferred.promise;
    }

    return main;
}
