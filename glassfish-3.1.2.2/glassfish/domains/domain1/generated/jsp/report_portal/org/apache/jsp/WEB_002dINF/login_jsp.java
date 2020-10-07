package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"cs\" lang=\"cs\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("\n");
      out.write("        <title>Report Portal</title>   \n");
      out.write("        <link rel=\"shortcut icon\" href=\"");
      out.print(request.getContextPath());
      out.write("/images/bkash.ico\"/>\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/default.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/grayred.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- #main -->\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <!-- #header -->\n");
      out.write("            <div id=\"header\"> \n");
      out.write("                <!-- #logo --> \n");
      out.write("                <div id=\"logo\" style=\"color:#fff;font-weight:normal;font-size:23px;font-family: Verdana,Arial;padding:0 0 0 12px;\">\n");
      out.write("                    Report Portal\n");
      out.write("                </div>\n");
      out.write("                <!-- /#logo -->\n");
      out.write("                <!-- #user -->                        \n");
      out.write("                <div id=\"user\">\n");
      out.write("\n");
      out.write("                    Report Generation Portal\n");
      out.write("                </div>\n");
      out.write("                <!-- /#user -->  \n");
      out.write("            </div>\n");
      out.write("            <!-- /header -->\n");
      out.write("            <!-- #content -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("\n");
      out.write("                <div id=\"login-logo\">\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/images/bkash_x140.jpg\" />\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box-cols\" style=\"margin-left:180px;\">\n");
      out.write("                    <div class=\"box box-col\">\n");
      out.write("                        <div class=\"headlines\" >\n");
      out.write("                            <h2 ><span>Login</span></h2>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"box-content\">\n");
      out.write("                            <form class=\"formBox\" action=\"j_security_check\" method=\"POST\">\n");
      out.write("\n");
      out.write("                                <fieldset>\n");
      out.write("                                    <div class=\"clearfix\">                    \n");
      out.write("                                        <div class=\"lab\"><label for=\"input-col\">Email</label></div>\n");
      out.write("                                        <div class=\"con\"><input type=\"text\" class=\"input\"  name=\"j_username\" ></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"clearfix\">\n");
      out.write("                                        <div class=\"lab\"><label for=\"textarea-col\">Password</label></div>\n");
      out.write("                                        <div class=\"con\"><input type=\"password\" class=\"input\"  name=\"j_password\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"btn-submit\" ><!-- Submit form -->\n");
      out.write("                                        <input type=\"submit\" value=\"Login\" class=\"button\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                </fieldset>\n");
      out.write("                            </form>   \n");
      out.write("                            <!-- Warning form message -->            \n");
      out.write("                            <div class=\"form-message warning\">\n");
      out.write("                                You are attempting to access a resource which is restricted.\n");
      out.write("                                Repeated failed login attempts will result in lock out.\n");
      out.write("                            </div>  \n");
      out.write("\n");
      out.write("                         \n");
      out.write("                            <div class=\"form-message help\">\n");
      out.write("                                For best performance use Google Chrome or Mozilla Firefox.\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"footer\"><p>© 2013 bKash Limited</p></div>            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /#content -->\n");
      out.write("\n");
      out.write("            <!-- #footer -->\n");
      out.write("\n");
      out.write("            <!-- /#footer -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /#main --> \n");
      out.write("    </body>\n");
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
}
