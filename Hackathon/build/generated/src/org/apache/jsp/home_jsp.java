package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("    <head>\n");
      out.write("      <!--Import Google Icon Font-->\n");
      out.write("      <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("      <link href='https://fonts.googleapis.com/css?family=Comfortaa' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("      <!--Import materialize.css-->\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"assest/css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"assest/css/style.css\"  media=\"screen,projection\"/>\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"assest/css/bootstrap.min.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("      <!--Let browser know website is optimized for mobile-->\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body background= \"assest/img/bg4.jpg\">\n");
      out.write("      <nav id=\"trans\">\n");
      out.write("        <div class=\"nav-wrapper\">\n");
      out.write("          <a href=\"#\" class=\"brand-logo\">Logo</a>\n");
      out.write("            <ul id=\"nav-mobile\" class=\"right hide-on-med-and-down icons\">\n");
      out.write("              <li><a href=\"home.jsp\" class=\"black-text lt\">Home</a></li>\n");
      out.write("              <li><a href=\"templates.jsp\" class=\"black-text lt\">Templates</a></li>\n");
      out.write("              <li><a href=\"#\" class=\"black-text lt\">Learn</a></li>\n");
      out.write("              <li><a href=\"#\" class=\"black-text lt\">username</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <br><br>\n");
      out.write("            <div class=\"abt-us-txt\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col s6 offset-s5 red-text\">\n");
      out.write("                    <h1>About Us</h1>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\" style=\"padding-top: 7px;\">\n");
      out.write("                  <div class=\"col s6 offset-s3\">\n");
      out.write("                    <p style=\"font-size: 16px;\">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"row\" style=\"padding-top: 30px; padding-right: 50px;\">\n");
      out.write("                <div class=\"col s6 offset-s5\">\n");
      out.write("                  <a class=\"waves-effect waves-light btn-large bn black-text\" href=\"templates.html\">Let's Get Started</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!--Import jQuery before materialize.js-->\n");
      out.write("      <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"assest/js/materialize.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"assest/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("  </html>");
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
