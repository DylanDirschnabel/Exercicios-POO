/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao1.poolistass11;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class ContaEspecialTest {
    
    public ContaEspecialTest() {
    }

    @Test
    public void teste1() {
        ContaEspecial conta = new ContaEspecial();
        conta.depositar(1000);
        conta.sacar(250);
        TipoMovimento tipo1 = conta.getMovimentos().get(0).getTipoMovimento();
        double valor1 = conta.getMovimentos().get(0).getValor();
        
        assertEquals(TipoMovimento.CREDITO, tipo1);
        assertEquals(1000, valor1);
        
        TipoMovimento tipo2 = conta.getMovimentos().get(1).getTipoMovimento();
        double valor2 = conta.getMovimentos().get(1).getValor();

        assertEquals(TipoMovimento.DEBITO, tipo2);
        assertEquals(250, valor2);
    }   
    
}
