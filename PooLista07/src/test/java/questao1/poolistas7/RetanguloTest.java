/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao1.poolistas7;

import camada2.poolistas7.Ponto;
import camada2.poolistas7.Retangulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *Teste retangulo
 * @author User
 */
public class RetanguloTest {
    
    public RetanguloTest() {
    }

    /**
     * Teste método calcularArea
     */
    @Test
    public void teste1() {
        Retangulo r1 = new Retangulo();
        Ponto p1 = new Ponto(10, 0);
        Ponto p2 = new Ponto(0, 10);
        
        r1.setPontoDireitoInf(p1);
        r1.setPontoEsquerdoSup(p2);
        
        double resultado = r1.calcularArea();
        assertEquals(resultado, 100);
    }
    
    /**
     * Teste método calcularPerimetro
     */
    @Test
    public void teste2() {
        Retangulo r1 = new Retangulo();
        Ponto p1 = new Ponto(10, 0);
        Ponto p2 = new Ponto(0, 10);

        r1.setPontoDireitoInf(p1);
        r1.setPontoEsquerdoSup(p2);

        double resultado = r1.calcularPerimetro();
        assertEquals(resultado, 40);
    }
         
    /**
     * Teste calcularInterseccao de 1 parametro
     */
        @Test
    public void teste3() {
        Retangulo r1 = new Retangulo();
        Ponto p1 = new Ponto(10, 0);
        Ponto p2 = new Ponto(0, 10);

        r1.setPontoDireitoInf(p1);
        r1.setPontoEsquerdoSup(p2);

        Retangulo r2 = new Retangulo();
        Ponto p3 = new Ponto(3, 2);
        Ponto p4 = new Ponto(2, 3);

        r2.setPontoDireitoInf(p3);
        r2.setPontoEsquerdoSup(p4);

        Retangulo resultado = r1.calcularInterseccao(r2);

            assertEquals(resultado.getPontoEsquerdoSup().getY(), r2.getPontoEsquerdoSup().getY());
            assertEquals(resultado.getPontoEsquerdoSup().getX(), r2.getPontoEsquerdoSup().getX());
            
            assertEquals(resultado.getPontoDireitoInf().getY(), r2.getPontoDireitoInf().getY());
            assertEquals(resultado.getPontoDireitoInf().getX(), r2.getPontoDireitoInf().getX());
    }

    /**
     * Teste método calcularInterseccao de dois parametros
     */
    @Test
    public void teste4() {
        Retangulo r1 = new Retangulo();
        Ponto p1 = new Ponto(10, 0);
        Ponto p2 = new Ponto(0, 10);

        r1.setPontoDireitoInf(p1);
        r1.setPontoEsquerdoSup(p2);

        Retangulo r2 = new Retangulo();
        Ponto p3 = new Ponto(12, 6);
        Ponto p4 = new Ponto(6, 12);

        r2.setPontoDireitoInf(p3);
        r2.setPontoEsquerdoSup(p4);

        Retangulo resultado = Retangulo.calcularInterseccao(r1, r2);

        assertEquals(resultado.getPontoEsquerdoSup().getY(), 10);
        assertEquals(resultado.getPontoEsquerdoSup().getX(), 6);
        assertEquals(resultado.getPontoDireitoInf().getY(), 6);
        assertEquals(resultado.getPontoDireitoInf().getX(), 10); 
        
    } 
    
}
