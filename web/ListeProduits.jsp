<%-- 
    Document   : ListeProduits
    Created on : 15 nov. 2023, 21:35:11
    Author     : TRETEC
--%>

<%@page import="connexion.DBconnexion"%>
<%@page import="java.util.List"%>
<%@page import="model.Produit"%>
<%@page import="DAO.ProduitDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="card m-5 border-black">
            <h5 class="card-header border-black ">Liste des Produits</h5>
            <div class="card-body ">
                <a href="ajouterProduit.jsp" class="btn btn-primary">Ajouter un autre Produit</a> 
                <br>

                <table class="table table-bordered border-black m-lg-2">
                    <thead class="table-dark">

                        <tr>
                            <th>Produit</th>
                            <th>Quantité</th>
                            <th>Prix de Vente</th>
                            <th>Photo</th>

                        </tr> 
                    </thead>
                    <tbody>
                        <%  ProduitDAO dao = new ProduitDAO(DBconnexion.DBconnection());
                            List<Produit> produits = dao.getAllProduit();
                            for (Produit a : produits) {

                        %>
                        <tr>
                            <td><%=a.getLibelle()%></td>
                            <td><%=a.getQts()%></td>
                            <td><%=a.getPrix()%>DA</td>
                            <td>
                                <img src="img/<%= a.getPhoto()%>" class="img-thumbnail" style="max-width: 60px; max-height: 70px;">
                            </td>
                        </tr>
                        <% }%>
                    </tbody>
                </table>

            </div>
        </div>
        <script src="js/bootstrap.bundle.min.js"></script>
    </body>
</html>
