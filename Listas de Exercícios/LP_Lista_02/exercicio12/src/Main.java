import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota  ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota  ");
        double n2 = scanner.nextDouble();

        double n2p2 = n2*2;

        double media = ( n1+n2p2)/2;
        System.out.println(" A média é "+media);
    }
}