import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero enre 5 e 9 ");
        int n1 = scanner.nextInt();

        switch (n1) {
            case 5:
                System.out.println("Opção escolhida: 5");
                break;
            case 6:
                System.out.println("Opção escolhida: 6");
                break;
            case 7:
                System.out.println("Opção escolhida: 7");
                break;
            case 8:
                System.out.println("Opção escolhida: 8");
                break;
            case 9:
                System.out.println("Opção escolhida: 9");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
