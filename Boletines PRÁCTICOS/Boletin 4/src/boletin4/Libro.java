/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin4;


public class Libro {
    //atributos
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    
    //constructores
    public Libro (){
        
    }
    
    public Libro (String tit, String aut, int an, short nPag){
    titulo = tit;
    autor = aut;
    ano = an;
    numPaginas = nPag;
    }

//metodos de acceso 
    //setters
      public void setTitulo (String tit) {
        titulo = tit;
    }
    
      public void setAutor (String aut) {
        autor = aut;
    }
    
      public void setAno (int an) {
        ano = an;
    }
    
      public void setNumPaginas (short nPag){
        numPaginas = nPag;
    }
    
      public void setValoracion (float val) {
         valoracion = val;
    }
    
    //getters
    public String getTitulo () {
        return titulo;
    }
        
    public String getAutor (){
        return autor;
    }
   
    public int getAno () {
        return ano;
    }
        
    public short getNumPaginas (){
        return numPaginas;
    }
        
    public float getvaloracion (){
        return valoracion;
    }
    

    //defino metodo
    public void amosar (){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("NumPaginas: " +numPaginas);
        System.out.println("Valoracion: " +valoracion);
     }
    
}

    