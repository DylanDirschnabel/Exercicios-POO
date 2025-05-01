/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistas9;

import java.util.Comparator;

/**
 *
 * @author User
 */
public class OrdenarMatricula implements Comparator<Aluno>{   
    
    @Override
    public int compare(Aluno a1, Aluno a2) {
        if(a1.getMatricula() < a2.getMatricula()) {
            return -1;
        } else if(a1.getMatricula() > a2.getMatricula()) {
            return 1;
        } else {
            return 0;
        }
    }
}
