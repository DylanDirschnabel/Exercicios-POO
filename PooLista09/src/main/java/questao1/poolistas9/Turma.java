/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.poolistas9;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Turma {
     private String disciplina;
    private Professor professor;
    private Aluno aluno;
    private Turno turno;
    private ArrayList<Aluno> turma = new ArrayList<>();
   
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getDisciplina() {
        return disciplina;
    }
   
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Professor getProfessor() {
        return professor;
    }
   
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public Aluno getAluno() {
        return aluno;
    }
   
    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    public Turno getTurno() {
        return turno;
    }
   
    public void incluirAluno(Aluno aluno) {
        turma.add(aluno);
    }
    public ArrayList<Aluno> getAlunos() {
        return turma;
    }
    public void removerAluno(Aluno aluno) {
        turma.remove(aluno);
    }
   
    public Aluno obterAlunoMelhorNotaEnem() {
        Aluno melhorNota = new Aluno();
        melhorNota.setNota(0);

        for (int i = 0; i < turma.size(); i++) {
            if (melhorNota.getNota() < turma.get(i).getNota()) {
                melhorNota = turma.get(i);
            }
        }
        return melhorNota;
    }
    
    public int getSize() {
        return turma.size();
    }

    
}
