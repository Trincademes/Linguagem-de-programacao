import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.println("----------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Débito");
        System.out.println("    2. Pix");
        System.out.println("    3. Crédito");
        System.out.println("----------------------------------");
        System.out.print("Escolha a forma de pagamento: ");
        int formaPagamento = scanner.nextInt();

        double valorFinal = 0;

        if (formaPagamento == 1) {
            valorFinal = valorCompra * 0.95;
        } else if (formaPagamento == 2) {
            valorFinal = valorCompra * 0.90;
        } else if (formaPagamento == 3) {
            System.out.print("Escolha o número de parcelas (máx 10): ");
            int parcelas = scanner.nextInt();

            if (parcelas < 1 || parcelas > 10) {
                System.out.println("Número de parcelas inválido.");
                return;
            }

            if (parcelas <= 4) {
                valorFinal = valorCompra * 1.02;
            } else {
                valorFinal = valorCompra * 1.05;
            }
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.printf("Valor final da compra: R$ %.2f\n", valorFinal);
        scanner.close();
    }
}
