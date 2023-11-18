package metier;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Panier;
import model.Produit;

@WebServlet(name = "AjouterPanierServlet", urlPatterns = {"/AjouterPanierServlet"})
public class AjouterPanierServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        // Créer un objet Produit
        Produit produit = new Produit();
        produit.setId(id);

        System.out.println("l id de produit " + id);
        // Récupérer la session
        HttpSession session = request.getSession(true);

        // Récupérer la liste de Panier depuis la session, ou la créer si elle n'existe pas encore
        List<Panier> panier = (List<Panier>) session.getAttribute("panier");
        if (panier == null) {
            panier = new ArrayList<>();
        }

        // Vérifier si le produit est déjà dans le panier
        boolean produitExiste = false;
        for (Panier panierItem : panier) {
            if (panierItem.getProduit().getId() == produit.getId()) {
                System.out.println(panierItem.getProduit().getId() == produit.getId());
                // Si le produit existe, incrémenter la quantité
                panierItem.incrementerQuantite();
                produitExiste = true;
                break;
            }
        }

        if (!produitExiste) {
            // Si le produit n'existe pas, créer un nouveau Panier avec une quantité de 1
            Panier nouveauPanier = new Panier(produit, 1);
            panier.add(nouveauPanier);
        }

        // Mettre à jour la liste de Panier dans la session
        session.setAttribute("panier", panier);

        // Rediriger vers la page des produits
        response.sendRedirect("toutProduits.jsp?quantity=" + panier.size());
    }

}
