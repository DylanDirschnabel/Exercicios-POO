/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistass17;

/**
 *
 * @author User
 */
public class Municipio {

    private String nome;
    private int popularcao;
    private String estado;
    private int codigo;
    
    public Municipio() {}
    
    public Municipio(int codigo, String nome, String estado, int popularcao) {
        setCodigo(codigo);
        setNome(nome);
        setEstado(estado);
        setPopularcao(popularcao);
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopularcao() {
        return popularcao;
    }

    public void setPopularcao(int popularcao) {
        this.popularcao = popularcao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
