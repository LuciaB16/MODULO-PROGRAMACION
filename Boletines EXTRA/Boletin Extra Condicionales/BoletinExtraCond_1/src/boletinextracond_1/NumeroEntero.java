/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinextracond_1;

public class NumeroEntero {
    
public NumeroEntero (){
    
}
    
public void verNumero(int num){
        if ((num>=0)&(num<=9))
            System.out.println("Tiene una cifra");
        else if ((num>=10)&(num<=99))
                System.out.println("Tiene dos cifras");
             else if ((num>=100)&(num<=999))
                     System.out.println("Tiene tres cifras");
                  else if ((num>=1000)&(num<=9999))
                           System.out.println("Tiene cuatro cifras");
                       else if ((num>=10000)&(num<=99999))
                               System.out.println("Tiene cinco cifras");
                            else
                                System.out.println("Error");
    }
    
}
