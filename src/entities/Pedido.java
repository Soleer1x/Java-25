package entities;

import entities.enums.StatusPedido;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pedido {
    private Integer id;
    private LocalDate dataPedido;
    private StatusPedido status;

    public Pedido(Integer id, LocalDate dataPedido, StatusPedido status) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public LocalDate estimativaEntrega(){
        return dataPedido.plusDays(7);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy") ;

        sb.append("\n--- RESUMO DO PEDIDO ---")
                .append("\nID do Pedido: ")
                .append(id)
                .append("\nDATA DE PEDIDO: ")
                .append(dataPedido)
                .append("\nSTATUS DE PEDIDO: ")
                .append(status);
        sb.append("\n---------------------------")
                .append("\nData Estimada de Entrega: ")
                .append(estimativaEntrega().format(dtf))
                .append("\n(Prazo padrão de 7 dias úteis)")
                .append("\n---------------------------");

        return sb.toString();
    }
}
