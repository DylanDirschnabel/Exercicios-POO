/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.listass12;

/**
 *
 * @author User
 */
public class Retangulo extends Figura{

    private int largura;
    private int altura;
    
    /**
     * @return the largura
     */
    public int getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(int largura) {
        this.largura = largura;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public Retangulo(int altura, int largura) {
       setAltura(altura);
       setLargura(largura);
    }
    
    @Override
    public double calcularArea() {
        return altura * largura;
    }
}
