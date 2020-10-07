function addMerchantData() {
//    alertify.alert("inside add merchant data");

    var merchantWallet = document.getElementById("merchantWallet").value;
    console.log('merchantWallet: ' + merchantWallet);

    var profileUID = document.getElementById("profileUID").value;
    console.log('profileUID: ' + profileUID);

    var e = document.getElementById("cash_settlement");
    var cash_settlement = e.options[e.selectedIndex].value;

    console.log('cash_settlement: ' + cash_settlement);

    //Validation
    if (merchantWallet.length > 0 && profileUID.length > 0) {
        $.ajax(
                {
                    url: 'AddMerchantData',
                    dataType: 'text',
                    Accept: "text/html",
                    type: 'POST',
                    data: {"merchantWallet": merchantWallet, "profileUID": profileUID, "cash_settlement": cash_settlement},
                    success: function(data)
                    {
                        //   obj = jQuery.parseJSON(data);
                        document.getElementById("uploadFormId").reset();
                        alertify.alert(data);
                        
                    },
                    error: function(data)
                    {

                    }
                });




    }
    else {
        alertify.alert("Please fill the required fields");

    }


    //successfull


    //error






}


