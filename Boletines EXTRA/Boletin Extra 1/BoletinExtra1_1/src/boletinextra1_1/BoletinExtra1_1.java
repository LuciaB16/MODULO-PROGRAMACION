/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinextra1_1;

import java.util.Scanner;

public class BoletinExtra1_1 {

    public static void main(String[] args) {
        float baseImponible,IVA, IVACorrespondiente, Total;
        Scanner obxScaner= new Scanner (System.in);
        System.out.println("Introduce base imponible");
        baseImponible= obxScaner.nextFloat();
        System.out.println("Introduce IVA");
        IVA= obxScaner.nextFloat();
        
        IVACorrespondiente= baseImponible* (IVA/100);
        Total= baseImponible+ IVACorrespondiente;
        
        System.out.println("El precio total="+Total+" euros");
    }
    
}
