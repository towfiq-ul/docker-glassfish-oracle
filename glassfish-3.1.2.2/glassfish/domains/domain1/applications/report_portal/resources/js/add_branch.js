$(document).ready(function() {
    $("#data_ho").html('');
    $("#data_ro").html('');
    $("#data_bo").html('');
    loadUserTree('-1', '-1', null, null);
});


function loadUserTree(recognitionId, layerId, merchantType, outletName) {
    console.log('loadUerTree Called with: ' + recognitionId + '::' + layerId);
    // alert('Hello');

    $.ajax(
            {
                url: 'UserTreeData',
                dataType: 'text',
                Accept: "text/html",
                type: 'POST',
                data: {"recognitionId": recognitionId, "layerId": layerId},
                success: function(data)
                {
                    obj = jQuery.parseJSON(data);
                    var childlayerId;
                    var menuData;
                    if (obj.length < 1)
                    {
                        if (layerId === '-1') {
                            childlayerId = '21';
                        }
                        else if (layerId === '21') {
                            childlayerId = '22';
                        }
                        else if (layerId === '31') {
                            childlayerId = '32';
                        }
                        else if (layerId === '32') {
                            childlayerId = '33';
                        }
                        else if (layerId === '61') {
                            childlayerId = '62';
                        }
                        menuData = "<ul id='floatMenu' class='mainmenu' style='top: 0px; '>";

                        menuData += "<li>";
                        menuData += "<a href='#'>" + 'No Child Found' + "</a>";
                        menuData += "</li>";

                        if (layerId !== '-1') {
                            menuData += "<li>";
                            menuData += "<a href='#' onclick=\"addBranch('" + recognitionId + "', '" + childlayerId + "', '" + merchantType + "', '" + outletName + "');\">" + '++Add Child' + "</a>";
                            menuData += "</li>";
                        }
                        else {
                            menuData += "<li>";
                            menuData += "<a href=\"#\" onclick=\"loadPage('add_user.html');\">++Add Child</a>";
                            menuData += "</li>";
                        }

                        menuData += "</ul>";

                    } else {

                        childlayerId = obj[0].layerId;

                        console.log('Tree Data: ' + data);

                        menuData = "<ul id='floatMenu' class='mainmenu' style='top: 0px; '>";
                        for (var i = 0; i < obj.length; i++) {
                            menuData += "<li>";
                            menuData += "<a href='#' onclick=\"loadUserTree('" + obj[i].recognitionId + "', '" + obj[i].layerId + "', '" + obj[i].merchantType + "', '" + obj[i].outletName + "');\">" + obj[i].outletName + "</a>";
                            menuData += "</li>";
                        }
                        if (layerId !== '-1') {
                            menuData += "<li>";
                            menuData += "<a href='#' onclick=\"addBranch('" + recognitionId + "', '" + childlayerId + "', '" + merchantType + "', '" + outletName + "');\">" + '++Add Child' + "</a>";
                            menuData += "</li>";
                        }
                        else {
                            menuData += "<li>";
                            menuData += "<a href=\"#\" onclick=\"loadPage('add_user.html');\">++Add Child</a>";
                            menuData += "</li>";
                        }

                        menuData += "</ul>";
                    }

                    var divId;
                    if (childlayerId === '41' || childlayerId === '21' || childlayerId === '31' || childlayerId === '11' || childlayerId === '66' || childlayerId === '67' || childlayerId === '61' || childlayerId === '10') {
                        divId = 'data_ho';
                        $("#data_ho").html(menuData);
                        $("#data_ro").html('');
                        $("#data_bo").html('');
                    }
                    else if (childlayerId === '22' || childlayerId === '32' || childlayerId === '62') {
                        divId = 'data_ro';
                        $("#data_ro").html('');
                        $("#data_bo").html('');
                        $("#data_ro").html(menuData);
                    }
                    else if (childlayerId === '33') {
                        divId = 'data_bo';
                        $("#data_bo").html('');
                        $("#data_bo").html(menuData);
                    }
                    console.log('Selected Div ID: ' + divId);


                },
                error: function(data)
                {

                }
            });


}

