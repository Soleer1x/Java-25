package entities;

public class Serie extends Conteudo {
    private Integer temporadas;
    private Integer episodiosPorTemporada;

    public Serie(Integer temporadas, Integer episodiosPorTemporada) {
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public Serie(String titulo, Integer anoLancamento, Integer temporadas, Integer episodiosPorTemporada) {
        super(titulo, anoLancamento);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

    public Integer getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(Integer episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    @Override
    public String descricao() {
        return "\nSérie: \"" + getTitulo() + "\" (" + getAnoLancamento() + ") - " + getTemporadas() + " Temporadas (Total: " + (getTemporadas() * getEpisodiosPorTemporada()) + " episódios)";
    }
}
