
package camada2.poolistas7;

/**
 *
 * @author User
 */
public class Ponto {
    private int x;
    private int y;
    
    public Ponto(int x, int y) {
        if(x < 0 || y < 0) {
            throw new IllegalArgumentException("As coordenadas X e Y não podem ser negativas!");
        }
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x) {
        if(x < 0) {
            throw new IllegalArgumentException("X não pode ser negativo!");
        }
        this.x = x;
    }
    
    public void setY(int y) {
        if(y < 0) {
            throw new IllegalArgumentException("Y não pode ser negativo!");
        }
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}
