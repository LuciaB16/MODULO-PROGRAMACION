/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

import javax.swing.JOptionPane;

public class Conta {
    
    private long numeroConta;
    private double saldo;
    private Persoa cliente;

    public Conta() {
    }
    
    
    public Conta(long numeroConta, Persoa cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    public void setCliente(Persoa cliente) {
        this.cliente = cliente;
    }

    public Persoa getCliente() {
        return cliente;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "numeroConta=" + numeroConta + ", saldo=" + saldo + ", cliente=" + cliente;
    }
    
    public void ingresar(double dinero){
        //JOptionPane.showInputDialog("Introduce cantidad de dinero a ingresar");
        saldo= saldo+dinero;
    }
    
    public void retirar(double dinero){
        if (saldo>0){
            JOptionPane.showInputDialog("Introduce cantidad a retirar de la cuenta");
             saldo= saldo-dinero; 
        }
           else
            JOptionPane.showMessageDialog(null, "No hay dinero a retirar");
        
    }  
         
    }



