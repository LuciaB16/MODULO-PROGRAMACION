/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Boletin3_5;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
       //System.out.println(new App().getGreeting());
        double sueldoFijo,importeVentas,numKm,numDias,sueldoBruto,sueldoLiquido;
        Scanner obxScaner= new Scanner (System.in);
        System.out.println("Teclea sueldo fijo");
        sueldoFijo= obxScaner.nextDouble();
        System.out.println("Teclea importe de ventas");
        importeVentas= obxScaner.nextDouble();
        System.out.println("Teclea numero de km");
        numKm= obxScaner.nextDouble();
        System.out.println("Teclea numero de dias");
        numDias= obxScaner.nextDouble();
               
             
        sueldoBruto= sueldoFijo+(0.05*importeVentas)+(2*numKm)+ (30*numDias);
           
   
        sueldoLiquido= sueldoBruto- ((0.18*sueldoBruto)+36);
        
        System.out.println("El sueldo bruto es="+sueldoBruto+ " y el sueldo liquido es de=" +sueldoLiquido);
        
    }
  }

