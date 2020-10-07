angular.module("app")
        .factory("generateFilesService", generateFilesService);

function generateFilesService($http, $q) {
    var main = {};

    main.generateFiles = generateFiles;
    main.generateChargeFiles = generateChargeFiles;
    main.sendScheduleRefundFiles = sendScheduleRefundFiles;
    
    
    function generateFiles(slot_no) {
        var deferred = $q.defer();
        $.ajax({
            type: "POST",
//            dataType: 'JSON',
            url: "GenerateFiles",
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
    function generateChargeFiles(slot_no) {
        var deferred = $q.defer();
        $.ajax({
            type: "POST",
//            dataType: 'JSON',
            url: "GenerateChargeFiles",
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
    function sendScheduleRefundFiles() {
        var deferred = $q.defer();
        $.ajax({
            type: "POST",
            url: "SendScheduleRefundFiles",
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



