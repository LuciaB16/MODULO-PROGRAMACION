/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

public class CuentaAhorro extends Conta{
    
    private double intereseVariable;
    private double saldoMinimo;

    public CuentaAhorro() {
    }

    public CuentaAhorro(double intereseVariable, double saldoMinimo, long numeroConta, Persoa cliente) {
        super(numeroConta, cliente);
        this.intereseVariable = intereseVariable;
        this.saldoMinimo = saldoMinimo;
    }

    public void setIntereseVariable(double intereseVariable) {
        this.intereseVariable = intereseVariable;
    }

    public double getIntereseVariable() {
        return intereseVariable;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }
    
    @Override
    public String toString() {
        return "intereseVariable=" + intereseVariable + ", saldoMinimo=" + saldoMinimo;
    }
    
    public void actualizarSaldo(){
        if (super.getSaldo()>=saldoMinimo){
            super.setSaldo(super.getSaldo()+(super.getSaldo()*(intereseVariable/100)));
        }
        
    }
}
    
    

