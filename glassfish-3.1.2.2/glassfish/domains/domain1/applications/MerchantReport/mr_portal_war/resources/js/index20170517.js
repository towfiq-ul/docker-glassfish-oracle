$(document).ready(function() {
    var userInfo = getUsername();

    var data = jQuery.parseJSON(userInfo);
    var username = data.username;
    var role = data.role;
    var userMenu = data.reports;
    var upMsg = data.sessionMessage;

    var properties = data.properties;
    var layerId = data.layerId;

    if (role !== 'admin')
        displayProperties(properties, layerId);

//    console.log("Username: " + username + " Role: " + role + " UserMenu: " + userMenu);

    $('#user_name').html(username);

//    if (data.hitCount !== '30')
        $('#hit_message_holder').html('You have remaining hit for this hour: ' + data.hitCount);

    var menu = '';
    for (var i = 0; i < userMenu.length; i++) {
        var menuName = userMenu[i].reportName;
        var menuId = userMenu[i].reportId;
        var jsEvent = userMenu[i].jsEvent;
        var jsFunction = userMenu[i].jsFunction;
        menu += "<li><a href='#' " + jsEvent + "=" + jsFunction + ">" + menuName + "</a></li>";
    }
    $('#floatMenu').append(menu);


    //Up Message
    if (upMsg !== "no_msg" && (role === 'admin' || role==='masterdata_admin'))
    {
        $('#message_holder').html(upMsg);
    }

    $('#change_pass').click(function() {
        //  $("#pageName").html('Upload');
        $("#message_holder").html("");
        $("#report_data_holder").html("");
        $('#menu_field_holder').load('resources/static_pages/change_pass.html');
    });

});


function displayProperties(property, layerId) {
 //   console.log('To Display: ' + property + ' Layer: ' + layerId);
    var dataDisplay = "";


    //    For all
    var logo = property.Logo;
    var logoURL = "https://" + window.location.host + "/mr_portal/resource/";
    if (logo !== undefined)
        dataDisplay += '<img src="' + logoURL + logo + '" alt="logo-not-found" height="150" width="150" style="margin-left: 80%;position: absolute;">';


    if (layerId === '10') {
        var merchantName = property.MerchantName;
        var merchantAccountNumber = property.MerchantAccountNumber;
        var address = property.Address;

        if (merchantName !== undefined)
            dataDisplay += '<p>Merchant Name : ' + merchantName + ' </p>';
        if (merchantAccountNumber !== undefined)
            dataDisplay += '<p>Merchant Account Number : ' + merchantAccountNumber + ' </p>';
        if (address !== undefined)
            dataDisplay += '<p>Address : ' + address + ' </p>';
    }
    else if (layerId === '11' || layerId === '21' || layerId === '61' || layerId === '66' || layerId === '67') {
        var organizationName = property.OrganizationName;
        var organizationAddress = property.OrganizationAddress;
        var concernedbKashMail = property.ConcernedbKashMail;
        var settlementFee = property.SettlementFee;
        var settlementFrequency = property.SettlementFrequency;
        var corporateAccountNo = property.CorporateAccountNo;
        var merchantAccountNo = property.MerchantAccountNo;

        if (organizationName !== undefined)
            dataDisplay += '<p>Organization Name : ' + organizationName + ' </p>';
        if (organizationAddress !== undefined)
            dataDisplay += '<p>Organization Address: ' + organizationAddress + ' </p>';
        if (concernedbKashMail !== undefined)
            dataDisplay += '<p>Concern bKash Team\'s Group email : ' + concernedbKashMail + ' </p>';
        if (merchantAccountNo !== undefined)
            dataDisplay += '<p>Merchant Account No : ' + merchantAccountNo + ' </p>';
        if (corporateAccountNo !== undefined)
            dataDisplay += '<p>Corporate Account No : ' + corporateAccountNo + ' </p>';
        if (settlementFee !== undefined)
            dataDisplay += '<p>Settlement Fee(%) : ' + settlementFee + ' </p>';
        if (settlementFrequency !== undefined)
            dataDisplay += '<p>Settlement Frequency : ' + settlementFrequency + ' </p>';
    }
    else if (layerId === '22') {
        var concernedbKashMail = property.ConcernedbKashMail;
        var merchantName = property.MerchantName;
        var outletName = property.OutletName;
        var outletAccountNumber = property.OutletAccountNumber;
        var outletAddress = property.OutletAddress;

        if (merchantName !== undefined)
            dataDisplay += '<p>Merchant Name : ' + merchantName + ' </p>';
        if (outletName !== undefined)
            dataDisplay += '<p>Outlet Name : ' + outletName + ' </p>';
        if (outletAccountNumber !== undefined)
            dataDisplay += '<p>Outlet Account Number : ' + outletAccountNumber + ' </p>';
        if (outletAddress !== undefined)
            dataDisplay += '<p>Outlet Address : ' + outletAddress + ' </p>';
        if (concernedbKashMail !== undefined)
            dataDisplay += '<p>Concern bKash Team\'s Group email : ' + concernedbKashMail + ' </p>';
    }
    else if (layerId === '62') {
        var concernedbKashMail = property.ConcernedbKashMail;
        var organizationName = property.OrganizationName;
        var branchName = property.BranchName;
        var branchAccountNumber = property.BranchAccountNumber;
        var branchAddress = property.BranchAddress;

        if (organizationName !== undefined)
            dataDisplay += '<p>Organization Name : ' + organizationName + ' </p>';
        if (branchName !== undefined)
            dataDisplay += '<p>Branch Name : ' + branchName + ' </p>';
        if (branchAccountNumber !== undefined)
            dataDisplay += '<p>Branch AccountNumber : ' + branchAccountNumber + ' </p>';
        if (branchAddress !== undefined)
            dataDisplay += '<p>Branch Address : ' + branchAddress + ' </p>';
        if (concernedbKashMail !== undefined)
            dataDisplay += '<p>Concern bKash Team\'s Group email : ' + concernedbKashMail + ' </p>';
    }
    
    var shortCode = property.ShortCode;
    
    if(shortCode !==undefined)
        dataDisplay += '<p>Short Code : ' + shortCode + ' </p>';
    //Data Generate
    $("#message_holder").html(dataDisplay);
}
function getUsername()
{
    var userInfo = "null";
    $.ajax({
        url: "UserInfo",
        async: false,
        type: 'POST',
        context: document.body
    }).done(function(data) {
        userInfo = data;
    });
    return userInfo;
}

