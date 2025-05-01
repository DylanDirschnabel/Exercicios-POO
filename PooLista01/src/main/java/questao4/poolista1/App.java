package questao4.poolista1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Pessoa pessoa[] = new Pessoa[3];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < pessoa.length; i++) {
            pessoa[i] = new Pessoa();
            System.out.println("Informe o nome da pessoa " + (i + 1) + ": ");
            pessoa[i].nome = scanner.next();
            System.out.println("Informe o peso de " + pessoa[i].nome + ": ");
            pessoa[i].peso = scanner.nextDouble();
            System.out.println("Informe a altura de " + pessoa[i].nome + ": ");
            pessoa[i].altura = scanner.nextDouble();
        }
        
        for(int i = 2; i >= 0; i--) {
            System.out.println("Peso de " + pessoa[i].nome + ": " + pessoa[i].peso);
            System.out.println("Altura de " + pessoa[i].nome + ": " + pessoa[i].altura);
            System.out.println("IMC de " + pessoa[i].nome + ": " + pessoa[i].calcularImc());
        }
    }
}
