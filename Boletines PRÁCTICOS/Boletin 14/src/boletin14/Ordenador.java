/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin14;

import com.Lucia.Partes.Cpu;
import com.Lucia.Partes.Monitor;
import com.Lucia.Partes.Teclado;

public class Ordenador {
    private Monitor mo;
    private Teclado te;
    private Cpu pro;
    private float precio;
    
    public Ordenador(){
    }
    
    public Ordenador(Monitor mo,Teclado te,Cpu pro,float precio){ 
        this.mo=mo;
        this.te=te;
        this.pro= pro;
        this.precio=precio;
    }

    public void setMo(Monitor mo) {
        this.mo = mo;
    }

    public void setTe(Teclado te) {
        this.te = te;
    }

    public void setPro(Cpu pro) {
        this.pro = pro;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Monitor getMo() {
        return mo;
    }

    public Teclado getTe() {
        return te;
    }

    public Cpu getPro() {
        return pro;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "mo=" + mo + ", te=" + te + ", pro=" + pro + ", precio=" + precio;
    }
    
    
    
}
