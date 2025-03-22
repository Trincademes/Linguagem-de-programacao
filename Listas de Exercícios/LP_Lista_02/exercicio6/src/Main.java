import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade em m/s: ");
        double ms = scanner.nextDouble();

        double conver = ms * 3.6;
        System.out.println("A velocidade de " + ms + " m/s, convertido em km/h é " + conver);

        scanner.close();
    }
}