$(document).ready(function() {
    //  alertify.alert('HI Welcome to BANK SEttlement Data');
});


$("#excelDmData").click(function() {
    //      alertify.alert('Generate DM EXCEL');


    var txt_month = document.getElementById("txt_month").value;

    var parameter = "txt_month=" + txt_month;

    var dateFilled = false;

    if (txt_month !== "")
        dateFilled = true;

    if (dateFilled)
        window.location = "DisbursementExcel?" + parameter;
    else
        alertify.alert("Please Select Month");


});
$("#pdfDmData").click(function() {
    //        alertify.alert('Generate DM PDF');
    var txt_month = document.getElementById("txt_month").value;

    var parameter = "txt_month=" + txt_month;

    var dateFilled = false;

    if (txt_month !== "")
        dateFilled = true;

    if (dateFilled)
        window.location = "DisbursementPDF?"+parameter;
    else
        alertify.alert("Please Select Month");
});




