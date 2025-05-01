
package questao1.poolista5;

import questao1.poolista5.a.Quadrante;

public class Ponto {

    Quadrante quadrante;
    
    private int x;
    private int y;
    
    public Ponto() {}
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Quadrante identificarQuadrante() {
         if (x > 0 && y > 0) {
            quadrante = quadrante.PRIMEIRO;
        } else if (x > 0 && y < 0) {
            quadrante = quadrante.SEGUNDO;
        } else if (x < 0 && y < 0) {
            quadrante = quadrante.TERCEIRO;
        } else if (x < 0 && y > 0) {
            quadrante = quadrante.QUARTO;
        } else {
            quadrante = quadrante.NENHUM;
        }
        return quadrante;
    }
    
    public boolean estaIncidindoSobreX() {
        boolean i = false;
        if(x == 0) {
            i = true;
        }
        return i;
    }
    
        public boolean estaIncidindoSobreY() {
        boolean i = false;
        if(y == 0) {
            i = true;
        }
        return i;
    }
        
        public double calcularDistancia(Ponto outroPonto) {
            double resultado;
            resultado = Math.sqrt(Math.pow(outroPonto.x - x, 2)
                    + Math.pow(outroPonto.y - y, 2));
            return resultado;  
        }
        
        public static double calcularDistancia(Ponto p1, Ponto p2) {
            double resultado;
            resultado = Math.sqrt(Math.pow(p2.x - p1.x, 2) +
                    Math.pow(p2.y - p1.y, 2));
            return resultado;
        }
}
