/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinextra2;


public class Cuenta {
    
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInterese;
    private double saldo;
    
    //declaro los constructores
    public Cuenta(){
        
    }
    public Cuenta(String nombreCliente,String numeroCuenta,double tipoInterese,double saldo){
        this.nombreCliente= nombreCliente;
        this.numeroCuenta= numeroCuenta;
        this.tipoInterese= tipoInterese;
        this.saldo= saldo;
    }
    
    //getters y setters
    public void setNombre(String nombreCliente){
        this.nombreCliente= nombreCliente;
    }
    
    public void setCuenta(String numeroCuenta){
        this.numeroCuenta= numeroCuenta;
    }
 
    public void setTipoInterese (double tipoInterese){
        this.tipoInterese= tipoInterese;
    }
    
    public void setSaldo(double saldo){
        this.saldo= saldo;
    }
    
    public String getNombre(){
        return this.nombreCliente;
    }
    
    public String getCuenta(){
        return this.numeroCuenta;
    }
    
    public double getTipoInterese(){
        return this.tipoInterese;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    //métodos
    public void ingreso(double ingreso){
        this.saldo = saldo + ingreso;
    }
    
    public void reintegro(double reintegro){
        this.saldo = saldo - Math.abs(reintegro);
    }
    
    public void transferencia(Cuenta cliente2,double importe){
        this.reintegro(importe);
        cliente2.ingreso(importe);
       
    }
       
}