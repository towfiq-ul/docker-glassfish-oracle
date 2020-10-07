$(document).ready(function() {
    //  alertify.alert('HI Welcome to BANK SEttlement Data');

    var dmData = getDmData();

    var data = jQuery.parseJSON(dmData);

    var dmNameTotal = data.dmNameTotal.split("#");
    var dmCodeTotal = data.dmCodeTotal.split("#");
    var dmWalletTotal = data.dmWalletTotal.split("#");

    $("#dmCode").autocomplete({
        source: dmCodeTotal
    });


    $("#dmName").autocomplete({
        source: dmNameTotal
    });

    $("#dmWallet").autocomplete({
        source: dmWalletTotal
    });


    $("#dmCode").on("autocompletechange", function(event, ui) {
        document.getElementById("dmName").setAttribute("value", "");
        document.getElementById("dmWallet").setAttribute("value", "");

        var index = dmCodeTotal.indexOf($(this).val());
        //    alertify.alert($(this).val());
        document.getElementById("dmName").setAttribute("value", dmNameTotal[index]);
        document.getElementById("dmWallet").setAttribute("value", dmWalletTotal[index]);

        document.getElementById("dmName").setAttribute("disabled", "true");
        document.getElementById("dmWallet").setAttribute("disabled", "true");
        document.getElementById("dmCode").setAttribute("disabled", "true");
    });
    $("#dmName").on("autocompletechange", function(event, ui) {
        document.getElementById("dmCode").setAttribute("value", "");
        document.getElementById("dmWallet").setAttribute("value", "");

        var index = dmNameTotal.indexOf($(this).val());
        //    alertify.alert($(this).val());
        document.getElementById("dmCode").setAttribute("value", dmCodeTotal[index]);
        document.getElementById("dmWallet").setAttribute("value", dmWalletTotal[index]);
        document.getElementById("dmName").setAttribute("disabled", "true");
        document.getElementById("dmWallet").setAttribute("disabled", "true");
        document.getElementById("dmCode").setAttribute("disabled", "true");
    });

    $("#dmWallet").on("autocompletechange", function(event, ui) {
        document.getElementById("dmName").setAttribute("value", "");
        document.getElementById("dmCode").setAttribute("value", "");
        var index = dmWalletTotal.indexOf($(this).val());
  //      alertify.alert(dmNameTotal[index] + ' ' + dmCodeTotal[index]);
        document.getElementById("dmName").setAttribute("value", dmNameTotal[index]);
        document.getElementById("dmCode").setAttribute("value", dmCodeTotal[index]);
        document.getElementById("dmName").setAttribute("disabled", "true");
        document.getElementById("dmWallet").setAttribute("disabled", "true");
        document.getElementById("dmCode").setAttribute("disabled", "true");
    });


});


$("#excelDmData").click(function() {
    //      alertify.alert('Generate DM EXCEL');
    var dmCode = document.getElementById("dmCode").value;
    var dmName = document.getElementById("dmName").value;
    var dmWallet = document.getElementById("dmWallet").value;
    var txt_month = document.getElementById("txt_month").value;

    console.log('Exel: ' + dmCode + ' ' + dmName + ' ' + dmWallet + ' ' + txt_month);
    var parameter = "dmCode=" + dmCode + "&dmName=" + dmName + "&dmWallet=" + dmWallet + "&txt_month=" + txt_month;


    var dateFilled = false;
    var optionFilled = false;

    if (txt_month !== "")
        dateFilled = true;
    if (dmCode !== "" || dmName !== "" || dmWallet !== "")
        optionFilled = true;
    if (dateFilled && optionFilled)
        window.location = "DisbursementExcel?" + parameter;
    else
        alertify.alert("Please fill Date and One of the 3 Fields");


});
$("#pdfDmData").click(function() {
    //        alertify.alert('Generate DM PDF');

    var dmCode = document.getElementById("dmCode").value;
    var dmName = document.getElementById("dmName").value;
    var dmWallet = document.getElementById("dmWallet").value;
    var txt_month = document.getElementById("txt_month").value;

    console.log('PDF: ' + dmCode + ' ' + dmName + ' ' + dmWallet + ' ' + txt_month);

    var parameter = "dmCode=" + dmCode + "&dmName=" + dmName + "&dmWallet=" + dmWallet + "&txt_month=" + txt_month;

    var dateFilled = false;
    var optionFilled = false;

    if (txt_month !== "")
        dateFilled = true;
    if (dmCode !== "" || dmName !== "" || dmWallet !== "")
        optionFilled = true;
    if (dateFilled && optionFilled)
        window.location = "DisbursementPDF?" + parameter;
    else
        alertify.alert("Please fill Date and One of the 3 Fields");
});




function getDmData()
{
    var dmInfo = "null";
    $.ajax({
        url: "DmInfo",
        async: false,
        type: 'POST',
        context: document.body
    }).done(function(data) {
        dmInfo = data;
    });
    return dmInfo;
}