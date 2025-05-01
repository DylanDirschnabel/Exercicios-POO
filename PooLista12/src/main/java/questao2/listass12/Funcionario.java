/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2.listass12;

/**
 *
 * @author User
 */
public class Funcionario {

    private String nome;
    private double salarioBase;
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public Funcionario(String nome, double salarioBase)  {
        setNome(nome);
        setSalarioBase(salarioBase);
    }
    
    public double calcularSalario() {
       return getSalarioBase();
    }

}
