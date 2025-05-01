
package camada2.poolistas7;

/**
 *
 * @author User
 */
public class Retangulo {
   private Ponto pontoDireitoInf;
   private Ponto pontoEsquerdoSup;
   
   public void setPontoDireitoInf(Ponto pontoDireitoInf) {
       this.pontoDireitoInf = pontoDireitoInf;
   }
   
   public void setPontoEsquerdoSup(Ponto pontoEsquerdoSup) {
       if(pontoDireitoInf.getX() < pontoEsquerdoSup.getX() ||
               pontoDireitoInf.getY() > pontoEsquerdoSup.getY()) {
           throw new IllegalArgumentException("Coordenadas Inválidas!");
       }
       this.pontoEsquerdoSup = pontoEsquerdoSup;
   }
   
   public Ponto getPontoDireitoInf() {
       return pontoDireitoInf;
   }
   
   public Ponto getPontoEsquerdoSup() {
       return pontoEsquerdoSup;
   }
   
   public double calcularArea() {
       double area = 0;
       area = (pontoDireitoInf.getX() - pontoEsquerdoSup.getX()) * 
               (pontoEsquerdoSup.getY() - pontoDireitoInf.getY());
       return area;
   }
   
   public double calcularPerimetro() {
       double perimetro = 0;
       perimetro = (2 * (pontoDireitoInf.getX() - pontoEsquerdoSup.getX())) + 
               (2 * (pontoEsquerdoSup.getY() - pontoDireitoInf.getY()));
       return perimetro;
   }
   
   public Retangulo calcularInterseccao(Retangulo outroRetangulo) {

       Retangulo novoRetangulo = new Retangulo();

       if(outroRetangulo.pontoDireitoInf.getY() > pontoEsquerdoSup.getY() ||
          outroRetangulo.pontoEsquerdoSup.getY() < pontoDireitoInf.getY() ||
          outroRetangulo.pontoEsquerdoSup.getX() > pontoDireitoInf.getX() ||
          outroRetangulo.pontoDireitoInf.getX() < pontoEsquerdoSup.getX() ) {
           throw new IllegalArgumentException("Os retângulos não se intersectam!");
       }
       
       Ponto p1 = new Ponto(0,0);
       Ponto p2 = new Ponto(0,0);
       novoRetangulo.setPontoDireitoInf(p1);
       novoRetangulo.setPontoEsquerdoSup(p2);
       
       if (outroRetangulo.pontoEsquerdoSup.getX() > pontoEsquerdoSup.getX()) {
           novoRetangulo.pontoEsquerdoSup.setX(outroRetangulo.pontoEsquerdoSup.getX());
       } else {
           novoRetangulo.pontoEsquerdoSup.setX(pontoEsquerdoSup.getX());
       }

       if (outroRetangulo.pontoEsquerdoSup.getY() < pontoEsquerdoSup.getY()) {
           novoRetangulo.pontoEsquerdoSup.setY(outroRetangulo.pontoEsquerdoSup.getY());
       } else {
           novoRetangulo.pontoEsquerdoSup.setY(pontoEsquerdoSup.getY());
       }

       if (outroRetangulo.pontoDireitoInf.getX() < pontoDireitoInf.getX()) {
           novoRetangulo.pontoDireitoInf.setX(outroRetangulo.pontoDireitoInf.getX());
       } else {
           novoRetangulo.pontoDireitoInf.setX(pontoDireitoInf.getX());
       }

       if (outroRetangulo.pontoDireitoInf.getY() > pontoDireitoInf.getY()) {
           novoRetangulo.pontoDireitoInf.setY(outroRetangulo.pontoDireitoInf.getY());
       } else {
           novoRetangulo.pontoDireitoInf.setY(pontoDireitoInf.getY());
       }
       
       return novoRetangulo;
   }
   
     public static Retangulo calcularInterseccao(Retangulo ret1, Retangulo ret2) {

       Retangulo novoRetangulo = new Retangulo();
       if(ret2.pontoDireitoInf.getY() > ret1.pontoEsquerdoSup.getY() ||
          ret2.pontoEsquerdoSup.getY() < ret1.pontoDireitoInf.getY() ||
          ret2.pontoEsquerdoSup.getX() > ret1.pontoDireitoInf.getX() ||
          ret2.pontoDireitoInf.getX() < ret1.pontoEsquerdoSup.getX() ) {
           throw new IllegalArgumentException("Os retângulos não se intersectam!");
       }
       
       Ponto p1 = new Ponto(0,0);
       Ponto p2 = new Ponto(0,0);
       novoRetangulo.setPontoDireitoInf(p1);
       novoRetangulo.setPontoEsquerdoSup(p2);
       
       if (ret2.pontoEsquerdoSup.getX() > ret1.pontoEsquerdoSup.getX()) {
           novoRetangulo.pontoEsquerdoSup.setX(ret2.pontoEsquerdoSup.getX());
       } else {
           novoRetangulo.pontoEsquerdoSup.setX(ret1.pontoEsquerdoSup.getX());
       }

       if (ret2.pontoEsquerdoSup.getY() < ret1.pontoEsquerdoSup.getY()) {
           novoRetangulo.pontoEsquerdoSup.setY(ret2.pontoEsquerdoSup.getY());
       } else {
           novoRetangulo.pontoEsquerdoSup.setY(ret1.pontoEsquerdoSup.getY());
       }

       if (ret2.pontoDireitoInf.getX() < ret1.pontoDireitoInf.getX()) {
           novoRetangulo.pontoDireitoInf.setX(ret2.pontoDireitoInf.getX());
       } else {
           novoRetangulo.pontoDireitoInf.setX(ret1.pontoDireitoInf.getX());
       }

       if (ret2.pontoDireitoInf.getY() > ret1.pontoDireitoInf.getY()) {
           novoRetangulo.pontoDireitoInf.setY(ret2.pontoDireitoInf.getY());
       } else {
           novoRetangulo.pontoDireitoInf.setY(ret1.pontoDireitoInf.getY());
       }
       
       return novoRetangulo;
   }
   
   
}
