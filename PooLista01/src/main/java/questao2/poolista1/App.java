
package questao2.poolista1;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o peso: ");
        pessoa.peso = scanner.nextDouble();
        System.out.print("Informe a altura: ");
        pessoa.altura = scanner.nextDouble();
        System.out.println("O IMC eh: " + pessoa.calcularImc());
    }
}
