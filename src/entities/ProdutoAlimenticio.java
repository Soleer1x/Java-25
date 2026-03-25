package entities;

import java.time.LocalDate;

public class ProdutoAlimenticio {
    private String nome;
    private LocalDate dataFabricacao;
    private Integer diasValidade;

    public ProdutoAlimenticio(String nome, LocalDate dataFabricacao, Integer diasValidade) {
        this.nome = nome;
        this.dataFabricacao = dataFabricacao;
        this.diasValidade = diasValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Integer getDiasValidade() {
        return diasValidade;
    }

    public void setDiasValidade(Integer diasValidade) {
        this.diasValidade = diasValidade;
    }

    public LocalDate dataVencimento(){
        return dataFabricacao.plusDays(diasValidade);
    }
}
