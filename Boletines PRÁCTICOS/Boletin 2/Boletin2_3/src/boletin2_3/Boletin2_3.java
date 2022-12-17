/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {
        // Algoritmo que cambia euros a dolares
        double euros, dolares, cambio;
        Scanner obxScaner = new Scanner (System.in);
        System.out.println("Teclea euros");
        euros= obxScaner.nextDouble();
        System.out.println("Teclea cambio");
        cambio= obxScaner.nextDouble();
        
        dolares=euros*cambio;
        
        System.out.println(euros + " euros son "+ dolares + " dolares");
    }
    
}
