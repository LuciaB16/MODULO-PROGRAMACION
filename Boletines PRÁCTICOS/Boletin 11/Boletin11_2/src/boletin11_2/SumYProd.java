/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11_2;

import javax.swing.JOptionPane;

public class SumYProd {
   
    public void operaciones(){
        int suma=0;
        long producto=1;
         for(int i=10;i<=90;i++){
                     
            suma=suma+i;
            producto= producto*i;
          }
   
        JOptionPane.showMessageDialog(null, "Suma=" + suma + "\n Producto=" + producto);
    
    }
}
    
    
    
    

