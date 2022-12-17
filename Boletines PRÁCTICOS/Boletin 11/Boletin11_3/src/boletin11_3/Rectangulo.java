/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11_3;

import javax.swing.JOptionPane;

public class Rectangulo {
    
    public void areaRectangulo(){
       int base, altura;
       //double area;
       
       do{
           base=pedirBase();
        } while (base<=0); 
       
        do{
           altura=pedirAltura();
        } while (altura<=0); 
       JOptionPane.showMessageDialog(null, "El area es=" +(base*altura));
              
    }
    
    public static int pedirBase(){
      return Integer.parseInt(JOptionPane.showInputDialog("Teclea la base"));
    }
     
   public static int pedirAltura(){
      return Integer.parseInt(JOptionPane.showInputDialog("Teclea la altura"));
}
}