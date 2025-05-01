/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package camada2.poolista6;

import camada3.poolista6.FaixaIrpf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class FuncionarioTest {
    
    public FuncionarioTest() {
    }

    @org.junit.jupiter.api.Test
    public void test1() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(850);
        FaixaIrpf resultado = funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.PRIMEIRA, resultado);
    }

    @org.junit.jupiter.api.Test
    public void test2() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(850);
        double resultado = funcionario.calcularIrpf();
        assertEquals(0, resultado);
    }

    @org.junit.jupiter.api.Test
    public void test3() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(1903.98);
        FaixaIrpf resultado = funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.PRIMEIRA, resultado);
    }

    @org.junit.jupiter.api.Test
    public void test4() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(1903.98);
        double resultado = funcionario.calcularIrpf();
        assertEquals(0, resultado);
    }

    @org.junit.jupiter.api.Test
    public void test5() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(1903.99);
        FaixaIrpf resultado = funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.SEGUNDA, resultado);
    }

    @org.junit.jupiter.api.Test
    public void test6() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(1903.98);
        double resultado = funcionario.calcularIrpf();
        assertEquals(0, resultado);
    }

    @org.junit.jupiter.api.Test
    public void test7() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2000);
        FaixaIrpf resultado = funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.SEGUNDA, resultado);
    }

    @org.junit.jupiter.api.Test
    public void test8() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2000);
        double resultado = funcionario.calcularIrpf();
        assertEquals(7.20, resultado, 0.01);
    }

    @org.junit.jupiter.api.Test
    public void test9() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2826.65);
        FaixaIrpf resultado = funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.SEGUNDA, resultado);
    }

    @org.junit.jupiter.api.Test
    public void test10() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2826.65);
        double resultado = funcionario.calcularIrpf();
        assertEquals(69.2, resultado, 0.01);
    }

    @org.junit.jupiter.api.Test
    public void test11() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2826.66);
        FaixaIrpf resultado = funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.TERCEIRA, resultado);
    }

    @org.junit.jupiter.api.Test
    public void test12() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2826.66);
        double resultado = funcionario.calcularIrpf();
        assertEquals(69.2, resultado, 0.01);
    }
    
    @org.junit.jupiter.api.Test
    public void test13() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(3000);
        FaixaIrpf resultado = funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.TERCEIRA, resultado);
    }

    @org.junit.jupiter.api.Test
    public void test14() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(3000 );
        double resultado = funcionario.calcularIrpf();
        assertEquals(95.2, resultado, 0.01);
    }
    
        @org.junit.jupiter.api.Test
    public void test15() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(3751.05);
        FaixaIrpf resultado = funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.TERCEIRA, resultado);
    }

    @org.junit.jupiter.api.Test
    public void test16() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(3751.05);
        double resultado = funcionario.calcularIrpf();
        assertEquals(207.86, resultado, 0.01);
    }
    
    @org.junit.jupiter.api.Test
    public void test17() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(3751.06);
        FaixaIrpf resultado = funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.QUARTA, resultado);
    }

    @org.junit.jupiter.api.Test
    public void test18() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(3751.05);
        double resultado = funcionario.calcularIrpf();
        assertEquals(207.86, resultado, 0.01);
    }
    
    @org.junit.jupiter.api.Test
    public void test19() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(4000);
        FaixaIrpf resultado = funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.QUARTA, resultado);
    }

    @org.junit.jupiter.api.Test
    public void test20() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(4000);
        double resultado = funcionario.calcularIrpf();
        assertEquals(263.87, resultado, 0.01);
    }

    @org.junit.jupiter.api.Test
    public void test21() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(4664.68);
        FaixaIrpf resultado = funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.QUARTA, resultado);
    }

    @org.junit.jupiter.api.Test
    public void test22() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(4664.68);
        double resultado = funcionario.calcularIrpf();
        assertEquals(413.42, resultado, 0.01);
    }
    
    @org.junit.jupiter.api.Test
    public void test23() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(4664.69);
        FaixaIrpf resultado = funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.QUINTA, resultado);
    }

    @org.junit.jupiter.api.Test
    public void test24() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(4664.69);
        double resultado = funcionario.calcularIrpf();
        assertEquals(413.42, resultado, 0.01);
    }
    
        @org.junit.jupiter.api.Test
    public void test25() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(5000);
        FaixaIrpf resultado = funcionario.identificarFaixaIrpf();
        assertEquals(FaixaIrpf.QUINTA, resultado);
    }

    @org.junit.jupiter.api.Test
    public void test26() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(5000);
        double resultado = funcionario.calcularIrpf();
        assertEquals(505.64, resultado, 0.01);
    }
    
    @org.junit.jupiter.api.Test
    public void test27() {
        Funcionario funcionario = new Funcionario();
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            funcionario.setSalario(-100);
        });
    }
    

    
    
}
