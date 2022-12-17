/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

public class CuentaCorriente extends Conta{
    private final static double interese=1.5;

    public CuentaCorriente() {
    }

       
    public CuentaCorriente(long numeroConta, Persoa cliente) {
        super(numeroConta, cliente);
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaCorriente= " + interese + "%";
    }

        
    public void actualizarSaldo(){
        super.setSaldo(super.getSaldo()+(super.getSaldo()*(interese/100)));
    }
        
    }


    
    
     

