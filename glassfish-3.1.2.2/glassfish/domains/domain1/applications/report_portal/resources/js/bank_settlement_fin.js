$(document).ready(function() {
    //  alertify.alert('HI Welcome to BANK SEttlement Data');
});

$("#brac_pdf").click(function() {
    //   alertify.alert('Generate Brac PDF');
    var parameter = "report_type=" + "brac_pdf";
    window.location = "PdfDownloader?" + parameter;
});

$("#brac_exel").click(function() {
 //   alertify.alert('Generate Brac EXCEL');
    var parameter = "report_type=" + "brac_exel";
    window.location = "ExelDownloader?" + parameter;

});

$("#non_brac_pdf").click(function() {
  //  alertify.alert('Generate Non Brac PDF');
  var parameter = "report_type=" + "non_brac_pdf";
    window.location = "PdfDownloader?" + parameter;
});

$("#non_brac_exel").click(function() {
  //  alertify.alert('Generate Non Brac EXCEL');
  var parameter = "report_type=" + "non_brac_exel";
    window.location = "ExelDownloader?" + parameter;
});
