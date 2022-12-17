/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin6_1;

public class Boletin6_1 {

    public static void main(String[] args) {
       
         Coche coche1= new Coche();
      coche1.setVelocidade(98);
        System.out.println("La velocidad actual es de:"+ coche1.getVelocidade());
      coche1.acelerar(20);
        System.out.println("La velocidad actual despues de acelerar es:"+coche1.getVelocidade());
      coche1.frenar(10);
        System.out.println("La velocidad actual despues de frenar es:"+coche1.getVelocidade());
        
    }
}
    

