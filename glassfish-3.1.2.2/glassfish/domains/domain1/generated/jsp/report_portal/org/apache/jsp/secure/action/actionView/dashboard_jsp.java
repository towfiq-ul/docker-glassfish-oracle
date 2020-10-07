package org.apache.jsp.secure.action.actionView;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_actionerror_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_value_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_actionerror_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_value_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_actionerror_nobody.release();
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_url_action_nobody.release();
    _jspx_tagPool_s_iterator_value_id.release();
    _jspx_tagPool_s_if_test.release();
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

      out.write('\n');
      out.write('\n');
 String pagename = "Dashboard";
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
      out.write('\n');
      if (_jspx_meth_s_if_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_s_property_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<fieldset class=\"gradient\">\n");
      out.write("    <div style=\"overflow:auto; height:450px; width:1008px\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
    if (request.isUserInRole("SND")) {
      out.write("\n");
      out.write("\n");
      out.write("        <!--\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_s_iterator_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        -->\n");
      out.write("        <br/>\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">KYC Tracking Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_3(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Summary Report : Date Wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_4(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Summary Report : Aging Report</p></a>\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_5(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Summary Report : BSA Agent Wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_6(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Detailed Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_7(_jspx_page_context))
        return;
      out.write("\"><p>KYC Lifecycle Report</p></a>\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">Transaction Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_8(_jspx_page_context))
        return;
      out.write("\"><p>Specific Channel Transaction Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_9(_jspx_page_context))
        return;
      out.write("\"><p>All Channel Transaction Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_10(_jspx_page_context))
        return;
      out.write("\"><p>Detailed Daily Transaction Report</p></a>\n");
      out.write("        <br/>\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">Lift & Refund Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_11(_jspx_page_context))
        return;
      out.write("\"><p>Summary Report</p></a>\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">KYC Status Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_12(_jspx_page_context))
        return;
      out.write("\"><p>Summary Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_13(_jspx_page_context))
        return;
      out.write("\"><p>Detailed Report</p></a>\n");
      out.write("\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">KYC Commission Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_14(_jspx_page_context))
        return;
      out.write("\"><p>Summary Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_15(_jspx_page_context))
        return;
      out.write("\"><p>Detailed Report</p></a>\n");
      out.write("        <!--\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">Others<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_16(_jspx_page_context))
        return;
      out.write("\"><p>Wallet Balance Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_17(_jspx_page_context))
        return;
      out.write("\"><p>Registration Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_18(_jspx_page_context))
        return;
      out.write("\"><p>Lifting & Refund Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_19(_jspx_page_context))
        return;
      out.write("\"><p>KYC Status Of Wallet Report</p></a>\n");
      out.write("        -->\n");
      out.write("\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
  }
      out.write("\n");
      out.write("\n");
      out.write("        ");
    if (request.isUserInRole("DISTRIBUTOR")) {
      out.write("\n");
      out.write("\n");
      out.write("        <!--\n");
      out.write("        ");
      if (_jspx_meth_s_iterator_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        -->\n");
      out.write("        <br/>\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">KYC Tracking Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("<!--        <a href=\"");
      if (_jspx_meth_s_url_22(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Summary Report : Date Wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_23(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Summary Report : Aging Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_24(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Summary Report : BSA Agent Wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_25(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Detailed Report</p></a>-->\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_26(_jspx_page_context))
        return;
      out.write("\"><p>KYC Lifecycle Report</p></a>\n");
      out.write("        <!--<a href=\"");
      if (_jspx_meth_s_url_27(_jspx_page_context))
        return;
      out.write("\"><p>Registration and Balance Report: Agent Wise</p></a>-->\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_28(_jspx_page_context))
        return;
      out.write("\"><p>ID Searching Tool</p></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_29(_jspx_page_context))
        return;
      out.write("\"><p>Registration Summary Report: Date wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_30(_jspx_page_context))
        return;
      out.write("\"><p>Registration Summary Report: Agent wise</p></a>\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_31(_jspx_page_context))
        return;
      out.write("\"><p>Registration Summary Report: DSO wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_32(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Detailed Report: Customer Account wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_33(_jspx_page_context))
        return;
      out.write("\"><p>Daily Registration & Transaction Report: Agent wise</p></a>\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_34(_jspx_page_context))
        return;
      out.write("\"><p>Transaction Summary Report : Date wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_35(_jspx_page_context))
        return;
      out.write("\"><p>Transaction Summary Report : DSO wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_36(_jspx_page_context))
        return;
      out.write("\"><p>Transaction Summary Report : Agent wise</p></a>\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_37(_jspx_page_context))
        return;
      out.write("\"><p>Agent List</p></a> \n");
      out.write("\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">DSO App Monitoring Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_38(_jspx_page_context))
        return;
      out.write("\"><p>Check IN and B2B raw data</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_39(_jspx_page_context))
        return;
      out.write("\"><p>Agent Wise- Check IN and B2B report</p></a>  \n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_40(_jspx_page_context))
        return;
      out.write("\"><p>Agent Wise- Check IN and B2B report MTD</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_41(_jspx_page_context))
        return;
      out.write("\"><p>RA Performance Report </p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_42(_jspx_page_context))
        return;
      out.write("\"><p>Day wise RA report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_43(_jspx_page_context))
        return;
      out.write("\"><p>Day wise Distributor report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_44(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Performance Summary</p></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--<a href=\"");
      if (_jspx_meth_s_url_45(_jspx_page_context))
        return;
      out.write("\"><p>Daily Performance Report : DSO wise</p></a>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <br/>\n");
      out.write("        <!-- dashboarde tramnsaction reporte 3 ta\n");
      out.write("                lift & refund reporte 1 ta done\n");
      out.write("                but icha kore deya hoi nai\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">Transaction Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - </p>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_46(_jspx_page_context))
        return;
      out.write("\"><p>Summary Report # 1</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_47(_jspx_page_context))
        return;
      out.write("\"><p>Summary Report # 2</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_48(_jspx_page_context))
        return;
      out.write("\"><p>Detailed Report</p></a>\n");
      out.write("        <br/>\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">Lift & Refund Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_49(_jspx_page_context))
        return;
      out.write("\"><p>Summary Report</p></a>\n");
      out.write("        <br/>\n");
      out.write("        -->\n");
      out.write("        <!--\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">KYC Status Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_50(_jspx_page_context))
        return;
      out.write("\"><p>Summary Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_51(_jspx_page_context))
        return;
      out.write("\"><p>Detailed Report</p></a>\n");
      out.write("\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">Others<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_52(_jspx_page_context))
        return;
      out.write("\"><p>Wallet Balance Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_53(_jspx_page_context))
        return;
      out.write("\"><p>Registration Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_54(_jspx_page_context))
        return;
      out.write("\"><p>Lifting & Refund Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_55(_jspx_page_context))
        return;
      out.write("\"><p>KYC Status Of Wallet Report</p></a>\n");
      out.write("        -->\n");
      out.write("\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
  }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
    if (request.isUserInRole("BSA")) {
      out.write("\n");
      out.write("\n");
      out.write("        <!--\n");
      out.write("        ");
      if (_jspx_meth_s_iterator_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        <br/>\n");
      out.write("        -->\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">Transaction Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_57(_jspx_page_context))
        return;
      out.write("\"><p>Summary Report # 1</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_58(_jspx_page_context))
        return;
      out.write("\"><p>Summary Report # 2</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_59(_jspx_page_context))
        return;
      out.write("\"><p>Detailed Report</p></a>\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
  }
      out.write("\n");
      out.write("\n");
      out.write("        ");
    if (request.isUserInRole("AGENT")) {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_s_iterator_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        <br/>\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">Transaction Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_60(_jspx_page_context))
        return;
      out.write("\"><p>Summary Report</p></a>\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
  }
      out.write("\n");
      out.write("\n");
      out.write("        ");
    if (request.isUserInRole("ADMINISTRATOR")) {
      out.write("\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_s_iterator_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        ");
  }
      out.write("\n");
      out.write("\n");
      out.write("        ");
    if (request.isUserInRole("COMPLIANCE")) {
      out.write("\n");
      out.write("\n");
      out.write("        <!--\n");
      out.write("        ");
      if (_jspx_meth_s_iterator_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        -->\n");
      out.write("        <br/>\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">KYC Tracking Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("<!--        <a href=\"");
      if (_jspx_meth_s_url_63(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Summary Report : Date Wise</p></a>\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_64(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Summary Report : BSA Agent Wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_65(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Detailed Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_66(_jspx_page_context))
        return;
      out.write("\"><p>Registration and Balance Report: Agent Wise</p></a>-->\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_67(_jspx_page_context))
        return;
      out.write("\"><p>ID Searching Tool</p></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--        <p style=\"font-size: 1.5em; color: #052b4d; font: Arial, sans-serif;\">\n");
      out.write("                    - - - - - - - - - -New Report- - - - - - - - - -</p>-->\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_68(_jspx_page_context))
        return;
      out.write("\"><p>Registration Summary Report: Date wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_69(_jspx_page_context))
        return;
      out.write("\"><p>Registration Summary Report: Agent wise</p></a>\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_70(_jspx_page_context))
        return;
      out.write("\"><p>Registration Summary Report: DSO wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_71(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Detailed Report: Customer Account wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_72(_jspx_page_context))
        return;
      out.write("\"><p>Daily Registration & Transaction Report: Agent wise</p></a>\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_73(_jspx_page_context))
        return;
      out.write("\"><p>Transaction Summary Report : Date wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_74(_jspx_page_context))
        return;
      out.write("\"><p>Transaction Summary Report : DSO wise </p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_75(_jspx_page_context))
        return;
      out.write("\"><p>Transaction Summary Report : Agent wise</p></a>\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_76(_jspx_page_context))
        return;
      out.write("\"><p>Agent List</p></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--<a href=\"");
      if (_jspx_meth_s_url_77(_jspx_page_context))
        return;
      out.write("\"><p>Daily Performance Report : DSO wise</p></a>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
  }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Sales OPS-->\n");
      out.write("        ");
    if (request.isUserInRole("SalesOps")) {
      out.write("\n");
      out.write("\n");
      out.write("        <!--\n");
      out.write("        ");
      if (_jspx_meth_s_iterator_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        -->\n");
      out.write("        <br/>\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">KYC Tracking Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("\n");
      out.write("        <!--RSM TM ASM Mangement-->\n");
      out.write("        <!--<a href=\"");
      if (_jspx_meth_s_url_80(_jspx_page_context))
        return;
      out.write("\"><p>User Mapping Management</p></a>-->\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_81(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Wise Report</p></a>\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_82(_jspx_page_context))
        return;
      out.write("\"><p>All Distributor Detailed Report: Customer Account wise</p></a>\n");
      out.write("        ");
  }
      out.write("\n");
      out.write("\n");
      out.write("        <!--RSM-->\n");
      out.write("        ");
    if (request.isUserInRole("RSM")) {
      out.write("\n");
      out.write("        <br/>\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">KYC Tracking Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_83(_jspx_page_context))
        return;
      out.write("\"><p>Registration Summary Report : Distributor wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_84(_jspx_page_context))
        return;
      out.write("\"><p>Transaction Summary Report : Distributor Wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_85(_jspx_page_context))
        return;
      out.write("\"><p>Lifting Status Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_86(_jspx_page_context))
        return;
      out.write("\"><p>Refund Status Report</p></a>  \n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">DSO App Monitoring Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_87(_jspx_page_context))
        return;
      out.write("\"><p>Check IN and B2B raw data</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_88(_jspx_page_context))
        return;
      out.write("\"><p>Agent Wise- Check IN and B2B report</p></a>  \n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_89(_jspx_page_context))
        return;
      out.write("\"><p>Agent Wise- Check IN and B2B report MTD</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_90(_jspx_page_context))
        return;
      out.write("\"><p>RA Performance Report </p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_91(_jspx_page_context))
        return;
      out.write("\"><p>Day wise RA report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_92(_jspx_page_context))
        return;
      out.write("\"><p>Day wise Distributor report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_93(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Performance Summary</p></a>\n");
      out.write("        ");
  }
      out.write("\n");
      out.write("\n");
      out.write("        <!--SM-->\n");
      out.write("        ");
    if (request.isUserInRole("SM")) {
      out.write("\n");
      out.write("        <br/>\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">KYC Tracking Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_94(_jspx_page_context))
        return;
      out.write("\"><p>Registration Summary Report : Distributor wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_95(_jspx_page_context))
        return;
      out.write("\"><p>Registration Summary Report : Agent wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_96(_jspx_page_context))
        return;
      out.write("\"><p>Transaction Summary Report : Distributor Wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_97(_jspx_page_context))
        return;
      out.write("\"><p>Transaction Summary Report : Agent Wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_98(_jspx_page_context))
        return;
      out.write("\"><p>Lifting Status Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_99(_jspx_page_context))
        return;
      out.write("\"><p>Refund Status Report</p></a>   \n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">DSO App Monitoring Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_100(_jspx_page_context))
        return;
      out.write("\"><p>Check IN and B2B raw data</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_101(_jspx_page_context))
        return;
      out.write("\"><p>Agent Wise- Check IN and B2B report</p></a>  \n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_102(_jspx_page_context))
        return;
      out.write("\"><p>Agent Wise- Check IN and B2B report MTD</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_103(_jspx_page_context))
        return;
      out.write("\"><p>RA Performance Report </p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_104(_jspx_page_context))
        return;
      out.write("\"><p>Day wise RA report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_105(_jspx_page_context))
        return;
      out.write("\"><p>Day wise Distributor report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_106(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Performance Summary</p></a>\n");
      out.write("        ");
  }
      out.write("\n");
      out.write("\n");
      out.write("        <!--TM-->\n");
      out.write("        ");
    if (request.isUserInRole("TM")) {
      out.write("\n");
      out.write("        <br/>\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">KYC Tracking Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_107(_jspx_page_context))
        return;
      out.write("\"><p>Registration Summary Report : Distributor wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_108(_jspx_page_context))
        return;
      out.write("\"><p>Registration Summary Report : Agent wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_109(_jspx_page_context))
        return;
      out.write("\"><p>Transaction Summary Report : Distributor Wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_110(_jspx_page_context))
        return;
      out.write("\"><p>Transaction Summary Report : Agent Wise</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_111(_jspx_page_context))
        return;
      out.write("\"><p>Lifting Status Report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_112(_jspx_page_context))
        return;
      out.write("\"><p>Refund Status Report</p></a>\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">DSO App Monitoring Report<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_113(_jspx_page_context))
        return;
      out.write("\"><p>Check IN and B2B raw data</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_114(_jspx_page_context))
        return;
      out.write("\"><p>Agent Wise- Check IN and B2B report</p></a>  \n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_115(_jspx_page_context))
        return;
      out.write("\"><p>Agent Wise- Check IN and B2B report MTD</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_116(_jspx_page_context))
        return;
      out.write("\"><p>RA Performance Report </p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_117(_jspx_page_context))
        return;
      out.write("\"><p>Day wise RA report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_118(_jspx_page_context))
        return;
      out.write("\"><p>Day wise Distributor report</p></a>\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_119(_jspx_page_context))
        return;
      out.write("\"><p>Distributor Performance Summary</p></a>\n");
      out.write("        ");
  }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
    if (request.isUserInRole("QC")) {
      out.write("\n");
      out.write("\n");
      out.write("        <!--\n");
      out.write("        ");
      if (_jspx_meth_s_iterator_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        -->\n");
      out.write("        <br/>\n");
      out.write("        <p style=\"font-size: 1.7em; color: #052b4d; font: Arial, sans-serif;\">ID Search<br/>\n");
      out.write("            - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>\n");
      out.write("\n");
      out.write("        <a href=\"");
      if (_jspx_meth_s_url_122(_jspx_page_context))
        return;
      out.write("\"><p>ID Searching Tool</p></a>\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
  }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</fieldset>\n");
      out.write("\n");
      out.write("<br/>\n");
      out.write("\n");
      out.write("\n");
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
      if (_jspx_meth_s_url_123(_jspx_page_context))
        return;
      out.write("\"><p>User Mapping Management</p></a></li>\n");
      out.write("        ");
 }
        
      out.write("\n");
      out.write("\n");
      out.write("</ul> ");
      out.write("\n");
      out.write("     \n");
      out.write("    <!-- /.mainmenu -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- /#sidebar -->\n");
      out.write("<!-- #footer -->\n");
      out.write("\n");
      out.write("<!-- /#footer -->\n");
      out.write("</div>\n");
      out.write("<!-- /#main --> \n");
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
      out.write("    \n");
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

  private boolean _jspx_meth_s_iterator_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value_id.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_0.setParent(null);
    _jspx_th_s_iterator_0.setValue("cm_list");
    _jspx_th_s_iterator_0.setId("cm_list");
    int _jspx_eval_s_iterator_0 = _jspx_th_s_iterator_0.doStartTag();
    if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_0.doInitBody();
      }
      do {
        out.write("  \n");
        out.write("\n");
        out.write("            <p style=\"font-size: 1.2em;color: #052b4d; font: Arial, sans-serif;\">Hello ");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write(" member : ");
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("\n");
        out.write("            <a href=\"");
        if (_jspx_meth_s_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\"><p>Total Agent Count</a> : ");
        if (_jspx_meth_s_property_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("            <a href=\"");
        if (_jspx_meth_s_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\"><p>Total BSA Count</a> : ");
        if (_jspx_meth_s_property_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("            <a href=\"");
        if (_jspx_meth_s_url_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\"><p>Total Distributor Count</a> : ");
        if (_jspx_meth_s_property_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("\n");
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_iterator_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_0);
      return true;
    }
    _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_0);
    return false;
  }

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_1.setValue("loggedin_role");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_2.setValue("loggedin");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
    return false;
  }

  private boolean _jspx_meth_s_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_0 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_0.setAction("secure/action/agentcount");
    int _jspx_eval_s_url_0 = _jspx_th_s_url_0.doStartTag();
    if (_jspx_th_s_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_0);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_0);
    return false;
  }

  private boolean _jspx_meth_s_property_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_3 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_3.setPageContext(_jspx_page_context);
    _jspx_th_s_property_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_3.setValue("agent_count");
    int _jspx_eval_s_property_3 = _jspx_th_s_property_3.doStartTag();
    if (_jspx_th_s_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
    return false;
  }

  private boolean _jspx_meth_s_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_1 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_1.setPageContext(_jspx_page_context);
    _jspx_th_s_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_1.setAction("secure/action/bsacount");
    int _jspx_eval_s_url_1 = _jspx_th_s_url_1.doStartTag();
    if (_jspx_th_s_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_1);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_1);
    return false;
  }

  private boolean _jspx_meth_s_property_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_4 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_4.setPageContext(_jspx_page_context);
    _jspx_th_s_property_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_4.setValue("bsa_count");
    int _jspx_eval_s_property_4 = _jspx_th_s_property_4.doStartTag();
    if (_jspx_th_s_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
    return false;
  }

  private boolean _jspx_meth_s_url_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_2 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_2.setPageContext(_jspx_page_context);
    _jspx_th_s_url_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_2.setAction("secure/action/distributorcount");
    int _jspx_eval_s_url_2 = _jspx_th_s_url_2.doStartTag();
    if (_jspx_th_s_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_2);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_2);
    return false;
  }

  private boolean _jspx_meth_s_property_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_5 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_5.setPageContext(_jspx_page_context);
    _jspx_th_s_property_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_5.setValue("distributor_count");
    int _jspx_eval_s_property_5 = _jspx_th_s_property_5.doStartTag();
    if (_jspx_th_s_property_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
    return false;
  }

  private boolean _jspx_meth_s_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_3 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_3.setPageContext(_jspx_page_context);
    _jspx_th_s_url_3.setParent(null);
    _jspx_th_s_url_3.setAction("secure/action/kycTrackingRep1Ui");
    int _jspx_eval_s_url_3 = _jspx_th_s_url_3.doStartTag();
    if (_jspx_th_s_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_3);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_3);
    return false;
  }

  private boolean _jspx_meth_s_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_4 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_4.setPageContext(_jspx_page_context);
    _jspx_th_s_url_4.setParent(null);
    _jspx_th_s_url_4.setAction("secure/action/kycTrackingRep2Ui");
    int _jspx_eval_s_url_4 = _jspx_th_s_url_4.doStartTag();
    if (_jspx_th_s_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_4);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_4);
    return false;
  }

  private boolean _jspx_meth_s_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_5 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_5.setPageContext(_jspx_page_context);
    _jspx_th_s_url_5.setParent(null);
    _jspx_th_s_url_5.setAction("secure/action/kycTrackingRep3Ui");
    int _jspx_eval_s_url_5 = _jspx_th_s_url_5.doStartTag();
    if (_jspx_th_s_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_5);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_5);
    return false;
  }

  private boolean _jspx_meth_s_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_6 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_6.setPageContext(_jspx_page_context);
    _jspx_th_s_url_6.setParent(null);
    _jspx_th_s_url_6.setAction("secure/action/kycTrackingRep4Ui");
    int _jspx_eval_s_url_6 = _jspx_th_s_url_6.doStartTag();
    if (_jspx_th_s_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_6);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_6);
    return false;
  }

  private boolean _jspx_meth_s_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_7 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_7.setPageContext(_jspx_page_context);
    _jspx_th_s_url_7.setParent(null);
    _jspx_th_s_url_7.setAction("secure/action/kycTrackingRep5Ui");
    int _jspx_eval_s_url_7 = _jspx_th_s_url_7.doStartTag();
    if (_jspx_th_s_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_7);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_7);
    return false;
  }

  private boolean _jspx_meth_s_url_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_8 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_8.setPageContext(_jspx_page_context);
    _jspx_th_s_url_8.setParent(null);
    _jspx_th_s_url_8.setAction("secure/action/monthlyTransaction");
    int _jspx_eval_s_url_8 = _jspx_th_s_url_8.doStartTag();
    if (_jspx_th_s_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_8);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_8);
    return false;
  }

  private boolean _jspx_meth_s_url_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_9 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_9.setPageContext(_jspx_page_context);
    _jspx_th_s_url_9.setParent(null);
    _jspx_th_s_url_9.setAction("secure/action/detailsInformation");
    int _jspx_eval_s_url_9 = _jspx_th_s_url_9.doStartTag();
    if (_jspx_th_s_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_9);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_9);
    return false;
  }

  private boolean _jspx_meth_s_url_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_10 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_10.setPageContext(_jspx_page_context);
    _jspx_th_s_url_10.setParent(null);
    _jspx_th_s_url_10.setAction("secure/action/detailsDailyInformation");
    int _jspx_eval_s_url_10 = _jspx_th_s_url_10.doStartTag();
    if (_jspx_th_s_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_10);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_10);
    return false;
  }

  private boolean _jspx_meth_s_url_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_11 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_11.setPageContext(_jspx_page_context);
    _jspx_th_s_url_11.setParent(null);
    _jspx_th_s_url_11.setAction("secure/action/monthlyLiftRefund");
    int _jspx_eval_s_url_11 = _jspx_th_s_url_11.doStartTag();
    if (_jspx_th_s_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_11);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_11);
    return false;
  }

  private boolean _jspx_meth_s_url_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_12 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_12.setPageContext(_jspx_page_context);
    _jspx_th_s_url_12.setParent(null);
    _jspx_th_s_url_12.setAction("secure/action/kycStatusSummary");
    int _jspx_eval_s_url_12 = _jspx_th_s_url_12.doStartTag();
    if (_jspx_th_s_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_12);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_12);
    return false;
  }

  private boolean _jspx_meth_s_url_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_13 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_13.setPageContext(_jspx_page_context);
    _jspx_th_s_url_13.setParent(null);
    _jspx_th_s_url_13.setAction("secure/action/kycStatus");
    int _jspx_eval_s_url_13 = _jspx_th_s_url_13.doStartTag();
    if (_jspx_th_s_url_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_13);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_13);
    return false;
  }

  private boolean _jspx_meth_s_url_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_14 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_14.setPageContext(_jspx_page_context);
    _jspx_th_s_url_14.setParent(null);
    _jspx_th_s_url_14.setAction("secure/action/kycCommissionSummary");
    int _jspx_eval_s_url_14 = _jspx_th_s_url_14.doStartTag();
    if (_jspx_th_s_url_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_14);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_14);
    return false;
  }

  private boolean _jspx_meth_s_url_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_15 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_15.setPageContext(_jspx_page_context);
    _jspx_th_s_url_15.setParent(null);
    _jspx_th_s_url_15.setAction("secure/action/kycCommission");
    int _jspx_eval_s_url_15 = _jspx_th_s_url_15.doStartTag();
    if (_jspx_th_s_url_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_15);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_15);
    return false;
  }

  private boolean _jspx_meth_s_url_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_16 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_16.setPageContext(_jspx_page_context);
    _jspx_th_s_url_16.setParent(null);
    _jspx_th_s_url_16.setAction("secure/action/walletBalanceReport_ui");
    int _jspx_eval_s_url_16 = _jspx_th_s_url_16.doStartTag();
    if (_jspx_th_s_url_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_16);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_16);
    return false;
  }

  private boolean _jspx_meth_s_url_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_17 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_17.setPageContext(_jspx_page_context);
    _jspx_th_s_url_17.setParent(null);
    _jspx_th_s_url_17.setAction("secure/action/registrationReport_ui");
    int _jspx_eval_s_url_17 = _jspx_th_s_url_17.doStartTag();
    if (_jspx_th_s_url_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_17);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_17);
    return false;
  }

  private boolean _jspx_meth_s_url_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_18 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_18.setPageContext(_jspx_page_context);
    _jspx_th_s_url_18.setParent(null);
    _jspx_th_s_url_18.setAction("secure/action/liftingAndRefundSummary");
    int _jspx_eval_s_url_18 = _jspx_th_s_url_18.doStartTag();
    if (_jspx_th_s_url_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_18);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_18);
    return false;
  }

  private boolean _jspx_meth_s_url_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_19 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_19.setPageContext(_jspx_page_context);
    _jspx_th_s_url_19.setParent(null);
    _jspx_th_s_url_19.setAction("secure/action/kycStatusOfWallet");
    int _jspx_eval_s_url_19 = _jspx_th_s_url_19.doStartTag();
    if (_jspx_th_s_url_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_19);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_19);
    return false;
  }

  private boolean _jspx_meth_s_iterator_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_1 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value_id.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_1.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_1.setParent(null);
    _jspx_th_s_iterator_1.setValue("cm_list");
    _jspx_th_s_iterator_1.setId("cm_list");
    int _jspx_eval_s_iterator_1 = _jspx_th_s_iterator_1.doStartTag();
    if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_1.doInitBody();
      }
      do {
        out.write("  \n");
        out.write("\n");
        out.write("            <p style=\"font-size: 1.2em;color: #052b4d; font: Arial, sans-serif;\">Hello ");
        if (_jspx_meth_s_property_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
          return true;
        out.write(" : ");
        if (_jspx_meth_s_property_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("\n");
        out.write("            <a href=\"");
        if (_jspx_meth_s_url_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
          return true;
        out.write("\"><p>Total Agent Count</a> : ");
        if (_jspx_meth_s_property_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("            <a href=\"");
        if (_jspx_meth_s_url_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
          return true;
        out.write("\"><p>Total BSA Count</a> : ");
        if (_jspx_meth_s_property_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("\n");
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_iterator_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_1);
      return true;
    }
    _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_1);
    return false;
  }

  private boolean _jspx_meth_s_property_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_6 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_6.setPageContext(_jspx_page_context);
    _jspx_th_s_property_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
    _jspx_th_s_property_6.setValue("loggedin_role");
    int _jspx_eval_s_property_6 = _jspx_th_s_property_6.doStartTag();
    if (_jspx_th_s_property_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
    return false;
  }

  private boolean _jspx_meth_s_property_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_7 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_7.setPageContext(_jspx_page_context);
    _jspx_th_s_property_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
    _jspx_th_s_property_7.setValue("loggedin");
    int _jspx_eval_s_property_7 = _jspx_th_s_property_7.doStartTag();
    if (_jspx_th_s_property_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_7);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_7);
    return false;
  }

  private boolean _jspx_meth_s_url_20(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_20 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_20.setPageContext(_jspx_page_context);
    _jspx_th_s_url_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
    _jspx_th_s_url_20.setAction("secure/action/agentcount");
    int _jspx_eval_s_url_20 = _jspx_th_s_url_20.doStartTag();
    if (_jspx_th_s_url_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_20);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_20);
    return false;
  }

  private boolean _jspx_meth_s_property_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_8 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_8.setPageContext(_jspx_page_context);
    _jspx_th_s_property_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
    _jspx_th_s_property_8.setValue("agent_count");
    int _jspx_eval_s_property_8 = _jspx_th_s_property_8.doStartTag();
    if (_jspx_th_s_property_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_8);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_8);
    return false;
  }

  private boolean _jspx_meth_s_url_21(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_21 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_21.setPageContext(_jspx_page_context);
    _jspx_th_s_url_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
    _jspx_th_s_url_21.setAction("secure/action/bsacount");
    int _jspx_eval_s_url_21 = _jspx_th_s_url_21.doStartTag();
    if (_jspx_th_s_url_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_21);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_21);
    return false;
  }

  private boolean _jspx_meth_s_property_9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_9 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_9.setPageContext(_jspx_page_context);
    _jspx_th_s_property_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
    _jspx_th_s_property_9.setValue("bsa_count");
    int _jspx_eval_s_property_9 = _jspx_th_s_property_9.doStartTag();
    if (_jspx_th_s_property_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_9);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_9);
    return false;
  }

  private boolean _jspx_meth_s_url_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_22 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_22.setPageContext(_jspx_page_context);
    _jspx_th_s_url_22.setParent(null);
    _jspx_th_s_url_22.setAction("secure/action/kycTrackingRep1Ui");
    int _jspx_eval_s_url_22 = _jspx_th_s_url_22.doStartTag();
    if (_jspx_th_s_url_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_22);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_22);
    return false;
  }

  private boolean _jspx_meth_s_url_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_23 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_23.setPageContext(_jspx_page_context);
    _jspx_th_s_url_23.setParent(null);
    _jspx_th_s_url_23.setAction("secure/action/kycTrackingRep2Ui");
    int _jspx_eval_s_url_23 = _jspx_th_s_url_23.doStartTag();
    if (_jspx_th_s_url_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_23);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_23);
    return false;
  }

  private boolean _jspx_meth_s_url_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_24 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_24.setPageContext(_jspx_page_context);
    _jspx_th_s_url_24.setParent(null);
    _jspx_th_s_url_24.setAction("secure/action/kycTrackingRep3Ui");
    int _jspx_eval_s_url_24 = _jspx_th_s_url_24.doStartTag();
    if (_jspx_th_s_url_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_24);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_24);
    return false;
  }

  private boolean _jspx_meth_s_url_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_25 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_25.setPageContext(_jspx_page_context);
    _jspx_th_s_url_25.setParent(null);
    _jspx_th_s_url_25.setAction("secure/action/kycTrackingRep4Ui");
    int _jspx_eval_s_url_25 = _jspx_th_s_url_25.doStartTag();
    if (_jspx_th_s_url_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_25);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_25);
    return false;
  }

  private boolean _jspx_meth_s_url_26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_26 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_26.setPageContext(_jspx_page_context);
    _jspx_th_s_url_26.setParent(null);
    _jspx_th_s_url_26.setAction("secure/action/kycTrackingRep5Ui");
    int _jspx_eval_s_url_26 = _jspx_th_s_url_26.doStartTag();
    if (_jspx_th_s_url_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_26);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_26);
    return false;
  }

  private boolean _jspx_meth_s_url_27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_27 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_27.setPageContext(_jspx_page_context);
    _jspx_th_s_url_27.setParent(null);
    _jspx_th_s_url_27.setAction("secure/action/kycTrackingRep6Ui");
    int _jspx_eval_s_url_27 = _jspx_th_s_url_27.doStartTag();
    if (_jspx_th_s_url_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_27);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_27);
    return false;
  }

  private boolean _jspx_meth_s_url_28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_28 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_28.setPageContext(_jspx_page_context);
    _jspx_th_s_url_28.setParent(null);
    _jspx_th_s_url_28.setAction("secure/action/kycTrackingRep8Ui");
    int _jspx_eval_s_url_28 = _jspx_th_s_url_28.doStartTag();
    if (_jspx_th_s_url_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_28);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_28);
    return false;
  }

  private boolean _jspx_meth_s_url_29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_29 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_29.setPageContext(_jspx_page_context);
    _jspx_th_s_url_29.setParent(null);
    _jspx_th_s_url_29.setAction("secure/action/kycTrackingRep9Ui");
    int _jspx_eval_s_url_29 = _jspx_th_s_url_29.doStartTag();
    if (_jspx_th_s_url_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_29);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_29);
    return false;
  }

  private boolean _jspx_meth_s_url_30(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_30 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_30.setPageContext(_jspx_page_context);
    _jspx_th_s_url_30.setParent(null);
    _jspx_th_s_url_30.setAction("secure/action/kycTrackingRep10Ui");
    int _jspx_eval_s_url_30 = _jspx_th_s_url_30.doStartTag();
    if (_jspx_th_s_url_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_30);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_30);
    return false;
  }

  private boolean _jspx_meth_s_url_31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_31 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_31.setPageContext(_jspx_page_context);
    _jspx_th_s_url_31.setParent(null);
    _jspx_th_s_url_31.setAction("secure/action/kycTrackingRep11Ui");
    int _jspx_eval_s_url_31 = _jspx_th_s_url_31.doStartTag();
    if (_jspx_th_s_url_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_31);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_31);
    return false;
  }

  private boolean _jspx_meth_s_url_32(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_32 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_32.setPageContext(_jspx_page_context);
    _jspx_th_s_url_32.setParent(null);
    _jspx_th_s_url_32.setAction("secure/action/kycTrackingRep14Ui");
    int _jspx_eval_s_url_32 = _jspx_th_s_url_32.doStartTag();
    if (_jspx_th_s_url_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_32);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_32);
    return false;
  }

  private boolean _jspx_meth_s_url_33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_33 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_33.setPageContext(_jspx_page_context);
    _jspx_th_s_url_33.setParent(null);
    _jspx_th_s_url_33.setAction("secure/action/kycTrackingRep13Ui");
    int _jspx_eval_s_url_33 = _jspx_th_s_url_33.doStartTag();
    if (_jspx_th_s_url_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_33);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_33);
    return false;
  }

  private boolean _jspx_meth_s_url_34(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_34 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_34.setPageContext(_jspx_page_context);
    _jspx_th_s_url_34.setParent(null);
    _jspx_th_s_url_34.setAction("secure/action/kycTrackingRep16Ui");
    int _jspx_eval_s_url_34 = _jspx_th_s_url_34.doStartTag();
    if (_jspx_th_s_url_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_34);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_34);
    return false;
  }

  private boolean _jspx_meth_s_url_35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_35 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_35.setPageContext(_jspx_page_context);
    _jspx_th_s_url_35.setParent(null);
    _jspx_th_s_url_35.setAction("secure/action/kycTrackingRep18Ui");
    int _jspx_eval_s_url_35 = _jspx_th_s_url_35.doStartTag();
    if (_jspx_th_s_url_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_35);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_35);
    return false;
  }

  private boolean _jspx_meth_s_url_36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_36 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_36.setPageContext(_jspx_page_context);
    _jspx_th_s_url_36.setParent(null);
    _jspx_th_s_url_36.setAction("secure/action/kycTrackingRep19Ui");
    int _jspx_eval_s_url_36 = _jspx_th_s_url_36.doStartTag();
    if (_jspx_th_s_url_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_36);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_36);
    return false;
  }

  private boolean _jspx_meth_s_url_37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_37 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_37.setPageContext(_jspx_page_context);
    _jspx_th_s_url_37.setParent(null);
    _jspx_th_s_url_37.setAction("secure/action/kycTrackingRep17Ui");
    int _jspx_eval_s_url_37 = _jspx_th_s_url_37.doStartTag();
    if (_jspx_th_s_url_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_37);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_37);
    return false;
  }

  private boolean _jspx_meth_s_url_38(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_38 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_38.setPageContext(_jspx_page_context);
    _jspx_th_s_url_38.setParent(null);
    _jspx_th_s_url_38.setAction("secure/action/kycTrackingRep27Ui");
    int _jspx_eval_s_url_38 = _jspx_th_s_url_38.doStartTag();
    if (_jspx_th_s_url_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_38);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_38);
    return false;
  }

  private boolean _jspx_meth_s_url_39(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_39 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_39.setPageContext(_jspx_page_context);
    _jspx_th_s_url_39.setParent(null);
    _jspx_th_s_url_39.setAction("secure/action/kycTrackingRep28Ui");
    int _jspx_eval_s_url_39 = _jspx_th_s_url_39.doStartTag();
    if (_jspx_th_s_url_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_39);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_39);
    return false;
  }

  private boolean _jspx_meth_s_url_40(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_40 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_40.setPageContext(_jspx_page_context);
    _jspx_th_s_url_40.setParent(null);
    _jspx_th_s_url_40.setAction("secure/action/kycTrackingRep29Ui");
    int _jspx_eval_s_url_40 = _jspx_th_s_url_40.doStartTag();
    if (_jspx_th_s_url_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_40);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_40);
    return false;
  }

  private boolean _jspx_meth_s_url_41(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_41 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_41.setPageContext(_jspx_page_context);
    _jspx_th_s_url_41.setParent(null);
    _jspx_th_s_url_41.setAction("secure/action/kycTrackingRep30Ui");
    int _jspx_eval_s_url_41 = _jspx_th_s_url_41.doStartTag();
    if (_jspx_th_s_url_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_41);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_41);
    return false;
  }

  private boolean _jspx_meth_s_url_42(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_42 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_42.setPageContext(_jspx_page_context);
    _jspx_th_s_url_42.setParent(null);
    _jspx_th_s_url_42.setAction("secure/action/kycTrackingRep31Ui");
    int _jspx_eval_s_url_42 = _jspx_th_s_url_42.doStartTag();
    if (_jspx_th_s_url_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_42);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_42);
    return false;
  }

  private boolean _jspx_meth_s_url_43(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_43 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_43.setPageContext(_jspx_page_context);
    _jspx_th_s_url_43.setParent(null);
    _jspx_th_s_url_43.setAction("secure/action/kycTrackingRep32Ui");
    int _jspx_eval_s_url_43 = _jspx_th_s_url_43.doStartTag();
    if (_jspx_th_s_url_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_43);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_43);
    return false;
  }

  private boolean _jspx_meth_s_url_44(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_44 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_44.setPageContext(_jspx_page_context);
    _jspx_th_s_url_44.setParent(null);
    _jspx_th_s_url_44.setAction("secure/action/kycTrackingRep33Ui");
    int _jspx_eval_s_url_44 = _jspx_th_s_url_44.doStartTag();
    if (_jspx_th_s_url_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_44);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_44);
    return false;
  }

  private boolean _jspx_meth_s_url_45(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_45 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_45.setPageContext(_jspx_page_context);
    _jspx_th_s_url_45.setParent(null);
    _jspx_th_s_url_45.setAction("secure/action/kycTrackingRep20Ui");
    int _jspx_eval_s_url_45 = _jspx_th_s_url_45.doStartTag();
    if (_jspx_th_s_url_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_45);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_45);
    return false;
  }

  private boolean _jspx_meth_s_url_46(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_46 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_46.setPageContext(_jspx_page_context);
    _jspx_th_s_url_46.setParent(null);
    _jspx_th_s_url_46.setAction("secure/action/monthlyTransaction");
    int _jspx_eval_s_url_46 = _jspx_th_s_url_46.doStartTag();
    if (_jspx_th_s_url_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_46);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_46);
    return false;
  }

  private boolean _jspx_meth_s_url_47(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_47 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_47.setPageContext(_jspx_page_context);
    _jspx_th_s_url_47.setParent(null);
    _jspx_th_s_url_47.setAction("secure/action/detailsInformation");
    int _jspx_eval_s_url_47 = _jspx_th_s_url_47.doStartTag();
    if (_jspx_th_s_url_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_47);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_47);
    return false;
  }

  private boolean _jspx_meth_s_url_48(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_48 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_48.setPageContext(_jspx_page_context);
    _jspx_th_s_url_48.setParent(null);
    _jspx_th_s_url_48.setAction("secure/action/detailsDailyInformation");
    int _jspx_eval_s_url_48 = _jspx_th_s_url_48.doStartTag();
    if (_jspx_th_s_url_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_48);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_48);
    return false;
  }

  private boolean _jspx_meth_s_url_49(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_49 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_49.setPageContext(_jspx_page_context);
    _jspx_th_s_url_49.setParent(null);
    _jspx_th_s_url_49.setAction("secure/action/monthlyLiftRefund");
    int _jspx_eval_s_url_49 = _jspx_th_s_url_49.doStartTag();
    if (_jspx_th_s_url_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_49);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_49);
    return false;
  }

  private boolean _jspx_meth_s_url_50(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_50 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_50.setPageContext(_jspx_page_context);
    _jspx_th_s_url_50.setParent(null);
    _jspx_th_s_url_50.setAction("secure/action/kycStatusSummary");
    int _jspx_eval_s_url_50 = _jspx_th_s_url_50.doStartTag();
    if (_jspx_th_s_url_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_50);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_50);
    return false;
  }

  private boolean _jspx_meth_s_url_51(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_51 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_51.setPageContext(_jspx_page_context);
    _jspx_th_s_url_51.setParent(null);
    _jspx_th_s_url_51.setAction("secure/action/kycStatus");
    int _jspx_eval_s_url_51 = _jspx_th_s_url_51.doStartTag();
    if (_jspx_th_s_url_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_51);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_51);
    return false;
  }

  private boolean _jspx_meth_s_url_52(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_52 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_52.setPageContext(_jspx_page_context);
    _jspx_th_s_url_52.setParent(null);
    _jspx_th_s_url_52.setAction("secure/action/walletBalanceReport_ui");
    int _jspx_eval_s_url_52 = _jspx_th_s_url_52.doStartTag();
    if (_jspx_th_s_url_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_52);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_52);
    return false;
  }

  private boolean _jspx_meth_s_url_53(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_53 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_53.setPageContext(_jspx_page_context);
    _jspx_th_s_url_53.setParent(null);
    _jspx_th_s_url_53.setAction("secure/action/registrationReport_ui");
    int _jspx_eval_s_url_53 = _jspx_th_s_url_53.doStartTag();
    if (_jspx_th_s_url_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_53);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_53);
    return false;
  }

  private boolean _jspx_meth_s_url_54(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_54 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_54.setPageContext(_jspx_page_context);
    _jspx_th_s_url_54.setParent(null);
    _jspx_th_s_url_54.setAction("secure/action/liftingAndRefundSummary");
    int _jspx_eval_s_url_54 = _jspx_th_s_url_54.doStartTag();
    if (_jspx_th_s_url_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_54);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_54);
    return false;
  }

  private boolean _jspx_meth_s_url_55(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_55 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_55.setPageContext(_jspx_page_context);
    _jspx_th_s_url_55.setParent(null);
    _jspx_th_s_url_55.setAction("secure/action/kycStatusOfWallet");
    int _jspx_eval_s_url_55 = _jspx_th_s_url_55.doStartTag();
    if (_jspx_th_s_url_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_55);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_55);
    return false;
  }

  private boolean _jspx_meth_s_iterator_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_2 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value_id.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_2.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_2.setParent(null);
    _jspx_th_s_iterator_2.setValue("cm_list");
    _jspx_th_s_iterator_2.setId("cm_list");
    int _jspx_eval_s_iterator_2 = _jspx_th_s_iterator_2.doStartTag();
    if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_2.doInitBody();
      }
      do {
        out.write("  \n");
        out.write("\n");
        out.write("            <p style=\"font-size: 1.2em;color: #052b4d; font: Arial, sans-serif;\">Hello ");
        if (_jspx_meth_s_property_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write(" : ");
        if (_jspx_meth_s_property_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("\n");
        out.write("            <a href=\"");
        if (_jspx_meth_s_url_56((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\"><p>Total Agent Count</a> : ");
        if (_jspx_meth_s_property_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("\n");
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_iterator_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_2);
      return true;
    }
    _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_2);
    return false;
  }

  private boolean _jspx_meth_s_property_10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_10 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_10.setPageContext(_jspx_page_context);
    _jspx_th_s_property_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_property_10.setValue("loggedin_role");
    int _jspx_eval_s_property_10 = _jspx_th_s_property_10.doStartTag();
    if (_jspx_th_s_property_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_10);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_10);
    return false;
  }

  private boolean _jspx_meth_s_property_11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_11 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_11.setPageContext(_jspx_page_context);
    _jspx_th_s_property_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_property_11.setValue("loggedin");
    int _jspx_eval_s_property_11 = _jspx_th_s_property_11.doStartTag();
    if (_jspx_th_s_property_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_11);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_11);
    return false;
  }

  private boolean _jspx_meth_s_url_56(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_56 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_56.setPageContext(_jspx_page_context);
    _jspx_th_s_url_56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_url_56.setAction("secure/action/agentcount");
    int _jspx_eval_s_url_56 = _jspx_th_s_url_56.doStartTag();
    if (_jspx_th_s_url_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_56);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_56);
    return false;
  }

  private boolean _jspx_meth_s_property_12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_12 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_12.setPageContext(_jspx_page_context);
    _jspx_th_s_property_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_property_12.setValue("agent_count");
    int _jspx_eval_s_property_12 = _jspx_th_s_property_12.doStartTag();
    if (_jspx_th_s_property_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_12);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_12);
    return false;
  }

  private boolean _jspx_meth_s_url_57(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_57 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_57.setPageContext(_jspx_page_context);
    _jspx_th_s_url_57.setParent(null);
    _jspx_th_s_url_57.setAction("secure/action/monthlyTransaction");
    int _jspx_eval_s_url_57 = _jspx_th_s_url_57.doStartTag();
    if (_jspx_th_s_url_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_57);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_57);
    return false;
  }

  private boolean _jspx_meth_s_url_58(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_58 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_58.setPageContext(_jspx_page_context);
    _jspx_th_s_url_58.setParent(null);
    _jspx_th_s_url_58.setAction("secure/action/detailsInformation");
    int _jspx_eval_s_url_58 = _jspx_th_s_url_58.doStartTag();
    if (_jspx_th_s_url_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_58);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_58);
    return false;
  }

  private boolean _jspx_meth_s_url_59(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_59 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_59.setPageContext(_jspx_page_context);
    _jspx_th_s_url_59.setParent(null);
    _jspx_th_s_url_59.setAction("secure/action/detailsDailyInformation");
    int _jspx_eval_s_url_59 = _jspx_th_s_url_59.doStartTag();
    if (_jspx_th_s_url_59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_59);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_59);
    return false;
  }

  private boolean _jspx_meth_s_iterator_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_3 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value_id.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_3.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_3.setParent(null);
    _jspx_th_s_iterator_3.setValue("cm_list");
    _jspx_th_s_iterator_3.setId("cm_list");
    int _jspx_eval_s_iterator_3 = _jspx_th_s_iterator_3.doStartTag();
    if (_jspx_eval_s_iterator_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_3.doInitBody();
      }
      do {
        out.write("  \n");
        out.write("\n");
        out.write("            <p style=\"font-size: 1.2em;color: #052b4d; font: Arial, sans-serif;\">Hello ");
        if (_jspx_meth_s_property_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_3, _jspx_page_context))
          return true;
        out.write(" : ");
        if (_jspx_meth_s_property_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_3, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_iterator_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_3);
      return true;
    }
    _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_3);
    return false;
  }

  private boolean _jspx_meth_s_property_13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_13 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_13.setPageContext(_jspx_page_context);
    _jspx_th_s_property_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_3);
    _jspx_th_s_property_13.setValue("loggedin_role");
    int _jspx_eval_s_property_13 = _jspx_th_s_property_13.doStartTag();
    if (_jspx_th_s_property_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_13);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_13);
    return false;
  }

  private boolean _jspx_meth_s_property_14(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_14 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_14.setPageContext(_jspx_page_context);
    _jspx_th_s_property_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_3);
    _jspx_th_s_property_14.setValue("loggedin");
    int _jspx_eval_s_property_14 = _jspx_th_s_property_14.doStartTag();
    if (_jspx_th_s_property_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_14);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_14);
    return false;
  }

  private boolean _jspx_meth_s_url_60(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_60 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_60.setPageContext(_jspx_page_context);
    _jspx_th_s_url_60.setParent(null);
    _jspx_th_s_url_60.setAction("secure/action/monthlyTransaction");
    int _jspx_eval_s_url_60 = _jspx_th_s_url_60.doStartTag();
    if (_jspx_th_s_url_60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_60);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_60);
    return false;
  }

  private boolean _jspx_meth_s_iterator_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_4 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value_id.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_4.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_4.setParent(null);
    _jspx_th_s_iterator_4.setValue("cm_list");
    _jspx_th_s_iterator_4.setId("cm_list");
    int _jspx_eval_s_iterator_4 = _jspx_th_s_iterator_4.doStartTag();
    if (_jspx_eval_s_iterator_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_4.doInitBody();
      }
      do {
        out.write("  \n");
        out.write("\n");
        out.write("            <p style=\"font-size: 1.2em;color: #052b4d; font: Arial, sans-serif;\">Hello ");
        if (_jspx_meth_s_property_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_4, _jspx_page_context))
          return true;
        out.write(" : ");
        if (_jspx_meth_s_property_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_4, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_iterator_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_4);
      return true;
    }
    _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_4);
    return false;
  }

  private boolean _jspx_meth_s_property_15(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_15 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_15.setPageContext(_jspx_page_context);
    _jspx_th_s_property_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_4);
    _jspx_th_s_property_15.setValue("loggedin_role");
    int _jspx_eval_s_property_15 = _jspx_th_s_property_15.doStartTag();
    if (_jspx_th_s_property_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_15);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_15);
    return false;
  }

  private boolean _jspx_meth_s_property_16(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_16 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_16.setPageContext(_jspx_page_context);
    _jspx_th_s_property_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_4);
    _jspx_th_s_property_16.setValue("loggedin");
    int _jspx_eval_s_property_16 = _jspx_th_s_property_16.doStartTag();
    if (_jspx_th_s_property_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_16);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_16);
    return false;
  }

  private boolean _jspx_meth_s_iterator_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_5 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value_id.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_5.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_5.setParent(null);
    _jspx_th_s_iterator_5.setValue("cm_list");
    _jspx_th_s_iterator_5.setId("cm_list");
    int _jspx_eval_s_iterator_5 = _jspx_th_s_iterator_5.doStartTag();
    if (_jspx_eval_s_iterator_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_5.doInitBody();
      }
      do {
        out.write("  \n");
        out.write("\n");
        out.write("            <p style=\"font-size: 1.2em;color: #052b4d; font: Arial, sans-serif;\">Hello ");
        if (_jspx_meth_s_property_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_5, _jspx_page_context))
          return true;
        out.write(" : ");
        if (_jspx_meth_s_property_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_5, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("\n");
        out.write("            <a href=\"");
        if (_jspx_meth_s_url_61((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_5, _jspx_page_context))
          return true;
        out.write("\"><p>Total Agent Count</a> : ");
        if (_jspx_meth_s_property_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_5, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("            <a href=\"");
        if (_jspx_meth_s_url_62((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_5, _jspx_page_context))
          return true;
        out.write("\"><p>Total BSA Count</a> : ");
        if (_jspx_meth_s_property_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_5, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("\n");
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_iterator_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_5);
      return true;
    }
    _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_5);
    return false;
  }

  private boolean _jspx_meth_s_property_17(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_17 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_17.setPageContext(_jspx_page_context);
    _jspx_th_s_property_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_5);
    _jspx_th_s_property_17.setValue("loggedin_role");
    int _jspx_eval_s_property_17 = _jspx_th_s_property_17.doStartTag();
    if (_jspx_th_s_property_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_17);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_17);
    return false;
  }

  private boolean _jspx_meth_s_property_18(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_18 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_18.setPageContext(_jspx_page_context);
    _jspx_th_s_property_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_5);
    _jspx_th_s_property_18.setValue("loggedin");
    int _jspx_eval_s_property_18 = _jspx_th_s_property_18.doStartTag();
    if (_jspx_th_s_property_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_18);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_18);
    return false;
  }

  private boolean _jspx_meth_s_url_61(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_61 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_61.setPageContext(_jspx_page_context);
    _jspx_th_s_url_61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_5);
    _jspx_th_s_url_61.setAction("secure/action/agentcount");
    int _jspx_eval_s_url_61 = _jspx_th_s_url_61.doStartTag();
    if (_jspx_th_s_url_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_61);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_61);
    return false;
  }

  private boolean _jspx_meth_s_property_19(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_19 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_19.setPageContext(_jspx_page_context);
    _jspx_th_s_property_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_5);
    _jspx_th_s_property_19.setValue("agent_count");
    int _jspx_eval_s_property_19 = _jspx_th_s_property_19.doStartTag();
    if (_jspx_th_s_property_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_19);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_19);
    return false;
  }

  private boolean _jspx_meth_s_url_62(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_62 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_62.setPageContext(_jspx_page_context);
    _jspx_th_s_url_62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_5);
    _jspx_th_s_url_62.setAction("secure/action/bsacount");
    int _jspx_eval_s_url_62 = _jspx_th_s_url_62.doStartTag();
    if (_jspx_th_s_url_62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_62);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_62);
    return false;
  }

  private boolean _jspx_meth_s_property_20(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_20 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_20.setPageContext(_jspx_page_context);
    _jspx_th_s_property_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_5);
    _jspx_th_s_property_20.setValue("bsa_count");
    int _jspx_eval_s_property_20 = _jspx_th_s_property_20.doStartTag();
    if (_jspx_th_s_property_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_20);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_20);
    return false;
  }

  private boolean _jspx_meth_s_url_63(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_63 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_63.setPageContext(_jspx_page_context);
    _jspx_th_s_url_63.setParent(null);
    _jspx_th_s_url_63.setAction("secure/action/kycTrackingRep1Ui");
    int _jspx_eval_s_url_63 = _jspx_th_s_url_63.doStartTag();
    if (_jspx_th_s_url_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_63);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_63);
    return false;
  }

  private boolean _jspx_meth_s_url_64(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_64 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_64.setPageContext(_jspx_page_context);
    _jspx_th_s_url_64.setParent(null);
    _jspx_th_s_url_64.setAction("secure/action/kycTrackingRep3Ui");
    int _jspx_eval_s_url_64 = _jspx_th_s_url_64.doStartTag();
    if (_jspx_th_s_url_64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_64);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_64);
    return false;
  }

  private boolean _jspx_meth_s_url_65(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_65 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_65.setPageContext(_jspx_page_context);
    _jspx_th_s_url_65.setParent(null);
    _jspx_th_s_url_65.setAction("secure/action/kycTrackingRep4Ui");
    int _jspx_eval_s_url_65 = _jspx_th_s_url_65.doStartTag();
    if (_jspx_th_s_url_65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_65);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_65);
    return false;
  }

  private boolean _jspx_meth_s_url_66(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_66 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_66.setPageContext(_jspx_page_context);
    _jspx_th_s_url_66.setParent(null);
    _jspx_th_s_url_66.setAction("secure/action/kycTrackingRep6Ui");
    int _jspx_eval_s_url_66 = _jspx_th_s_url_66.doStartTag();
    if (_jspx_th_s_url_66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_66);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_66);
    return false;
  }

  private boolean _jspx_meth_s_url_67(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_67 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_67.setPageContext(_jspx_page_context);
    _jspx_th_s_url_67.setParent(null);
    _jspx_th_s_url_67.setAction("secure/action/kycTrackingRep8Ui");
    int _jspx_eval_s_url_67 = _jspx_th_s_url_67.doStartTag();
    if (_jspx_th_s_url_67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_67);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_67);
    return false;
  }

  private boolean _jspx_meth_s_url_68(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_68 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_68.setPageContext(_jspx_page_context);
    _jspx_th_s_url_68.setParent(null);
    _jspx_th_s_url_68.setAction("secure/action/kycTrackingRep9Ui");
    int _jspx_eval_s_url_68 = _jspx_th_s_url_68.doStartTag();
    if (_jspx_th_s_url_68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_68);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_68);
    return false;
  }

  private boolean _jspx_meth_s_url_69(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_69 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_69.setPageContext(_jspx_page_context);
    _jspx_th_s_url_69.setParent(null);
    _jspx_th_s_url_69.setAction("secure/action/kycTrackingRep10Ui");
    int _jspx_eval_s_url_69 = _jspx_th_s_url_69.doStartTag();
    if (_jspx_th_s_url_69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_69);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_69);
    return false;
  }

  private boolean _jspx_meth_s_url_70(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_70 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_70.setPageContext(_jspx_page_context);
    _jspx_th_s_url_70.setParent(null);
    _jspx_th_s_url_70.setAction("secure/action/kycTrackingRep11Ui");
    int _jspx_eval_s_url_70 = _jspx_th_s_url_70.doStartTag();
    if (_jspx_th_s_url_70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_70);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_70);
    return false;
  }

  private boolean _jspx_meth_s_url_71(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_71 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_71.setPageContext(_jspx_page_context);
    _jspx_th_s_url_71.setParent(null);
    _jspx_th_s_url_71.setAction("secure/action/kycTrackingRep14Ui");
    int _jspx_eval_s_url_71 = _jspx_th_s_url_71.doStartTag();
    if (_jspx_th_s_url_71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_71);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_71);
    return false;
  }

  private boolean _jspx_meth_s_url_72(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_72 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_72.setPageContext(_jspx_page_context);
    _jspx_th_s_url_72.setParent(null);
    _jspx_th_s_url_72.setAction("secure/action/kycTrackingRep13Ui");
    int _jspx_eval_s_url_72 = _jspx_th_s_url_72.doStartTag();
    if (_jspx_th_s_url_72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_72);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_72);
    return false;
  }

  private boolean _jspx_meth_s_url_73(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_73 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_73.setPageContext(_jspx_page_context);
    _jspx_th_s_url_73.setParent(null);
    _jspx_th_s_url_73.setAction("secure/action/kycTrackingRep16Ui");
    int _jspx_eval_s_url_73 = _jspx_th_s_url_73.doStartTag();
    if (_jspx_th_s_url_73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_73);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_73);
    return false;
  }

  private boolean _jspx_meth_s_url_74(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_74 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_74.setPageContext(_jspx_page_context);
    _jspx_th_s_url_74.setParent(null);
    _jspx_th_s_url_74.setAction("secure/action/kycTrackingRep18Ui");
    int _jspx_eval_s_url_74 = _jspx_th_s_url_74.doStartTag();
    if (_jspx_th_s_url_74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_74);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_74);
    return false;
  }

  private boolean _jspx_meth_s_url_75(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_75 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_75.setPageContext(_jspx_page_context);
    _jspx_th_s_url_75.setParent(null);
    _jspx_th_s_url_75.setAction("secure/action/kycTrackingRep19Ui");
    int _jspx_eval_s_url_75 = _jspx_th_s_url_75.doStartTag();
    if (_jspx_th_s_url_75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_75);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_75);
    return false;
  }

  private boolean _jspx_meth_s_url_76(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_76 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_76.setPageContext(_jspx_page_context);
    _jspx_th_s_url_76.setParent(null);
    _jspx_th_s_url_76.setAction("secure/action/kycTrackingRep17Ui");
    int _jspx_eval_s_url_76 = _jspx_th_s_url_76.doStartTag();
    if (_jspx_th_s_url_76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_76);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_76);
    return false;
  }

  private boolean _jspx_meth_s_url_77(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_77 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_77.setPageContext(_jspx_page_context);
    _jspx_th_s_url_77.setParent(null);
    _jspx_th_s_url_77.setAction("secure/action/kycTrackingRep20Ui");
    int _jspx_eval_s_url_77 = _jspx_th_s_url_77.doStartTag();
    if (_jspx_th_s_url_77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_77);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_77);
    return false;
  }

  private boolean _jspx_meth_s_iterator_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_6 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value_id.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_6.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_6.setParent(null);
    _jspx_th_s_iterator_6.setValue("cm_list");
    _jspx_th_s_iterator_6.setId("cm_list");
    int _jspx_eval_s_iterator_6 = _jspx_th_s_iterator_6.doStartTag();
    if (_jspx_eval_s_iterator_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_6.doInitBody();
      }
      do {
        out.write("  \n");
        out.write("            <p style=\"font-size: 1.2em;color: #052b4d; font: Arial, sans-serif;\">Hello ");
        if (_jspx_meth_s_property_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_6, _jspx_page_context))
          return true;
        out.write(" : ");
        if (_jspx_meth_s_property_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_6, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("            <a href=\"");
        if (_jspx_meth_s_url_78((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_6, _jspx_page_context))
          return true;
        out.write("\"><p>Total Agent Count</a> : ");
        if (_jspx_meth_s_property_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_6, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("            <a href=\"");
        if (_jspx_meth_s_url_79((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_6, _jspx_page_context))
          return true;
        out.write("\"><p>Total BSA Count</a> : ");
        if (_jspx_meth_s_property_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_6, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_iterator_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_6);
      return true;
    }
    _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_6);
    return false;
  }

  private boolean _jspx_meth_s_property_21(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_21 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_21.setPageContext(_jspx_page_context);
    _jspx_th_s_property_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_6);
    _jspx_th_s_property_21.setValue("loggedin_role");
    int _jspx_eval_s_property_21 = _jspx_th_s_property_21.doStartTag();
    if (_jspx_th_s_property_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_21);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_21);
    return false;
  }

  private boolean _jspx_meth_s_property_22(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_22 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_22.setPageContext(_jspx_page_context);
    _jspx_th_s_property_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_6);
    _jspx_th_s_property_22.setValue("loggedin");
    int _jspx_eval_s_property_22 = _jspx_th_s_property_22.doStartTag();
    if (_jspx_th_s_property_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_22);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_22);
    return false;
  }

  private boolean _jspx_meth_s_url_78(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_78 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_78.setPageContext(_jspx_page_context);
    _jspx_th_s_url_78.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_6);
    _jspx_th_s_url_78.setAction("secure/action/agentcount");
    int _jspx_eval_s_url_78 = _jspx_th_s_url_78.doStartTag();
    if (_jspx_th_s_url_78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_78);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_78);
    return false;
  }

  private boolean _jspx_meth_s_property_23(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_23 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_23.setPageContext(_jspx_page_context);
    _jspx_th_s_property_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_6);
    _jspx_th_s_property_23.setValue("agent_count");
    int _jspx_eval_s_property_23 = _jspx_th_s_property_23.doStartTag();
    if (_jspx_th_s_property_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_23);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_23);
    return false;
  }

  private boolean _jspx_meth_s_url_79(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_79 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_79.setPageContext(_jspx_page_context);
    _jspx_th_s_url_79.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_6);
    _jspx_th_s_url_79.setAction("secure/action/bsacount");
    int _jspx_eval_s_url_79 = _jspx_th_s_url_79.doStartTag();
    if (_jspx_th_s_url_79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_79);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_79);
    return false;
  }

  private boolean _jspx_meth_s_property_24(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_24 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_24.setPageContext(_jspx_page_context);
    _jspx_th_s_property_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_6);
    _jspx_th_s_property_24.setValue("bsa_count");
    int _jspx_eval_s_property_24 = _jspx_th_s_property_24.doStartTag();
    if (_jspx_th_s_property_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_24);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_24);
    return false;
  }

  private boolean _jspx_meth_s_url_80(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_80 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_80.setPageContext(_jspx_page_context);
    _jspx_th_s_url_80.setParent(null);
    _jspx_th_s_url_80.setAction("secure/action/sm_tm_management");
    int _jspx_eval_s_url_80 = _jspx_th_s_url_80.doStartTag();
    if (_jspx_th_s_url_80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_80);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_80);
    return false;
  }

  private boolean _jspx_meth_s_url_81(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_81 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_81.setPageContext(_jspx_page_context);
    _jspx_th_s_url_81.setParent(null);
    _jspx_th_s_url_81.setAction("secure/action/kycTrackingRep12Ui");
    int _jspx_eval_s_url_81 = _jspx_th_s_url_81.doStartTag();
    if (_jspx_th_s_url_81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_81);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_81);
    return false;
  }

  private boolean _jspx_meth_s_url_82(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_82 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_82.setPageContext(_jspx_page_context);
    _jspx_th_s_url_82.setParent(null);
    _jspx_th_s_url_82.setAction("secure/action/kycTrackingRep15Ui");
    int _jspx_eval_s_url_82 = _jspx_th_s_url_82.doStartTag();
    if (_jspx_th_s_url_82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_82);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_82);
    return false;
  }

  private boolean _jspx_meth_s_url_83(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_83 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_83.setPageContext(_jspx_page_context);
    _jspx_th_s_url_83.setParent(null);
    _jspx_th_s_url_83.setAction("secure/action/kycTrackingRep21Ui");
    int _jspx_eval_s_url_83 = _jspx_th_s_url_83.doStartTag();
    if (_jspx_th_s_url_83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_83);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_83);
    return false;
  }

  private boolean _jspx_meth_s_url_84(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_84 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_84.setPageContext(_jspx_page_context);
    _jspx_th_s_url_84.setParent(null);
    _jspx_th_s_url_84.setAction("secure/action/kycTrackingRep23Ui");
    int _jspx_eval_s_url_84 = _jspx_th_s_url_84.doStartTag();
    if (_jspx_th_s_url_84.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_84);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_84);
    return false;
  }

  private boolean _jspx_meth_s_url_85(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_85 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_85.setPageContext(_jspx_page_context);
    _jspx_th_s_url_85.setParent(null);
    _jspx_th_s_url_85.setAction("secure/action/kycTrackingRep25Ui");
    int _jspx_eval_s_url_85 = _jspx_th_s_url_85.doStartTag();
    if (_jspx_th_s_url_85.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_85);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_85);
    return false;
  }

  private boolean _jspx_meth_s_url_86(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_86 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_86.setPageContext(_jspx_page_context);
    _jspx_th_s_url_86.setParent(null);
    _jspx_th_s_url_86.setAction("secure/action/kycTrackingRep26Ui");
    int _jspx_eval_s_url_86 = _jspx_th_s_url_86.doStartTag();
    if (_jspx_th_s_url_86.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_86);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_86);
    return false;
  }

  private boolean _jspx_meth_s_url_87(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_87 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_87.setPageContext(_jspx_page_context);
    _jspx_th_s_url_87.setParent(null);
    _jspx_th_s_url_87.setAction("secure/action/kycTrackingRep27Ui");
    int _jspx_eval_s_url_87 = _jspx_th_s_url_87.doStartTag();
    if (_jspx_th_s_url_87.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_87);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_87);
    return false;
  }

  private boolean _jspx_meth_s_url_88(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_88 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_88.setPageContext(_jspx_page_context);
    _jspx_th_s_url_88.setParent(null);
    _jspx_th_s_url_88.setAction("secure/action/kycTrackingRep28Ui");
    int _jspx_eval_s_url_88 = _jspx_th_s_url_88.doStartTag();
    if (_jspx_th_s_url_88.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_88);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_88);
    return false;
  }

  private boolean _jspx_meth_s_url_89(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_89 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_89.setPageContext(_jspx_page_context);
    _jspx_th_s_url_89.setParent(null);
    _jspx_th_s_url_89.setAction("secure/action/kycTrackingRep29Ui");
    int _jspx_eval_s_url_89 = _jspx_th_s_url_89.doStartTag();
    if (_jspx_th_s_url_89.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_89);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_89);
    return false;
  }

  private boolean _jspx_meth_s_url_90(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_90 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_90.setPageContext(_jspx_page_context);
    _jspx_th_s_url_90.setParent(null);
    _jspx_th_s_url_90.setAction("secure/action/kycTrackingRep30Ui");
    int _jspx_eval_s_url_90 = _jspx_th_s_url_90.doStartTag();
    if (_jspx_th_s_url_90.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_90);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_90);
    return false;
  }

  private boolean _jspx_meth_s_url_91(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_91 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_91.setPageContext(_jspx_page_context);
    _jspx_th_s_url_91.setParent(null);
    _jspx_th_s_url_91.setAction("secure/action/kycTrackingRep31Ui");
    int _jspx_eval_s_url_91 = _jspx_th_s_url_91.doStartTag();
    if (_jspx_th_s_url_91.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_91);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_91);
    return false;
  }

  private boolean _jspx_meth_s_url_92(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_92 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_92.setPageContext(_jspx_page_context);
    _jspx_th_s_url_92.setParent(null);
    _jspx_th_s_url_92.setAction("secure/action/kycTrackingRep32Ui");
    int _jspx_eval_s_url_92 = _jspx_th_s_url_92.doStartTag();
    if (_jspx_th_s_url_92.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_92);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_92);
    return false;
  }

  private boolean _jspx_meth_s_url_93(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_93 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_93.setPageContext(_jspx_page_context);
    _jspx_th_s_url_93.setParent(null);
    _jspx_th_s_url_93.setAction("secure/action/kycTrackingRep33Ui");
    int _jspx_eval_s_url_93 = _jspx_th_s_url_93.doStartTag();
    if (_jspx_th_s_url_93.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_93);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_93);
    return false;
  }

  private boolean _jspx_meth_s_url_94(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_94 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_94.setPageContext(_jspx_page_context);
    _jspx_th_s_url_94.setParent(null);
    _jspx_th_s_url_94.setAction("secure/action/kycTrackingRep21Ui");
    int _jspx_eval_s_url_94 = _jspx_th_s_url_94.doStartTag();
    if (_jspx_th_s_url_94.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_94);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_94);
    return false;
  }

  private boolean _jspx_meth_s_url_95(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_95 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_95.setPageContext(_jspx_page_context);
    _jspx_th_s_url_95.setParent(null);
    _jspx_th_s_url_95.setAction("secure/action/kycTrackingRep22Ui");
    int _jspx_eval_s_url_95 = _jspx_th_s_url_95.doStartTag();
    if (_jspx_th_s_url_95.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_95);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_95);
    return false;
  }

  private boolean _jspx_meth_s_url_96(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_96 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_96.setPageContext(_jspx_page_context);
    _jspx_th_s_url_96.setParent(null);
    _jspx_th_s_url_96.setAction("secure/action/kycTrackingRep23Ui");
    int _jspx_eval_s_url_96 = _jspx_th_s_url_96.doStartTag();
    if (_jspx_th_s_url_96.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_96);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_96);
    return false;
  }

  private boolean _jspx_meth_s_url_97(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_97 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_97.setPageContext(_jspx_page_context);
    _jspx_th_s_url_97.setParent(null);
    _jspx_th_s_url_97.setAction("secure/action/kycTrackingRep24Ui");
    int _jspx_eval_s_url_97 = _jspx_th_s_url_97.doStartTag();
    if (_jspx_th_s_url_97.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_97);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_97);
    return false;
  }

  private boolean _jspx_meth_s_url_98(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_98 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_98.setPageContext(_jspx_page_context);
    _jspx_th_s_url_98.setParent(null);
    _jspx_th_s_url_98.setAction("secure/action/kycTrackingRep25Ui");
    int _jspx_eval_s_url_98 = _jspx_th_s_url_98.doStartTag();
    if (_jspx_th_s_url_98.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_98);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_98);
    return false;
  }

  private boolean _jspx_meth_s_url_99(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_99 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_99.setPageContext(_jspx_page_context);
    _jspx_th_s_url_99.setParent(null);
    _jspx_th_s_url_99.setAction("secure/action/kycTrackingRep26Ui");
    int _jspx_eval_s_url_99 = _jspx_th_s_url_99.doStartTag();
    if (_jspx_th_s_url_99.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_99);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_99);
    return false;
  }

  private boolean _jspx_meth_s_url_100(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_100 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_100.setPageContext(_jspx_page_context);
    _jspx_th_s_url_100.setParent(null);
    _jspx_th_s_url_100.setAction("secure/action/kycTrackingRep27Ui");
    int _jspx_eval_s_url_100 = _jspx_th_s_url_100.doStartTag();
    if (_jspx_th_s_url_100.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_100);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_100);
    return false;
  }

  private boolean _jspx_meth_s_url_101(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_101 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_101.setPageContext(_jspx_page_context);
    _jspx_th_s_url_101.setParent(null);
    _jspx_th_s_url_101.setAction("secure/action/kycTrackingRep28Ui");
    int _jspx_eval_s_url_101 = _jspx_th_s_url_101.doStartTag();
    if (_jspx_th_s_url_101.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_101);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_101);
    return false;
  }

  private boolean _jspx_meth_s_url_102(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_102 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_102.setPageContext(_jspx_page_context);
    _jspx_th_s_url_102.setParent(null);
    _jspx_th_s_url_102.setAction("secure/action/kycTrackingRep29Ui");
    int _jspx_eval_s_url_102 = _jspx_th_s_url_102.doStartTag();
    if (_jspx_th_s_url_102.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_102);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_102);
    return false;
  }

  private boolean _jspx_meth_s_url_103(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_103 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_103.setPageContext(_jspx_page_context);
    _jspx_th_s_url_103.setParent(null);
    _jspx_th_s_url_103.setAction("secure/action/kycTrackingRep30Ui");
    int _jspx_eval_s_url_103 = _jspx_th_s_url_103.doStartTag();
    if (_jspx_th_s_url_103.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_103);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_103);
    return false;
  }

  private boolean _jspx_meth_s_url_104(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_104 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_104.setPageContext(_jspx_page_context);
    _jspx_th_s_url_104.setParent(null);
    _jspx_th_s_url_104.setAction("secure/action/kycTrackingRep31Ui");
    int _jspx_eval_s_url_104 = _jspx_th_s_url_104.doStartTag();
    if (_jspx_th_s_url_104.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_104);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_104);
    return false;
  }

  private boolean _jspx_meth_s_url_105(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_105 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_105.setPageContext(_jspx_page_context);
    _jspx_th_s_url_105.setParent(null);
    _jspx_th_s_url_105.setAction("secure/action/kycTrackingRep32Ui");
    int _jspx_eval_s_url_105 = _jspx_th_s_url_105.doStartTag();
    if (_jspx_th_s_url_105.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_105);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_105);
    return false;
  }

  private boolean _jspx_meth_s_url_106(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_106 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_106.setPageContext(_jspx_page_context);
    _jspx_th_s_url_106.setParent(null);
    _jspx_th_s_url_106.setAction("secure/action/kycTrackingRep33Ui");
    int _jspx_eval_s_url_106 = _jspx_th_s_url_106.doStartTag();
    if (_jspx_th_s_url_106.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_106);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_106);
    return false;
  }

  private boolean _jspx_meth_s_url_107(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_107 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_107.setPageContext(_jspx_page_context);
    _jspx_th_s_url_107.setParent(null);
    _jspx_th_s_url_107.setAction("secure/action/kycTrackingRep21Ui");
    int _jspx_eval_s_url_107 = _jspx_th_s_url_107.doStartTag();
    if (_jspx_th_s_url_107.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_107);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_107);
    return false;
  }

  private boolean _jspx_meth_s_url_108(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_108 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_108.setPageContext(_jspx_page_context);
    _jspx_th_s_url_108.setParent(null);
    _jspx_th_s_url_108.setAction("secure/action/kycTrackingRep22Ui");
    int _jspx_eval_s_url_108 = _jspx_th_s_url_108.doStartTag();
    if (_jspx_th_s_url_108.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_108);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_108);
    return false;
  }

  private boolean _jspx_meth_s_url_109(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_109 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_109.setPageContext(_jspx_page_context);
    _jspx_th_s_url_109.setParent(null);
    _jspx_th_s_url_109.setAction("secure/action/kycTrackingRep23Ui");
    int _jspx_eval_s_url_109 = _jspx_th_s_url_109.doStartTag();
    if (_jspx_th_s_url_109.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_109);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_109);
    return false;
  }

  private boolean _jspx_meth_s_url_110(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_110 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_110.setPageContext(_jspx_page_context);
    _jspx_th_s_url_110.setParent(null);
    _jspx_th_s_url_110.setAction("secure/action/kycTrackingRep24Ui");
    int _jspx_eval_s_url_110 = _jspx_th_s_url_110.doStartTag();
    if (_jspx_th_s_url_110.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_110);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_110);
    return false;
  }

  private boolean _jspx_meth_s_url_111(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_111 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_111.setPageContext(_jspx_page_context);
    _jspx_th_s_url_111.setParent(null);
    _jspx_th_s_url_111.setAction("secure/action/kycTrackingRep25Ui");
    int _jspx_eval_s_url_111 = _jspx_th_s_url_111.doStartTag();
    if (_jspx_th_s_url_111.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_111);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_111);
    return false;
  }

  private boolean _jspx_meth_s_url_112(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_112 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_112.setPageContext(_jspx_page_context);
    _jspx_th_s_url_112.setParent(null);
    _jspx_th_s_url_112.setAction("secure/action/kycTrackingRep26Ui");
    int _jspx_eval_s_url_112 = _jspx_th_s_url_112.doStartTag();
    if (_jspx_th_s_url_112.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_112);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_112);
    return false;
  }

  private boolean _jspx_meth_s_url_113(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_113 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_113.setPageContext(_jspx_page_context);
    _jspx_th_s_url_113.setParent(null);
    _jspx_th_s_url_113.setAction("secure/action/kycTrackingRep27Ui");
    int _jspx_eval_s_url_113 = _jspx_th_s_url_113.doStartTag();
    if (_jspx_th_s_url_113.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_113);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_113);
    return false;
  }

  private boolean _jspx_meth_s_url_114(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_114 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_114.setPageContext(_jspx_page_context);
    _jspx_th_s_url_114.setParent(null);
    _jspx_th_s_url_114.setAction("secure/action/kycTrackingRep28Ui");
    int _jspx_eval_s_url_114 = _jspx_th_s_url_114.doStartTag();
    if (_jspx_th_s_url_114.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_114);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_114);
    return false;
  }

  private boolean _jspx_meth_s_url_115(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_115 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_115.setPageContext(_jspx_page_context);
    _jspx_th_s_url_115.setParent(null);
    _jspx_th_s_url_115.setAction("secure/action/kycTrackingRep29Ui");
    int _jspx_eval_s_url_115 = _jspx_th_s_url_115.doStartTag();
    if (_jspx_th_s_url_115.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_115);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_115);
    return false;
  }

  private boolean _jspx_meth_s_url_116(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_116 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_116.setPageContext(_jspx_page_context);
    _jspx_th_s_url_116.setParent(null);
    _jspx_th_s_url_116.setAction("secure/action/kycTrackingRep30Ui");
    int _jspx_eval_s_url_116 = _jspx_th_s_url_116.doStartTag();
    if (_jspx_th_s_url_116.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_116);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_116);
    return false;
  }

  private boolean _jspx_meth_s_url_117(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_117 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_117.setPageContext(_jspx_page_context);
    _jspx_th_s_url_117.setParent(null);
    _jspx_th_s_url_117.setAction("secure/action/kycTrackingRep31Ui");
    int _jspx_eval_s_url_117 = _jspx_th_s_url_117.doStartTag();
    if (_jspx_th_s_url_117.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_117);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_117);
    return false;
  }

  private boolean _jspx_meth_s_url_118(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_118 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_118.setPageContext(_jspx_page_context);
    _jspx_th_s_url_118.setParent(null);
    _jspx_th_s_url_118.setAction("secure/action/kycTrackingRep32Ui");
    int _jspx_eval_s_url_118 = _jspx_th_s_url_118.doStartTag();
    if (_jspx_th_s_url_118.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_118);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_118);
    return false;
  }

  private boolean _jspx_meth_s_url_119(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_119 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_119.setPageContext(_jspx_page_context);
    _jspx_th_s_url_119.setParent(null);
    _jspx_th_s_url_119.setAction("secure/action/kycTrackingRep33Ui");
    int _jspx_eval_s_url_119 = _jspx_th_s_url_119.doStartTag();
    if (_jspx_th_s_url_119.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_119);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_119);
    return false;
  }

  private boolean _jspx_meth_s_iterator_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_7 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value_id.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_7.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_7.setParent(null);
    _jspx_th_s_iterator_7.setValue("cm_list");
    _jspx_th_s_iterator_7.setId("cm_list");
    int _jspx_eval_s_iterator_7 = _jspx_th_s_iterator_7.doStartTag();
    if (_jspx_eval_s_iterator_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_7.doInitBody();
      }
      do {
        out.write("  \n");
        out.write("\n");
        out.write("            <p style=\"font-size: 1.2em;color: #052b4d; font: Arial, sans-serif;\">Hello ");
        if (_jspx_meth_s_property_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_7, _jspx_page_context))
          return true;
        out.write(" : ");
        if (_jspx_meth_s_property_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_7, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("\n");
        out.write("            <a href=\"");
        if (_jspx_meth_s_url_120((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_7, _jspx_page_context))
          return true;
        out.write("\"><p>Total Agent Count</a> : ");
        if (_jspx_meth_s_property_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_7, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("            <a href=\"");
        if (_jspx_meth_s_url_121((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_7, _jspx_page_context))
          return true;
        out.write("\"><p>Total BSA Count</a> : ");
        if (_jspx_meth_s_property_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_7, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("\n");
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_iterator_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_7);
      return true;
    }
    _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_7);
    return false;
  }

  private boolean _jspx_meth_s_property_25(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_25 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_25.setPageContext(_jspx_page_context);
    _jspx_th_s_property_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_7);
    _jspx_th_s_property_25.setValue("loggedin_role");
    int _jspx_eval_s_property_25 = _jspx_th_s_property_25.doStartTag();
    if (_jspx_th_s_property_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_25);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_25);
    return false;
  }

  private boolean _jspx_meth_s_property_26(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_26 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_26.setPageContext(_jspx_page_context);
    _jspx_th_s_property_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_7);
    _jspx_th_s_property_26.setValue("loggedin");
    int _jspx_eval_s_property_26 = _jspx_th_s_property_26.doStartTag();
    if (_jspx_th_s_property_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_26);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_26);
    return false;
  }

  private boolean _jspx_meth_s_url_120(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_120 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_120.setPageContext(_jspx_page_context);
    _jspx_th_s_url_120.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_7);
    _jspx_th_s_url_120.setAction("secure/action/agentcount");
    int _jspx_eval_s_url_120 = _jspx_th_s_url_120.doStartTag();
    if (_jspx_th_s_url_120.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_120);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_120);
    return false;
  }

  private boolean _jspx_meth_s_property_27(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_27 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_27.setPageContext(_jspx_page_context);
    _jspx_th_s_property_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_7);
    _jspx_th_s_property_27.setValue("agent_count");
    int _jspx_eval_s_property_27 = _jspx_th_s_property_27.doStartTag();
    if (_jspx_th_s_property_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_27);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_27);
    return false;
  }

  private boolean _jspx_meth_s_url_121(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_121 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_121.setPageContext(_jspx_page_context);
    _jspx_th_s_url_121.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_7);
    _jspx_th_s_url_121.setAction("secure/action/bsacount");
    int _jspx_eval_s_url_121 = _jspx_th_s_url_121.doStartTag();
    if (_jspx_th_s_url_121.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_121);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_121);
    return false;
  }

  private boolean _jspx_meth_s_property_28(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_28 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_28.setPageContext(_jspx_page_context);
    _jspx_th_s_property_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_7);
    _jspx_th_s_property_28.setValue("bsa_count");
    int _jspx_eval_s_property_28 = _jspx_th_s_property_28.doStartTag();
    if (_jspx_th_s_property_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_28);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_28);
    return false;
  }

  private boolean _jspx_meth_s_url_122(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_122 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_122.setPageContext(_jspx_page_context);
    _jspx_th_s_url_122.setParent(null);
    _jspx_th_s_url_122.setAction("secure/action/kycTrackingRep8Ui");
    int _jspx_eval_s_url_122 = _jspx_th_s_url_122.doStartTag();
    if (_jspx_th_s_url_122.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_122);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_122);
    return false;
  }

  private boolean _jspx_meth_s_url_123(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_123 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_123.setPageContext(_jspx_page_context);
    _jspx_th_s_url_123.setParent(null);
    _jspx_th_s_url_123.setAction("secure/action/sm_tm_management");
    int _jspx_eval_s_url_123 = _jspx_th_s_url_123.doStartTag();
    if (_jspx_th_s_url_123.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_123);
      return true;
    }
    _jspx_tagPool_s_url_action_nobody.reuse(_jspx_th_s_url_123);
    return false;
  }
}
