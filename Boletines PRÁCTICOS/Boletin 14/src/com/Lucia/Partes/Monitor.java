/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Lucia.Partes;

public class Monitor {
    private float pulgadas;      

    public Monitor(){
    }

    public Monitor(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public float getPulgadas() {
        return pulgadas;
    }
    
    @Override
    public String toString() {
        return "pulgadas=" + pulgadas;
    }

}
