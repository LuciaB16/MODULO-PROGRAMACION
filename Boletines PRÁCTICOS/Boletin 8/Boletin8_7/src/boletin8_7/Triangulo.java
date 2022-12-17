/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin8_7;

public class Triangulo {
    private float base;
    private float altura;

    public Triangulo() {
    }

    
    public void setBase(float base) {
        this.base = base;
    }
    
    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    public float calcularArea() {
        float area=  base * altura / 2;
        return area;  
       
}
}
