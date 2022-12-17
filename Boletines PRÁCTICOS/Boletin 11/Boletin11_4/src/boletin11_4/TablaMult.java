/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11_4;

import java.util.Scanner;

public class TablaMult {
    
    public void Tablas(){
        Scanner obx = new Scanner (System.in);
        System.out.println("Teclea un numero");
        int numero= obx.nextInt();
        
        while (numero!=0){
            System.out.println("La tabla de multiplicar correspondiente es:");
        
            for (int i=0; i<11; i++){
                System.out.println(numero + "x" + i + "=" + numero*i);
            }
            
            System.out.println("Teclea un numero");
            numero = obx.nextInt();
            
       }              
    }
}
