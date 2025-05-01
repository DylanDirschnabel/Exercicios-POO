
package questao2.poolista3;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario[] = new Funcionario[5];
        DecimalFormat dformat = new DecimalFormat("0.00");
        String titular;
        double valor;
        String msg = "";
        
        for(int i = 0; i < funcionario.length; i++) {
            funcionario[i] = new Funcionario();
            titular = JOptionPane.showInputDialog(null, "Informe o nome do funcionario " + (i + 1) + ": ");
            funcionario[i].setNome(titular);
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário do funcionario " + (i + 1) + ": "));
            funcionario[i].setSalario(valor);
        }

        for(int i = 0; i < funcionario.length; i++) {
            msg = msg + (i + 1) + "- " + funcionario[i].getNome() + 
                    " | Salário R$: " + funcionario[i].getSalario() +
                    " | Imposto R$: " + dformat.format(funcionario[i].calcularIrpf()) + "\n";  
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
