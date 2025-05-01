/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistass16;

/**
 *
 * @author User
 */
public class ArgumentoNaoEhArquivoException extends IllegalArgumentException{
    public ArgumentoNaoEhArquivoException(String arquivo){
       super("argumento: " + arquivo + " nao eh um arquivo");
    }
}
