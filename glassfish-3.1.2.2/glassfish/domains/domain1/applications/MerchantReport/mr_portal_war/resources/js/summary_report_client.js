$(document).ready(function() {
    //  alertify.alert('HI Welcome to BANK SEttlement Data');
});

$("#pdfDmData").click(function() {
    //        alertify.alert('Generate DM PDF');
    var txt_month = document.getElementById("txt_month").value;

    var parameter = "txt_month=" + txt_month;

    var dateFilled = false;

    if (txt_month !== "")
        dateFilled = true;

    if (dateFilled){
        var url = window.location.origin+window.location.pathname+"SummaryFullData?"+parameter
        $.ajax({url: url, success: function(result){
                console.log(result)
                var text= ""
                if(result.totalPage==0){
                    alertify.alert("No data found");
                }else if(result.totalPage==1){
                    window.location = "SummaryPDF?"+parameter;
                } else {
                    for(var i =0;i<result.data.length;i++){
                        var page = result.data[i]
                        text+= "<a style='margin: 5px 0;display: block;' href="+window.location.origin+window.location.pathname
                            +"SummaryPDF?"+parameter + "&start="+page.start+ "&end="+page.end+">"
                            + "Part "+(i+1) +"  ("+(page.start +1) + " to " + (page.end + 1) +")" + "</a>"
                    }
                }
                document.getElementById("div1").innerHTML = text;
            }});
    }
    else
        alertify.alert("Please Select Month");
});

$("#excelDmData").click(function() {
    //        alertify.alert('Generate DM PDF');
    var txt_month = document.getElementById("txt_month").value;

    var parameter = "txt_month=" + txt_month;

    var dateFilled = false;

    if (txt_month !== "")
        dateFilled = true;

    if (dateFilled){
        var url = window.location.origin+window.location.pathname+"SummaryFullData?"+parameter
        $.ajax({url: url, success: function(result){
                console.log(result)
                var text= ""
                if(result.totalPage==0){
                    alertify.alert("No data found");
                }else if(result.totalPage==1){
                    window.location = "SummaryExcel?"+parameter;
                } else {
                    for(var i =0;i<result.data.length;i++){
                        var page = result.data[i]
                        text+= "<a style='margin: 5px 0;display: block;' href="+window.location.origin+window.location.pathname
                            +"SummaryExcel?"+parameter + "&start="+page.start+ "&end="+page.end+">"
                            + "Part "+(i+1) +"  ("+(page.start +1) + " to " + (page.end + 1) +")" + "</a>"
                    }
                }
                document.getElementById("div1").innerHTML = text;
            }});
    }
    else
        alertify.alert("Please Select Month");
});




