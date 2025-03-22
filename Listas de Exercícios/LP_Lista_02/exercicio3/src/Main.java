import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = scanner.nextDouble();

        double num2 = num1 / 5;
        System.out.println("A quinta parte de " + num1 + " é = " + num2);

        scanner.close();
    }
}