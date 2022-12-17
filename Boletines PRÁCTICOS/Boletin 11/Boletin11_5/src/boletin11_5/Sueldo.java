/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11_5;

import java.util.Scanner;

public class Sueldo {
    public float sueldo;
    public int trabajadoresSueldo1 = 0;
    public int trabajadoresSueldo2 = 0;
    public int totalTrabajadores = 0;

    public void clasificarSueldo() {
        do {
            Scanner obx = new Scanner(System.in);
            System.out.println("Introduce el sueldo del trabajador; si escribes 0 se acaba el programa");
            sueldo = obx.nextFloat();
            
            if (sueldo > 0) {
                totalTrabajadores++;
                
                if (sueldo >= 1000 && sueldo <= 1750) {
                    trabajadoresSueldo1 = trabajadoresSueldo1 +1;
                    
                } else if (sueldo <= 1000) {
                    trabajadoresSueldo2 = trabajadoresSueldo2 +1;
                }
            }

        } while (sueldo != 0);

        float porcentaje = (float) (trabajadoresSueldo1 / (float) totalTrabajadores) * 100;
        System.out.println("Hay " + trabajadoresSueldo1 + " trabajador/es con sueldo entre 1000 y 1750 euros");
        System.out.println("Hay " + trabajadoresSueldo2 + " trabajador/es con sueldo inferior a 1000 euros");
        System.out.println("El porcentaje de trabajadores que tienen un sueldo por debajo de los 1000 euros es: " + porcentaje + " %");
}
}

