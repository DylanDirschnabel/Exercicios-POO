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
public final class Vendedor extends Funcionario{

    private double percentualComissao;
    private ArrayList<Venda> vendas = new ArrayList();
    
    /**
     * @return the percentualComissao
     */
    public double getPercentualComissao() {
        return percentualComissao;
    }

    /**
     * @param percentualComissao the percentualComissao to set
     */
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public ArrayList<Venda> getVendas()  {
        return vendas;
    }
    
    public void incluirVenda(Venda v) {
        vendas.add(v);
    }
    
    public Vendedor(String nome, double salarioBase, double percentualComissao) {
        super(nome, salarioBase);
        setPercentualComissao(percentualComissao);
    }
    
    @Override
    public double calcularSalario() {
        double totalVendas = 0;
        
        for(int i = 0; i < vendas.size(); i++) {
            totalVendas += vendas.get(i).getValor();
        }
        
        return (percentualComissao * totalVendas) + super.getSalarioBase();
    }

}
