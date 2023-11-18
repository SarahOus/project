/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

public class Produit {
    private int id;
     private String libelle;
    private String photo;
    private double prix;
    private int qts;

    public Produit(int id, String libelle, String photo, double prix, int qts) {
        this.id = id;
        this.libelle = libelle;
        this.photo = photo;
        this.prix = prix;
        this.qts = qts;
    }
    
    public Produit() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQts() {
        return qts;
    }

    public void setQts(int qts) {
        this.qts = qts;
    }
    

}
