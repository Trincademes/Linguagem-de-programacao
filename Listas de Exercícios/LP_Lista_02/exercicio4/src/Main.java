import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double num2 = scanner.nextDouble();

        double med = (num1 + num2) / 2;
        System.out.println("A média das notas " + num1 + " e " + num2 + " é = " + med);

        scanner.close();
    }
}