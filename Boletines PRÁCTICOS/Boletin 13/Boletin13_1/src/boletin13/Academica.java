/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin13;

import com.Lucia.PaqueteA.Persoal;
import javax.swing.JOptionPane;


public class Academica {
   
    public static int numReferencia=2018;
    private String nome;
    private int nota;
    private Persoal alum;//=new Persoal();
    
    
    public Academica(){
        numReferencia++;
    }
    
    /*public Academica(String nome, int nota, String tel,String correo){
        numReferencia= getNumReferencia();
        
       
        this.nome=nome;
        this.nota=nota;
        alum.setTelefono(tel);
        alum.setCorreo(correo);
    }*/
    public Academica(String nome, int nota, Persoal alum){
        
        Academica.numReferencia +=1;
        this.nome=nome;
        this.nota=nota;
        this.alum=alum;
    }

    public static int getNumReferencia(){
        return numReferencia;
    }

    public static void setNumReferencia(int numReferencia){
    Academica.numReferencia= numReferencia;
    }
    
    public String getNome(){
        return nome;
    }
   
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setNota(int nota){
        this.nota=nota;
    }
  
    public int getNota(){
        return nota;
    }
    
    public void setAlum(Persoal alum){
        this.alum=alum;
    }
    public Persoal getAlum(){
        return alum;
    }
     
    @Override
    public String toString() {
        return "nome=" + nome + ", nota= " + nota + ",alum= " + alum;
    }
       
    
    /*public void amosar(){
        System.out.println(toString());
    }
    public void ver(){
        System.out.println("numReferencia: "+ numReferencia+" nome: "+nome+"nota:" +nota+ "tf:"+ alum.getTelefono()+"corrreo:"+ alum.getCorreo());
   }*/
    public int validarNota(){
        do{
            nota= Integer.parseInt(JOptionPane.showInputDialog("Teclea nota entre 0 y 10"));
      
    }while(nota<0|| nota>10);
        return nota;
    }
}  

