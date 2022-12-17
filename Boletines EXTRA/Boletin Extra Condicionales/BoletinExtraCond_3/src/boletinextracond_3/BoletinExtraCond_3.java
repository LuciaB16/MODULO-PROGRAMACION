/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinextracond_3;

import java.util.Scanner;

public class BoletinExtraCond_3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Teclea numero de alumnos");
        int alumno= sc.nextInt();
        
        Dinero din= new Dinero();
        din.precio(alumno);
        
                
    }
    
}
