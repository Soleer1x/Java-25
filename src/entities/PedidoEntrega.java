package entities;

import entities.enums.TipoEnvio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PedidoEntrega {
    private String produto;
    private Double valorProduto;
    private LocalDate dataCompra;
    private TipoEnvio envio;

    public PedidoEntrega(String produto, Double valorProduto, TipoEnvio envio) {
        this.produto = produto;
        this.valorProduto = valorProduto;
        this.envio = envio;
        this.dataCompra = LocalDate.now();
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public TipoEnvio getEnvio() {
        return envio;
    }

    public void setEnvio(TipoEnvio envio) {
        this.envio = envio;
    }

    public LocalDate calcularDataEntrega(){
        switch (envio){
            case ECONOMICO:
                return dataCompra.plusDays(15);
            case PADRAO:
                return dataCompra.plusDays(7);
                case EXPRESSO:
                    return dataCompra.plusDays(2);
                    default:
                        return dataCompra;
        }
    }

    public Double obterValorFrete(){
        switch (envio){
            case ECONOMICO:
                return 10.0;
                case PADRAO:
                    return 25.0;
                    case EXPRESSO:
                        return 50.0;
                        default:
                            return 0.0;
        }
    }

    public Double calcularTotal(){
        return valorProduto + obterValorFrete();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        sb.append("\n--- DETALHES DO PEDIDO ---")
        .append("\nProduto: \"")
                .append(produto)
                .append("\"")
                .append("\nValor do Produto: R$ ")
                .append(valorProduto)
                .append("\nTipo de Envio: ")
                .append(envio);

        sb.append("\n")
        .append("\nRESUMO DO FRETE: ")
                .append("\nValor do Frete: R$ ")
                .append(obterValorFrete())
                .append("\nTotal a Pagar: R$ ")
                .append(calcularTotal())
                .append("\n--------------------------")
                .append("\nData da Compra: ")
                .append(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(LocalDateTime.now()))
                .append("\nPrevisão de Entrega: ")
                .append(dtf.format(calcularDataEntrega()))
        .append("\n--------------------------");

        return sb.toString();
    }
}
