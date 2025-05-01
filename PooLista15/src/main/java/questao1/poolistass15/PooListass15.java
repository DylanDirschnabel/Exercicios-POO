/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package questao1.poolistass15;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class PooListass15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe um diretório: ");
        String diretorio = teclado.nextLine();
        
        try{
          Diretorio dir = new Diretorio(diretorio);
          long tamanho = dir.obterTamanhoArquivos();
          
          System.out.println("Tamanho dos Arquivos(Byte): "+tamanho);
          System.out.println("Tamanho dos Arquivos(MegaByte): "+(tamanho/1024.0/1024.0));
          
          
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        
        
        
    }
    
}
