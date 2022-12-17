/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinextra2;

public class BoletinExtra2 {

    
    public static void main(String[] args) {
     
        Cuenta obx =new Cuenta();
        obx.setNombre("Lucia");
        obx.setCuenta("12345");
        obx.setTipoInterese(0);
        obx.setSaldo(1500);
        System.out.println("El titular de la cuenta es: " + obx.getNombre() + ", el numero de cuenta es: " + obx.getCuenta() + ", el tipo de interes es de: " + obx.getTipoInterese()
        + " y el saldo es de: " + obx.getSaldo());
        
        Cuenta obx1= new Cuenta("Esther","67890",0, 1700);
        System.out.println("El titular de la cuenta es: " + obx1.getNombre() + ", el numero de cuenta es: " + obx1.getCuenta() + ", el tipo de interes es de: " + obx1.getTipoInterese()
        + " y el saldo es de: " + obx1.getSaldo());
        
        obx.transferencia(obx1, 50);
        System.out.println("Se realiza una transferencia de 50 euros");
        
        System.out.println("El saldo actual de la cuenta de " + obx.getNombre() + " es de: " +obx.getSaldo() );
        System.out.println("El saldo actual de la cuenta de " + obx1.getNombre() + " es de: " +obx1.getSaldo() );
        
    }
}