function addBranch(parentRecognitionId, layerId, merchantType, outletName) {
    console.log('Adding Branch/Region: ParentRecognitionID: ' + parentRecognitionId + ' Own LayerId: ' + layerId + ' Merchant Type: ' + merchantType + ' OutletName: ' + outletName);
    $("#input_branch_data").html('');
//    $('#input_branch_data').load('resources/static_pages/input_branch.html');
    var parentRecognitionId2 = "<input type='hidden' name='parentRecognitionId' id='parentRecognitionId' value='" + parentRecognitionId + "'>";
    var layerId2 = "<input type='hidden' name='layerId' id='layerId' value='" + layerId + "'>";
    var merchantType2 = "<input type='hidden' name='merchantType' id='merchantType' value='" + merchantType + "'>";

    $("#input_branch_data").append(parentRecognitionId2);
    $("#input_branch_data").append(layerId2);
    $("#input_branch_data").append(merchantType2);
    var heading = '<h3>Add Child for ' + outletName + '</h3>';
    var inputHtml = '<table><tbody><tr><td style="text-align:right">';
    inputHtml += '<label for="username">User Name</label></td>';
    inputHtml += '<td><input type="text" name="username" id="username"/></td></tr>';
    inputHtml += '<tr><td style="text-align:right">';
    inputHtml += '<label for="outletName">Outlet Name</label></td>';
    inputHtml += '<td><input type="text" name="outletName" id="outletName"/></td></tr>';

    inputHtml += '<tr><td style="text-align:right">';
    inputHtml += '<label for="merchantWallet">Merchant Wallet</label></td>';
    inputHtml += '<td><input type="text" name="merchantWallet" id="merchantWallet"/></td></tr>';

    inputHtml += '<tr><td style="text-align:right"><label for="cash_settlement">Select Cash Settlement</label></td>';
    inputHtml += '<td><select name="cash_settlement" id="cash_settlement">';
    inputHtml += '<option value="Daily">Daily</option>';
    inputHtml += '<option value="Fortnight">Fortnight</option>';
    inputHtml += '<option value="Monthly">Monthly</option>';
    inputHtml += '<option value="On Request">On Request</option>';
    inputHtml += '<option value="weekly">weekly</option>';
    inputHtml += '<option value="EFT Issue">EFT Issue</option>';
    inputHtml += '</select></td></tr>';

    inputHtml += '<tr><td style="text-align:right">';
    inputHtml += '<label for="address">Address</label></td>';
    inputHtml += '<td><textarea type="textarea" name="address" id="address"></textarea></td></tr>';


    inputHtml += '<tr><td style="text-align:right">';
    inputHtml += '<label for="email">Email Address</label></td>';
    inputHtml += '<td><input type="text" name="email" id="email"/></td></tr>';


    inputHtml += '<tr><td></td><td><button type="button" onclick="addBranchInput();">Add Branch</button></td></tr></tbody></table>';
    $("#input_branch_data").append(heading);
    $("#input_branch_data").append(inputHtml);
}
function addBranchInput() {
    var parentRecognitionId = document.getElementById("parentRecognitionId").value;
    console.log('parentRecognitionId: ' + parentRecognitionId);
    var layerId = document.getElementById("layerId").value;
    console.log('layerId: ' + layerId);
    var merchantType = document.getElementById("merchantType").value;
    console.log('merchantType: ' + merchantType);
    var username = document.getElementById("username").value;
    console.log('username: ' + username);

    var outletName = document.getElementById("outletName").value;
    console.log('outletName: ' + outletName);
    var merchantWallet = document.getElementById("merchantWallet").value;
    console.log('merchantWallet: ' + merchantWallet);

    var e = document.getElementById("cash_settlement");
    var cash_settlement = e.options[e.selectedIndex].value;

    var address = document.getElementById("address").value;
    console.log('address: ' + address);
    var email = document.getElementById("email").value;
    console.log('email: ' + email);
    $.ajax(
            {
                url: 'AddChild',
                dataType: 'text',
                Accept: "text/html",
                type: 'POST',
                data: {"parentRecognitionId": parentRecognitionId, "layerId": layerId, "merchantType": merchantType, "username": username, "outletName": outletName, "merchantWallet": merchantWallet, "cashSettlement": cash_settlement, "address": address,"email":email},
                success: function(data)
                {
                    $("#input_branch_data").html('');
                    obj = jQuery.parseJSON(data);
                    console.log(obj);
                    if (obj.responseCode === '0000')
                        $("#input_branch_data").html('<div class="form-message success">Child Added Successfully</div>');
                    else
                        $("#input_branch_data").html('<div class="form-message error">' + obj.responseMessage + '</div>');
                },
                error: function(data)
                {

                }
            });

}



