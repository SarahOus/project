
<%@page import="java.util.Base64"%>
<%@page import="java.util.List"%>
<%@page import="model.Produit"%>
<%@page import="DAO.ProduitDAO"%>
<%@page import="connexion.DBconnexion"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des Produits</title>
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <style>
            .product-container {
                display: flex;
                flex-wrap: wrap;
                justify-content: space-around;
                padding: 20px;
            }

            .product-card {
                border: 1px solid #ddd;
                border-radius: 5px;
                margin: 10px;
                padding: 10px;
                width: 200px;
                text-align: center;
                display: flex;
                flex-direction: column;
                justify-content: space-between;
                height: 100%; /* Remplir la hauteur de la carte */
            }

            .product-image {
                max-width: 100%;
                height: 100%;
            }

            /* Ajout de styles pour le compteur et le bouton panier */
            #cart-counter {
                margin-right: 10px;
                font-size: 18px;
            }

            #btn-panier {
                font-size: 18px;
            }
        </style>

    </head>
    <body>
        <!-- Ajout du compteur et du bouton panier en dehors de la barre de navigation -->
        <div class="container mt-3">
            <div class="row">
                <div class="col-md-8">
                    <h2>Liste des Produits</h2>
                </div>
                <div class="col-md-4 text-right">
                    <a href="afficherPanier.jsp">
                        <span id="cart-counter">Nombre de Produits dans le panier : <span id="counter">
                                <%-- Afficher la quantité uniquement si elle est disponible --%>
                                <c:if test="${not empty param.quantity}">
                                    ${param.quantity}
                                </c:if>
                            </span></span>
                    </a>
                </div>

            </div>
        </div>

        <!-- Liste des Produits -->
        <div class="container mt-3">
            <div class="product-container">
                <%
                    ProduitDAO dao = new ProduitDAO(DBconnexion.DBconnection());
                    List<Produit> produits = dao.getAllProduit();
                    for (Produit a : produits) {
                        
                %>
                <div class="product-card">
                    <img src="img/<%= a.getPhoto()%>" class="product-image" >
                    <h5 class="card-title"><%= a.getLibelle()%></h5>
                    <p class="card-text">Prix: <%= a.getPrix()%> DA</p>
                    
                    <a href="AjouterPanierServlet?id=<%=a.getId()%>" class="btn btn-primary">Ajouter</a>


                </div>
                <% }%>
            </div>
        </div>
        <script src="js/bootstrap.bundle.min.js"></script>

    </body>
</html>

