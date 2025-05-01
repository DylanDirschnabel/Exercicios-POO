/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsadads;

import java.util.Objects;

/**
 *
 * @author User
 */
public class Produto {

    private String nome;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public Produto(String nome, double valor) {
        setNome(nome);
        setValor(valor);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nome, valor);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if(nome.equals(other.getNome())) {
            if(valor == other.getValor()) {
                return true;
            }
        }
        return false;
    }
    
}
