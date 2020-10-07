/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

angular.module("app")
        .factory("msfReportService", msfReportService);

function msfReportService($http, $q) {
    var main = {};


    main.getMsfReportData = getMsfReportData;


    function getMsfReportData() {
        var deferred = $q.defer();
        $.ajax({
            type: "POST",
//            dataType: 'JSON',
            url: 'https://' + window.location.host + '/bkash.tool/api/refund_eft/msf_report_list',
//            url: "msf_report",
//            data: {"bank":bank},
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
