package entities;

public class Estoque {
    private Integer id;
    private String nome;
    private Double estoque;

    public Estoque(Integer id, String nome, Double estoque) {
        this.id = id;
        this.nome = nome;
        this.estoque = estoque;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getEstoque() {
        return estoque;
    }

    public void darBaixa(Double quantidade) {
        this.estoque = this.estoque - quantidade;
    }

    public String toString(){
        return id + ", " + nome + ", " + String.format("%.0f%n unidades", estoque);
    }
}
