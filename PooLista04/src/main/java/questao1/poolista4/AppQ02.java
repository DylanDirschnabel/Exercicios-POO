
package questao1.poolista4;

import javax.swing.JOptionPane;

public class AppQ02 {

    public static void main(String[] args) {

        int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a altura: "));
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o comprimento: "));
        
        Retangulo r1 = new Retangulo();
        try {
            r1.setAltura(altura);
            r1.setComprimento(comprimento);
            JOptionPane.showMessageDialog(null, "Area: " + r1.calcularArea() + 
                    "\n Comprimento: " + r1.calcularPerimetro());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
