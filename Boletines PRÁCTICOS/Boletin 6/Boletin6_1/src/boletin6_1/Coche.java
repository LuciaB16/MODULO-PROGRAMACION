/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin6_1;

public class Coche {
     private int velocidade;
    
 public Coche(){
     velocidade= 0;
 }
 
 //metodos
 public void setVelocidade (int v){
     velocidade= v;
 }
 public int getVelocidade(){
     return velocidade;
 }
 
 public void acelerar(int valor){
     velocidade += valor;
 }
 
 public void frenar(int menos){
     velocidade -= menos;
 }
}