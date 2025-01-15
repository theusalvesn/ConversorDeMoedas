package br.com.conversordemoedas.main;

import br.com.conversordemoedas.api.CurrencyAPI;
import br.com.conversordemoedas.service.ConversionService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CurrencyAPI currencyAPI = new CurrencyAPI();
        ConversionService service = new ConversionService(currencyAPI);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("\n=== Menu de Conversão de Moedas ===");
            System.out.println("1. Converter moedas");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                int currencyOption;
                do {
                    String baseCurrency = "BRL";
                    String targetCurrency;

                    System.out.println("\nEscolha a moeda de destino:");
                    System.out.println("1. ARS (Peso argentino)");
                    System.out.println("2. BOB (Boliviano)");
                    System.out.println("3. MXN (Peso mexicano)");
                    System.out.println("4. CLP (Peso chileno)");
                    System.out.println("5. COP (Peso colombiano)");
                    System.out.println("6. USD (Dólar americano)");
                    System.out.println("7. Voltar para o menu principal");
                    System.out.print("Opção: ");

                    currencyOption = scanner.nextInt();
                    scanner.nextLine();
                    targetCurrency = getCurrencyCode(currencyOption);

                    if (targetCurrency == null) {
                        if (currencyOption == 7) break; // Voltar ao menu principal
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                        continue;
                    }

                    System.out.print("Digite a quantidade em BRL: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    if (amount <= 0) {
                        System.out.println("Por favor, insira um valor positivo.");
                        continue;
                    }

                    try {
                        double result = service.convert(baseCurrency, targetCurrency, amount);
                        System.out.printf("Resultado: %.2f %s equivalem a %.2f %s%n", amount, baseCurrency, result, targetCurrency);
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }

                } while (currencyOption != 7);

            } else if (option == 2) {
                exit = true;
                System.out.println("Obrigado por usar o conversor de moedas!");
            } else {
                System.out.println("Opção inválida. Por favor, escolha novamente.");
            }

        } while (!exit);
    }

    private static String getCurrencyCode(int option) {
        return switch (option) {
            case 1 -> "ARS";
            case 2 -> "BOB";
            case 3 -> "MXN";
            case 4 -> "CLP";
            case 5 -> "COP";
            case 6 -> "USD";
            default -> null;
        };
    }
}
