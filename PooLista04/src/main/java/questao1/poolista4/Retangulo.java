
package questao1.poolista4;

public class Retangulo {
    private int altura;
    private int comprimento;
    
    public Retangulo(int altura, int comprimento) {
        this.altura = altura;
        this.comprimento = comprimento;
    }
    
    public Retangulo() {}

    public int getAltura() {
        return altura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setAltura(int altura) {
        if(altura <= 0) {
            throw new IllegalArgumentException("A altura deve ser maior que 0");
        }
        this.altura = altura;
    }

    public void setComprimento(int comprimento) {
                if(comprimento <= 0) {
            throw new IllegalArgumentException("O comprimento deve ser maior que 0");
                }
        this.comprimento = comprimento;
    }
    
    public int calcularPerimetro() {
        return (2*altura) + (2*comprimento);
    }

    public int calcularArea() {
        return altura * comprimento;
    }

}
