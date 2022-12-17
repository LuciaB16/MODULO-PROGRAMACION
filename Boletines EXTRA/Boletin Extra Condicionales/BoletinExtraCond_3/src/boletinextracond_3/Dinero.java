/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinextracond_3;

public class Dinero {
    public int alumno;
    public double precioBus65= 65;
    public double precioBus70=70;
    public double precioBus95= 95;
    
    public Dinero(){
        
    }

    public void setAlumno(int alumno) {
        this.alumno = alumno;
    }

    public int getAlumno() {
        return alumno;
    }
    
     
    
    public void precio(int alumno){
        if(alumno>=100)
            System.out.println("Precio por alumno de 65 euros y el precio del autobus es de " + (alumno*precioBus65)+ " euros");
        else if((alumno>=50)&(alumno<=99))
                 System.out.println("Precio por alumno de 70 euros y el precio del autobus es de " + (alumno*precioBus70) + " euros");
            else if((alumno>=30)&(alumno<=49))
                    System.out.println("Precio por alumno de 95 euros y el precio del autobus es de " + (alumno*precioBus95)+ "200euros");
                else
                    System.out.println("Precio del autobus es de 4000 euros y por alumno es de: " + (4000/alumno));
    }
}
