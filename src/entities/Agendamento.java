package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agendamento {
    private LocalDate dataEntrada;
    private String observacao;
    private Cliente cliente;
    List<ItemServico> lista = new ArrayList<>();

    public Agendamento(LocalDate dataEntrada, String observacao, Cliente cliente) {
        this.dataEntrada = dataEntrada;
        this.observacao = observacao;
        this.cliente = cliente;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addServico(ItemServico item){
        lista.add(item);
    }

    public Double calcularTotal(){
        double soma = 0;
        for(ItemServico item : lista){
            soma += item.valorParcial();
        }
        return soma;
    }

    public LocalDate dataRetirada(){
        return dataEntrada.plusDays(3);
    }

    public Double somaImpostos(){
        double soma = 0;
        for(ItemServico item : lista){
            soma += item.impostoSobreItem();
        }
        return soma;
    }

    public Double somaValorParcial(){
        double soma = 0;
        for(ItemServico item : lista){
            soma += item.valorParcial();
        }
        return soma;
    }

    public Double somaImpostosEValorParcial(){
        return somaImpostos() + somaValorParcial();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("--- RECIBO DE AGENDAMENTO #001 ---")
            .append("\nCliente: ")
                .append(cliente.getNome())
                .append("\nTelefone: ")
                .append(cliente.getTelefone())
                .append("\nData de Entrada: ")
                .append(dataEntrada)
                .append("\nData para Retirada: ")
                .append(dataRetirada())
                .append("\nStatus: ")
                        .append(getObservacao());

        sb.append("\n")
            .append("\nDETALHAMENTO DOS SERVIÇOS: ")
                .append("\n------------------------------------------------------------");
        for(ItemServico item : lista){
            sb.append("\nServiço: ")
                    .append(item.getTipoServico().getNomeServico())
                    .append(" | Qtd: ")
                    .append(item.getQuantidade())
                    .append(" | Subtotal: ")
                    .append(item.valorParcial())
                    .append(" | Taxa (5%): ")
                    .append(item.impostoSobreItem());
        }

        sb.append("\n------------------------------------------------------------");
        sb.append("\n")
            .append("\nRESUMO FINANCEIRO: ");
        sb.append("\nValor Bruto: R$ ")
                .append(calcularTotal())
                .append("\nTotal de Impostos (5%): ")
                .append(somaImpostos())
                .append("\nVALOR TOTAL A PAGAR: R$ ")
                .append(somaImpostosEValorParcial());
        return sb.toString();
    }
}
