/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

public class Persoa {

    private String nome;
    private String apelidos;
    private String NIF;

    public Persoa() {
    }

    public Persoa(String nome, String apelidos, String NIF) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.NIF = NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNIF() {
        return NIF;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    

}
