/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11_1;

import javax.swing.JOptionPane;

public class Num {
    
    public void numFor(){
        int num,AcPositivo=0,AcNegativo=0,AcCero=0;
        for(int i=0;i<10;i++){
            num= pedirEntero();
            
            if(num>0)
               AcPositivo=AcPositivo+1;
              
             else if(num==0)
                   AcCero=AcCero+1;
               
                else
                 AcNegativo=AcNegativo+1;
            }
        JOptionPane.showMessageDialog(null, "Cantidad de positivos=" + AcPositivo +"\n cantidad de negativos=" + AcNegativo + "\n cantidad de ceros=" + AcCero);
        }
    
    
    public static int pedirEntero(){
      return Integer.parseInt(JOptionPane.showInputDialog("Teclea el numero"));
        
    }
    
}
