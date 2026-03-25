package entities;

public class ItemServico {
    private Integer quantidade;
    private Double precoUnitario;
    private DescricaoServico tipoServico;

    public ItemServico(Integer quantidade, Double precoUnitario, DescricaoServico tipoServico) {
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.tipoServico = tipoServico;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public DescricaoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(DescricaoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public Double valorParcial(){
        return quantidade * precoUnitario;
    }

    public Double impostoSobreItem(){
        return valorParcial() * 0.05;
    }
}
