/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package questao1.poolistass17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        Municipio menorMunicipio = new Municipio();
        menorMunicipio.setPopularcao(Integer.MAX_VALUE);
        
        Municipio maiorMunicipio = new Municipio();
        maiorMunicipio.setPopularcao(Integer.MIN_VALUE);
        
        File arquivo = new File("C:\\Users\\User\\Downloads\\L14_municipios.csv");
        
        try{
            
            Scanner scanner = new Scanner(arquivo);
            scanner.nextLine();
            while(scanner.hasNext()) {
                
                String[] valores = scanner.nextLine().split(";");
                Municipio municipio = new Municipio(Integer.parseInt(valores[0]), valores[1], valores[2], Integer.parseInt(valores[3]));
                
                if(municipio.getPopularcao() > maiorMunicipio.getPopularcao()) {
                    maiorMunicipio = municipio;
                }
                if(municipio.getPopularcao() < menorMunicipio.getPopularcao()) {
                    menorMunicipio = municipio;
                }
              
            }
            
            System.out.println("Cidade com menor população: " + menorMunicipio.getNome() + " - " + 
                    menorMunicipio.getPopularcao() + " habitantes");
            System.out.println("Cidade com maior população: " + maiorMunicipio.getNome() + " - " + 
                    maiorMunicipio.getPopularcao() + " habitantes");
            scanner.close();
            
        }catch(FileNotFoundException e) {
            
        }
        
        
    }
}
