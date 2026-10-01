/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;
import java.util.Scanner;
/**
 *
 * @author enzoo
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //création magasin et stock
        Magasin magasin = new Magasin();
        magasin.ajouterProduit(new Produit(1, "Ordinateur", 799.99, 5));
        magasin.ajouterProduit(new Produit(2, "Souris", 24.50, 15));
        magasin.ajouterProduit(new Produit(3, "Clavier", 49.90, 8));

        //création client et panier
        Client client1 = new Client(1, "Enzo", "enzo@email.com");
        Panier panier1 = new Panier();

        int choix = 0;
        int idCommandeCompteur = 1;

        while (choix != 5) {
            System.out.println("\n--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();
            scanner.nextLine(); //consomme la ligne

            switch (choix) {
                case 1:
                    magasin.afficherProduitsDisponibles();
                    break;

                case 2:
                    System.out.print("Entrez le nom du produit à ajouter : ");
                    String nomProduit = scanner.nextLine();
                    Produit prodTrouve = magasin.trouverProduitParNom(nomProduit);
                    
                    if (prodTrouve != null) {
                        panier1.ajouterProduit(prodTrouve);
                    } else {
                        System.out.println("Produit introuvable.");
                    }
                    break;

                case 3:
                    panier1.afficherPanier();
                    break;

                case 4:
                    if (panier1.getProduits().isEmpty()) {
                        System.out.println("Impossible de commander : votre panier est vide.");
                    } else {
                        Commande commande1 = new Commande(idCommandeCompteur, client1, panier1.getProduits());
                        commande1.afficherDetailsCommande();
                        panier1.getProduits().clear();
                        idCommandeCompteur++;
                    }
                    break;

                case 5:
                    System.out.println("Fermeture du programme.");
                    break;

                default:
                    System.out.println("Choix invalide.");
                    break;
            }
        }

        scanner.close();
    }
}
