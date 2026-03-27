package application;

import entities.ImportedProduct;
import entities.Product4;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program35 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = leia.nextInt();

        List<Product4> lista = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for(int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Product #" + i + " data: ");
            System.out.print("Cummon, used or imported (c/u/i)? ");
            char letra = leia.next().charAt(0);
            System.out.print("Name: ");
            leia.nextLine();
            String name = leia.nextLine();
            System.out.print("Price: ");
            double price = leia.nextDouble();
            if (letra == 'c'){
                Product4 praLista = new Product4(name, price);
                lista.add(praLista);
            }
            else if(letra == 'i'){
                System.out.print("Customs fee: ");
                double customs = leia.nextDouble();
                Product4 praLista1 = new ImportedProduct(name, price, customs);
                lista.add(praLista1);
            }
            else {
                System.out.print("Manufacture date (dd/MM/yyyy): ");
                leia.nextLine();
                String data = leia.nextLine();
                LocalDate date = LocalDate.parse(data, dtf);
                Product4 praLista2 = new UsedProduct(name, price, date);
                lista.add(praLista2);
            }
        }

        System.out.println();
        System.out.println("Price Tags: ");
        for(Product4 product4 : lista){
            System.out.println(product4.priceTag());
        }
    }
}