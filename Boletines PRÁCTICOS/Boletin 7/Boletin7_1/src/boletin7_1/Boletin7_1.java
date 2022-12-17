/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7_1;

import javax.swing.JOptionPane;

public class Boletin7_1 {

    public static void main(String[] args) {
        Numero numero1= new Numero();
        double respuesta= Integer.parseInt(JOptionPane.showInputDialog("Teclea o numero"));
        numero1.NumeroPositivo(respuesta);
                
       
        
    }
    
}
