/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.listass12;

/**
 *
 * @author User
 */
public class Triangulo extends Figura{

    private int lado1;
    private int lado2;
    private int lado3;
    
    /**
     * @return the lado1
     */
    public int getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the lado2
     */
    public int getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return the lado3
     */
    public int getLado3() {
        return lado3;
    }

    /**
     * @param lado3 the lado3 to set
     */
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public Triangulo(int lado1, int lado2, int lado3) {
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
    }
    
    @Override
    public double calcularArea() {
        double p = (lado1 + lado2 + lado3)/2;
        double a = Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
        return a;
    }
    
}
