
package questao2.poolista3;

public class Funcionario {
    
    private String nome;
    private double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularIrpf() {
        double valor = 0;
        if(salario < 1903.38) {
            valor = 0;
        } else if (salario > 1903.38 && salario <= 2826.65) {
            valor = (salario - 1903.38) * 0.075;
        } else if (salario > 2826.65 && salario <= 3751.05) {
            valor = (salario - 2826.65) * 0.15 + (0.075 * 922.67);
        } else if (salario > 3751.05 && salario <= 4664.68) {
            valor = (salario - 3751.05) * 0.225 + (0.15 * 924.35) + (0.075 * 922.67);
        } else {
            valor = (salario - 4664.68) * 0.275 + (913.63 * 0.225) + (0.15 * 924.35) + (0.075 * 922.67);
        }
        return valor;
    }
}
