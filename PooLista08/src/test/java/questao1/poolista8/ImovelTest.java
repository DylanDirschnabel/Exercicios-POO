/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao1.poolista8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class ImovelTest {
    

    @org.junit.jupiter.api.Test
      public void teste1() {
        Imovel imovel = new Imovel();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            imovel.setArea(-5);
        });
        String esperado = "A área não pode ser negativa!";
        String resultado = exception.getMessage();
       
        assertEquals(esperado, resultado);
    }
   
    @org.junit.jupiter.api.Test
    public void teste2() {
        Imovel imovel = new Imovel();
        Bairro centro = new Bairro();
        centro.setNome("Centro");
        centro.setCoeficiente(1);
        imovel.setBairro(centro);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            imovel.calcularIptu();
        });
        String esperado = "A área não foi definida!";
        String resultado = exception.getMessage();

        assertEquals(esperado, resultado);
    }

    @org.junit.jupiter.api.Test
    public void teste3() {
        Imovel imovel = new Imovel();
        Bairro centro = new Bairro();
        centro.setNome("Centro");
        centro.setCoeficiente(1);
        imovel.setBairro(centro);
        imovel.setArea(250);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            imovel.calcularIptu();
        });
        String esperado = "A finalidade não foi definida!";
        String resultado = exception.getMessage();

        assertEquals(esperado, resultado);
    }
   
    @org.junit.jupiter.api.Test
    public void teste4() {
        Imovel imovel = new Imovel();
        Finalidade finalidade;
        finalidade = Finalidade.RESIDENCIAL;
        imovel.setArea(400);
        imovel.setFinalidade(finalidade);
       
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            imovel.calcularIptu();
        });
        String esperado = "O bairro não foi definido!";
        String resultado = exception.getMessage();

        assertEquals(esperado, resultado);
    }

    @org.junit.jupiter.api.Test
    public void teste5() {
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        Finalidade finalidade = Finalidade.RESIDENCIAL;
        bairro.setCoeficiente(1);
        imovel.setBairro(bairro);
        imovel.setFinalidade(finalidade);
        imovel.setArea(400);
       
        double resultado = imovel.calcularIptu();
       
        assertEquals(resultado, 400);
    }
   
    @org.junit.jupiter.api.Test
    public void teste6() {
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        Finalidade finalidade = Finalidade.COMERCIAL;
        bairro.setCoeficiente(1);
        imovel.setBairro(bairro);
        imovel.setFinalidade(finalidade);
        imovel.setArea(80);

        double resultado = imovel.calcularIptu();

        assertEquals(resultado, 500);
    }
   
    @org.junit.jupiter.api.Test
    public void teste7() {
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        Finalidade finalidade = Finalidade.COMERCIAL;
        bairro.setCoeficiente(1);
        imovel.setBairro(bairro);
        imovel.setFinalidade(finalidade);
        imovel.setArea(250);

        double resultado = imovel.calcularIptu();

        assertEquals(resultado, 1000);
    }
   
    @org.junit.jupiter.api.Test
    public void teste8() {
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        Finalidade finalidade = Finalidade.COMERCIAL;
        bairro.setCoeficiente(1);
        imovel.setBairro(bairro);
        imovel.setFinalidade(finalidade);
        imovel.setArea(500);

        double resultado = imovel.calcularIptu();

        assertEquals(resultado, 1275);
    }
   
    @org.junit.jupiter.api.Test
    public void teste9() {
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        Finalidade finalidade = Finalidade.INDUSTRIAL;
        bairro.setCoeficiente(1);
        imovel.setBairro(bairro);
        imovel.setFinalidade(finalidade);
        imovel.setArea(2000);

        double resultado = imovel.calcularIptu();

        assertEquals(resultado, 1000);
    }
   
    @org.junit.jupiter.api.Test
    public void teste10() {
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        Finalidade finalidade = Finalidade.INDUSTRIAL;
        bairro.setCoeficiente(1);
        imovel.setBairro(bairro);
        imovel.setFinalidade(finalidade);
        imovel.setArea(3000);

        double resultado = imovel.calcularIptu();

        assertEquals(resultado, 1650, 0.000000000001);
    }
   
    @org.junit.jupiter.api.Test
    public void teste11() {
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        Finalidade finalidade = Finalidade.RESIDENCIAL;
        bairro.setCoeficiente(2.5);
        imovel.setBairro(bairro);
        imovel.setFinalidade(finalidade);
        imovel.setArea(500);
       
        double resultado = imovel.calcularIptu();
       
        assertEquals(resultado, 1250);
    }
    
}
