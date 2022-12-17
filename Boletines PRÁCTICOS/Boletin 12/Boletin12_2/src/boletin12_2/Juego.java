/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin12_2;

import javax.swing.JOptionPane;

public class Juego {

    int numAdivinar = (int) (Math.random() * 50 + 1);
    int numPropuesto;

    public void jugar() {
       
        int intento= Integer.parseInt(JOptionPane.showInputDialog("Teclea numero intentos"));
       
        for (int i = 1; i <= intento; i++) {
            numPropuesto = pedirEntero("Adivina el numero");
          
            if (numPropuesto == numAdivinar) {
                JOptionPane.showMessageDialog(null, "Acertaste");
                break;
            }
                else if (intento==i){
                 JOptionPane.showMessageDialog(null, "Se acabaron los intentos");
                break;
                } 
                    else if ((numPropuesto-numAdivinar)>20) {
                     JOptionPane.showMessageDialog(null, "Muy lejos");
                     } 
                         else if ((numPropuesto-numAdivinar)>=10 && ((numPropuesto-numAdivinar)<=20)) {
                          JOptionPane.showMessageDialog(null, "Lejos");
                         }
                             else if ((numPropuesto-numAdivinar)>10 && ((numPropuesto-numAdivinar)<5)) {
                              JOptionPane.showMessageDialog(null, "Cerca");
                              }
                                 else if ((numPropuesto-numAdivinar)<=5) {
                                  JOptionPane.showMessageDialog(null, "Muy cerca");
                                 }

        }

    }

    public static int pedirEntero(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
  }


