/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

import DAO.ProduitDAO;
import connexion.DBconnexion;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.Produit;

/**
 *
 * @author TRETEC
 */
@WebServlet("/AjouterProduitServlet")
@MultipartConfig
public class AjouterProduitServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String libelle = request.getParameter("libelle");
        Part photoPart = request.getPart("photo");
        String prixStr = request.getParameter("prix");
        String qtsStr = request.getParameter("qts");

        double prix = Double.parseDouble(prixStr);
        int qts = Integer.parseInt(qtsStr);

        // Enregistrement de l'image dans le répertoire du serveur
        String imageFileName =photoPart.getSubmittedFileName();
        
        String uploadPath = "C:/Users/TRETEC/Desktop/TP1/GestionDesVentes/web/img/"+imageFileName;
        
        
        try {
            FileOutputStream fos = new FileOutputStream(uploadPath);
            InputStream is = photoPart.getInputStream();
            
            byte[] data = new byte[is.available()];
            is.read(data);
            fos.write(data);
            fos.close();
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }


        // Enregistrement des détails du produit dans la base de données
        Produit produit = new Produit();
        produit.setLibelle(libelle);
        produit.setPhoto(imageFileName);
        produit.setPrix(prix);
        produit.setQts(qts);

        try {
            Connection connection = DBconnexion.DBconnection();
            ProduitDAO produitDAO = new ProduitDAO(connection);
            produitDAO.ajouterProduit(produit);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException("Database operation failed", e);
        }

        response.sendRedirect("ListeProduits.jsp");
    }
}
