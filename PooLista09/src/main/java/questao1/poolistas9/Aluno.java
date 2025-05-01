/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistas9;

/**
 *
 * @author User
 */
public class Aluno {
      private int matricula;
    private String nome;
    private double notaEnem;
   
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public void setNota(double notaEnem) {
        this.notaEnem = notaEnem;
    }
   
    public int getMatricula() {
        return matricula;
    }
   
    public String getNome() {
        return nome;
    }
   
    public double getNota() {
        return notaEnem;
    }
}
