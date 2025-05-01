/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistas9;

/**
 *
 * @author User
 */
public class Professor {
    private String email;
    private String nome;
    private Titulacao titulacao;
   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
   
    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }
   
    public Titulacao getTitulacao() {
        return titulacao;
    }
}
