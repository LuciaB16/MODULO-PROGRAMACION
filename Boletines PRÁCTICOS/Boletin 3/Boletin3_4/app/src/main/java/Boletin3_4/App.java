/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Boletin3_4;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        //System.out.println(new App().getGreeting());
        int eurosTotales, billetes100, billetes20, billetes5, monedas1;
        Scanner obxScaner= new Scanner (System.in);
        System.out.println("Teclea euros totales");
        eurosTotales= obxScaner.nextInt();
        
        billetes100= eurosTotales/100;
        billetes20= (eurosTotales%100)/20;
        billetes5= (eurosTotales%100%20)/5;
        monedas1= (eurosTotales%100%20%5);
        
        System.out.println("Desglose de "+eurosTotales+" euros="+"\n Billetes de 100="+billetes100+"\n Billetes de 20="+billetes20+"\n Billetes de 5="+billetes5+"\n Monedas de 1="+monedas1);
        
    }
}
