package entities;

public class Aluno {
    private String nome;
    private Double nota;

    public Aluno(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public Double getNota() {
        return nota;
    }
}
