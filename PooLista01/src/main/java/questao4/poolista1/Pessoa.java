
package questao4.poolista1;

public class Pessoa {
    public String nome;
    public double peso;
    public double altura;
    
    public double calcularImc(){
        return peso / (altura * altura);
    }
}
