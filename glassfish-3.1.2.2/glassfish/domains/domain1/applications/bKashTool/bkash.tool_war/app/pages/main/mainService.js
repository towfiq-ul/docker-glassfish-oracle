/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

angular.module("app")
        .factory("mainService", mainService);

function mainService($http, $q) {
    var main = {};

    main.getAllMenu = getAllMenu;

    function getAllMenu() {

        var deferred = $q.defer();

//        $http.post('/bkash.tool/app/shared/static_menu.html')
        $http.post('UserMenu')
                .success(function(data) {
            deferred.resolve(data);
        })
                .error(function(err) {
            console.log('error -> ' + err);
            deferred.reject(err);
        });

        return deferred.promise;
    }

    return main;
}
