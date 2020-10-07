angular.module("app")
        .factory("userManagementService", userManagementService);

function userManagementService($http, $q) {
    var main = {};

    main.getUserManagementData = getUserManagementData;
    main.addUser = addUser;
    main.removeUser = removeUser;

    function getUserManagementData() {
        var deferred = $q.defer();
        $.ajax({
            type: "POST",
            url: "UserManagementData",
            success: function(result) {
                deferred.resolve(result);
            },
            error: function(err) {
                deferred.reject(err);
            }
        });
        return deferred.promise;
    }
    function addUser(userName, roleId) {
        var deferred = $q.defer();
        $.ajax({
            type: "POST",
            url: "AddUser",
            data: {"userName": userName, "roleId": roleId},
            success: function(result) {
                deferred.resolve(result);
            },
            error: function(err) {
                deferred.reject(err);
            }
        });
        return deferred.promise;
    }
    function removeUser(userName) {
        var deferred = $q.defer();
        $.ajax({
            type: "POST",
            url: "RemoveUser",
            data: {"userName": userName},
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



