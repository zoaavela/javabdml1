/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

/**
 *
 * @author enzoo
 */
public class Client {

    //attributs 
    private int id;
    private String nom;
    private String email;

    //constructeur
    public Client(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    //getters
    public int getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public String getEmail() {
        return this.email;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //méthodes 
    public void afficherDetails() {
        System.out.println("Client ID: " + this.id + " | Nom: " + this.nom + " | Email: " + this.email);
    }
}
