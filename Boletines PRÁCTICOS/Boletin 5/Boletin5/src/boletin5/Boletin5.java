/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5;

public class Boletin5 {

    public static void main(String[] args) {
        Consumo consume= new Consumo ();
        consume.setLitros(50f);
        consume.setPrezoGas(1.57f);
   
        Consumo consumo1= new Consumo(1545,56,110, 1.85f);
        System.out.println("EL consumo medio es:"+ consumo1.consumoMedio());
        
        consumo1.setLitros(150f);
        
        System.out.println("La velocidad media es:"+consumo1.getVelocidadeMedia());
    }
  }
    

