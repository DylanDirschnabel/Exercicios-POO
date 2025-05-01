/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsadads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ImportadorEstoque {
    private HashMap<Produto, Integer> estoque = new HashMap();
    File arquivo;
    
    public ImportadorEstoque() {}
    
    public void setArquivo(File arquivo) {
        this.arquivo = arquivo;
    }
   
    public void processarArquivo() throws FileNotFoundException {
        
        Scanner scanner = new Scanner(arquivo);
        scanner.nextLine();
        
        while(scanner.hasNext()) {
            String[] valores = scanner.nextLine().split(";");
            Produto produto = new Produto(valores[0], Double.parseDouble(valores[1]));           
            
            if(estoque.containsKey(produto)) {
                estoque.put(produto, estoque.get(produto) + Integer.valueOf(valores[2]));
            } else {
                estoque.put(produto, Integer.valueOf(valores[2]));
            }

        }
        
    }
    
    public HashMap<Produto, Integer> getEstoque() {
        return estoque;
    }
    
    
}
