package DAO;

import connexion.DBconnexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Produit;

public class ProduitDAO {

    private Connection c;

    public ProduitDAO(Connection c) {
        this.c = c;
    }

    public void ajouterProduit(Produit produit) throws SQLException {

        String sql = "INSERT INTO produit (libelle, photo, prix, qts) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = c.prepareStatement(sql)) {
            statement.setString(1, produit.getLibelle());
            statement.setString(2, produit.getPhoto());
            statement.setDouble(3, produit.getPrix());
            statement.setInt(4, produit.getQts());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Produit> getAllProduit() {
        List<Produit> produits = new ArrayList<>();
        try {
            String sql = "SELECT id,libelle, photo, prix, qts FROM produit";
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Produit produit = new Produit();
                produit.setId(rs.getInt("id"));
                produit.setLibelle(rs.getString("libelle"));
                produit.setPhoto(rs.getString("photo"));
                produit.setPrix(rs.getDouble("prix"));
                produit.setQts(rs.getInt("qts"));
                produits.add(produit);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return produits;
    }

    public Produit getProduitById(int id) {

        Produit cc = null;
        try {
            String sql = "select* from produit where id=? ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cc = new Produit();
                cc.setId(rs.getInt(1));
                cc.setLibelle(rs.getString(2));
                cc.setPhoto(rs.getString(3));
                cc.setQts(rs.getInt(4));
                cc.setPrix(rs.getDouble(5));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cc;
    }

}

