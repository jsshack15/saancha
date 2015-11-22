package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <html>\n");
      out.write("    <head>\n");
      out.write("      <!--Import Google Icon Font-->\n");
      out.write("      <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("      <link href='https://fonts.googleapis.com/css?family=Comfortaa' rel='stylesheet' type='text/css'>\n");
      out.write("      \n");
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
      out.write("      <div class=\"container\">\n");
      out.write("        <img src=\"assest/img/typo2.png\" style=\"align: centre;\" height=\"280px\" id=\"san\" >\n");
      out.write("        <div class=\"log\">\n");
      out.write("          <a class=\"waves-effect waves-light btn-large bn black-text\" id=\"myBtn\"><i class=\"material-icons left\">send</i>Login</a>\n");
      out.write("          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("          <a class=\"waves-effect waves-light btn-large bn black-text\" id=\"myBtn-su\"><i class=\"material-icons left\">send</i>sign up</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!-- Modal -->\n");
      out.write("  \n");
      out.write("    <div class=\"modal fade mo\" style=\"width:40%;\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header teal darken-2\" style=\"padding:35px 50px;\">\n");
      out.write("          <h2><i class=\"material-icons\">lock</i>Login</h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\" style=\"padding:40px 50px;\">\n");
      out.write("          <form role=\"form\">\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"usrname\" style=\"font-size:16px;\"><i class=\"material-icons\">perm_identity</i> Username</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"usrname\" placeholder=\"Enter username\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"psw\" style=\"font-size:16px;\"><i class=\"material-icons\">vpn_key</i> Password</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"psw\" placeholder=\"Enter password\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("              <button type=\"submit\" class=\"btn btn-success btn-block teal darken-2\">Login</button>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\" style=\"height:120%;\">\n");
      out.write("          <button type=\"submit\" class=\"btn btn-danger btn-default pull-left\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("          <p>Not a member? <a href=\"#\">Sign Up</a></p>\n");
      out.write("          <p>Forgot <a href=\"#\">Password?</a></p>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write(" <!-- Modal-2 -->\n");
      out.write("  \n");
      out.write("    <div class=\"modal fade mo\" style=\"width:40%;\" id=\"myModal-2\" role=\"dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal-2 content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header teal darken-2\" style=\"padding:35px 50px;\">\n");
      out.write("          <h2><i class=\"material-icons\">assignment_ind</i>Sign Up</h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\" style=\"padding:40px 50px;\">\n");
      out.write("          <form role=\"form\">\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <lable for=\"email\" style=\"font-size:16px;\"><i class=\"material-icons\">email</i> Email Id</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"usrname\" placeholder=\"Enter email\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"usrname\" style=\"font-size:16px;\"><i class=\"material-icons\">perm_identity</i> Username</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"usrname\" placeholder=\"Enter username\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"psw\" style=\"font-size:16px;\"><i class=\"material-icons\">vpn_key</i> Password</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"psw\" placeholder=\"Enter password\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"psw\" style=\"font-size:16px;\"><i class=\"material-icons\">vpn_key</i> Re-enter Password</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"psw\" placeholder=\"Enter password\">\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("              <button type=\"submit\" class=\"btn btn-success btn-block teal darken-2\">Sign Up</button>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\" style=\"height:120%;\">\n");
      out.write("          <button type=\"submit\" class=\"btn btn-danger btn-default pull-left\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("      <!--Import jQuery before materialize.js-->\n");
      out.write("      <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"assest/js/materialize.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"assest/js/bootstrap.min.js\"></script>\n");
      out.write("      <script>\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            $(\"#myBtn\").click(function(){\n");
      out.write("                $(\"#myModal\").modal();\n");
      out.write("            });\n");
      out.write("          });\n");
      out.write("      </script>\n");
      out.write("      <script>\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            $(\"#myBtn-su\").click(function(){\n");
      out.write("                $(\"#myModal-2\").modal();\n");
      out.write("            });\n");
      out.write("          });\n");
      out.write("      </script>\n");
      out.write("\n");
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
