/*
 * TP0 - Exo2
 * Nom : ABDI Enzo
 * Groupe : BDML 1
 * Rôle : Créer une calculatrice
 * Date : 22/09/2026
 */
package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author enzoo
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Please entre the operator : \n1) add\n2) substract\n3) multiply\n4) divide\n5) modulo");
        int operator = sc.nextInt();
        if (operator < 1 || operator > 5) {
            System.out.println("L'opérateur n'est pas valide.");
            System.exit(0);
        }

        System.out.println("Please enter the first number:");
        int operande1 = sc.nextInt();

        System.out.println("Please enter the second number:");
        int operande2 = sc.nextInt();
        
        int resultat = 0;
        switch(operator){
            case 1:
                resultat = operande1 + operande2;
                break;
            case 2:
                resultat = operande1 - operande2;
                break;
            case 3:
                resultat = operande1 * operande2;
                break;
            case 4:
                if(operande2==0){
                    System.out.println("Error : division by zero");
                    System.exit(0);
                }
                resultat = operande1 / operande2;
                break;
            case 5:
                if(operande2 == 0){
                    System.out.println("Error: modulo bu zero");
                    System.exit(0);
                }
                resultat = operande1 % operande2;
                break;
        }
        System.out.println("The result is: "+ resultat);
    
    }
}
