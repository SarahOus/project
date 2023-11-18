package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pageAccueil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f4f4f4;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            height: 100vh;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form {\n");
      out.write("            background-color: #fff;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 8px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 8px;\n");
      out.write("            margin-bottom: 16px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("            background-color: #4caf50;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 10px 15px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"verificationLogin.jsp\">\n");
      out.write("        <label for=\"username\">Nom d'utilisateur :</label>\n");
      out.write("        <input type=\"text\" id=\"user\" name=\"user\" required>\n");
      out.write("\n");
      out.write("        <label for=\"password\">Mot de passe :</label>\n");
      out.write("        <input type=\"password\" id=\"pwd\" name=\"pwd\" required>\n");
      out.write("\n");
      out.write("        <button type=\"submit\">Se Connecter</button>\n");
      out.write("    </form>\n");
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
