/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

angular.module("app")
        .factory("listTransactionsService", listTransactionsService);

function listTransactionsService($http, $q) {
    var main = {};


    main.getBalanceHistory = getBalanceHistory;


    function getBalanceHistory() {
        var deferred = $q.defer();
        $.ajax({
            type: "POST",
//            dataType: 'JSON',
            url: "RefundList",
//            data: {"bank":bank},
            success: function(result) {
                deferred.resolve(result);
            },
            error: function(err) {
                deferred.reject(err);
            }
        });

//        $http.post('RefundList')
//                .success(function(data) {
//            deferred.resolve(data);
//        })
//                .error(function(err) {
//            console.log('error -> ' + err);
//            deferred.reject(err);
//        });

        return deferred.promise;
    }
    return main;
}
