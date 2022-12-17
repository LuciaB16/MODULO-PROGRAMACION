/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin4;


public class Boletin4 {

   
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setTitulo("ABCD");
        libro1.setAutor("abcd");
        libro1.setAno(1987);
        libro1.setNumPaginas((short)256);
        libro1.setValoracion(7.5f);
        libro1.amosar();
        
        Libro libro2 = new Libro("EFGH","efgh",1856,(short)345);
        libro2.amosar();
    }
    
}
