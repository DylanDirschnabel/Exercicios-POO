/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistass13;

/**
 *
 * @author User
 */
public class ContaAgua implements Pagavel{
    private int metrosCubicos;
    private double precoMetroCubico;
    
    /**
     * @return the metrosCubicos
     */
    public int getMetrosCubicos() {
        return metrosCubicos;
    }

    /**
     * @param metrosCubicos the metrosCubicos to set
     */
    public void setMetrosCubicos(int metrosCubicos) {
        this.metrosCubicos = metrosCubicos;
    }

    /**
     * @return the precoMetroCubico
     */
    public double getPrecoMetroCubico() {
        return precoMetroCubico;
    }

    /**
     * @param precoMetroCubico the precoMetroCubico to set
     */
    public void setPrecoMetroCubico(double precoMetroCubico) {
        this.precoMetroCubico = precoMetroCubico;
    }
    
    public ContaAgua(int metro, double preco) {
        setMetrosCubicos(metro);
        setPrecoMetroCubico(preco);
    }
    
    @Override
    public double calcularValorPagar() {
        return metrosCubicos * precoMetroCubico;
    }
}
