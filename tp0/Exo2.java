/*
 * TP0 - Exo2
 * Nom : ABDI Enzo
 * Groupe : BDML 1
 * Rôle : Calcule et affiche la somme des N premiers entiers
 * Date : 22/09/2026
 */

package com.mycompany.exo2;

import java.util.Scanner;



/**
 *
 * @author enzoo
 */
public class Exo2 {

    public static void main(String[] args) {
        int nb;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n  Entrez le nombre :");
        nb=sc.nextInt();
        int result;
        int ind;
        result=0;
        
        ind=1;
        while (ind <= nb) {
            result = result + ind;
            //ind++; // incrémentation de ind et non de result sinon boucle infinie
        }
        
        System.out.println();
        System.out.println("La somme des "+nb+" entiers est: "+result);
    }
}
