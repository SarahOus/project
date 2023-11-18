
package model;

import java.util.List;


public class Panier {
    private Produit produit;
    private int quantite;

    public Panier(Produit produit, int quantite) {
        this.produit = produit;
        this.quantite = quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int incrementerQuantite() {
        return this.quantite=quantite+1;
    }
 

}
