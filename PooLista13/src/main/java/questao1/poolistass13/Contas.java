/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistass13;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Contas {
    private ArrayList<Pagavel> contas = new ArrayList();
    
    public void incluirConta(Pagavel conta) {
        contas.add(conta);
    }
    
    public ArrayList<Pagavel> getContas() {
        return contas;
    }
    
    public double calcularTotalContas() {
        double total = 0;
        
        for(Pagavel c : contas) {
            total  += c.calcularValorPagar();
        }
        
        return total;
    }
    
    public int getSize()  {
        return contas.size();
    }
}
