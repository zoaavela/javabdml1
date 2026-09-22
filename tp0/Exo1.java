/*
 * TP0 - Exo2
 * Nom : ABDI Enzo
 * Groupe : BDML1
 * Rôle : 
 * Date : 22/09/2026
 */
package com.mycompany.exo1;

import java.util.Scanner;

/**
 *
 * @author enzoo
 */
public class Exo1 {

    public static void main(String[] args) {
	// Premier affichage demandé dans le sujet
        //System.out.println("Bonjour");
        
	// Initialisation de l'outil de lecture clavier
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
	
	// Saisie du prénom au clavier
        System.out.println("Bonjour quel est votre prénom ?");
        prenom = sc.nextLine();

	// Message personnalisé final
        System.out.println("Salut "+prenom+" !");
    }
}
