/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin16;

public class Boletin16 {

    public static void main(String[] args) {
       Persoa per= new Persoa("Lu","Balsa", "35488028V");
       
              
       Conta cont= new Conta(2445353,per);
       cont.ingresar(200);
       System.out.println(cont.getSaldo());
       
       CuentaAhorro cont1= new CuentaAhorro(3.5,200,cont.getNumeroConta(),per);
       cont1.ingresar(500);
       cont1.retirar(100);
       cont1.actualizarSaldo();
       System.out.println(cont1.toString());
    }
    
}
