/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.listass12;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        int resposta = 0;
 
        do {
            resposta = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a forma geométrica: \n"
                    + "1 - Retângulo \n"
                    + "2 - Quadrado \n"
                    + "3 - Triângulo \n"
                    + "4 - Círculo \n"
                    + "5 - Sair"));
            
            switch(resposta) {
                case 1:
                    int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a altura: "));
                    int largura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a largura: "));
                    Figura retangulo = new Retangulo(altura, largura);
                    JOptionPane.showMessageDialog(null, "Área do retângulo: " + retangulo.calcularArea());
                    break;
                case 2:
                    int medida = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor do lado: "));
                    Figura quadrado = new Quadrado(medida);
                    JOptionPane.showMessageDialog(null, "Área do quadrado: " + quadrado.calcularArea());
                    break;
                case 3:
                    int lado1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor do lado 1: "));
                    int lado2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor do lado 2: "));
                    int lado3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor do lado 3: "));
                    Figura triangulo = new Triangulo(lado1, lado2, lado3);
                    JOptionPane.showMessageDialog(null, "Área do triângulo: " + triangulo.calcularArea());
                    break;
                case 4:
                    int raio = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor do raio: "));
                    Figura circulo = new Circulo(raio);
                    JOptionPane.showMessageDialog(null, "Área do círculo: " + circulo.calcularArea());
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido!");
            }
            
            
        } while (resposta != 5);

    }
    

    
}
