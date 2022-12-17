/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinextracond_2;

import java.util.Scanner;

public class BoletinExtraCond_2 {

    public static void main(String[] args) {
        
        Scanner obx= new Scanner(System.in);
        System.out.println("Introduce el tipo de uva (A o B): ");
        String tipo=obx.next();
        System.out.println("Introduce el tamano de uva (1 o 2): ");
        int tamano=obx.nextInt();
        System.out.println("Introduce el precio: ");
        float precio=obx.nextFloat();
        
        Uvas obx1=new Uvas();
        obx1.setTipoUva(tipo);
        obx1.setTamano(tamano);
        obx1.setPrecio(precio);
        obx1.precioFinal();
        
    }
     
}
    


