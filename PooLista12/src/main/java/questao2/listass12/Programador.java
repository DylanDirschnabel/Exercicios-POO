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
public class Programador extends Funcionario{
    
    private ArrayList<String> linguagens = new ArrayList();
    
    
    
    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    public void incluirLinguagem(String linguagem) {
        linguagens.add(linguagem);
    }
    
    public void removerLinguagem(String linguagem) {
        linguagens.remove(linguagem);
    }
    
    public ArrayList<String> getLinguagens() {
        return linguagens;
    }
    
    @Override
    public double calcularSalario() {
        double beneficio = 0;
        for(int  i = 0; i < linguagens.size(); i++) {
            String toUpperCase = linguagens.get(i).toUpperCase();
            
            if (toUpperCase.equals("JAVA")) {
                beneficio += 0.2 * super.getSalarioBase();
                break;
            }
        }
        
        return super.getSalarioBase() + beneficio;
    }
    
    public int getSize() {
        return linguagens.size();
    }
}
