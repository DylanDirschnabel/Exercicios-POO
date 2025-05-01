/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistass16;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String arquivo = "C:\\Users\\User\\Downloads\\L13-arquivos-exemplo\\L13_musicaMP3.mp3";
        try {
            ArquivoMp3 mp3 = new ArquivoMp3(arquivo);
            System.out.println("Título: " + mp3.getTag().getTitulo() + "\n"
                    + "Artista: " + mp3.getTag().getArtista() + "\n"
                            + "Álbum: " + mp3.getTag().getAlbum() + "\n"
                                    + "Lançamento: " + mp3.getTag().getAno() + "\n"
                                            + "Comentário: " + mp3.getTag().getComentario());
                            
        } catch (ArgumentoNaoEhArquivoException e) {
            System.out.println("1");
            System.out.println(e.getMessage());
        } catch (ArquivoNaoTemTagMp3 e) {
            System.out.println("2");
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("3");
            System.out.println(e.getMessage());
        }
        
        
    }
}
