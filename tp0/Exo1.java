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
        //System.out.println("Bonjour");
        
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour quel est votre prénom ?");
        prenom = sc.nextLine();
        System.out.println("Salut "+prenom+" !");
    }
}
