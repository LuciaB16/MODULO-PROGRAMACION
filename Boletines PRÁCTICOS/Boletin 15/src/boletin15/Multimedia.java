/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin15;

public class Multimedia {
    private String titulo;
    private String autor;
    private String formato;
    private float duracion;

    public Multimedia() {
    }

    public Multimedia(String titulo, String autor, String formato, float duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public float getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion;
    }
    
  }
