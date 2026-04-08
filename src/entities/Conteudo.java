package entities;

public class Conteudo {
    private String titulo;
    private Integer anoLancamento;

    public Conteudo() {

    }

    public Conteudo(String titulo, Integer anoLancamento) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String descricao(){
        return titulo + " - " + anoLancamento;
    }
}
