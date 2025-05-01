/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistass11;

/**
 *
 * @author User
 */
public class ContaEspecial extends ContaBancaria {
    private double limiteCredito;
   
    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    public double getLimiteCredito() {
        return limiteCredito;
    }
   
    @Override
    public void sacar(double valor) {
        if(valor > getSaldo()+getLimiteCredito()) {
            throw new IllegalArgumentException("Saldo Insuficiente!");
        }
        super.setSaldo(super.getSaldo() - valor);
        Movimento movimento = new Movimento(valor, TipoMovimento.DEBITO);
        incluirMovimento(movimento);
    }
}
