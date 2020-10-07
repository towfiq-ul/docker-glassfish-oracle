$(document).ready(function() {
    //    alertify.alert('Hello World from cps Statement');

});

$('#syncCpsStatement').click(function() {
    $.ajax(
            {
                url: 'SyncCpsData',
                dataType: 'text',
                Accept: "text/html",
                type: 'POST',
                success: function(data)
                {
                    console.log(data);
                    document.getElementById("sync_status").innerHTML = data;
                },
                error: function(data)
                {

                }
            });
});

$('#showCpsStatement').click(function() {
//    alertify.alert('showCpsStatement');
    $("#report_table_cps td").remove();
    $("#no_data_rm").html('');
    $("#sync_status").html('');

       $.ajax(
            {
                url: 'ShowCpsStatement',
                dataType: 'text',
                Accept: "text/html",
                type: 'POST',
                success: function(data)
                {
                    console.log(data);
                    obj = jQuery.parseJSON(data);
                    console.log(obj);
                    if (obj.length > 0) {
                        for (var i = 0; i < obj.length; i++) {
                            var row = "<tr>";
                            row += "<td>" + obj[i].receiptNumber + "</td>";
                            row += "<td>" + obj[i].identityPublicName + "</td>";
                            row += "<td>" + obj[i].accountType + "</td>";
                            row += "<td>" + obj[i].accountNo + "</td>";
                            row += "<td>" + obj[i].currency + "</td>";
                            row += "<td>" + obj[i].balanceAmount + "</td>";
                            row += "<td>" + obj[i].currentBalance + "</td>";
                            row += "<td>" + obj[i].details + "</td>";
                            row += "<td>" + obj[i].completionTime + "</td>";
                            row += "</tr>";
                            $('#report_table_cps').append(row);
                        }
                    }
                    else
                    {
                        document.getElementById("no_data_rm").innerHTML = "No Data Found";
                    }
                },
                error: function(data)
                {

                }
            });
});