
package questao3.poolista1;
import java.util.Scanner;
public class App {
        public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++ ){
        System.out.print("Informe o peso da pessoa " + (i + 1) + ": ");
        pessoa.peso = scanner.nextDouble();
        System.out.print("Informe a altura da pessoa " + (i + 1) + ": ");
        pessoa.altura = scanner.nextDouble();
        System.out.println("O IMC da pessoa " + (i + 1) + ": " + pessoa.calcularImc());
        }
    }
}
