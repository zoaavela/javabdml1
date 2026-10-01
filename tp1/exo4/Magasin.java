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
public class Magasin {

    //attributs 
    private ArrayList<Produit> produits;

    //constructeur
    public Magasin() {
        this.produits = new ArrayList<>();
    }

    //méthodes 
    public void ajouterProduit(Produit produit) {
        this.produits.add(produit);
    }

    public void afficherProduitsDisponibles() {
        System.out.println("\n--- Produits Disponibles ---");
        for (Produit p : this.produits) {
            p.afficherDetails();
        }
    }

    public Produit trouverProduitParNom(String nom) {
        for (Produit p : this.produits) {
            if (p.getNom().equalsIgnoreCase(nom)) {
                return p;
            }
        }
        return null;
    }
}
