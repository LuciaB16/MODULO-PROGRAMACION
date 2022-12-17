/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin8_6;

public class Articulo {
    private String nombre;
 

public Articulo(){
    
}

public Articulo(String nombre){
    this.nombre=nombre;
}

public void setNombre(String nombre){
    this.nombre=nombre;
}

public String getNombre(){
    return nombre;
}

public void Ventas (int ventas){
        if (ventas<=100)
                System.out.println("Es articulo de consumo bajo");
        else if ((ventas>100)&(ventas<=500))
                System.out.println("es articulo de consumo medio");
             else if ((ventas>500)&(ventas<=1000))
                System.out.println("Es articulo de consumo alto");
                  else
                 System.out.println("Es articulo de primera necesidad");

}
}