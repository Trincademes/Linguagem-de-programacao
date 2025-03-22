import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a velocidade inicial  ");
        double vinicial = scanner.nextDouble();

        System.out.print("Digite a acelereção   ");
        double ace = scanner.nextDouble();

        System.out.print("Digite o tempo    ");
        double tempo  = scanner.nextDouble();

        double vfinal =(vinicial + ace * tempo);

        System.out.println("A velocidade final é "+vfinal);
    }
}