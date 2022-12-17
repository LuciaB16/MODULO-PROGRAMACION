/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin14;

import com.Lucia.Partes.Cpu;
import com.Lucia.Partes.Monitor;
import com.Lucia.Partes.Teclado;

public class Boletin14 {

    public static void main(String[] args) {
        
        Ordenador obx= new Ordenador(new Monitor(22.3f),new Teclado("Asus"), new Cpu(290),650f);
        System.out.println("Las caracteristicas del ordenador son:" +obx.toString());       
        
        System.out.println("El precio del ordenador es:" +obx.getPrecio());
        
        System.out.println("La marca del teclado es:" +obx.getTe());
        
        System.out.println("La velocidad de la Cpu es:" +obx.getPro());
    }
    
}
