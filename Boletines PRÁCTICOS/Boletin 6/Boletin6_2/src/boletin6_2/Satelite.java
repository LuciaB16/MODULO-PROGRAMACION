/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin6_2;


public class Satelite {
    //atributos
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;

    //constructores
public Satelite(){
    //tb estaria bien meridiano=paralelo=distanciaTerra=0, siempre de derecha a izquierda: distancia=0,por lo tanto paralelo=0,etc
    meridiano=0;
    paralelo=0;
    distanciaTerra=0;
}

public Satelite(double m, double p, double d){
    meridiano= m;
    paralelo= p;
    distanciaTerra= d;
}
//metodos getters y setters, no harian falta pq trabajo con el parametrizado para darle valores, pero solo podria usarlo una vez, si hago otro seria con getters y setters
public void setMeridiano(double m){
    meridiano=m;  
}

public void setParalelo(double p){
    paralelo=p;
}

public void setDistanciaTerra(double d){
    distanciaTerra=d;
}

public double getMeridiano(){
    return meridiano;
}

public double getParalelo(){
    return paralelo;
}

public double getDistanciaTerra(){
    return distanciaTerra;
}

public void verPosicion(){
    System.out.println("O satelite atopase no paralelo "+ paralelo +" ,meridiano " + meridiano+ " e a unha distancia da terra de " + distanciaTerra);
}
}
