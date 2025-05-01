/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolista8;

/**
 *
 * @author User
 */
public class Imovel {
    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
   public void setArea(int area) {
       if(area < 0){
           throw new IllegalArgumentException("A área não pode ser negativa!");
       }
       this.area = area;
   }
   public void setBairro(Bairro bairro) {
       this.bairro = bairro;
   }
   public void setFinalidade(Finalidade finalidade) {
       this.finalidade = finalidade;
   }
   
    public String getEndereco() {
        return endereco;
    }
    public int getArea() {
        return area;
    }
    public Bairro getBairro() {
        return bairro;
    }
    public Finalidade getFinalidade() {
        return finalidade;
    }
    
    public double calcularIptu() {
        if(area == 0) {
            throw new IllegalArgumentException("A área não foi definida!");
        }
        if (bairro == null) {
            throw new IllegalArgumentException("O bairro não foi definido!");
        }
        if (finalidade == null) {
            throw new IllegalArgumentException("A finalidade não foi definida!");
        }
        if (bairro.getCoeficiente() < 0) {
            throw new IllegalArgumentException("O coeficiente de IPTU não pode ser negativo!");
        }
        
        double valor = 0;
        
        switch(finalidade) {
            case Finalidade.RESIDENCIAL:
                valor = bairro.getCoeficiente() * area;
                break;
            case Finalidade.COMERCIAL:
                if(area <= 100) {
                    valor = 500 * bairro.getCoeficiente();
                } else if(area > 100 && area <= 400) {
                    valor = 1000 * bairro.getCoeficiente();
                } else {
                    valor = 2.55 * area * bairro.getCoeficiente();
                }
                break;
            case Finalidade.INDUSTRIAL:
                if(area <= 2000) {
                    valor = 1000 * bairro.getCoeficiente();
                } else {
                    valor = 0.55 * area * bairro.getCoeficiente();
                }
                break;
            default:
                
        }
        
        return valor;
    }
}
