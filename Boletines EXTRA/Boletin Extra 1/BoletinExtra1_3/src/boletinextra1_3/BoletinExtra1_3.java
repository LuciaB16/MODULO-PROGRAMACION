/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinextra1_3;

import java.util.Scanner;

public class BoletinExtra1_3 {

    public static void main(String[] args) {
        
        float a,b,c,X;
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduce valor de a");
        a= sc.nextFloat();
        System.out.println("Introduce valor de b");
        b= sc.nextFloat();
        System.out.println("Introduce valor de c");
        c= sc.nextFloat();
        
        float X1= (float) (((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
        System.out.println("Primer resultado es= " + X1);
       
        float X2= (float) (((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
        System.out.println("Segundo resultado es= " + X2);
        
    }
    
}
