/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistass11;

import java.util.Collections;

/**
 *
 * @author User
 */
public class Teste {
    public static void main(String[] args) throws InterruptedException {
        ContaEspecial conta = new ContaEspecial();
        conta.depositar(1000);
        Thread.sleep(1000);
        conta.sacar(250);
        Thread.sleep(1000);
        conta.sacar(500);
        Thread.sleep(1000);
        conta.depositar(100);
        
        for(Movimento movimento : conta.getMovimentos()) {
            System.out.println(movimento.getTipoMovimento() + ": R$" + movimento.getValor() + " "
                    + movimento.getData() + " - " + movimento.getHora());
        }
        
        System.out.println("");
        Collections.sort(conta.getMovimentos());
        
        for(Movimento movimento : conta.getMovimentos()) {
            System.out.println(movimento.getTipoMovimento() + ": R$" + movimento.getValor() + " "
                    + movimento.getData() + " - " + movimento.getHora());
        }
    }
}
