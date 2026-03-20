package entities;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nomeDisciplina;
    List<Aluno> lista = new ArrayList<>();

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void addAluno(Aluno aluno){
        lista.add(aluno);
    }

    public Double calcularMediaTurma(){
        double soma = 0;

        for(Aluno aluno : lista){
            soma += aluno.getNota();
        }
        return soma / lista.size();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("DISCIPLINA: ")
                .append(getNomeDisciplina())
                .append("\nALUNOS: ");
        for(Aluno aluno : lista) {
                sb.append("\n- ")
                    .append(aluno.getNome() + ": ")
                    .append(aluno.getNota());
        }
        sb.append("\n")
        .append("\nMÉDIA DA TURMA: ")
                .append(calcularMediaTurma());

        return sb.toString();
    }
}
