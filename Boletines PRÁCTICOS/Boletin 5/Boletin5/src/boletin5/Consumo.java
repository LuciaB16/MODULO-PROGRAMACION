/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin5;

public class Consumo {
    
     //atributos
    float kilometros,litros, velocidadeMedia,prezoGas;
      
    //constructores
    public Consumo (){
        
    }
    
    public Consumo (float km, float lit, float vMed, float pGas){
        kilometros = km;
        litros = lit;
        velocidadeMedia = vMed;
        prezoGas = pGas;
    }
    
   //metodos de acceso
    //setters
        public void setKilometros (float km){
            kilometros = km;
        }
        
        public void setLitros (float lit){
            litros = lit;
        }
        
        public void setVelocidadeMedia (float vMed){
            velocidadeMedia = vMed;
        }
        
        public void setPrezoGas (float pGas){
            prezoGas = pGas;
        }
        
        
    //getters
        public float getKilometros (){
            return kilometros;
        }
        
        public float getLitros (){
            return litros;
        }
        
        public float getVelocidadeMedia (){
            return velocidadeMedia;
        }
        
        public float getPrezoGas (){
            return prezoGas;
        }
        
    
    //defino metodos
       public float getTempo (){  
           float tiempo = kilometros/ velocidadeMedia;
           return tiempo;
       }
       
       public float consumoMedio (){
           float consumoVehiculo= (litros*100)/kilometros;
           return consumoVehiculo;
       }
       
       public float consumoEuros (){
           float consumoEuros= (prezoGas*100)/kilometros;
           return consumoEuros;
       }
}
