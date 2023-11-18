package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import connexion.DBconnexion;
import java.util.List;
import model.Produit;
import DAO.ProduitDAO;

public final class ListeProduits_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"card m-5 border-black\">\n");
      out.write("            <h5 class=\"card-header border-black \">Liste des Produits</h5>\n");
      out.write("            <div class=\"card-body \">\n");
      out.write("                <a href=\"ajouterProduit.jsp\" class=\"btn btn-primary\">Ajouter un autre Produit</a> \n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <table class=\"table table-bordered border-black\">\n");
      out.write("                    <thead class=\"table-dark\">\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Produit</th>\n");
      out.write("                            <th>Quantité</th>\n");
      out.write("                            <th>Prix de Vente</th>\n");
      out.write("                            <th>Photo</th>\n");
      out.write("\n");
      out.write("                        </tr> \n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
  ProduitDAO dao = new ProduitDAO(DBconnexion.DBconnection());
                            List<Produit> produits = dao.getAllProduit();
                            for (Produit a : produits) {

                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(a.getLibelle());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(a.getQts());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(a.getPrix());
      out.write("DA</td>\n");
      out.write("                            <td>\n");
      out.write("                                <img src=\"img/");
      out.print( a.getPhoto());
      out.write("\" class=\"img-thumbnail\" style=\"max-width: 60px; max-height: 70px;\">\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
