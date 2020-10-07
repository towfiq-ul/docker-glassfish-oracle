$(document).ready(function() {
    loadAllUser(null, '%%');
});

function loadAllUser(profileUid, userLayer) {
    $("#user_table td").remove();
    $("#UserTableDIV").html("");
    $.ajax({
        url: 'https://' + window.location.host + '/mr_portal/api/merchantreport/get_all_user',
        dataType: 'text', //Accept Type
        type: 'POST',
        data: {"merchantName": profileUid, "userLayer": userLayer},
        success: function(data)
        {
//            var obj=data;
            var obj = jQuery.parseJSON(data);
            //     console.log('OnSuccess: ' + data);
            var tableData = '<table class="reference" style="width: 1500px;" id="user_table">';
            tableData += "<tbody><tr><th>Serial No</th><th>Profile UID</th><th>User Name</th><th >Merchant/Outlet Name</th><th>Wallet No</th><th>Cash Settlement</th><th>Email</th><th>Layer Definitoin</th><th>Added By</th><th>Added On</th><th>Edit</th><th>Remove</th><th>Password Reset</th></tr></tbody>";
            for (var i = 0; i < obj.length; i++) {
                var row = "<tr>";
                row += "<td>" + (i + 1) + "</td>";
                row += "<td>" + obj[i].profileUid + "</td>";
                if (obj[i].layerId === '21' || obj[i].layerId === '31' || obj[i].layerId === '61')
                    row += "<td><b>" + obj[i].userName + "</b></td>";
                else
                    row += "<td>" + obj[i].userName + "</td>";
                row += "<td>" + obj[i].merchantName + "</td>";
                row += "<td>" + obj[i].walletNo + "</td>";
                row += "<td>" + obj[i].cashSettlement + "</td>";
                row += "<td>" + obj[i].email + "</td>";
                row += "<td>" + obj[i].layerDefinition + "</td>";
                row += "<td>" + obj[i].addedBy + "</td>";
                row += "<td>" + obj[i].addedOn + "</td>";

                row += "<td><img src='resources/images/edit.png' alt='Edit' height='30' width='30' onclick=\"" + "editAction('" + obj[i].recognitionId + "','" + obj[i].layerId + "','" + obj[i].userName + "')" + "\"></td>";
                if (obj[i].layerId !== '21' && obj[i].layerId !== '31' && obj[i].layerId !== '61')
                    row += "<td><img src='resources/images/delete.png' alt='Delete' height='30' width='30' onclick=\"" + "deleteAction('" + obj[i].recognitionId + "','" + obj[i].merchantWallet + "','" + obj[i].userName + "')" + "\"></td>";
                else
                    row += "<td></td>";
                row += "<td><img src='resources/images/pass_reset1.png' alt='Edit' height='40' width='40' onclick=\"" + "passReset('" + obj[i].recognitionId + "','" + obj[i].userName + "')" + "\"></td>";
                row += "</tr>";
                // $('#user_table').append(row);
                tableData += row;
            }
            tableData += "</tbody></table>";
            $("#UserTableDIV").html(tableData);
        },
        error: function(data)
        {
        },
        complete: function(data) {

        }
    });
}


$('#searchUser').click(function() {
    $("#user_table td").remove();
    var profileUID = document.getElementById("searchProfileUID").value;
    var e = document.getElementById("layer_id");
    var layer_id = e.options[e.selectedIndex].value;
    loadAllUser(profileUID, layer_id);

});
$('#exportUser').click(function() {
    exportAllUser();
});

