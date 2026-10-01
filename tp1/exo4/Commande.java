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
public class Commande {

    //attributs 
    private int idCommande;
    private Client client;
    private ArrayList<Produit> produitsCommandes;
    private double total;

    //constructeur
    public Commande(int idCommande, Client client, ArrayList<Produit> produits) {
        this.idCommande = idCommande;
        this.client = client;
        this.produitsCommandes = new ArrayList<>(produits);
        
        double somme = 0.0;
        for (Produit p : this.produitsCommandes) {
            somme = somme + p.getPrix();
        }
        this.total = somme;
    }

    //méthodes 
    public void afficherDetailsCommande() {
        System.out.println("\n--- Détails de la Commande n°" + this.idCommande + " ---");
        this.client.afficherDetails();
        System.out.println("Articles achetes :");
        for (Produit p : this.produitsCommandes) {
            System.out.println("- " + p.getNom() + " : " + p.getPrix() + "€");
        }
        System.out.println("Montant total : " + this.total + "€");
    }
}
