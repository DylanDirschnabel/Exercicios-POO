/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.listass12;

/**
 *
 * @author User
 */
public class Circulo extends Figura{

    private int raio;
    
    /**
     * @return the raio
     */
    public int getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    public Circulo(int raio) {
        setRaio(raio);
    }
    
    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}
