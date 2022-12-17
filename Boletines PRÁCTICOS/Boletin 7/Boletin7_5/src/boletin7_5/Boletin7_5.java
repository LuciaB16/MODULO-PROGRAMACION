/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7_5;

import java.util.Scanner;

public class Boletin7_5 {

     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Teclea el primer numero");
         float num1= sc.nextFloat();
         System.out.println("Teclea el segundo numero");
         float num2= sc.nextFloat();
         System.out.println("Teclea el tercer numero");
         float num3= sc.nextFloat();
         
         Numeros numMayor= new Numeros();
         numMayor.mayor(num1, num2, num3);
         
         
         
    }
    
}
