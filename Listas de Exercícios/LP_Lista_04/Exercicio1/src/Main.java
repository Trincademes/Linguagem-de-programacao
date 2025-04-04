import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int num1 = scanner.nextInt();

        System.out.println("Tabuada do " + num1 + ":");
        for (int i = 0; i <= 10; i++) {
            int resultado = num1 * i;
            System.out.println(num1 + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}
