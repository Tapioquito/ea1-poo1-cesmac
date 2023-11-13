import Model.Entities.Ticket;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] movies = {"The Man Who Erased His Name", "Ishin!", "Like a Dragon"};
        String[] sessions = {"15h", "17h", "21h"};
        Double[] prices = {32.0, 16.0};

        String movie;
        String session;
        Double price;

        ArrayList<Ticket> tickets = new ArrayList<>();

        System.out.println("Boas-vindas ao Cine Pajuçara!");
        System.out.println("Quantos ingressos vamos comprar?");
        int numberOfTickets = sc.nextInt();

        for (int i = 0; i < numberOfTickets; i++) {
            System.out.println("Vamos inserir os dados para o ingresso número " + (i + 1));
            System.out.println("Qual o título do filme?\n" +
                    "Digite o número: ");
            for (int m = 0; m < movies.length; m++) {
                System.out.println((i + 1) + " " + movies[m]);
            }
            movie = sc.nextLine();

            switch (movie) {
                case "1":
                    movie = movies[0]
                    break;
                case "2":
                    movie = movies[1]
                    break;
                case "3":
                    movie = movies[2]
                    break;
                default:
                    System.out.println("Id inváldo");
            }

            System.out.println("Qual o horário da sessão?\n" +
                    "Digite o número: ");
            for (int s = 0; s < sessions.length; s++) {
                System.out.println((i + 1) + " " + sessions[s]);
            }
            session = sc.nextLine();
            switch (session) {
                case "1":
                    session = sessions[0]
                    break;
                case "2":
                    session = sessions[1]
                    break;
                case "3":
                    session sessions[ 2]
                    break;
                default:
                    System.out.println("Id inváldo");
            }
            System.out.println("Inteira ou meia?\n" +
                    "Digite o número: ");
            System.out.println("1 - Inteira: $ 32.00");
            System.out.println("2 - Meia: 16.00");
            String p = sc.nextLine();
            switch (p) {
                case "1":
                    price = prices[0]
                    break;
                case "2":
                    price = prices[1]
                    break;

                default:
                    System.out.println("Id inváldo");
            }

            tickets.add(new Ticket(movie, price, session))

        }


        double sum;
        for (int i = 0; i < tickets.length; i++) {
            sum += tickets[i].getPrice();
        }

        System.out.println("Valor total dos ingressos: " + sum);
        System.out.println("Bons filmes!");

        sc.close();
    }
}
