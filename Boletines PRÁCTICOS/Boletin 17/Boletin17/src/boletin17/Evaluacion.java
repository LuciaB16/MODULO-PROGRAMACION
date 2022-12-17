/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin17;

import javax.swing.JOptionPane;

public class Evaluacion {
    
    private float notaEsc1;
    private float notaEsc2;
    private float notaPract;
    private float notaBoletines;

    public Evaluacion() {
    }

    public Evaluacion(float notaEsc1, float notaEsc2, float notaPract, float notaBoletines) {
        this.notaEsc1= notaEsc1;
        this.notaEsc2= notaEsc2;
        this.notaPract= notaPract;
        this.notaBoletines= notaBoletines;
    }

    public void setNotaEsc1(float notaEsc1) {
        this.notaEsc1 = notaEsc1;
    }

    public float getNotaEsc1() {
        return notaEsc1;
    }

    public void setNotaEsc2(float notaEsc2) {
        this.notaEsc2 = notaEsc2;
    }

    public float getNotaEsc2() {
        return notaEsc2;
    }

    public void setNotaPract(float notaPract) {
        this.notaPract = notaPract;
    }

    public float getNotaPract() {
        return notaPract;
    }

    public void setNotaBoletines(float notaBoletines) {
        this.notaBoletines = notaBoletines;
    }

    public float getNotaBoletines() {
        return notaBoletines;
    }
    
    
     public float calcularNotaEscrita() {
        notaEsc1 = validarNota("Teclea nota de la primera prueba escrita entre 0 y 10");
        notaEsc2= validarNota("Teclea nota de la segunda prueba escrita entre 0 y 10");
        float media = (notaEsc1 + notaEsc2) / 2 * 0.40f;

        return media;

    }

    public float calcularNotaPractica() {
        notaPract = validarNota("Teclea nota de la prueba práctica entre 0 y 10");
        float media = notaPract* 0.40f;

        return media;
    }

    public float calcularNotaBoletines() {
        float bolTotales = pedirNumero("Introduce numero total de boletines a entregar");
        float bolHechos = pedirNumero("Introduce el numero de boletines que hiciste");
        
            if (((bolHechos / bolTotales) * 100) > 90) {
            notaBoletines = 2;
            } 
               
                else if ((((bolHechos / bolTotales) * 100) >= 70) || (((bolHechos / bolTotales) * 100) <= 90)) {
                notaBoletines = 1;
                } 
                
                    else {
                    notaBoletines = 0;
                    }
        
            return notaBoletines;
    }

    public static float pedirNumero(String mensaje) {
        return Float.parseFloat(JOptionPane.showInputDialog(mensaje));
    }

    public float validarNota(String mensaje) {
        float nota;
        do {
            nota = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
            
        } while (nota < 0 || nota > 10);
        
        return nota;
    }
    
}
