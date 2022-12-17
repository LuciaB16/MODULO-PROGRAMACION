/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {
        // Programa que calsule la suma, resta, producto y cociente de dos numeros
        float num1, num2;
        Scanner obxScaner = new Scanner (System.in);
        System.out.println(" Teclea num1");
        num1= obxScaner.nextFloat();
        System.out.println(" Teclea num2");
        num2= obxScaner.nextFloat();
        float suma,resta,producto,cociente;
        suma= num1+num2;
        resta= num1-num2;
        producto= num1*num2;
        cociente= num1/num2;
        System.out.println("suma="+suma+"\n resta="+resta+ "\n producto="+producto+ "\n cociente=" +cociente);
    }
    
}
