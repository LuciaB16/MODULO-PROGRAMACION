/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin6_3;


public class Boletin6_3 {

 
    public static void main(String[] args) {
        Circulo circulo1= new Circulo();
        circulo1.setRadio(5);
        circulo1.calcularArea();
        double resultado= circulo1.calcularArea();
        System.out.println("El area es igual a " +resultado);
        circulo1.calcularLonxitude();
        double resultado2= circulo1.calcularLonxitude();
        System.out.println("La longitud es igual a " +resultado2);
        
        Circulo circulo2= new Circulo(21);
        circulo2.calcularArea();
        double resultado3= circulo2.calcularArea();
        System.out.println("El area es igual a " +resultado3);
        circulo2.calcularLonxitude();
        double resultado4= circulo2.calcularLonxitude();
        System.out.println("La longitud es igual a " +resultado4);
    }
    
}