function editAction(rId, layerId, userName) {

    $.ajax({
        url: 'https://' + window.location.host + '/mr_portal/api/merchantreport/get_edit_data',
        dataType: 'text', //Accept Type
        type: 'POST',
        data: {"recognitionId": rId, "layerId": layerId, "userName": userName},
        success: function(data)
        {
            console.log(data);
//            var obj=data;
            var obj = jQuery.parseJSON(data);
            makeEditableUI(obj);
        },
        error: function(data)
        {
        },
        complete: function(data) {

        }
    });

}
function makeEditableUI(data) {
    var obj = data;
    var htmlData = '<input type="hidden" name="recognitionId" id="recognitionId" value="' + obj.recognitionId + '"/>';
    htmlData += '<table border="0">';
    htmlData += '<tr>';
    htmlData += '<td><label for="merchantName">Merchant Name</label></td>';
    htmlData += '<td><input  type="text" name="merchantName" id="merchantName" value="' + obj.merchantName + '" readonly="true" style="background-color: grey;"/></td>';
    htmlData += '</tr>';

    htmlData += '<tr>';
    htmlData += '<td><label for="merchantWallet">Merchant Account No</label></td>';
    htmlData += '<td><input  type="text" name="merchantWallet" id="merchantWallet" value="' + obj.merchantWallet + '" readonly="true" style="background-color: grey;" /></td>';
    htmlData += '</tr>';

    htmlData += '<tr>';
    htmlData += '<td><label for="profileUid">Profile UID</label></td>';
    htmlData += '<td><input  type="text" name="profileUid" id="profileUid" value="' + obj.profileUid + '" readonly="true" style="background-color: grey;"/></td>';
    htmlData += '</tr>';


    htmlData += '<tr>';
    htmlData += '<td><label for="userName">User Name</label></td>';
    htmlData += '<td><input  type="text" name="userName" id="userName" value="' + obj.userName + '" readonly="true" style="background-color: grey;"/></td>';
    htmlData += '</tr>';

    htmlData += '<tr>';
    htmlData += '<td><label for="email">Email</label></td>';
    htmlData += '<td><input  type="text" name="email" id="email" value="' + obj.email + '" /></td>';
    htmlData += '</tr>';

    if (obj.layerId === '66' || obj.layerId === '11' || obj.layerId === '62' || obj.layerId === '22' || obj.layerId === '10') {
        htmlData += '<tr>';
        htmlData += '<td><label for="newMerchantWallet">Change Merchant Account</label></td>';
        htmlData += '<td><input  type="text" name="newMerchantWallet" id="newMerchantWallet" value="' + obj.merchantWallet + '"  /></td>';
        htmlData += '</tr>';
    }
    if (obj.cashSettlement !== 'NA') {
        //
        htmlData += '<tr>';
        htmlData += '<td><label for="sType">Cash Settlement </label></td>';
        htmlData += '<td><select id="sType" name="sType">';
        for (var i = 0; i < obj.settlementTypes.length; i++) {
            if (obj.settlementTypes[i] === obj.cashSettlement)
                htmlData += '<option value="' + obj.settlementTypes[i] + '" selected>' + obj.settlementTypes[i] + '</option>';
            else
                htmlData += '<option value="' + obj.settlementTypes[i] + '">' + obj.settlementTypes[i] + '</option>';
        }
        htmlData += '</select></td>';
        htmlData += '</tr>';

        //
    }
    if (obj.layerId === '66' || obj.layerId === '11') {
        htmlData += '<tr>';
        htmlData += '<td><label for="lType">Layers</label></td>';
        htmlData += '<td><select id="lType" name="lType">';
        for (var i = 0; i < obj.layerIdList.length; i++) {
            var layers = obj.layerIdList[i].split("#");
            if (layers[0] === obj.layerId)
                htmlData += '<option value="' + layers[0] + '" selected>' + layers[1] + '</option>';
            else
                htmlData += '<option value="' + layers[0] + '">' + layers[1] + '</option>';
        }
        htmlData += '</select></td>';
        htmlData += '</tr>';
    }

    for (var j = 0; j < obj.prop.length; j++) {
        htmlData += '<tr>';
        htmlData += '<td><label for="' + obj.prop[j].propId + '">' + obj.prop[j].propDescription + ' </label></td>';
        htmlData += '<td><input  type="text" name="' + obj.prop[j].propId + '" id="' + obj.prop[j].propId + '" value="' + obj.prop[j].value + '"/><br/></td>';
        htmlData += '</tr>';
    }
    htmlData += '</table>';

    document.getElementById("ui-layout-table").innerHTML = htmlData;
    $("#ui-layout-table").dialog({
        title: 'Edit Data',
        height: 500,
        width: 600,
        modal: true,
        resizable: false,
        buttons: {
            Save: function() {
                var recognitionId = document.getElementById("recognitionId").value;
                var catSett = null;
                if (obj.cashSettlement !== 'NA') {
                    var e = document.getElementById("sType");
                    catSett = e.options[e.selectedIndex].value;
                }
                var newLayer = null;
                if (obj.layerId === '66' || obj.layerId === '11') {
                    var e = document.getElementById("lType");
                    newLayer = e.options[e.selectedIndex].value;
                }
                var newWallet = null;
                if (obj.layerId === '10' || obj.layerId === '11' || obj.layerId === '22' || obj.layerId === '62' || obj.layerId === '66') {
                    //alert('Getting New Wallet of '+ obj.layerId);
                    newWallet = document.getElementById("newMerchantWallet").value;
                }
                // alertify.success('User Saved operation ' + recognitionId);
                //
                var email = document.getElementById("email").value;

                var finalJson = {};
                var newProperty = [];
                for (var j = 0; j < obj.prop.length; j++) {
                    item = {};
                    item["propId"] = obj.prop[j].propId;
                    item["value"] = document.getElementById(obj.prop[j].propId).value;
                    newProperty.push(item);
                    //                
                }
                finalJson["recognitionId"] = recognitionId;
                finalJson["layerId"] = obj.layerId;
                finalJson["newLayerId"] = newLayer;
                finalJson["cashSettlement"] = obj.cashSettlement;
                finalJson["newCashSettlement"] = catSett;
                finalJson["merchantWallet"] = document.getElementById("merchantWallet").value;
                finalJson["newMerchantWallet"] = newWallet;
                finalJson["prop"] = newProperty;
                finalJson["email"] = email;
                console.log('Final output Json : ' + JSON.stringify(finalJson));
                //Api Call
                $.ajax({
                    url: 'https://' + window.location.host + '/mr_portal/api/merchantreport/post_edit_data',
                    contentType: 'application/json; charset=UTF-8', //Sending Type
                    dataType: 'text', //Accept Type
                    type: 'POST',
                    data: JSON.stringify(finalJson),
                    success: function(data)
                    {
                        var obj = JSON.parse(data);
                        alertify.success('User Edit : ' + obj.responseMessage);
                    },
                    error: function(data)
                    {

                    }, complete: function(data) {

                    }

                });
                //  dialog.dialog("close");
                $(this).dialog("close");
                //    loadAllUser(null);
                $("#user_table td").remove();
                var profileUID = document.getElementById("searchProfileUID").value;
                var e = document.getElementById("layer_id");
                var layer_id = e.options[e.selectedIndex].value;
                loadAllUser(profileUID, layer_id);
            },
            Cancel: function() {
                alertify.success('You Cancelled the operation');
                $(this).dialog("close");
            }
        }
    });
}

