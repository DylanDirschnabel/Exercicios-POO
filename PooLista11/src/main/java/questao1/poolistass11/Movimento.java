/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistass11;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date; 

/**
 *
 * @author User
 */
public class Movimento implements Comparable<Movimento>{
    private double valor;
    private TipoMovimento tipo;
    private LocalTime hora;
    private LocalDate data;
    
    public Movimento(double valor, TipoMovimento tipo) {
        this.valor = valor;
        this.tipo = tipo;
        hora = LocalTime.now();
        data = LocalDate.now();
    }
    
    public Movimento() {}
    
    
    public LocalDate getData() {
        return data;
    }
    
    public LocalTime getHora() {
        return hora;
    }
    
    public double getValor() {
        return valor;
    }
    
    public TipoMovimento getTipoMovimento() {
        return tipo;
    }
    
    @Override
    public int compareTo(Movimento m) {
        if (this.data.isBefore(m.data)) {
            return 1;
        } else if(this.data.isAfter(m.data)) {
            return -1;
        } else if(this.hora.isBefore(m.hora)) {
            return 1;
        } else if(this.hora.isAfter(m.hora)) {
            return -1;
        } else {
            return 0;
        }
        
    }
    
}
