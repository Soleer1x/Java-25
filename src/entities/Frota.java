package entities;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    List<Veiculo> lista = new ArrayList<>();

    public Double totalKmGeral() {
        double soma = 0;
        for (Veiculo veiculo1 : lista) {
            soma += veiculo1.getQuilometrosRodados();
        }
        return soma;
    }

    public Double media(){
        double somaL = 0;
        for(Veiculo veiculo1 : lista){
            somaL += veiculo1.getCombustivelGasto();
        }
        return somaL / lista.size();
    }

    public void addVeiculo(Veiculo veiculo) {
        lista.add(veiculo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RELATÓRIO DA FROTA:\n");
        for (Veiculo veiculo : lista) {
                sb.append("- Placa: ")
                    .append(veiculo.getPlaca())
                    .append(" | Rendimento: ")
                    .append(String.format("%.2f", veiculo.calcularKmL()))
                    .append(" Km/L\n");
        }
        sb.append("\nKM TOTAL DA FROTA: ")
                .append(totalKmGeral())
                .append(" Km")
                .append("\nMÉDIA DE CONSUMO POR VEÍCULO: ")
                .append(String.format("%.2f", media()))
                .append(" Litros");
        return sb.toString();
    }
}