/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin8_7;

public class Cuadrado {
    private float lado;

   
    public Cuadrado() {
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
     
    public float getLado() {
        return lado;
    }

    public float calcularArea() {
        float area = lado * lado;
        return area;
    }
}
