/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2.poolista14;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Teclado {
    Scanner teclado = new Scanner(System.in);
    
    public int lerInt() {
        System.out.println("Informe um inteiro: ");
        while(true) {
            
        try{
         
        
        int inteiro = Integer.parseInt(teclado.next());
        return inteiro;
        
        }
        catch(NumberFormatException erro){
            System.out.println("Valor Incorreto");
        }
        
        }
        
    }
    
        public double lerDouble() {
            
        System.out.println("Informe um double: ");
        while(true) {
            
        try{
        
        
        double numero = Double.parseDouble(teclado.next());
        return numero;
        
        }
        catch(NumberFormatException erro){
            System.out.println("Valor Incorreto");
        }
        
        }
        
    }
        
        public String lerString() {
        
        System.out.println("Informe uma string: ");
        String texto = teclado.next();
        return texto;
        
    }
        
        public boolean lerBoolean() {
        System.out.println("Informe um valor boleano: ");
        while(true) {
            
        boolean bool;
        
        String texto = teclado.next();
        texto.toLowerCase();
        if(texto.equals("sim") || texto.equals("verdadeiro") || texto.equals("s"))
        {
            bool = true;
            return bool;
        }
        else if(texto.equals("nao") || texto.equals("falso") || texto.equals("n"))
        {
            bool = false;
            return bool;
        }
        
        }
        
    }
    
    
}