function loadPage(pageName) {
    // alert('To Load Page:' + pageName);
    $('#message_holder').html('');
    $("#report_data_holder").html("");
    $('#menu_field_holder').load('resources/static_pages/' + pageName);
}


String.prototype.replaceAll = function(find, replace) {
    var str = this;
    return str.replace(new RegExp(find.replace(/[-\/\\^$*+?.()|[\]{}]/g, '\\$&'), 'g'), replace);
};

function loadMenuItem(reportId, reportName)
{


    $("#message_holder").html('');
    $("#report_data_holder").html('');
    $("#menu_field_holder").html('');
    $.ajax(
            {
                url: 'FieldOptions',
                dataType: 'text',
                Accept: "text/html",
                type: 'POST',
                data: {"reportId": reportId},
                success: function(data)
                {

                    $("#menu_field_holder").html('');
                    // $("#bKash").html('');
                    obj = jQuery.parseJSON(data);
                    var dateParams = null;
                    var selectRegionFlag = 0;
                    var selectBranchFlag = 0;
                    var radioFlag = false;
                    var init = 0;
                    var nameInputValue = "";
                    var hiddenInputValue = "ReportId" + "seperator1" + reportId + "seperator2" + "ReportName" + "seperator1" + reportName;
                    var finalDiv = document.getElementById("menu_field_holder");
                    var reportOptionPosition = document.createElement("center");
                    var reportOptionCaption = document.createElement("h4");
                    reportOptionCaption.setAttribute("style", "background-color: darkgray");
                    var reportN = reportName;
                    reportN = reportN.replaceAll('_', ' ');

                    reportOptionCaption.innerHTML = "Field Options For : " + reportN;
                    reportOptionPosition.appendChild(reportOptionCaption);
                    finalDiv.appendChild(reportOptionPosition);
                    var formElement = document.createElement("form");
                    formElement.setAttribute('method', "post");
                    formElement.setAttribute('action', "JTableExelDownloader");
                    var tableElement = document.createElement("table");
//                    tableElement.setAttribute('border', "1");
                    tableElement.setAttribute('width', "100%");
                    //  alert("OBJ::"+obj);
                    var currentFieldName = "";
//                    var selectElement;

                    for (var i = 0; i < obj.length; i++) {
                        //   alert("loop ::"+i);

                        if (obj[i].fieldType === 'select')
                        {
                            //   alert("Option: "+ i);

                            if (obj[i].fieldName === currentFieldName) {

                                var optionElement = document.createElement("option");
                                optionElement.setAttribute("value", obj[i].displayId);
                                optionElement.innerHTML = obj[i].displayValue;
                                selectElement.appendChild(optionElement);
                            }
                            else {
                                if (obj[i].fieldName.indexOf("hidden") === -1)
                                {
                                    hiddenInputValue += "seperator2" + obj[i].fieldType + "seperator1" + obj[i].fieldName;
                                    nameInputValue += obj[i].displayName + "seperator1";
                                }
                                var trElement = document.createElement("tr");
                                trElement.setAttribute("id", obj[i].fieldName + "_tr");
                                var tdElement = document.createElement("td");
                                tdElement.setAttribute('width', "50%");
                                var elementCaption = document.createElement("div");
                                elementCaption.innerHTML = obj[i].displayName;
                                elementCaption.setAttribute("style", "text-align:right");
                                tdElement.appendChild(elementCaption);
                                trElement.appendChild(tdElement);
                                var tdElement2 = document.createElement("td");
                                tdElement2.setAttribute('width', "50%");
                                var selectElement = document.createElement('select');
                                selectElement.setAttribute("name", obj[i].fieldName);
                                selectElement.setAttribute("id", obj[i].fieldName);
                                //  selectElement.setAttribute("style", "width : 130px");
                                if (obj[i].fieldName.indexOf("hidden") !== -1) {
                                    selectElement.setAttribute("style", "display: none;");
                                    formElement.appendChild(selectElement);
                                }


                                if (obj[i].jsEvent !== null && obj[i].jsEvent.length > 0)
                                {
                                    selectElement.setAttribute(obj[i].jsEvent, obj[i].jsFunction);
                                }


                                var optionElement = document.createElement("option");
                                optionElement.setAttribute("value", obj[i].displayId);
                                optionElement.innerHTML = obj[i].displayValue;
                                selectElement.appendChild(optionElement);
//                                selectElement.setAttribute("style", "display:none");

                                if (obj[i].fieldName.indexOf("hidden") === -1) {
                                    tdElement.appendChild(elementCaption);
                                    trElement.appendChild(tdElement);
                                    tdElement2.appendChild(selectElement);
                                    trElement.appendChild(tdElement2);
                                    trElement.setAttribute("style", "display:none");
                                    tableElement.appendChild(trElement);
                                }



                                currentFieldName = obj[i].fieldName;
                            }


                        }
                        else {
//                            alert("Other Options: "+ i);
                            if (obj[i].fieldName.indexOf("hidden") === -1 && obj[i].fieldType !== 'radio_button')
                            {
                                nameInputValue += obj[i].displayName + "seperator1";
                                hiddenInputValue += "seperator2" + obj[i].fieldType + "seperator1" + obj[i].fieldName;
                            }
                            var trElementInput = document.createElement("tr");
                            trElementInput.setAttribute("id", obj[i].fieldName + "_tr");
                            var tdElementCaption = document.createElement("td");
                            tdElementCaption.setAttribute('width', "50%");
                            var tdElementInput = document.createElement("td");
                            tdElementInput.setAttribute('width', "50%");
                            var elementCaption = document.createElement("div");
                            elementCaption.innerHTML = obj[i].displayName;
                            elementCaption.setAttribute("style", "text-align:right");
                            //Append the element in page (in span).
                            if (obj[i].fieldName.indexOf("hidden") === -1)
                                tdElementCaption.appendChild(elementCaption);
                            //  input Type Text Box
                            if (obj[i].fieldType === 'text_box') {
//                                alert("text_box: "+ i);
                                var element = document.createElement('input');
                                //Assign different attributes to the element.
                                element.setAttribute("type", "text");
                                element.setAttribute("style", "float:left");
                                //      element.setAttribute("name", obj[i].name);
                                element.setAttribute("id", obj[i].fieldName);
                            }
                            else if (obj[i].fieldType === 'check_box') {
                                var element = document.createElement('input');

                                //Assign different attributes to the element.
                                element.setAttribute("type", "checkbox");
                                //      element.setAttribute("name", obj[i].name);
                                element.setAttribute("id", obj[i].fieldName);
                            }
                            else if (obj[i].fieldType === 'radio_button') {
                                var element = document.createElement('input');

                                //Assign different attributes to the element.
                                element.setAttribute("type", "radio");
                                //      element.setAttribute("name", obj[i].name);
                                element.setAttribute("id", obj[i].fieldName);
                                element.setAttribute("name", obj[i].fieldName);
                                element.setAttribute("value", obj[i].displayValue);
                                if (obj[i].jsEvent !== null && obj[i].jsEvent.length > 0)
                                {
                                    element.setAttribute(obj[i].jsEvent, obj[i].jsFunction);
                                }
                                radioFlag = true;
                            }
                            //     element.setAttribute("value", obj[i].value);
                            if (obj[i].dataType === 'date') {
                                var dateParamss = i;
//                                alert("date: "+ i);
                                element.setAttribute("class", "dp");
                                element.setAttribute("readonly", "readonly");
                                element.setAttribute("autocomplete", "off");
                            }
                            //      var foo = document.getElementById("bKash");

                            //Append the element in page (in span).
                            if (obj[i].fieldName.indexOf("hidden") === -1)
                            {

                                tdElementInput.appendChild(element);
                                if (obj[i].fieldType === 'radio_button')
                                {
                                    elementCaption.setAttribute("style", "text-align:left");
                                    element.setAttribute("style", "float:right");
                                    trElementInput.appendChild(tdElementInput);
                                    trElementInput.appendChild(tdElementCaption);
                                }
                                else
                                {

                                    trElementInput.appendChild(tdElementCaption);
                                    trElementInput.appendChild(tdElementInput);
                                    if (radioFlag === true)
                                        trElementInput.setAttribute("style", "display:none");
                                }

                                tableElement.appendChild(trElementInput);
                            }
                            else {
                                element.setAttribute("style", "display: none;");
                                formElement.appendChild(element);
                            }
                            //  alert("end of Else");
                        }

                    }

                    var hiddenInput = document.createElement("input");
                    hiddenInput.setAttribute("type", "hidden");
                    hiddenInput.setAttribute("name", "maxValue");
                    hiddenInput.setAttribute("id", "maxValue");
                    hiddenInput.setAttribute("value", hiddenInputValue);
                    formElement.appendChild(hiddenInput);
                    var hiddenInput = document.createElement("input");
                    hiddenInput.setAttribute("type", "hidden");
                    hiddenInput.setAttribute("name", "nameValue");
                    hiddenInput.setAttribute("id", "nameValue");
                    hiddenInput.setAttribute("value", nameInputValue);
                    formElement.appendChild(hiddenInput);
                    var trElement = document.createElement("tr");
                    if (radioFlag === true)
                        trElement.setAttribute("style", "display:none");
                    trElement.setAttribute("id", "button_tr");
                    var tdElement = document.createElement("td");
                    var buttonElement = document.createElement("button");
                    buttonElement.setAttribute("onclick", "viewTableFunction_new('View')");
                    buttonElement.setAttribute("type", "button");
                    buttonElement.setAttribute("role", "button");
                    buttonElement.setAttribute("style", "float: right;border-radius: 10px;height: 25px;width: 130px;background-color: ghostwhite");
                    buttonElement.innerHTML = "View Report";
                    tdElement.appendChild(buttonElement);
                    trElement.appendChild(tdElement);
                    var tdElement = document.createElement("td");
                    var buttonElement = document.createElement("button");
                    buttonElement.setAttribute("onclick", "viewTableFunction_new('Download')");
//                    buttonElement.setAttribute("onclick", "exportReport('" + reportName + "')");
                    buttonElement.setAttribute("type", "button");
                    buttonElement.setAttribute("role", "button");
                    buttonElement.setAttribute("style", "border-radius: 10px;height: 25px;width: 130px;background-color: ghostwhite");
                    buttonElement.innerHTML = "Download";
                    tdElement.appendChild(buttonElement);
                    trElement.appendChild(tdElement);
                    tableElement.appendChild(trElement);
                    formElement.appendChild(tableElement);
                    finalDiv.appendChild(formElement);
                    //  alert('Mandatory Fields: '+obj[dateParams].mandatory);
                    if (dateParamss !== null) {

                        var dateParams = obj[dateParamss].mandatory.split("#");
                        //  alert('MinDate: ' + dateParams[0] + ' MaxDate: ' + dateParams[1] + ' DateFormat: ' + dateParams[2]);
//                    $(".dp").datepicker({minDate: "-3M", maxDate: "+0D", dateFormat: "dd-MM-yy"});

                        if (dateParams[2] === 'yy-M') {

                            $(".dp").datepicker({
                                changeMonth: true,
                                changeYear: true,
                                showButtonPanel: true,
                                minDate: dateParams[0],
                                maxDate: dateParams[1],
                                dateFormat: dateParams[2],
//                            onClose: function(dateText, inst) {
//                                $(this).datepicker('setDate', new Date(inst.selectedYear, inst.selectedMonth, 1));
//                            }
                                onClose: function(dateText, inst) {
                                    var month = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
                                    var year = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
                                    $(this).val($.datepicker.formatDate('yy-M', new Date(year, month, 1)));
                                }
                            });

                            $(".dp").focus(function() {
                                $(".ui-datepicker-calendar").hide();
                                $("#ui-datepicker-div").position({
                                    my: "center top",
                                    at: "center bottom",
                                    of: $(this)
                                });
                            });

                        }
                        else {
                            var date = new Date();
                            var maxDate = "-" + date.getDate() + "D";
                            var minDate = "-1M " + "-" + (date.getDate() - 1) + "D";
                            $(".dp").datepicker({
//                            minDate: dateParams[0],
//                            maxDate: dateParams[1],
                                minDate: minDate,
                                maxDate: "+OD",
                                dateFormat: dateParams[2]
                            });
                        }
                    }

//                    $("#ui-layout-customized").dialog({
//                        title: 'Fill The Following Fields',
//                        height: 400,
//                        width: 620,
//                        modal: true,
//                        //    resizable: false,
//                        buttons: {
//                            Ok: function() {
//
//                                $(this).dialog("close");
//                                $("#bKash").html('');
//                            }
//                        }
//                    });

                },
                error: function(data)
                {
                    //  $("#menu_field_holder").html('Error Communicating With Server');
                    alertify.alert("Error Communicating With Server");
                }
            });
}


