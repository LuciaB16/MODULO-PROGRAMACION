/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin8_6;

import java.util.Scanner;

public class Boletin8_6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Teclea numero de ventas");
        int ventas= sc.nextInt();
        System.out.println("Teclea el nombre");
        String nombre= sc.next();
        
        Articulo articulo1= new Articulo();
        articulo1.setNombre(nombre);
        articulo1.getNombre();
        articulo1.Ventas(ventas);
        }
  
    }
    
      
