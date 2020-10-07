$(document).ready(function() {
    loadAllUser(null);
});

function loadAllUser(profileUid) {

    $('#ProfileUIDDIV').jtable({
        title: 'All Profile UID',
        paging: true, //Enable paging
        pageSize: 10, //Set page size (default: 10)
        actions: {
            listAction: function(postData, jtParams) {
                return $.Deferred(function($dfd) {
                    $.ajax({
                        url: 'https://' + window.location.host + '/mr_portal/api/merchantreport/get_all_profile_uid?jtStartIndex=' + jtParams.jtStartIndex + '&jtPageSize=' + jtParams.jtPageSize + '&profileUid=' + profileUid,
                        type: 'POST',
                        dataType: 'json',
                        data: postData,
                        success: function(data) {
                            $dfd.resolve(data);
                        },
                        error: function() {
                            $dfd.reject();
                        }
                    });
                });
            },
            createAction: 'https://' + window.location.host + '/mr_portal/api/merchantreport/prof_uid_create',
            updateAction: 'https://' + window.location.host + '/mr_portal/api/merchantreport/prof_uid_update'
        },
        toolbar: {
            items: [{
                    tooltip: 'Click here to export this table to excel',
                    icon: 'resources/images/excel-icon.png',
                    text: 'Export to Excel',
                    click: function() {
                        window.location = "ProfileUidFullData";
                    }
                }]
        },
        fields: {
            recognitionId: {
                title: 'ID',
                key: true,
                create: false,
                edit: false,
                list: true
            },
            profileUid: {
                title: 'Profile UID',
                key: true,
                create: true
            },
            merchantName: {
                title: 'Merchant Name',
                key: true,
                create: false
            },
            walletNo: {
                title: 'Wallet No',
                key: true,
                create: true
            },
            cashSettlement: {
                title: 'Cash Settlement',
                options: {'Daily': 'Daily', 'weekly': 'weekly', 'Monthly': 'Monthly', 'Fortnight': 'Fortnight', 'On Request': 'On Request', 'EFT Issue': 'EFT Issue'}
            },
            serviceFee: {
                title: 'Service Fee',
                key: true,
                create: false
            }
        }
    });
    $('#ProfileUIDDIV').jtable('load');
}


$('#searchProfileUIDButton').click(function() {
    // $("#profile_uid td").remove();
    var profileUID = document.getElementById("searchProfileUID").value;
    $('#ProfileUIDDIV').jtable('destroy');
    loadAllUser(profileUID);

});