function abc() {
    var selectedDestination = document.getElementById("drop_branch_name");
    $("#drop_branch_name").html("");
    var optsSource = document.getElementById("drop_hidden_branch_name").options;
    var dropRegionSelectObject = document.getElementById("drop_region_name");
    for (var i = 0; i < optsSource.length; i++) {
        if (optsSource[i].value.indexOf(dropRegionSelectObject.options[dropRegionSelectObject.selectedIndex].innerHTML) !== -1) {
            var optionElement = document.createElement("option");
            optionElement.setAttribute("value", optsSource[i].value);
            optionElement.innerHTML = optsSource[i].innerHTML;
            selectedDestination.appendChild(optionElement);
        }

    }

}

function radioAction(myRadio) {
    if (myRadio.value === 'SPBO')
    {
        var selectedDestination = document.getElementById("button_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:true");
        var selectedDestination = document.getElementById("drop_region_name_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:true");
        var selectedDestination = document.getElementById("drop_branch_name_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:true");
        var selectedDestination = document.getElementById("txt_date_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:true");
        var selectedDestination = document.getElementById("txt_from_date_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:true");
        var selectedDestination = document.getElementById("txt_end_date_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:true");
    }
    else if (myRadio.value === 'SPRO' || myRadio.value === 'ALLBO')
    {
        var selectedDestination = document.getElementById("button_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:true");
        var selectedDestination = document.getElementById("drop_region_name_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:true");
        var selectedDestination = document.getElementById("drop_branch_name_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:none");
        var selectedDestination = document.getElementById("txt_date_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:true");
        var selectedDestination = document.getElementById("txt_from_date_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:true");
        var selectedDestination = document.getElementById("txt_end_date_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:true");
    }
    else if (myRadio.value === 'OWN' || myRadio.value === 'ALLRO')
    {
        var selectedDestination = document.getElementById("button_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:true");
        var selectedDestination = document.getElementById("drop_region_name_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:none");
        var selectedDestination = document.getElementById("drop_branch_name_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:none");
        var selectedDestination = document.getElementById("txt_date_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:true");
        var selectedDestination = document.getElementById("txt_from_date_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:true");
        var selectedDestination = document.getElementById("txt_end_date_tr");
        if (selectedDestination !== null)
            selectedDestination.setAttribute("style", "display:true");
    }

}


