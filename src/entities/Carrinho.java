package entities;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    List<Product3> lista = new ArrayList<>();

    public Double total(){
        double soma = 0;
        for(Product3 product3 : lista){
            soma += product3.getPreco();
        }
        return soma;
    }

    public void addProduct(Product3 product3){
        lista.add(product3);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("CARRINHO DE COMPRAS:");

        for(Product3 product3 : lista){
            sb.append("\n")
            .append("- ")
            .append(product3.getNome())
                    .append(": $")
                    .append(product3.getPreco());
        }

        sb.append("\nTOTAL DA COMPRA: ").append(total());
        return sb.toString();
    }
}
