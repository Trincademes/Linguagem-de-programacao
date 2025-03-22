import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2= scanner.nextDouble();

        double med = (n1+n2)/2;

        if (med >= 8.5) {
            System.out.println("A");

        } else if (med >= 7 && med < 8.5) {
            System.out.println("B");

        } else if (med>= 5 && med < 7) {
            System.out.println("C");

        } else if (med < 5) {
        System.out.println("D");
    }

        scanner.close();
    }
}