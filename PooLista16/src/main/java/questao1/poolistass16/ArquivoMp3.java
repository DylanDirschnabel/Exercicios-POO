/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistass16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author User
 */
public class ArquivoMp3 {

    private TagMp3 tag = new TagMp3();

    public ArquivoMp3(String nomeArquivo) throws FileNotFoundException, IOException {
        File arquivo = new File(nomeArquivo);

        if (!arquivo.exists()) {
            throw new FileNotFoundException(nomeArquivo);
        }

        if (!arquivo.isFile()) {
            throw new ArgumentoNaoEhArquivoException(nomeArquivo);
        }

        try (FileInputStream fis = new FileInputStream(arquivo)) {

            // pula para os ultimos 128 bytes
            fis.skip(arquivo.length() - 128);

            byte[] dados = new byte[128];

            // Armazena os 128 bytes no vetor dados
            fis.read(dados);

            // Le os 3 primeiros bytes do vetor como uma String
            String cabecalho = extrairTexto(dados, 0, 3);

            if (cabecalho.equals("TAG")) {
                System.out.println(cabecalho);
                
                tag.setTitulo(extrairTexto(dados, 3, 30));

                tag.setArtista(extrairTexto(dados, 33, 30));

                tag.setAlbum(extrairTexto(dados, 63, 30));
                
                if(isNumeric(extrairTexto(dados, 93, 4))) {
                tag.setAno(Integer.parseInt(extrairTexto(dados, 93, 4)));
                }

                tag.setComentario(extrairTexto(dados, 97, 28));

                if(isNumeric(extrairTexto(dados, 126, 1))) {
                tag.setNumeroFaixa(Integer.parseInt(extrairTexto(dados, 126, 1)));
                }
                
                if(isNumeric(extrairTexto(dados, 126, 1))) {
                tag.setGenero(Integer.parseInt(extrairTexto(dados, 127, 1)));
                }
            } else {
                throw new ArquivoNaoTemTagMp3(nomeArquivo);
            }
        }
    }

    /**
     * Converte os bytes de um vetor em String
     * @param dados Vetor de bytes que sera lido
     * @param posicaoInicial o indice do primeiro byte a ser convertido
     * @param qtdBytes a quantidade de bytes que devem ser convertidos
     * @return  Texto resultante da conversao
     */
    private String extrairTexto(byte[] dados, int posicaoInicial, int qtdBytes) {

        byte[] dados2 = new byte[qtdBytes];

        for (int i = 0; i < qtdBytes; i++) {
            dados2[i] = dados[posicaoInicial + i];
        }

        return new String(dados2);

    }

    public TagMp3 getTag() {
        return tag;
    }
    
    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
