/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin15;

public class Disco extends Multimedia{
    private String xenero;

    public Disco() {
        super();
    }

    public Disco(String xenero, String titulo, String autor, String formato, float duracion) {
        super(titulo, autor, formato, duracion);
        this.xenero = xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

    public String getXenero() {
        return xenero;
    }

    @Override
    public String toString() {
        return (super.toString()+ "xenero=" + xenero);
    }
    
    
    
}