function deleteAction(rId, merchantWallet, userName) {
    document.getElementById("ui-layout-table").innerHTML = "Do you want to Delete User : " + userName + " ?";
    $("#ui-layout-table").dialog({
        title: 'Delete!!',
        height: 200,
        width: 300,
        modal: true,
        buttons: {
            Ok: function() {
                // alertify.success('To Delete: ' + rId + ' ' + layerId);
                $.ajax({
                    url: 'https://' + window.location.host + '/mr_portal/api/merchantreport/user_remove_admin',
                    dataType: 'text', //Accept Type
                    type: 'POST',
                    data: {"recognitionId": rId, "userName": userName, "merchantWallet": merchantWallet},
                    success: function(data)
                    {
                        var obj = JSON.parse(data);
                        alertify.success('User Remove : ' + obj.responseMessage);
                    },
                    error: function(data)
                    {
                    },
                    complete: function(data) {

                    }
                });

                $(this).dialog("close");
                // loadAllUser(null);
                $("#user_table td").remove();
                var profileUID = document.getElementById("searchProfileUID").value;
                var e = document.getElementById("layer_id");
                var layer_id = e.options[e.selectedIndex].value;
                loadAllUser(profileUID, layer_id);
            },
            Cancel: function() {
                $(this).dialog("close");
            }
        }
    });
}
function passReset(rId, userName) {
    document.getElementById("ui-layout-table").innerHTML = "Do you want to reset password for : " + userName + "?";
    $("#ui-layout-table").dialog({
        title: 'Reset!!',
        height: 200,
        width: 300,
        modal: true,
        buttons: {
            Ok: function() {
                //   alertify.success('To Reset: ' + rId + ' ' + userName);
                $.ajax({
                    url: 'https://' + window.location.host + '/mr_portal/api/merchantreport/pass_reset_admin',
                    dataType: 'text', //Accept Type
                    type: 'POST',
                    data: {"recognitionId": rId, "userName": userName},
                    success: function(data)
                    {
                        var obj = JSON.parse(data);
                        alertify.success('User Pass Reset : ' + obj.responseMessage);
                    },
                    error: function(data)
                    {
                    },
                    complete: function(data) {

                    }
                });

                $(this).dialog("close");
            },
            Cancel: function() {
                $(this).dialog("close");
            }
        }
    });
}

function exportAllUser() {
    var date = new Date();
    var yyyy = date.getFullYear();
    var mm = date.getMonth() < 9 ? "0" + (date.getMonth() + 1) : (date.getMonth() + 1); // getMonth() is zero-based
    var dd = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
    var hh = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
    var min = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
//    var datestring = reportName + '_' + yyyy + '_' + mm + '_' + dd + '_' + hh + '_' + min;
    var datestring = 'All_User' + '_' + yyyy + '_' + mm + '_' + dd;
    $(".reference").table2excel({
        exclude: ".noExl",
        name: "Excel Document Name",
        filename: datestring
    });
}