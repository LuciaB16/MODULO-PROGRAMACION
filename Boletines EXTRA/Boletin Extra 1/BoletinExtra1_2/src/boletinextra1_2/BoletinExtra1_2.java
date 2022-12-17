/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinextra1_2;

import java.util.Scanner;

public class BoletinExtra1_2 {

    public static void main(String[] args) {
        float a,b,c,X,Y;
        Scanner sc= new Scanner (System.in);
        System.out.println("Teclea coeficiente a");
        a= sc.nextFloat();
        System.out.println("Teclea coeficiente b");
        b= sc.nextFloat();
        System.out.println("Teclea coeficiente c");
        c= sc.nextFloat();
        System.out.println("Teclea valor X");
        X= sc.nextFloat();
        
        Y= (float) (a*Math.pow(X, 2)+ b*X+c);
        
        System.out.println("Elvalor de Y="+Y);
    }
    
}
