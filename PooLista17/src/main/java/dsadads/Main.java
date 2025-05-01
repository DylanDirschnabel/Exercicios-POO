/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsadads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\Downloads\\L16_Estoque.csv");
        ImportadorEstoque estoque = new ImportadorEstoque();
        
        estoque.setArquivo(file);
        try {
            estoque.processarArquivo();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Iterator<Map.Entry<Produto, Integer>> iterator = estoque.getEstoque().entrySet().iterator();
        
        while(iterator.hasNext()) {
            HashMap.Entry<Produto, Integer> produtos = iterator.next();
            System.out.println("Produto: " + produtos.getKey().getNome()
                    + "\nValor: " + produtos.getKey().getValor()
                    + "\nEstoque: " + produtos.getValue() + "\n");
        }
    }
}
