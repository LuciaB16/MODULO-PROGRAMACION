/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin15;

import javax.swing.JOptionPane;

public class Boletin15 {

    public static void main(String[] args) {
        /*Película pel= new Película();
        System.out.println(pel.toString());
        
        Disco disc= new Disco();
        System.out.println(disc.toString());*/
        
      Película peli= new Película();
      peli.setActorPrincipal(pedirDatos("Escribe el nombre del actor principal"));
      peli.setActrizPrincipal(pedirDatos("Escribe el nombre de la actriz principal"));
      peli.setTitulo(pedirDatos("Escribe el titulo"));   
      peli.setAutor(pedirDatos("Escribe el nombre del autor"));
      peli.setFormato(pedirDatos("Escribe el formato"));
      peli.setDuracion(Integer.parseInt(pedirDatos("Escribe la duracion")));
      JOptionPane.showMessageDialog(null, peli.toString());
    }
    public static String pedirDatos(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
        
    }
     
    }

