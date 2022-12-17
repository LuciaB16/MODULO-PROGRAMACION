/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin17;

import javax.swing.JOptionPane;

public class Boletin17 {

    public static void main(String[] args) {
        Evaluacion pe = new Evaluacion();
        float mediaPruebaEscrita = pe.calcularNotaEscrita();
        float mediaPruebaPractica = pe.calcularNotaPractica();
        float mediaBoletines = pe.calcularNotaBoletines();
        float notaFinal = mediaPruebaEscrita + mediaPruebaPractica + mediaBoletines;
        
        JOptionPane.showMessageDialog(null, "Nota 1ª prueba escrita= " + pe.getNotaEsc1() + "\nNota 2ª prueba escrita= " 
        + pe.getNotaEsc2() + "\nMedia pruebas escritas= " + mediaPruebaEscrita + "\nNota prueba practica= " + pe.getNotaPract() + 
        "\nMedia prueba practica= " + mediaPruebaPractica + "\nMedia boletines= " + pe.getNotaBoletines()+ 
        "\nTu nota final es= " + notaFinal);
    }

}
