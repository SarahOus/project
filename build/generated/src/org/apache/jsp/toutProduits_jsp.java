package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Base64;
import java.util.List;
import model.Produit;
import DAO.ProduitDAO;
import connexion.DBconnexion;

public final class toutProduits_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Liste des Produits</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .product-container {\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                justify-content: space-around;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .product-card {\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                margin: 10px;\n");
      out.write("                padding: 10px;\n");
      out.write("                width: 200px;\n");
      out.write("                text-align: center;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                height: 100%; /* Remplir la hauteur de la carte */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .product-image {\n");
      out.write("                max-width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Ajout de styles pour le compteur et le bouton panier */\n");
      out.write("            #cart-counter {\n");
      out.write("                margin-right: 10px;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #btn-panier {\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Ajout du compteur et du bouton panier en dehors de la barre de navigation -->\n");
      out.write("        <div class=\"container mt-3\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <h2>Liste des Produits</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 text-right\">\n");
      out.write("                    <a href=\"afficherPanier.jsp\">\n");
      out.write("                        <span id=\"cart-counter\">Nombre de Produits dans le panier : <span id=\"counter\">\n");
      out.write("                                ");
      out.write("\n");
      out.write("                                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty param.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                </c:if>\n");
      out.write("                            </span></span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Liste des Produits -->\n");
      out.write("        <div class=\"container mt-3\">\n");
      out.write("            <div class=\"product-container\">\n");
      out.write("                ");

                    ProduitDAO dao = new ProduitDAO(DBconnexion.DBconnection());
                    List<Produit> produits = dao.getAllProduit();
                    for (Produit a : produits) {
                        String libelle = a.getLibelle();
                        double prix = a.getPrix();
                
      out.write("\n");
      out.write("                <div class=\"product-card\">\n");
      out.write("                    <img src=\"img/");
      out.print( a.getPhoto());
      out.write("\" class=\"product-image\" style=\"max-width: 60px; max-height: 70px;\">\n");
      out.write("                    <h5 class=\"card-title\">");
      out.print( a.getLibelle());
      out.write("</h5>\n");
      out.write("                    <p class=\"card-text\">Prix: ");
      out.print( a.getPrix());
      out.write(" DA</p>\n");
      out.write("                    <p class=\"card-text\">Quantité: ");
      out.print( a.getQts());
      out.write("</p>\n");
      out.write("                    <a href=\"AjouterPanierServlet?id=");
      out.print(a.getId());
      out.write("\" class=\"btn btn-primary\">Ajouter</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
