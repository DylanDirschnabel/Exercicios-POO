/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolista8;

/**
 *
 * @author User
 */
public class Bairro {
    private String nome;
    private double coeficienteIptu;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setCoeficiente(double coeficienteIptu) {
        if(coeficienteIptu <= 0) {
            throw new IllegalArgumentException("Coeficiente deve ser maior que 0!");
        }
        this.coeficienteIptu = coeficienteIptu;
    }
    
    public double getCoeficiente() {
        return coeficienteIptu;
    }
}