function viewTableFunction_new(ViewType)
{
    var reportChecked = null;
    var reportName = null;
    if (document.getElementsByName('report_radio_button') !== null) {
        reportName = document.getElementsByName('report_radio_button');

        for (var i = 0; i < reportName.length; i++) {
            if (reportName[i].checked) {
                reportChecked = reportName[i].value;
            }
        }
    }
    var parameter = '';
    var maxValueNew = '';
    var nameValueNew = '';
    var validationFlag = false;
    var maxValue = document.getElementById("maxValue").value;
    var nameValue = document.getElementById("nameValue").value;
    var object = maxValue.split('seperator2');
    var nameValuePart = nameValue.split("seperator1");
    var dialogAlert = "";
    var nameValueCount = 0;
    var values = '';
    var input = null;
    var ReportName = '';
    var ReportId = '';
    $.each(object, function(key, line) {
        var parts = line.split('seperator1');
        //For Select Input
        if (parts[0] === 'select') {

            if (document.getElementById(parts[1] + "_tr").style.display !== 'none')
            {

                var e = document.getElementById(parts[1]);
//                var input = e.options[e.selectedIndex].value;
                var input = e.options[e.selectedIndex].innerHTML;
                maxValueNew += parts[1] + "seperator1" + input + "seperator2";
                nameValueNew += nameValuePart[nameValueCount] + "seperator1";
                if (e.options[e.selectedIndex].value.length < 3) {
                    //               if (input.trim().length < 2) {
                    validationFlag = true;
                    dialogAlert += nameValuePart[nameValueCount] + ", ";

                }
                input = null;
            }
            nameValueCount++;
        }
        //For CheckBox Input
        else if (parts[0] === 'check_box') {
            if (document.getElementById(parts[1] + "_tr").style.display !== 'none')
            {
                if ($("#" + parts[1]).is(":checked"))
                    var input = document.getElementById(parts[1]).value;
                maxValueNew += parts[1] + "seperator1" + input + "seperator2";
                nameValueNew += nameValuePart[nameValueCount] + "seperator1";
                if (input.length < 1) {
                    validationFlag = true;
                    dialogAlert += nameValuePart[nameValueCount] + ", ";

                }

                input = null;
            }
            nameValueCount++;
        }
        //For text Input
        else if (parts[0] === 'text_box') {

            if (document.getElementById(parts[1] + "_tr").style.display !== 'none')
            {
                var input = document.getElementById(parts[1]).value;
                maxValueNew += parts[1] + "seperator1" + input + "seperator2";
                nameValueNew += nameValuePart[nameValueCount] + "seperator1";

                if (input.length < 1) {
                    validationFlag = true;
                    dialogAlert += nameValuePart[nameValueCount] + ", ";
                }

                input = null;
            }
            nameValueCount++;
        }
        else if (parts[0] === 'ReportName') {
            ReportName = parts[1];
        }
        else if (parts[0] === 'ReportId') {
            ReportId = parts[1];
        }
    });
    parameter = "ReportId=" + ReportId + "&ReportName=" + ReportName + "&ReportChecked=" + reportChecked + "&NameValue=" + nameValueNew + "&MaxValue=" + maxValueNew;
//    alert(dialogAlert.substr(0, dialogAlert.length - 2));
    var dialogTextV = dialogAlert.substr(0, dialogAlert.length - 2);
    if (dialogTextV.indexOf(',') === -1)
    {
        if (dialogTextV.indexOf('Account Number') !== -1 || dialogTextV.indexOf('Transaction ID') !== -1) {
            validationFlag = false;
        }
    }
    if (validationFlag === true)
    {
        var dialogText = "Please Fill The Following Fields: " + dialogAlert.substr(0, dialogAlert.length - 2);
        //   document.getElementById("menu_field_holder22").innerHTML = dialogText;
        alertify.alert(dialogText);

    }
    else {
        if (ViewType === 'View') {
            request = $.ajax({
                url: "ReportDownloader?" + parameter,
                //      url: "JTableExelDownloader",
                type: "POST",
                data: null
            });

            request.done(function(response, textStatus, jqXHR) {
                var data = jqXHR.responseText;
                //     console.log('Final Data:' + data + ' Report Name'+ ReportName);
                //Fit the data to report_data_holder div
//                var htmlData = "<h2>Report For: " + ReportName + "</h2>";
//
//                htmlData += "<button id='exportReport' onclick='exportReport(\"" + ReportName + "\");' role='button' aria-disabled='false'><span class='ui-button-text'>Export Table Data</span></button><br>";
//                htmlData += "<table class='reference' style='width: 100%;'>";
//                htmlData += "<tbody>";
//
//                var rowData = data.split("<eos>");
//               
//                htmlData += '<tr>';
//                var headerData = rowData[0].split("<seperator>");
//                for (var k = 0; k < headerData.length; k++) {
//                    htmlData += '<th>' + headerData[k] + '</th>';
//                }
//                htmlData += '</tr>';
//               
//                for (var i = 1; i < rowData.length - 1; i++) {
//                    htmlData += '<tr>';
//                    var columnData = rowData[i].split("<seperator>");
//                    for (var j = 0; j < columnData.length; j++) {
//                        htmlData += '<td>' + columnData[j] + '</td>';
//                    }
//                    htmlData += '</tr>';
//                }
//                htmlData += "</tbody>";
//                htmlData += "</table>";
//                console.log('FinalHTMLData: ' + htmlData);
//                $('#report_data_holder').html(htmlData);
                var reportData = data.split("####");

                $('#report_data_holder').html(reportData[1]);
                $('#hit_message_holder').html(reportData[0]);

            });
        }
        else if (ViewType === 'Download')
        {
            window.location = "ReportDownloader?" + parameter;
        }
    }

}
function exportReport(reportName) {
    var date = new Date();
    var yyyy = date.getFullYear();
    var mm = date.getMonth() < 9 ? "0" + (date.getMonth() + 1) : (date.getMonth() + 1); // getMonth() is zero-based
    var dd = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
    var hh = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
    var min = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
//    var datestring = reportName + '_' + yyyy + '_' + mm + '_' + dd + '_' + hh + '_' + min;
    var datestring = reportName + '_' + yyyy + '_' + mm + '_' + dd;
    $(".reference").table2excel({
        exclude: ".noExl",
        name: "Excel Document Name",
        filename: datestring
    });
}


