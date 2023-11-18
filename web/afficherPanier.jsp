<%-- 
    Document   : afficherPanier
    Created on : 17 nov. 2023, 17:38:42
    Author     : TRETEC
--%>

<%@page import="DAO.ProduitDAO"%>
<%@page import="connexion.DBconnexion"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Produit"%>
<%@page import="model.Panier"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Afficher Panier</title>
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">

    </head>
    <body>
        <div class="container mt-3">
            <h2 class="text-center">Votre Panier</h2>
            <table class="table">
                <thead>
                    <tr>
                        <th>Quantité</th>
                        <th>Libellé</th>
                        <th>Prix</th>
                        <th>Photo</th>

                    </tr>
                </thead>
                <%
                    // Récupérer la liste des produits depuis la session
                    List<Panier> panier = (List<Panier>) session.getAttribute("panier");
                    ProduitDAO dao = new ProduitDAO(DBconnexion.DBconnection());
                    // Initialiser le montant total à zéro
                   double montantTotal = 0;

                %>
                <tbody>
                    <% for (Panier panierItem : panier) {
                            int productId = panierItem.getProduit().getId();
                            Produit produit = dao.getProduitById(productId);
                            
                            montantTotal += produit.getPrix() * panierItem.getQuantite();
                           
                    %>
                    <tr>
                        <td><%= panierItem.getQuantite()%></td>
                        <td><%= produit.getLibelle()%></td>
                        <td><%= produit.getPrix()%> DA</td>

                        <td>
                            <img src="img/<%= produit.getPhoto()%>" class="img-thumbnail" style="max-width: 60px; max-height: 70px;">
                        </td>

                    </tr>
                    <% }%>
                </tbody>
            </table>
                    <p class="text-center">Montant total : <%= montantTotal %> DA</p>
        </div>
        <script src="js/bootstrap.bundle.min.js"></script>
    </body>
</html>
