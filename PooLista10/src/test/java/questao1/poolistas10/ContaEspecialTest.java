/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao1.poolistas10;

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
        conta.setLimiteCredito(100);
        conta.depositar(20);
        conta.sacar(50);
        double esperado = conta.getSaldo();
        assertEquals(-30, esperado);
    }
   
    @Test
    public void teste2() {
        ContaEspecial conta = new ContaEspecial();
        conta.setLimiteCredito(100);
        conta.depositar(20);
        conta.sacar(120);
        double esperado = conta.getSaldo();
        assertEquals(-100, esperado);
    }
   
    @Test
    public void teste3() {
        ContaEspecial conta = new ContaEspecial();
        conta.setLimiteCredito(100);
        conta.depositar(20);
       
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            conta.sacar(120.01);
        });
       
        String esperado = "Saldo Insuficiente!";
        String resultado = exception.getMessage();
       
        assertEquals(esperado, resultado);
    }
    
}
