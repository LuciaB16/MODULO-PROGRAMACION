/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7_4;

public class Boletin7_4 {

    public static void main(String[] args) {
        Persona persona1= new Persona("Lucia",69f);
        Persona persona2= new Persona("Esther",58f);
       
        if (persona1.getPeso()> persona2.getPeso())
            System.out.println("Nombre:" + persona1.getNombre()+"\n Peso:" + persona1.getPeso());
        else
            System.out.println("Nombre:" + persona2.getNombre()+ "\n Peso:" + persona2.getPeso());
        
        System.out.println("La diferencia de peso es=" + (Math.abs((persona1.getPeso())-(persona2.getPeso()))));
      
        
    }
    
}
