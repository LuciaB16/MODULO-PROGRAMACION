/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinextracond_2;

public class Uvas {
    
    private String tipoUva;
    private int tamano;
    private float precio;

    public void precioFinal() {
        if (tipoUva.toUpperCase().equals("A")) {
            
            if (tamano == 1) {
                System.out.println("Precio final = " + (precio + 0.20));
            }
            
            else if (tamano == 2) {
                System.out.println("Precio final = " + (precio + 0.30));
            } 
            
                else {
                    System.out.println("Error");
            }
        }  
       
        else if (tipoUva.toUpperCase().equals("B")) {
            
            if (tamano == 1) {
                System.out.println("Precio final = " + (precio - 0.30));
            }
            
            else if (tamano == 2) {
                System.out.println("Precio final = " + (precio - 0.50));
            } 
            
                else {
                    System.out.println("Error");
            }
        } 
        
        else {
            System.out.println("Error");
        }

    }

    public void setTipoUva(String tipoUva) {
        this.tipoUva = tipoUva;
    }

    public void setTamano(int tamano) {
        this.tamano= tamano;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
