package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Plano {
    List<Assinatura> lista = new ArrayList<>();

    public Double faturamentoTotal(){
        double soma = 0;
        for(Assinatura assinatura : lista){
            soma += assinatura.getValorMensal();
        }
        return soma;
    }

    public void addCliente(Assinatura assinatura){
        lista.add(assinatura);
    }

    @Override
    public String toString(){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("RELATÓRIO DE ASSINANTES: ");

        for(Assinatura assinatura : lista) {
            LocalDate depois = assinatura.proximaCobranca();
                    sb.append("\n- Cliente: ")
                    .append(assinatura.getCliente())
                            .append(" | Próxima Cobrança: ")
                            .append(depois.format(dtf))
                            .append(" | Valor: R$ ")
                            .append(String.format("%.2f" , assinatura.getValorMensal()));
        }

        sb.append("\n")
        .append("\nFATURAMENTO MENSAL PREVISTO: R$ ")
                .append(String.format("%.2f" , faturamentoTotal()));
        return sb.toString();
    }
}
