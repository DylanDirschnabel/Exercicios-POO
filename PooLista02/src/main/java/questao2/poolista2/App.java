
package questao2.poolista2;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ContaBancaria conta[] = new ContaBancaria[2];
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < conta.length; i++) {
            conta[i] = new ContaBancaria();
            System.out.print("Ola! Informe o numero da conta bancaria " + (i + 1) + ": ");
            conta[i].setNumero(scanner.next());
            System.out.print("Agora, informe o titular da conta bancaria " + (i + 1) + ": ");
            conta[i].setTitular(scanner.next());
        }
        
        conta[0].depositar(1000);
        conta[0].depositar(700);
        conta[1].depositar(5000);
        conta[1].sacar(3000);
        conta[1].transferir(conta[0], 1800);
        
        for(int i = 0; i < conta.length; i++) {
            System.out.println("Saldo de " + conta[i].getTitular() + ": " + conta[i].getSaldo());
        }
    }
}
