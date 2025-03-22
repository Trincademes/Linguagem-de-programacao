import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        if (n1 % 2 ==0 ) {
            System.out.println("O numero" +n1+ "é par");
        } else
            System.out.println("O numero" +n1+ "é impar");

        scanner.close();
    }
}