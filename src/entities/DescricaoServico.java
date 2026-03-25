package entities;

public class DescricaoServico {
    private String nomeServico;
    private Double precoBase;

    public DescricaoServico(String nomeServico, Double precoBase) {
        this.nomeServico = nomeServico;
        this.precoBase = precoBase;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public Double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(Double precoBase) {
        this.precoBase = precoBase;
    }
}
