/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistas10;

/**
 *
 * @author User
 */
public class ContaBancaria{
    
    private String numero;
    private double saldo;
    private Cliente cliente;

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setTitular(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getTitular() {
        return cliente;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor a depositar deve ser "
                    + "maior que zero!");
        }
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor a sacar deve ser"
                    + "maior que zero!");
        } else if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        saldo = saldo - valor;
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        sacar(valor);
        contaDestino.depositar(valor);
    }
    
}
