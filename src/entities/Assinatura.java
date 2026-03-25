package entities;

import java.time.LocalDate;

public class Assinatura {
    private String cliente;
    private Double valorMensal;
    private LocalDate dataInicio;

    public Assinatura(String cliente, Double valorMensal, LocalDate dataInicio) {
        this.cliente = cliente;
        this.valorMensal = valorMensal;
        this.dataInicio = dataInicio;
    }

    public LocalDate proximaCobranca(){
        return dataInicio.plusMonths(1);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(Double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
}
