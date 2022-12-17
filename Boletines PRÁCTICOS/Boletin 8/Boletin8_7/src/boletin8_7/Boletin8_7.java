/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin8_7;

import java.util.Scanner;

public class Boletin8_7 {

    public static void main(String[] args) {
        
        String menu= "Elige una opcion";
        String opcion1 = "1. Cuadrado";
        String opcion2 = "2. Triangulo";
        String opcion3 = "3. Circulo";
        String pedirLado = "Introduce el lado";
        String pedirBase = "Introduce la base";
        String pedirAltura = "Introduce la altura";
        String pedirRadio = "Introduce el radio";
     

        System.out.println(menu);
        System.out.println(opcion1);
        System.out.println(opcion2);
        System.out.println(opcion3);

        Scanner obx = new Scanner(System.in);
        int figura = obx.nextInt();

        switch (figura) {
            case 1:
                System.out.println(pedirLado);
                float lado = obx.nextFloat();
                
                Cuadrado cuad = new Cuadrado();
                cuad.setLado(lado);
                System.out.println("El area del cuadrado es=" + cuad.calcularArea());
                break;
            case 2:
                System.out.println(pedirBase);
                float base = obx.nextFloat();
                System.out.println(pedirAltura);
                float altura = obx.nextFloat();
                
                Triangulo tri = new Triangulo();
                tri.setBase(base);
                tri.setAltura(altura);
                System.out.println("El area del triangulo es=" + tri.calcularArea());
                break;
            case 3:
                System.out.println(pedirRadio);
                float radio = obx.nextFloat();
                
                Circulo circ = new Circulo();
                circ.setRadio(radio);
                System.out.println("El area del circulo es=" + circ.calcularArea());
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
    
}
