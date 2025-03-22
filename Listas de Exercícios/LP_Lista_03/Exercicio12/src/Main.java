import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos números
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        // Exibição do menu
        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Soma");
        System.out.println("    2. Subtração");
        System.out.println("    3. Multiplicação");
        System.out.println("    4. Divisão");
        System.out.println("------------------------------");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        System.out.println("------------------------------");

        // Cálculo e exibição do resultado
        switch (opcao) {
            case 1:
                System.out.println("Resultado: " +n1+ " + " +n2+ " = " + (n1 + n2));
                break;
            case 2:
                System.out.println("Resultado: " +n1+ " - " +n2+ " = " + (n1 - n2));
                break;
            case 3:
                System.out.println("Resultado: " +n1+ " x " +n2+ " = " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Resultado: " +n1+ " / " +n2+ " = " + (n1 / n2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
