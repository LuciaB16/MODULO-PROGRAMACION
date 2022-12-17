/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin12_1;

import javax.swing.JOptionPane;

public class Adivinar {
    
    public void adivinarNum(){ 
        int numPropuesto= Integer.parseInt(JOptionPane.showInputDialog("Teclea numero a adivinar"));
        int intento= Integer.parseInt(JOptionPane.showInputDialog("Teclea numero de intentos"));
        int numJug2=Integer.parseInt(JOptionPane.showInputDialog("Empieza el juego"));
       
     
        
        for(int i=1;i<=intento;i++){
           
           if (numPropuesto==numJug2){
         JOptionPane.showMessageDialog(null, "Acertaste");
       break;
           
           }  
           else if(i==intento)
             JOptionPane.showMessageDialog(null, "Se acabaron los intentos");
       
                else if(numPropuesto>numJug2)
         numJug2= Integer.parseInt(JOptionPane.showInputDialog("El numero a adivinar es mayor"));
               
       
            else if (numPropuesto<numJug2)
            numJug2= Integer.parseInt(JOptionPane.showInputDialog("El numero a adivinar es menor"));
       
     
        
            }
                      
        }             

}
