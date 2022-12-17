/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin15;

public class Película extends Multimedia{
    private String actorPrincipal;
    private String actrizPrincipal;

    public Película() {
        super();
    }

    public Película(String actorPrincipal, String actrizPrincipal, String titulo, String autor, String formato, float duracion) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        return (super.toString()+ "actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal);
    }
    
    
    
    
}
