/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistass13;

/**
 *
 * @author User
 */
public class MensalidadeEnsino implements Pagavel {

    private int nrCreditos;
    private double precoCredito;
    
    /**
     * @return the nrCreditos
     */
    public int getNrCreditos() {
        return nrCreditos;
    }

    /**
     * @param nrCreditos the nrCreditos to set
     */
    public void setNrCreditos(int nrCreditos) {
        this.nrCreditos = nrCreditos;
    }

    /**
     * @return the precoCredito
     */
    public double getPrecoCredito() {
        return precoCredito;
    }

    /**
     * @param precoCredito the precoCredito to set
     */
    public void setPrecoCredito(double precoCredito) {
        this.precoCredito = precoCredito;
    }
    
    public MensalidadeEnsino(int nr, double preco) {
        setNrCreditos(nr);
        setPrecoCredito(preco);
    }
    
    @Override
    public double calcularValorPagar() {
        return nrCreditos * precoCredito;
    }
    
}
