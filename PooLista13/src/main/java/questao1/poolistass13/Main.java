/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistass13;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {

        Contas contas = new Contas();

        Pagavel conta1 = new ContaAgua(20, 10);
        Pagavel conta2 = new MensalidadeEnsino(500, 3);
        Pagavel conta3 = new PrevidenciaPrivada(200);
        Pagavel conta4 = new PrevidenciaPrivada(1200);

        ((PrevidenciaPrivada) conta3).investir();
        ((PrevidenciaPrivada) conta4).investir();

        contas.incluirConta(conta1);
        contas.incluirConta(conta2);
        contas.incluirConta(conta3);
        contas.incluirConta(conta4);

        System.out.println("Total Contas a Pagar: R$: " + contas.calcularTotalContas());

        for (int i = 0; i < contas.getSize(); i++) {
            System.out.println("Conta " + (i + 1) + ": " + contas.getContas().get(i).calcularValorPagar());
        }

        for (int i = 0; i < contas.getSize(); i++) {
            if (contas.getContas().get(i) instanceof PrevidenciaPrivada) {
                System.out.println("Saldo previdencia privada: R$"
                        + ((PrevidenciaPrivada) contas.getContas().get(i)).getSaldo());
            }
        }

    }
}
