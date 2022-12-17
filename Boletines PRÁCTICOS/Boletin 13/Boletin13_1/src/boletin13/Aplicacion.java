/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin13;

import com.Lucia.PaqueteA.Persoal;

public class Aplicacion {

    public static void main(String[] args) {
        Persoal per= new Persoal("111","aaa@");
        Academica obx1= new Academica("Lu",6,per);
        System.out.println(obx1.toString());
        /*visualizar solo el nombre del objeto1
        obx1.getNome();
        //visualizar solo el telefono del objeto1
        obx1.getAlum().getTelefono();*/
        
       /* Academica obx2= new Academica("bbb",9,"6666","bbb@");
        Academica ob3= new Academica("pepa",4,new Persoal ("333","ccc@"));
        Persoal al= new Persoal("111","aaa@");
        Academica obx= new Academica("aa",7,al);
        System.out.println(obx.toString());*/
    }
    
}
