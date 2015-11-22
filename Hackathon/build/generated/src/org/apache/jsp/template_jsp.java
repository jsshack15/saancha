package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body background=\"assest/img/tem-bg.jpg\">\n");
      out.write("      <nav id=\"trans\">\n");
      out.write("        <div class=\"nav-wrapper\">\n");
      out.write("          <a href=\"#\" class=\"brand-logo\">Logo</a>\n");
      out.write("            <ul id=\"nav-mobile\" class=\"right hide-on-med-and-down icons\">\n");
      out.write("              <li><a href=\"home.jsp\" class=\"black-text lt\">Home</a></li>\n");
      out.write("              <li><a href=\"templates.jsp\" class=\"black-text lt\">Templates</a></li>\n");
      out.write("              <li><a href=\"#\" class=\"black-text lt\">username</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col s6 offset-s7\">\n");
      out.write("        <h1>Themes</h1>\n");
      out.write("          <div id=\"slider1_container\">\n");
      out.write("            <!-- Slides Container -->\n");
      out.write("            <div u=\"slides\" style=\"cursor: move; position: absolute; overflow: hidden; left: 630px; top: 150px; width: 600px; height: 300px;\">\n");
      out.write("              <div class=\"card\" style=\"width:500px; length:200px;\">\n");
      out.write("                <div class=\"card-image\">\n");
      out.write("                  <a href=\"temp1/index.html\"><img src=\"assest/img/pic.png\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-content\">\n");
      out.write("                  <p>I am a very simple card. I am good at containing small bits of information.\n");
      out.write("                  I am convenient because I require little markup to use effectively.</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card\" style=\"width:500px; length:200px;\">\n");
      out.write("                <div class=\"card-image\">\n");
      out.write("                  <a href=\"temp2/index.html\"><img src=\"assest/img/pic2.jpg\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-content\">\n");
      out.write("                  <p>I am a very simple card. I am good at containing small bits of information.\n");
      out.write("                  I am convenient because I require little markup to use effectively.</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card\" style=\"width:500px; length:200px;\">\n");
      out.write("                <div class=\"card-image\">\n");
      out.write("                  <a href=\"temp3/index.html\"><img src=\"assest/img/pic3.jpg\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-content\">\n");
      out.write("                  <p>I am a very simple card. I am good at containing small bits of information.\n");
      out.write("                  I am convenient because I require little markup to use effectively.</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("      <!--Import jQuery before materialize.js-->\n");
      out.write("      <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"assest/js/materialize.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"assest/js/bootstrap.min.js\"></script>\n");
      out.write("      <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jssor-slider/19.0.1/jssor.slider.mini.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("      <!-- it works the same with all jquery version from 1.x to 2.x -->\n");
      out.write("      <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0-alpha1/jquery.min.js\"></script>\n");
      out.write("      <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jssor-slider/19.0.1/jssor.slider.mini.js\"></script>\n");
      out.write("      <script>\n");
      out.write("          jQuery(document).ready(function ($) {\n");
      out.write("              var options = { $AutoPlay: true };\n");
      out.write("              var jssor_slider1 = new $JssorSlider$('slider1_container', options);\n");
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
