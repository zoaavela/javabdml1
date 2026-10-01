/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

/**
 *
 * @author enzoo
 */
public class Produit {

    //attributs 
    private int id;
    private String nom;
    private double prix;
    private int quantite;

    //constructeur
    public Produit(int id, String nom, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    //getters
    public int getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public double getPrix() {
        return this.prix;
    }

    public int getQuantite() {
        return this.quantite;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    //méthodes 
    public void afficherDetails() {
        System.out.println("ID: " + this.id + " | Nom: " + this.nom + " | Prix: " + this.prix + "EUR | Quantite: " + this.quantite);
    }
}
