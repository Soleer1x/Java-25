package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");    
        
        System.out.print("Digite uma data: ");
        String data = leia.nextLine();

        LocalDate minhaData = LocalDate.parse(data, formatter);
        LocalDate futuro = minhaData.plusWeeks(2);

        LocalDate passado = minhaData.minusWeeks(2);

        int ano = minhaData.getYear();
        int mes = minhaData.getMonthValue();
        int dia = minhaData.getDayOfMonth();

        System.out.println();
        System.out.println("Adição de 2 semanas = " + futuro.format(formatter));
        System.out.println("Remoção de 2 semanas = " + passado.format(formatter));

        System.out.println();
        System.out.println("Ano: " + ano);
        System.out.println("Mes: " + mes);
        System.out.println("Dia: " + dia);
    }
}
