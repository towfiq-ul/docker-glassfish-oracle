/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

angular.module("app")
        .controller("mainController", mainController);
        function mainController(mainService) {
        var vm = this;
                vm.message = "Hello from home";
                getMenuConfiguration();
                function getMenuConfiguration() {

                console.log('Getting Menu Configuration');
                        return mainService.getAllMenu().then(
                        function(data) {
//                    var obj=jQuery.parseJSON(data);
                        var obj = data;
                                //  vm.menu = data;
                                //  console.log("Data Found: "+ data);
                                console.log('User: ' + obj.user);
                                document.getElementById("user_name").innerHTML = '<a>(' + obj.user + ')</a>';
                                if (obj.status === 'OK') {
                        var currentAppId = - 1;
                                var menuHtml = "";
                                for (var i = 0; i < obj.menu.length; i++) {
                        if (currentAppId !== obj.menu[i].appId) {
                        currentAppId = obj.menu[i].appId;
                                var parentLi = document.createElement("li");
                                parentLi.setAttribute("class", "dropdown");
                                menuHtml += '<a href="" class="dropdown-toggle" data-toggle="dropdown" role="button">' + obj.menu[i].appName + '<span class="caret"></span></a>';
                                menuHtml += '<ul class="dropdown-menu" role="menu">';
                        }
                        menuHtml += '<li><a href="#/' + obj.menu[i].menuHref + '" >' + obj.menu[i].menuName + '</a></li>';
                                if (i === obj.menu.length - 1 || currentAppId !== obj.menu[i + 1].appId) {
                        parentLi.innerHTML = menuHtml;
                                document.getElementById('menu_ul').appendChild(parentLi);
                                menuHtml = "";
                        }
                        }
                        }
                        else {
                        var noMenuHtml = '<center><h3 id="bodyParagraph">No Menu Found. Please contact administrator</h3></center>';

                                document.getElementById("no_menu").innerHTML = noMenuHtml;
                        }


                        },
                        function(error) {
                        vm.errorMessage = 'A problem has occurred ! Try Again !';
                        }
                );
                }
        }
