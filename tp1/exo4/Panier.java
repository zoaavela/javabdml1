/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;
import java.util.ArrayList;
/**
 *
 * @author enzoo
 */
public class Panier {

    //attributs 
    private ArrayList<Produit> produits;

    //constructeur
    public Panier() {
        this.produits = new ArrayList<>();
    }

    //getters
    public ArrayList<Produit> getProduits() {
        return this.produits;
    }

    //méthodes 
    public void ajouterProduit(Produit produit) {
        this.produits.add(produit);
        System.out.println(produit.getNom() + " ajouté au panier.");
    }

    public void supprimerProduit(Produit produit) {
        if (this.produits.remove(produit)) {
            System.out.println(produit.getNom() + " supprimé du panier.");
        } else {
            System.out.println("Produit non trouvé dans le panier.");
        }
    }

    public void afficherPanier() {
        if (this.produits.isEmpty()) {
            System.out.println("Le panier est vide.");
        } else {
            System.out.println("--- Contenu du Panier ---");
            for (Produit p : this.produits) {
                p.afficherDetails();
            }
            System.out.println("Total: " + calculerTotal() + "EUR");
        }
    }

    public double calculerTotal() {
        double total = 0.0;
        for (Produit p : this.produits) {
            total = total + p.getPrix();
        }
        return total;
    }
}
