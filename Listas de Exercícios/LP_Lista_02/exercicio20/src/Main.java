import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de x1 (primeira raiz): ");
        double x1 = scanner.nextDouble();

        System.out.print("Digite o valor de x2 (segunda raiz): ");
        double x2 = scanner.nextDouble();

        double a = 1;
        double b = -(x1 + x2);
        double c = x1 * x2;

        System.out.println("A equação do segundo grau é:");
        System.out.printf("x^2 %+.2fx %+.2f = 0\n", b, c);

        scanner.close();
    }
}