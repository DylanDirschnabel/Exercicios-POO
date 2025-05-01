
package questao2.poolista2;

public class ContaBancaria {
    
    private String numero;
    private String titular;
    private double saldo;
    
        public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        if(valor < 0) {
            System.out.println("Valor Invalido! Informe um numero positivo!");
        } else {
        saldo = saldo + valor;
        }
    }
    
    public void sacar(double valor) {
        if(valor < 0) {
            System.out.println("Valor Invalido! Informe um numero positivo!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
        saldo = saldo - valor;
        }
    }
    
    public void transferir(ContaBancaria contaDestino, double valor) {
        if(valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
        saldo = saldo - valor;
        contaDestino.saldo = contaDestino.saldo + valor;
        }
    }
}
