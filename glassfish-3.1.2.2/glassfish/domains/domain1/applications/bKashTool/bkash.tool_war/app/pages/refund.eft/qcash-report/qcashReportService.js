angular.module("app")
        .factory("qcashReportService", qcashReportService);

function qcashReportService($http, $q) {
    var main = {};

    main.generateFiles = generateFiles;   
    
    function generateFiles() {
        var deferred = $q.defer();
        $.ajax({
            type: "POST",
//            dataType: 'JSON',
            url: "GenerateQcashFiles",
            //data: {"slot_no":slot_no},
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



