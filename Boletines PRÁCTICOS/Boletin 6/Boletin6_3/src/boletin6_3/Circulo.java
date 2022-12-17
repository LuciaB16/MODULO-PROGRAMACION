/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin6_3;


public class Circulo {
    //atributos
    private double radio;
    public static final double PI = 3.14;
    
    
  //constructores
    public Circulo(){
       
    }
    
    public Circulo(double r){
        radio=r;
    }
    
    //getters y setters
    public void setRadio(double r){
        radio=r;
    }
    
    public double getRadio(){
        return radio;
    }
    
    
    //metodos
    public double calcularArea(){
        double area;
        area= PI* Math.pow(radio, 2);
        return area;
    }
    
    public double calcularLonxitude(){
        double lonxitude;
        lonxitude= 2*PI*radio;
        return lonxitude; //return 2*PI*radio
    }
}
