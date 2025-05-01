
package camada2.poolista6;

import camada3.poolista6.FaixaIrpf;

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
        if(salario  <= 0) {
            throw new IllegalArgumentException("Salario deve ser maior que Zero");
        }
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    
    public void Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularIrpf() {
        double valor = 0;
        if (salario > 1903.98) {
            if (salario > 2826.65) {
                valor += (2826.65 - 1903.98) * 0.075;
            } else {
                valor += (salario - 1903.98) * 0.075;
            }
        }
        if (salario > 2826.65) {
            if (salario > 3751.05) {
                valor += (3751.05 - 2826.65) * 0.15;
            } else {
                valor += (salario - 2826.65) * 0.15;
            }
        }
        if (salario > 3751.05) {
            if (salario > 4664.68) {
                valor += (4664.68 - 3751.05) * 0.225;
                valor += (salario - 4664.68) * 0.275;
            } else {
                valor += (salario - 3751.05) * 0.225;
            }
        }
        return valor;
    }
    
    public FaixaIrpf identificarFaixaIrpf() {
        FaixaIrpf faixa = null;
        if (salario > 1903.98 && salario <= 2826.65) {
            faixa = FaixaIrpf.SEGUNDA;
        } else if (salario > 2826.65 && salario <= 3751.05) {
            faixa = FaixaIrpf.TERCEIRA;
        } else if (salario > 3751.05 && salario <= 4664.68) {
            faixa = FaixaIrpf.QUARTA;
        } else if (salario > 4664.68) {
            faixa = FaixaIrpf.QUINTA;
        } else {
            faixa = FaixaIrpf.PRIMEIRA;
        }
        return faixa;
    }
}
