package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Prateleira {
    List<ProdutoAlimenticio> lista = new ArrayList<>();

    public void addProduto(ProdutoAlimenticio pa){
        lista.add(pa);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate hoje = LocalDate.now();

        sb.append("CONTROLE DE VALIDADE: ");
            for(ProdutoAlimenticio pa : lista){

                LocalDate vencimento = pa.dataVencimento();
                long diasFaltam = java.time.temporal.ChronoUnit.DAYS.between(hoje, vencimento);

                sb.append("\n- ")
                        .append(pa.getNome())
                        .append(" | ")
                        .append("Vence em: ")
                        .append(vencimento.format(dtm))
                        .append(" | ")
                        .append("Faltam: ")
                        .append(diasFaltam)
                        .append(" dias");
            }
            sb.append("\n")
                    .append("\nTOTAL DE ITENS NA PRATELEIRA: ")
                    .append(lista.size());

            return sb.toString();
    }
}