function ChangePassword()
{
    var currentPassword = document.getElementById("currentPassword").value;
    var newPassword = document.getElementById("newPassword").value;
    var confirmPassword = document.getElementById("confirmPassword").value;
    if (currentPassword.length < 1 || newPassword.length < 1 || confirmPassword.length < 1)
        alertify.alert("Please fill out all the fields");
    else if (newPassword !== confirmPassword)
        alertify.alert("Password Doesn't match");
    else {
        var p = /(?=.{8,})(?=.*?[^\w\s])(?=.*?[0-9])(?=.*?[A-Z]).*?[a-z].*$/;
        var isValid = p.test(newPassword);

        if (isValid) {

          //  console.log('Change Password Method Called with: ' + currentPassword + ' ' + newPassword + ' ' + confirmPassword);

            $.ajax({
                url: 'ChangePassword',
                dataType: 'text',
                Accept: "text/html",
                type: 'POST',
                data: {"password": currentPassword, "newPassword": newPassword},
                success: function(data)
                {
                    //   console.log('Data: ' + data);
                    obj = jQuery.parseJSON(data);
                    if (obj.responseCode === '0000')
                        $('#message_holder').html('<div><div class="form-message success">' + obj.responseMessage + '</div></div>');
                    else
                        $('#message_holder').html('<div><div class="form-message error">' + obj.responseMessage + '</div></div>');

                    $('#menu_field_holder').html('');

                },
                error: function(data)
                {
                    obj = jQuery.parseJSON(data);
                    $('#message_holder').html('<div><div class="form-message error">' + obj.responseMessage + '</div></div>');

                }
            });

        }
        else {
            alertify.alert("Please Follow Password Policy As mentioned");
        }
    }

}