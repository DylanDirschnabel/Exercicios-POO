/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistass13;

/**
 *
 * @author User
 */
public abstract class Investimento implements Pagavel{

    private double saldo;
    
    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
