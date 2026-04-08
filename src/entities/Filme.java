package entities;

public class Filme extends Conteudo{
    private Integer duracaoMinutos;

    public Filme(Integer duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public Filme(String titulo, Integer anoLancamento, Integer duracaoMinutos) {
        super(titulo, anoLancamento);
        this.duracaoMinutos = duracaoMinutos;
    }

    public Integer getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(Integer duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String descricao() {
        return "Filme: \"" + getTitulo() + "\"" + " (" + getAnoLancamento() + ") - Duração: " + getDuracaoMinutos() + " min.";
    }
}
