package entities;

import entities.enums.Prioridade;

import java.time.LocalDate;

public class Servico {
    private String descricao;
    private LocalDate dataInicio;
    private Prioridade prioridade;

    public Servico(String descricao, LocalDate dataInicio, Prioridade prioridade) {
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDate calcularDataEntrega(){
        switch (prioridade){
            case BAIXA:
                return dataInicio.plusDays(1);
            case MEDIA:
                return dataInicio.plusDays(3);
            case ALTA:
                return dataInicio.plusDays(7);
            default:
                return dataInicio;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n--- REGISTRO DE SERVIÇO ---")
                .append("\nDescrição: ")
                .append(descricao)
                .append("\nData de Início: ")
                .append(dataInicio)
                .append("\nPrioridade: ")
                .append(prioridade);

        sb.append("\n")
                .append("\nRESULTADO: ")
                .append("\nO serviço \"")
                .append(descricao + "\"")
                .append(" (Prioridade ")
                .append(prioridade + ")")
                .append("\nestará pronto em: ")
                .append(calcularDataEntrega())
                .append("\n---------------------------");

        return sb.toString();
    }
}
