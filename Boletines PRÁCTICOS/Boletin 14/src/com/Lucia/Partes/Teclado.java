/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Lucia.Partes;

public class Teclado {
    private String marca;
    
    public Teclado(){
    }

    public Teclado(String marca) {
        this.marca = marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "marca=" + marca;
    }
    
    
}

