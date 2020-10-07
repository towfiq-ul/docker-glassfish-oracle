angular.module("app")
        .controller("userManagementController", userManagementController);

function userManagementController(userManagementService) {
    var vm = this;
    vm.message = "Hello from User Management Controller";
    loadUserManagementData();

    function loadUserManagementData() {

        return userManagementService.getUserManagementData().then(
                function(data) {
                    // console.log(data);
                    var obj = jQuery.parseJSON(data);
                    //   vm.roleList = obj.role;
                    //    vm.userList = obj.user;
                    vm.userInfo = obj;
                    //        console.log('userInfo: ' + vm.userInfo);
//                    console.log('User List: ' + vm.userList);
                },
                function(error) {
                    console.log('error found');
                }
        );
    }


    vm.createUser = function createUser() {
        var e = document.getElementById("selectedRole");
        var role = e.options[e.selectedIndex].value;
        var valid = true;
        var message = '';
        if (vm.userName !== undefined && vm.userName.length > 0 && role !== '?') {
            valid = true;
        }
        else {
            valid = false;
            message = 'Please fill mandatory fields';
        }
        if (valid) {
            // console.log('To Create User: ' + vm.userName + ' RoleId: ' + role);

            return userManagementService.addUser(vm.userName, role).then(
                    function(data) {
                        document.getElementById("createUserMsg").innerHTML = data;
                        document.getElementById("addUserFormId").reset();
                        vm.userName='';
                        loadUserManagementData();
                    },
                    function(error) {
                        console.log('error found');
                    }
            );
        }
        else {
            alertify.alert(message);

        }


    };

    vm.removeUser = function removeUser(email) {

        console.log('To Remove User: ' + email);
        document.getElementById("ui-layout-table").innerHTML = "Do you want to Remove User: <b>" + email + " ?</b>";
        $("#ui-layout-table").dialog({
            title: 'Remove User!!',
            height: 150,
            width: 300,
            modal: true,
            buttons: {
                Ok: function() {
                    removeUserServiceCall(email);
                    loadUserManagementData();
                    $(this).dialog("close");
                },
                Cancel: function() {
                    // alertify.success('You cancelled the operation');
                    $(this).dialog("close");
                }
            }
        });
    };

    function removeUserServiceCall(email) {
        return userManagementService.removeUser(email).then(
                function(data) {
                    alertify.success(data);
                },
                function(error) {
                    console.log('error found');
                }
        );
    }
}