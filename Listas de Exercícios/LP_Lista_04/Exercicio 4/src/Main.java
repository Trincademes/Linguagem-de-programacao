import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabela de Conversão: Celsius para Fahrenheit");
        System.out.println("---------------------------------------------");
        System.out.println("Celsius|Fahrenheit");
        System.out.println("---------------------------------------------");

        int celsius = -80;

        while (celsius <= 80) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;

            System.out.printf("%d°C\t|\t%.1f°F%n", celsius, fahrenheit);

            celsius += 10;

        }
    }
}


// Tá certo isso?

