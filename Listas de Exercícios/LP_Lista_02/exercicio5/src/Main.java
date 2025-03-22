import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade em km/h: ");
        double km = scanner.nextDouble();

        double conver = km / 3.6;
        System.out.println("A velocidade de " + km + " km/h, convertido em m/s é " + conver);

        scanner.close();
    }
}