
package questao3.poolista1;

public class Pessoa {
        public double altura;
    public double peso;

    public double calcularImc() {
        return peso / (altura * altura);
    }
}
