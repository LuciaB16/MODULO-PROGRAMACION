/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinextracond_1;

import java.util.Scanner;

public class BoletinExtraCond_1 {

    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
        System.out.println("Introduce numero");
        int num= sc.nextInt();
        
       NumeroEntero Numero= new NumeroEntero();
       Numero.verNumero(num);
    }
    
}
