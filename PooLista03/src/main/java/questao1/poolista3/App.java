
package questao1.poolista3;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        DecimalFormat dformat = new DecimalFormat("0.00");
        String titular;
        double salarioo;
        
        titular = JOptionPane.showInputDialog(null, "Informe o nome");
        funcionario.setNome(titular);
        salarioo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário"));
        funcionario.setSalario(salarioo);
        JOptionPane.showMessageDialog(null, "Imposto - R$: " + dformat.format(funcionario.calcularIrpf()));
    }
}
