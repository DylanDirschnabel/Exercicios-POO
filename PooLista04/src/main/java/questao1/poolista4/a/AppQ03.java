
package questao1.poolista4.a;

import javax.swing.JOptionPane;
import questao1.poolista4.Retangulo;

public class AppQ03 {

    public static void main(String[] args) {

        int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a altura: "));
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o comprimento: "));
        
        
        try {
            Retangulo r1 = new Retangulo(altura, comprimento);
            JOptionPane.showMessageDialog(null, "Area: " + r1.calcularArea() + 
                    "\n Comprimento: " + r1.calcularPerimetro());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}