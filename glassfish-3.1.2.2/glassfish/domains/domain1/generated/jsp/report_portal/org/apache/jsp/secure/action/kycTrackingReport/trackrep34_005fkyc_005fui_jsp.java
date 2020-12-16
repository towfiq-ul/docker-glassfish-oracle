package org.apache.jsp.secure.action.kycTrackingReport;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public final class trackrep34_005fkyc_005fui_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/secure/top.jsp");
    _jspx_dependants.add("/WEB-INF/includes/head/jquery.jsp");
    _jspx_dependants.add("/secure/role.jsp");
    _jspx_dependants.add("/secure/bottom.jsp");
    _jspx_dependants.add("/secure/menu.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_readonly_placeholder_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_hidden_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_actionerror_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_select_name_multiple_listValue_listKey_list_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_id_cssClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_style_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_onsubmit_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_textfield_readonly_placeholder_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_hidden_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_actionerror_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_select_name_multiple_listValue_listKey_list_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_div_id_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_style_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_onsubmit_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_textfield_readonly_placeholder_name_id_nobody.release();
    _jspx_tagPool_s_hidden_value_name_nobody.release();
    _jspx_tagPool_s_actionerror_nobody.release();
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_select_name_multiple_listValue_listKey_list_id_nobody.release();
    _jspx_tagPool_s_url_action_nobody.release();
    _jspx_tagPool_s_if_test.release();
    _jspx_tagPool_s_div_id_cssClass.release();
    _jspx_tagPool_s_submit_value_style_nobody.release();
    _jspx_tagPool_s_form_onsubmit_action.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      response.setHeader("X-Powered-By", "JSP/2.2");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
 String pagename = "B2B Request Report";
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta name=\"robots\" content=\"all, follow\" />\n");
      out.write("    <meta name=\"description\" content=\"\" />\n");
      out.write("    <meta name=\"keywords\" content=\"\" />\n");
      out.write("    <title>Report Portal</title>   \n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/javascript/datetimepicker_css.js\" type=\"text/javascript\"></script>\n");
      out.write("    ");
      out.write("\n");
      out.write("     \n");
      out.write("<!-- jq integration from google cdn (content delivery network) -->\n");
      out.write("<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("<!-- <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js\" type=\"text/javascript\"></script> -->\n");
      out.write("        \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    //make sure jq is really loaded from google, else load it from our local server\n");
      out.write("    if (!window.jQuery){\n");
      out.write("        document.write(unescape(\"%3Cscript src='");
      out.print(request.getContextPath() );
      out.write("/js/jquery/jquery-1.7.2.js' type='text/javascript'%3E%3C/script%3E\"));\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("     \n");
      out.write("<!-- jq-ui integration from google cdn (content delivery network) -->\n");
      out.write("<!-- you could do it this way, but we don't really need it for our tutorial-->\n");
      out.write("<!--\n");
      out.write("<script src=\"//ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.js\" type=\"text/javascript\"></script>\n");
      out.write("<link href=\"//ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("-->");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery/jquery-ui.css\" />\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery/jquery-ui.js\"></script>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"");
      out.print(request.getContextPath());
      out.write("/images/bkash.ico\"/>\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/default.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/jquery.selectBoxIt.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/grayred.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/jquery.multiselect.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery/jquery.multiselect.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/javascript/date.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/json2.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/date.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/smoke/smoke.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.selectBoxIt.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/bootstrap.js\" type=\"text/javascript\"></script>   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        $(function() {\n");
      out.write("            $(\"#demo4\").datepicker({dateFormat: 'dd-mm-yy',\n");
      out.write("                maxDate: \"0d\"\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $(\"#multiple-select-ma\").multiselect({\n");
      out.write("                height: 175,\n");
      out.write("                noneSelectedText: 'Select Wallet',\n");
      out.write("                classes: 'custom-ui-multiselect-header',\n");
      out.write("                closeIcon: '',\n");
      out.write("                click: function(event, ui) {\n");
      out.write("                    getRaListByMaWallet(getSelectedRas());\n");
      out.write("                },\n");
      out.write("                checkAll: function() {\n");
      out.write("                    $('input[name=\"multiselect_multiple-select-ma\"]').each(function(i, v) {\n");
      out.write("                        $(v).addClass('selected');\n");
      out.write("                    });\n");
      out.write("                    getRaListByMaWallet(getSelectedRas());\n");
      out.write("                },\n");
      out.write("                uncheckAll: function() {\n");
      out.write("                    $('input[name=\"multiselect_multiple-select-ma\"]').each(function(i, v) {\n");
      out.write("                        $(v).removeClass('selected');\n");
      out.write("                    });\n");
      out.write("                    getRaListByMaWallet(getSelectedRas());\n");
      out.write("                },\n");
      out.write("//                beforeclose: function() {\n");
      out.write("//                    getRaListByMaWallet(getSelectedRas());\n");
      out.write("//                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $(\"#multiple-select\").multiselect({\n");
      out.write("                height: 175,\n");
      out.write("                noneSelectedText: 'Select Wallet',\n");
      out.write("                classes: 'custom-ui-multiselect-header',\n");
      out.write("                closeIcon: '',\n");
      out.write("                checkAll: function() {\n");
      out.write("                    $('input[name=\"multiselect_multiple-select\"]').each(function(i, v) {\n");
      out.write("                        $(v).addClass('selected');\n");
      out.write("                    });\n");
      out.write("                },\n");
      out.write("                uncheckAll: function() {\n");
      out.write("                    $('input[name=\"multiselect_multiple-select\"]').each(function(i, v) {\n");
      out.write("                        $(v).removeClass('selected');\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('#checkbox-MTD').on('change', function() {\n");
      out.write("                $('#datepicker_kyc_tr_startdate27').datepicker('setDate', null);\n");
      out.write("                $('#datepicker_kyc_tr_enddate27').datepicker('setDate', null);\n");
      out.write("            })\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function validateNIDForm() {\n");
      out.write("            var x = document.forms[\"NID_Form\"][\"nid_no\"].value;\n");
      out.write("            if (x == null || x == \"\") {\n");
      out.write("                alert(\"NID must be filled out\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        function validateIDForm() {\n");
      out.write("            var x = document.forms[\"ID_Form\"][\"photo_id_no\"].value;\n");
      out.write("            var y = document.forms[\"ID_Form\"][\"photo_id_type\"].value;\n");
      out.write("            if (x == null || x == \"\" || y == null || y == \"\") {\n");
      out.write("                alert(\"Photo ID/Type must be filled out\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if (y === 'National ID') {\n");
      out.write("                if (x.length === 13 || x.length === 17) {\n");
      out.write("                    if (x.length === 17) {\n");
      out.write("                        var year = x.substring(0, 2);\n");
      out.write("                        if (year !== '19') {\n");
      out.write("                            alert('Invalid National ID Number.ID Number must start with 19');\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                else {\n");
      out.write("                    alert(\"Invalid National ID Length.Length Must be 13/17 Digit\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        function rolep() {\n");
      out.write("\n");
      out.write("            var role = document.getElementById(\"role\");\n");
      out.write("            var product = document.getElementById(\"product\");\n");
      out.write("            var option1 = document.createElement(\"option\");\n");
      out.write("            option1.text = \"Channel Wallet\";\n");
      out.write("            option1.value = \"Channel Wallet\";\n");
      out.write("            var option2 = document.createElement(\"option\");\n");
      out.write("            option2.text = \"Retail Merchant Wallet\";\n");
      out.write("            option2.value = \"Retail Merchant Wallet\";\n");
      out.write("            var option3 = document.createElement(\"option\");\n");
      out.write("            option3.text = \"Mega Merchant Wallet\";\n");
      out.write("            option3.value = \"Mega Merchant Wallet\";\n");
      out.write("            if (role.value == \"Master Agent\") {\n");
      out.write("                product.options.length = 0;\n");
      out.write("                product.add(option1, null);\n");
      out.write("            } else if (role.value == \"Merchant\") {\n");
      out.write("                product.options.length = 0;\n");
      out.write("                product.add(option2, null);\n");
      out.write("                product.add(option3, null);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function rolepload() {\n");
      out.write("\n");
      out.write("\n");
      out.write("            var product = document.getElementById(\"product\");\n");
      out.write("            var option1 = document.createElement(\"option\");\n");
      out.write("            option1.text = \"Channel Wallet\";\n");
      out.write("            option1.value = \"Channel Wallet\";\n");
      out.write("\n");
      out.write("            if (product) {\n");
      out.write("                product.options.length = 0;\n");
      out.write("                product.add(option1, null);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        $(function() {\n");
      out.write("            \"use strict\";\n");
      out.write("            $('#logoutLink').click(function() {\n");
      out.write("\n");
      out.write("                var destinationUrl = this.href;\n");
      out.write("\n");
      out.write("                $.ajax({\n");
      out.write("                    url: destinationUrl,\n");
      out.write("                    type: \"GET\",\n");
      out.write("                    cache: false,\n");
      out.write("                    dataType: \"json\",\n");
      out.write("                    success: function(data, textStatus, jqXHR) {\n");
      out.write("                        //alert(\"success\");\n");
      out.write("                        if (data.status == \"SUCCESS\") {\n");
      out.write("                            //redirect to welcome page\n");
      out.write("                            window.location.replace(\"http://\" + window.location.host + \"");
      out.print(request.getContextPath());
      out.write("\");\n");
      out.write("                        } else {\n");
      out.write("                            alert(\"failed\");\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    error: function(jqXHR, textStatus, errorThrown) {\n");
      out.write("                        alert(\"error - HTTP STATUS: \" + jqXHR.status);\n");
      out.write("                    },\n");
      out.write("                    complete: function(jqXHR, textStatus) {\n");
      out.write("                        //alert(\"complete\");\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                return false;\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</head>   \n");
      out.write("<body onload=\"rolepload()\">\n");
      out.write("    <!-- #main -->\n");
      out.write("    <div id=\"main\">\n");
      out.write("        <!-- #header -->\n");
      out.write("        <div id=\"header\"> \n");
      out.write("            <!-- #logo --> \n");
      out.write("            <div id=\"logo\" style=\"color:#fff;font-weight:normal;font-size:23px;font-family: Verdana,Arial;padding:0 0 0 12px;\">\n");
      out.write("                Report Portal\n");
      out.write("            </div>\n");
      out.write("            <!-- /#logo -->\n");
      out.write("            <!-- #user -->                        \n");
      out.write("            <div id=\"user\">\n");
      out.write("                <h2>");
out.print(request.getUserPrincipal().getName());
      out.write(" <span>(");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

 String[] allRoles = {"ADMINISTRATOR","BSO","SND","CS","DISTRIBUTOR","QC","FINANCE","BSA","AGENT","COMPLIANCE","SalesOps","RSM","SM","TM"};
int temp=0;
List userRoles = new ArrayList(allRoles.length);
for(String role : allRoles) {
 if(request.isUserInRole(role)) { 
 if(temp==0){ 
     out.print(role);
    
 }else{
     out.print(" , "+role);
     
 }
  temp++;
 }
};

      out.write('\n');
      out.write(")</span></h2>\n");
      out.write("                <script type=\"text/javascript\">date();</script> - <a id=\"logout\" href=\"");
      out.print(request.getContextPath());
      out.write("/secure/action/logout\" >Logout</a> - \n");
      out.write("                <a id=\"pwd_chng\" href=\"");
      out.print(request.getContextPath());
      out.write("/secure/action/change\" >Change password</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- /#user -->  \n");
      out.write("        </div>\n");
      out.write("        <!-- /header -->\n");
      out.write("        <!-- #content -->\n");
      out.write("        <div id=\"content\">\n");
      out.write("\n");
      out.write("            <!-- breadcrumbs -->\n");
      out.write("            <div class=\"breadcrumbs\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /breadcrumbs -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- box -->\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div class=\"headlines\">\n");
      out.write("                    <h2><span>");
out.print(pagename);
      out.write("</span></h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box-content\">");
      out.write("\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/css/detailsInformation.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\n");
      out.write("\n");
      if (_jspx_meth_s_if_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_s_property_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_s_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
 if (request.isUserInRole("RSM") || request.isUserInRole("SM") || request.isUserInRole("TM")
            || request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("COMPLIANCE")) {
      out.write("\n");
      out.write("\n");
      out.write("    <fieldset class=\"gradient\">\n");
      out.write("        ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("<br/>\n");
      out.write("    </fieldset>\n");
      out.write("    ");
 }
      out.write("\n");
      out.write("    <br/>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div><!-- /box-content -->\n");
      out.write("</div>\n");
      out.write("<!-- /box -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- /#content -->\n");
      out.write("<!-- #sidebar -->\n");
      out.write("<div id=\"sidebar\">\n");
      out.write("    <div id=\"page-logo\">\n");
      out.write("        <img src=\"");
      out.print(request.getContextPath());
      out.write("/images/bkash_x140.jpg\" />\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- mainmenu -->\n");
      out.write("    ");
      out.write("<ul id=\"floatMenu\" class=\"mainmenu\" style=\"top: 0px; \">\n");
      out.write("\n");
      out.write("    <li class=\"first\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/secure/action/dashboard\">Dashboard</a></li>\n");
      out.write("\n");
      out.write("    <!--\n");
      out.write("    \n");
      out.write("    <div onmouseover=\"document.getElementById('transaction').style.display = 'block';\" onmouseout=\"document.getElementById('transaction').style.display = 'none';\">\n");
      out.write("    ");
    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("BSA") || request.isUserInRole("AGENT") || request.isUserInRole("SND")) {
    
      out.write(" <li id=\"monthlyreport\"><a class=\"nonlink\">Transaction Report</a></li>\n");
      out.write("    ");
 }
    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"transaction\" style=\"display: none;\">\n");
      out.write("    ");
    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("BSA") || request.isUserInRole("AGENT") || request.isUserInRole("SND")) {
    
      out.write(" <li class=\"red\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/secure/action/monthlyTransaction\">- Summary</a></li>\n");
      out.write("    ");
 }
    
      out.write("\n");
      out.write("\n");
      out.write("    ");
    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("BSA") || request.isUserInRole("SND")) {
    
      out.write(" <li class=\"red\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/secure/action/detailsInformation\">- Detailed</a></li>\n");
      out.write("\n");
      out.write("    ");
 }
    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div onmouseover=\"document.getElementById('liftnrefund').style.display = 'block';\" onmouseout=\"document.getElementById('liftnrefund').style.display = 'none';\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {
    
      out.write(" <li><a class=\"nonlink\">Lift & Refund Report</a></li>\n");
      out.write("    ");
 }
    
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"liftnrefund\" style=\"display: none;\">\n");
      out.write("    ");
    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {
    
      out.write(" <li class=\"red\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/secure/action/monthlyLiftRefund\">- Summary</a></li>\n");
      out.write("    ");
 }
    
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div onmouseover=\"document.getElementById('kyc').style.display = 'block';\" onmouseout=\"document.getElementById('kyc').style.display = 'none';\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {
    
      out.write(" <li><a class=\"nonlink\">KYC Status Report</a></li>\n");
      out.write("    ");
 }
    
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"kyc\" style=\"display: none;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {
    
      out.write("  <li class=\"red\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/secure/action/kycStatusSummary\">- Summary</a></li>\n");
      out.write("    ");
 }
    
      out.write("\n");
      out.write("\n");
      out.write("    ");
    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {
    
      out.write("  <li class=\"red\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/secure/action/kycStatus\">- Detailed</a></li>\n");
      out.write("    ");
 }
    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    -->\n");
      out.write("\n");
      out.write("    ");
    if (request.isUserInRole("ADMINISTRATOR")) {
    
      out.write(" <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/secure/Admin/Account.jsp\">Manage Accounts</a></li>\n");
      out.write("    <li><a href=\"");
      if (_jspx_meth_s_url_0(_jspx_page_context))
        return;
      out.write("\"><p>User Mapping Management</p></a></li>\n");
      out.write("        ");
 }
        
      out.write("\n");
      out.write("\n");
      out.write("</ul> ");
      out.write("\n");
      out.write("    \n");
      out.write("    <!-- /.mainmenu -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- /#sidebar -->\n");
      out.write("<!-- #footer -->\n");
      out.write("\n");
      out.write("<!-- /#footer -->\n");
      out.write("</div>\n");
      out.write("<!-- /#main -->\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("    $(function() {\n");
      out.write("\n");
      out.write("\n");
      out.write("        function validdate(a, b) {\n");
      out.write("            var startDate = document.getElementById(a).value;\n");
      out.write("            var endDate = document.getElementById(b).value;\n");
      out.write("            if (Date.parse(endDate) < Date.parse(startDate)) {\n");
      out.write("                alert(\"Invalid date range!\\n Please choose a date that is not later than today!\\n Please choose start date earlier than end date\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if ((startDate == false) && (endDate == false)) {\n");
      out.write("                alert(\"please select both Start and End Date\")\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if (startDate == false) {\n");
      out.write("                alert(\"please select a Start Date\")\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if (endDate == false) {\n");
      out.write("                alert(\"please select a End Date\")\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        var date = new Date();\n");
      out.write("        var currentTime = new Date();\n");
      out.write("\n");
      out.write("        date.setMonth(date.getMonth(), 0);\n");
      out.write("        var date = new Date();\n");
      out.write("        date.setMonth(date.getMonth(), 0);\n");
      out.write("        var mindate = new Date();\n");
      out.write("        mindate.setMonth(date.getMonth() - 2);\n");
      out.write("        $(\"#datepicker\").datepicker({\n");
      out.write("            maxDate: date,\n");
      out.write("            dateFormat: 'mm-yy',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true,\n");
      out.write("            showButtonPanel: true,\n");
      out.write("            onClose: function(dateText, inst) {\n");
      out.write("                var month = $(\"#ui-datepicker-div .ui-datepicker-month :selected\").val();\n");
      out.write("                var year = $(\"#ui-datepicker-div .ui-datepicker-year :selected\").val();\n");
      out.write("                $(this).datepicker('setDate', new Date(year, month, 1));\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\"#datepicker20,#datepicker21\").datepicker({\n");
      out.write("            dateFormat: 'yy-mm-dd',\n");
      out.write("            minDate: -90,\n");
      out.write("            maxDate: -1,\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true,\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\"#datepicker19\").datepicker({\n");
      out.write("            dateFormat: 'dd-mm-y',\n");
      out.write("            minDate: -90,\n");
      out.write("            maxDate: -1,\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true,\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\"#datepicker98\").datepicker({\n");
      out.write("            maxDate: date,\n");
      out.write("            minDate: mindate,\n");
      out.write("            dateFormat: 'M-y',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true,\n");
      out.write("            showButtonPanel: true,\n");
      out.write("            onClose: function(dateText, inst) {\n");
      out.write("                var month = $(\"#ui-datepicker-div .ui-datepicker-month :selected\").val();\n");
      out.write("                var year = $(\"#ui-datepicker-div .ui-datepicker-year :selected\").val();\n");
      out.write("                $(this).datepicker('setDate', new Date(year, month, 1));\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("        $(\"#datepicker1\").datepicker({\n");
      out.write("            maxDate: date,\n");
      out.write("            dateFormat: 'mm-yy',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true,\n");
      out.write("            showButtonPanel: true,\n");
      out.write("            onClose: function(dateText, inst) {\n");
      out.write("                var month = $(\"#ui-datepicker-div .ui-datepicker-month :selected\").val();\n");
      out.write("                var year = $(\"#ui-datepicker-div .ui-datepicker-year :selected\").val();\n");
      out.write("                $(this).datepicker('setDate', new Date(year, month, 1));\n");
      out.write("            }});\n");
      out.write("\n");
      out.write("\n");
      out.write("        $(\"#datepicker99,#datepicker97\").datepicker({\n");
      out.write("            maxDate: date,\n");
      out.write("            minDate: mindate,\n");
      out.write("            dateFormat: 'M-y',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true,\n");
      out.write("            showButtonPanel: true,\n");
      out.write("            onClose: function(dateText, inst) {\n");
      out.write("                var month = $(\"#ui-datepicker-div .ui-datepicker-month :selected\").val();\n");
      out.write("                var year = $(\"#ui-datepicker-div .ui-datepicker-year :selected\").val();\n");
      out.write("                $(this).datepicker('setDate', new Date(year, month, 1));\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\"#datepicker2\").datepicker({\n");
      out.write("            maxDate: date,\n");
      out.write("            dateFormat: 'mm-yy',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true,\n");
      out.write("            showButtonPanel: true,\n");
      out.write("            onClose: function(dateText, inst) {\n");
      out.write("                var month = $(\"#ui-datepicker-div .ui-datepicker-month :selected\").val();\n");
      out.write("                var year = $(\"#ui-datepicker-div .ui-datepicker-year :selected\").val();\n");
      out.write("                $(this).datepicker('setDate', new Date(year, month, 1));\n");
      out.write("            }});\n");
      out.write("\n");
      out.write("        $(\"#datepicker3\").datepicker({\n");
      out.write("            maxDate: date,\n");
      out.write("            dateFormat: 'mm-yy',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true,\n");
      out.write("            showButtonPanel: true,\n");
      out.write("            onClose: function(dateText, inst) {\n");
      out.write("                var month = $(\"#ui-datepicker-div .ui-datepicker-month :selected\").val();\n");
      out.write("                var year = $(\"#ui-datepicker-div .ui-datepicker-year :selected\").val();\n");
      out.write("                $(this).datepicker('setDate', new Date(year, month, 1));\n");
      out.write("            }});\n");
      out.write("        $(\"#datepicker4\").datepicker({\n");
      out.write("            maxDate: date,\n");
      out.write("            dateFormat: 'mm-yy',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true,\n");
      out.write("            showButtonPanel: true,\n");
      out.write("            onClose: function(dateText, inst) {\n");
      out.write("                var month = $(\"#ui-datepicker-div .ui-datepicker-month :selected\").val();\n");
      out.write("                var year = $(\"#ui-datepicker-div .ui-datepicker-year :selected\").val();\n");
      out.write("                $(this).datepicker('setDate', new Date(year, month, 1));\n");
      out.write("            }});\n");
      out.write("\n");
      out.write("        $(\"#datepicker5\").datepicker({\n");
      out.write("            maxDate: date,\n");
      out.write("            dateFormat: 'mm-yy',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true,\n");
      out.write("            showButtonPanel: true,\n");
      out.write("            onClose: function(dateText, inst) {\n");
      out.write("                var month = $(\"#ui-datepicker-div .ui-datepicker-month :selected\").val();\n");
      out.write("                var year = $(\"#ui-datepicker-div .ui-datepicker-year :selected\").val();\n");
      out.write("                $(this).datepicker('setDate', new Date(year, month, 1));\n");
      out.write("            }});\n");
      out.write("\n");
      out.write("        $(\"#datepicker7,#datepicker7_1\").datepicker({\n");
      out.write("            maxDate: -1,\n");
      out.write("            dateFormat: 'mm/dd/yy',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true,\n");
      out.write("        });\n");
      out.write("        $(\"#datepicker8,#datepicker8_1\").datepicker({\n");
      out.write("            maxDate: -1,\n");
      out.write("            dateFormat: 'mm/dd/yy',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\"#datepicker_kyc_tr_startdate,#datepicker_kyc_tr_enddate,\\n\\\n");
      out.write("        \\n\\\n");
      out.write("#datepicker_kyc_tr_startdate_1,#datepicker_kyc_tr_enddate_1,\\n\\\n");
      out.write("\\n\\\n");
      out.write("#datepicker_kyc_tr_startdate_2,#datepicker_kyc_tr_enddate_2\").datepicker({\n");
      out.write("            maxDate: -1,\n");
      out.write("            minDate: -90,\n");
      out.write("            dateFormat: 'dd-M-y',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\"#datepicker_kyc_tr_startdate27,#datepicker_kyc_tr_enddate27\").datepicker({\n");
      out.write("            maxDate: -1,\n");
      out.write("            minDate: -35,\n");
      out.write("            dateFormat: 'dd-M-y',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: false,\n");
      out.write("            onSelect: function() {\n");
      out.write("                $('#checkbox-MTD').prop('checked', false);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("        $(\"#datepicker_kyc_tr_startdate15,#datepicker_kyc_tr_enddate15\").datepicker({\n");
      out.write("            maxDate: -1,\n");
      out.write("            minDate: -90,\n");
      out.write("            dateFormat: 'dd-M-y',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true\n");
      out.write("        });\n");
      out.write("        $(\"#datepicker_kyc_tr_startdate25,#datepicker_kyc_tr_enddate25\").datepicker({\n");
      out.write("            maxDate: 0,\n");
      out.write("            minDate: -7,\n");
      out.write("            dateFormat: 'dd-M-y',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\"#datepicker17,#datepicker18\").datepicker({\n");
      out.write("            maxDate: -1,\n");
      out.write("            dateFormat: 'mm/dd/yy',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true,\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        $(\"#datepicker9,#datepicker9_1\").datepicker({\n");
      out.write("            maxDate: -1,\n");
      out.write("            dateFormat: 'mm/dd/yy',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\"#datepicker6\").datepicker({\n");
      out.write("            maxDate: date,\n");
      out.write("            dateFormat: 'mm-yy',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: true,\n");
      out.write("            showButtonPanel: true,\n");
      out.write("            onClose: function(dateText, inst) {\n");
      out.write("                var month = $(\"#ui-datepicker-div .ui-datepicker-month :selected\").val();\n");
      out.write("                var year = $(\"#ui-datepicker-div .ui-datepicker-year :selected\").val();\n");
      out.write("                $(this).datepicker('setDate', new Date(year, month, 1));\n");
      out.write("            }});\n");
      out.write("\n");
      out.write("        $(\"#datepicker_kyc_tr_startdate34,#datepicker_kyc_tr_enddate34\").datepicker({\n");
      out.write("            // maxDate: -1,\n");
      out.write("            // minDate: -35,\n");
      out.write("            dateFormat: 'dd-M-y',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: false,\n");
      out.write("            onSelect: function() {\n");
      out.write("                $('#checkbox-MTD').prop('checked', false);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\"#datepicker_kyc_tr_startdate35,#datepicker_kyc_tr_enddate35\").datepicker({\n");
      out.write("            // maxDate: -1,\n");
      out.write("            // minDate: -35,\n");
      out.write("            dateFormat: 'dd-M-y',\n");
      out.write("            changeMonth: true,\n");
      out.write("            changeYear: false,\n");
      out.write("            onSelect: function() {\n");
      out.write("                $('#checkbox-MTD').prop('checked', false);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function()\n");
      out.write("    {\n");
      out.write("        $('#search').keyup(function()\n");
      out.write("        {\n");
      out.write("            searchTable($(this).val());\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    function isInteger(t)\n");
      out.write("    {\n");
      out.write("        var i;\n");
      out.write("        var ss;\n");
      out.write("        ss = document.getElementById(t).value;\n");
      out.write("        ss = ss.toString();\n");
      out.write("        for (i = 0; i < ss.length; i++)\n");
      out.write("        {\n");
      out.write("            var c = ss.charAt(i);\n");
      out.write("            if (isNaN(c))\n");
      out.write("            {\n");
      out.write("                document.getElementById(t).value = \"\";\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function mobilenumberformat(t)\n");
      out.write("    {\n");
      out.write("        var i;\n");
      out.write("        var ss;\n");
      out.write("        var it;\n");
      out.write("        ss = document.getElementById(t).value;\n");
      out.write("        ss = ss.toString();\n");
      out.write("\n");
      out.write("        if (ss.length != 11) {\n");
      out.write("            document.getElementById(t).value = \"\";\n");
      out.write("            alert(\"Invalid Wallet Number format\");\n");
      out.write("            // oh what now?\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function checkwalletno(t)\n");
      out.write("    {\n");
      out.write("\n");
      out.write("\n");
      out.write("        var i;\n");
      out.write("        var ss;\n");
      out.write("        var it;\n");
      out.write("        ss = document.getElementById(t).value;\n");
      out.write("        ss = ss.toString();\n");
      out.write("\n");
      out.write("        if (ss.length == 0) {\n");
      out.write("\n");
      out.write("\n");
      out.write("            alert(\"Please Enter Wallet Number first\");\n");
      out.write("            return (false);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function checkBlankTextBox(x) {\n");
      out.write("\n");
      out.write("        var ss;\n");
      out.write("\n");
      out.write("        ss = document.getElementById(x).value;\n");
      out.write("        ss = ss.toString();\n");
      out.write("\n");
      out.write("        if (ss.length == 0) {\n");
      out.write("            alert(\"Please pick the month first !\");\n");
      out.write("\n");
      out.write("            return (false);\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        return true;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function checkdate(r, t)\n");
      out.write("    {\n");
      out.write("        var rr;\n");
      out.write("        var ss;\n");
      out.write("\n");
      out.write("        ss = document.getElementById(t).value;\n");
      out.write("        ss = ss.toString();\n");
      out.write("        rr = document.getElementById(r).value;\n");
      out.write("        rr = rr.toString();\n");
      out.write("\n");
      out.write("\n");
      out.write("        if (ss.length == 0 || rr.length == 0) {\n");
      out.write("\n");
      out.write("\n");
      out.write("            alert(\"You can't leave a date textbox empty ! Please try again !\");\n");
      out.write("\n");
      out.write("\n");
      out.write("            return (false);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        var d1 = Date.parse(ss);\n");
      out.write("        var d2 = Date.parse(rr);\n");
      out.write("\n");
      out.write("\n");
      out.write("        var x = Date.parse(ss);\n");
      out.write("        x.add(-30).days();\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        if (d2 < x) {\n");
      out.write("\n");
      out.write("            alert(\"You can pull data of 30 days max !\");\n");
      out.write("\n");
      out.write("            return (false);\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        if (d2 > d1) {\n");
      out.write("            alert(\"Please pick a valid date range first !\");\n");
      out.write("\n");
      out.write("            return (false);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("    function checkdate15(r, t)\n");
      out.write("    {\n");
      out.write("\n");
      out.write("\n");
      out.write("        var rr;\n");
      out.write("        var ss;\n");
      out.write("\n");
      out.write("        ss = document.getElementById(t).value;\n");
      out.write("        ss = ss.toString();\n");
      out.write("        rr = document.getElementById(r).value;\n");
      out.write("        rr = rr.toString();\n");
      out.write("\n");
      out.write("\n");
      out.write("        if (ss.length == 0 || rr.length == 0) {\n");
      out.write("\n");
      out.write("\n");
      out.write("            alert(\"You can't leave a date textbox empty ! Please try again !\");\n");
      out.write("\n");
      out.write("\n");
      out.write("            return (false);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        var d1 = Date.parse(ss);\n");
      out.write("        var d2 = Date.parse(rr);\n");
      out.write("\n");
      out.write("\n");
      out.write("        var x = Date.parse(ss);\n");
      out.write("        x.add(-5).days();\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        if (d2 < x) {\n");
      out.write("\n");
      out.write("            alert(\"You can pull data of 5 days max !\");\n");
      out.write("\n");
      out.write("            return (false);\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        if (d2 > d1) {\n");
      out.write("            alert(\"Please pick a valid date range first !\");\n");
      out.write("\n");
      out.write("            return (false);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("    function searchTable(inputVal)\n");
      out.write("    {\n");
      out.write("        var table = $('#tblData');\n");
      out.write("        table.find('tr').each(function(index, row)\n");
      out.write("        {\n");
      out.write("            var allCells = $(row).find('td');\n");
      out.write("            if (allCells.length > 0)\n");
      out.write("            {\n");
      out.write("                var found = false;\n");
      out.write("                allCells.each(function(index, td)\n");
      out.write("                {\n");
      out.write("                    var regExp = new RegExp(inputVal, 'i');\n");
      out.write("                    if (regExp.test($(td).text()))\n");
      out.write("                    {\n");
      out.write("                        found = true;\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                if (found == true)\n");
      out.write("                    $(row).show();\n");
      out.write("                else\n");
      out.write("                    $(row).hide();\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function checkDistributorAndMTDAndDate(c, s, e) {\n");
      out.write("        return checkDistributor() && checkMTDAndDate(c, s, e);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function checkMAAndRA() {\n");
      out.write("        return checkMA() && checkRA();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function checkMAAndRAandMTDAndDate(c, s, e) {\n");
      out.write("        return checkMA() && checkRA() && checkMTDAndDate(c, s, e);\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function checkMAAndRAandDate(s, e){\n");
      out.write("        return checkMA() && checkRAandDate(s, e);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function checkRAandMTDAndDate(c, s, e) {\n");
      out.write("        return checkRA() && checkMTDAndDate(c, s, e);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function checkRAandDate(s, e) {\n");
      out.write("        return checkRA() && checkdate(s, e);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function checkMAandDate(s, e) {\n");
      out.write("        return checkMA() && checkdate(s, e);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function checkRAandMTD(c) {\n");
      out.write("        return checkRA() && checkMTD(c);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function checkMTD(c) {\n");
      out.write("        if (!$('#' + c).is(':checked')) {\n");
      out.write("            alert(\"You have to select MTD to proceed ! Please try again !\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function checkMTDAndDate(c, s, e) {\n");
      out.write("        if (!$('#' + c).is(':checked') && !$('#' + s).val() && !$('#' + e).val()) {\n");
      out.write("            alert(\"You have to select MTD or date range to proceed ! Please try again !\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        else if ($('#' + c).is(':checked')) {\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("        else {\n");
      out.write("            return checkdate(s, e);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function checkMA() {\n");
      out.write("        var ras = [];\n");
      out.write("        $('input[name=\"multiselect_multiple-select-ma\"]').each(function(i, v) {\n");
      out.write("            if ($(v).is(\":checked\") || $(v).hasClass('selected'))\n");
      out.write("                ras.push(v.value);\n");
      out.write("        });\n");
      out.write("        if (!ras.length) {\n");
      out.write("            alert(\"You haven't selected any Distributor! Please try again !\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function checkDistributor() {\n");
      out.write("        var ras = [];\n");
      out.write("        $('input[name=\"multiselect_multiple-select\"]').each(function(i, v) {\n");
      out.write("            if ($(v).is(\":checked\") || $(v).hasClass('selected'))\n");
      out.write("                ras.push(v.value);\n");
      out.write("        });\n");
      out.write("        if (!ras.length) {\n");
      out.write("            alert(\"You haven't selected any Distributor! Please try again !\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function checkRA() {\n");
      out.write("        var ras = [];\n");
      out.write("        $('input[name=\"multiselect_multiple-select\"]').each(function(i, v) {\n");
      out.write("            if ($(v).is(\":checked\") || $(v).hasClass('selected'))\n");
      out.write("                ras.push(v.value);\n");
      out.write("        });\n");
      out.write("//        console.log(ras);\n");
      out.write("        if (!ras.length) {\n");
      out.write("            alert(\"You haven't selected any RA! Please try again !\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function getSelectedRas() {\n");
      out.write("        var ras = [];\n");
      out.write("        $('input[name=\"multiselect_multiple-select-ma\"]').each(function(i, v) {\n");
      out.write("            if ($(v).is(\":checked\") || $(v).hasClass('selected'))\n");
      out.write("                ras.push(v.value);\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        return ras.join(',');\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function getRaListByMaWallet(ma_wallet) {\n");
      out.write("        if (ma_wallet) {\n");
      out.write("            $.ajax({\n");
      out.write("                type: \"POST\",\n");
      out.write("                url: \"");
      out.print(request.getContextPath());
      out.write("/services/auth/ra_list_by_ma_wallet\",\n");
      out.write("                data: ma_wallet,\n");
      out.write("                contentType: \"application/json;\",\n");
      out.write("                dataType: \"json\",\n");
      out.write("                success: function(msg) {\n");
      out.write("                    console.log('getRaListByMaWallet: ', msg);\n");
      out.write("                    $(\"#multiple-select\").get(0).options.length = 0;\n");
      out.write("\n");
      out.write("                    $.each(msg.data, function(index, item) {\n");
      out.write("                        $(\"#multiple-select\").get(0).options[$(\"#multiple-select\").get(0).options.length] = new Option(item.walletNo, item.walletNo);\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    $(\"#multiple-select\").multiselect('refresh');\n");
      out.write("                },\n");
      out.write("                error: function() {\n");
      out.write("                    $(\"#multiple-select\").get(0).options.length = 0;\n");
      out.write("                    alert(\"Failed to load RAs\");\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        } else {\n");
      out.write("            $(\"#multiple-select\").get(0).options.length = 0;\n");
      out.write("            $(\"#multiple-select\").multiselect('refresh');\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_0 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_0.setPageContext(_jspx_page_context);
    _jspx_th_s_if_0.setParent(null);
    _jspx_th_s_if_0.setTest("hasActionErrors()");
    int _jspx_eval_s_if_0 = _jspx_th_s_if_0.doStartTag();
    if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_s_actionerror_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_s_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
    return false;
  }

  private boolean _jspx_meth_s_actionerror_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionerror
    org.apache.struts2.views.jsp.ui.ActionErrorTag _jspx_th_s_actionerror_0 = (org.apache.struts2.views.jsp.ui.ActionErrorTag) _jspx_tagPool_s_actionerror_nobody.get(org.apache.struts2.views.jsp.ui.ActionErrorTag.class);
    _jspx_th_s_actionerror_0.setPageContext(_jspx_page_context);
    _jspx_th_s_actionerror_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    int _jspx_eval_s_actionerror_0 = _jspx_th_s_actionerror_0.doStartTag();
    if (_jspx_th_s_actionerror_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_actionerror_nobody.reuse(_jspx_th_s_actionerror_0);
      return true;
    }
    _jspx_tagPool_s_actionerror_nobody.reuse(_jspx_th_s_actionerror_0);
    return false;
  }

  private boolean _jspx_meth_s_property_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent(null);
    _jspx_th_s_property_0.setValue("message");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_1 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_1.setPageContext(_jspx_page_context);
    _jspx_th_s_if_1.setParent(null);
    _jspx_th_s_if_1.setTest("%{!errorMessage.empty}");
    int _jspx_eval_s_if_1 = _jspx_th_s_if_1.doStartTag();
    if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_s_div_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_s_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_1);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_1);
    return false;
  }

  private boolean _jspx_meth_s_div_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_0 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_id_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_0.setPageContext(_jspx_page_context);
    _jspx_th_s_div_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_1);
    _jspx_th_s_div_0.setId("errorMessage");
    _jspx_th_s_div_0.setCssClass("form-message error");
    int _jspx_eval_s_div_0 = _jspx_th_s_div_0.doStartTag();
    if (_jspx_eval_s_div_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("            <ul>\n");
        out.write("                <li>");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_0, _jspx_page_context))
          return true;
        out.write("</li>\n");
        out.write("            </ul>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_div_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_id_cssClass.reuse(_jspx_th_s_div_0);
      return true;
    }
    _jspx_tagPool_s_div_id_cssClass.reuse(_jspx_th_s_div_0);
    return false;
  }

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_0);
    _jspx_th_s_property_1.setValue("errorMessage");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_onsubmit_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("/secure/action/kycTrackingRep34Result");
    _jspx_th_s_form_0.setOnsubmit("return checkMAAndRAandDate('datepicker_kyc_tr_startdate34','datepicker_kyc_tr_enddate34')");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_hidden_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            <label>Select Distributor: </label>\n");
        out.write("            ");
        if (_jspx_meth_s_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("            <label>Select RA: </label>\n");
        out.write("            <select id=\"multiple-select\" multiple=\"true\" name=\"selectedRAs\"></select>\n");
        out.write("            <br>\n");
        out.write("            <br>\n");
        out.write("            Start Date : ");
        if (_jspx_meth_s_textfield_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            &nbsp; End Date : ");
        if (_jspx_meth_s_textfield_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            <br>\n");
        out.write("            <br>\n");
        out.write("            ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_onsubmit_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_onsubmit_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_hidden_0 = (org.apache.struts2.views.jsp.ui.HiddenTag) _jspx_tagPool_s_hidden_value_name_nobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_s_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_hidden_0.setName("target");
    _jspx_th_s_hidden_0.setValue("DISTRIBUTOR");
    int _jspx_eval_s_hidden_0 = _jspx_th_s_hidden_0.doStartTag();
    if (_jspx_th_s_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_hidden_value_name_nobody.reuse(_jspx_th_s_hidden_0);
      return true;
    }
    _jspx_tagPool_s_hidden_value_name_nobody.reuse(_jspx_th_s_hidden_0);
    return false;
  }

  private boolean _jspx_meth_s_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_0 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_name_multiple_listValue_listKey_list_id_nobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_0.setPageContext(_jspx_page_context);
    _jspx_th_s_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_select_0.setId("multiple-select-ma");
    _jspx_th_s_select_0.setMultiple("true");
    _jspx_th_s_select_0.setList("dsoWallets");
    _jspx_th_s_select_0.setListKey("walletNo");
    _jspx_th_s_select_0.setListValue("walletNo");
    _jspx_th_s_select_0.setName("selectedMAs");
    int _jspx_eval_s_select_0 = _jspx_th_s_select_0.doStartTag();
    if (_jspx_th_s_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_name_multiple_listValue_listKey_list_id_nobody.reuse(_jspx_th_s_select_0);
      return true;
    }
    _jspx_tagPool_s_select_name_multiple_listValue_listKey_list_id_nobody.reuse(_jspx_th_s_select_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_readonly_placeholder_name_id_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_0.setName("from_date");
    _jspx_th_s_textfield_0.setId("datepicker_kyc_tr_startdate34");
    _jspx_th_s_textfield_0.setDynamicAttribute(null, "placeholder", new String("Select date"));
    _jspx_th_s_textfield_0.setReadonly("true");
    int _jspx_eval_s_textfield_0 = _jspx_th_s_textfield_0.doStartTag();
    if (_jspx_th_s_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_readonly_placeholder_name_id_nobody.reuse(_jspx_th_s_textfield_0);
      return true;
    }
    _jspx_tagPool_s_textfield_readonly_placeholder_name_id_nobody.reuse(_jspx_th_s_textfield_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_readonly_placeholder_name_id_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_1.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_1.setName("to_date");
    _jspx_th_s_textfield_1.setId("datepicker_kyc_tr_enddate34");
    _jspx_th_s_textfield_1.setDynamicAttribute(null, "placeholder", new String("Select date"));
    _jspx_th_s_textfield_1.setReadonly("true");
    int _jspx_eval_s_textfield_1 = _jspx_th_s_textfield_1.doStartTag();
    if (_jspx_th_s_textfield_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_readonly_placeholder_name_id_nobody.reuse(_jspx_th_s_textfield_1);
      return true;
    }
    _jspx_tagPool_s_textfield_readonly_placeholder_name_id_nobody.reuse(_jspx_th_s_textfield_1);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_style_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_submit_0.setDynamicAttribute(null, "style", new String("background: #413F3F repeat;color:#E0E0E0;width: 50px;border: none;margin: 6px;padding: 3; cursor:pointer;"));
    _jspx_th_s_submit_0.setValue("Go");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_style_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_style_nobody.reuse(_jspx_th_s_submit_0);
    return false;
  }

  private boolean _jspx_meth_s_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_0 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent(null);
    _jspx_th_s_url_0.setAction("secure/action/sm_tm_management");
    int _jspx_eval_s_url_0 = _jspx_th_s_url_0.doStartTag();
    if (_jspx_th_s_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_0);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_0);
    return false;
  }
}
