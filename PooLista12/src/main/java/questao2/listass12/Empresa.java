/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2.listass12;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public final class Empresa {
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList();
    
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
    
    public Empresa(String nome) {
        setNome(nome);
    }
    
    public void incluirFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }
    
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public double calcularCustosSalarios() {
        double totalSalarios = 0;
        
        for(Funcionario f : funcionarios) {
            if(f instanceof Vendedor) {
                totalSalarios += ((Vendedor) f).calcularSalario();
            } else if(f instanceof Programador) {
                totalSalarios += ((Programador) f).calcularSalario();
            } else {
                totalSalarios += f.calcularSalario();
            }
        }
        
        return totalSalarios;
    }
    
    public int getSize() {
        return funcionarios.size();
    }
    
    
}
