/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistass15;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Diretorio {
    
    private File diretorio;

    public Diretorio(String caminho) {
        diretorio = new File(caminho);

        if (!diretorio.exists()) {
            throw new IllegalArgumentException("O diretório: "
                    + caminho
                    + " não existe.");
        }
    }

    public long obterTamanhoArquivos() {
        // usa o conceito de recurcao, para passar por todos os arquivos
        return obterTamanhoArquivos(diretorio);
    }

    private long obterTamanhoArquivos(File arquivo) {
        long total = 0;

        File[] dir = arquivo.listFiles();
        if (dir != null) {
            for (File f : dir) {
                // toda vez que ele encontrar uma pasta ele chama a funcao novamente
                // para ver qual o tamanha daquela pasta
                if (f.isDirectory()) {
                    total += obterTamanhoArquivos(f);
                } else {
                    total += f.length();
                }
            }
        }

        return total;
    }  
        
}
