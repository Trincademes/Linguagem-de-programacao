import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();
        double num2 = num1 * 2;

        System.out.println("O resultado de " + num1 + " multiplicado por 2 é: " + num2);

        scanner.close();
    }
}