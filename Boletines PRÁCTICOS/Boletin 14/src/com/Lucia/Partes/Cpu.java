/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Lucia.Partes;

public class Cpu {
    private int velocidade;
    
    public Cpu(){
    }

    public Cpu(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    @Override
    public String toString() {
        return "velocidade=" + velocidade;
    }
    
    
}
