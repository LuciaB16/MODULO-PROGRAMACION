/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin6_2;


public class Boletin6_2 {

    
    public static void main(String[] args) {
        /*Esto sería usando el parametrizado
        Satelite obx1= new Satelite (2.3, 4, 7);
        obx1.verPosicion();
        */
        
        
        Satelite satelite1 = new Satelite();
        satelite1.setMeridiano(56);
        System.out.println("O satelite atopase no meridiano:"+ satelite1.getMeridiano());
        satelite1.setParalelo(89);
        System.out.println("O satelite atopase no paralelo:"+ satelite1.getParalelo());
        satelite1.setDistanciaTerra(5689);
        System.out.println("A distancia da Terra a que se atopa o satelite e:"+ satelite1.getDistanciaTerra());
        
        System.out.println(); satelite1.verPosicion();
    }
    
}
