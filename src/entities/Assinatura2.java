package entities;

import entities.enums.TipoPlano;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Assinatura2 {
    private String nomeCliente;
    private LocalDate dataInicio;
    private TipoPlano plano;

    public Assinatura2(String nomeCliente, LocalDate dataInicio, TipoPlano plano) {
        this.nomeCliente = nomeCliente;
        this.dataInicio = dataInicio;
        this.plano = plano;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public TipoPlano getPlano() {
        return plano;
    }

    public void setPlano(TipoPlano plano) {
        this.plano = plano;
    }

    public LocalDate calcularVencimento() {
        switch (plano) {
            case MENSAL:
                return dataInicio.plusMonths(1);
            case TRIMESTRAL:
                return dataInicio.plusMonths(3);
            case ANUAL:
                return dataInicio.plusMonths(12);
            default:
                return dataInicio;
        }
    }

    public Double obterPreco(){
        if(plano == TipoPlano.MENSAL){
            return 100.0;
        }
        else if(plano == TipoPlano.TRIMESTRAL){
            return 300.0;
        }
        else {
            return 800.0;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n--- RECIBO DE ASSINATURA ---")
                .append("\nCliente: \"")
                .append(nomeCliente)
                .append("\"")
                .append("\nPlano Selecionado: ")
                .append(plano)
                .append("\nData de Adesão: ")
                .append(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataInicio));

        sb.append("\n")
        .append("\nDETALHES DO CONTRATO:")
                .append("\nO plano \"")
                .append(plano)
                .append("\" custa: R$ ")
                .append(obterPreco())
                .append("\nSua assinatura é válida até: ")
                .append(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(calcularVencimento()));
        return sb.toString();
    }
}
