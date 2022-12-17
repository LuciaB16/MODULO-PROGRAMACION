/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {

    public static final int CONV=1852;
    public static void main(String[] args) {
        // Programa que pase millas mariñas a metros
        double millas,metros;
        Scanner obxScaner= new Scanner (System.in);
        System.out.println("Teclea millas");
        millas= obxScaner.nextDouble(); //leer o meter al objecto scanner
        
        metros= millas*CONV;
        
        System.out.println(millas+ " millas son "+ metros+ " metros");
    }
    
}
