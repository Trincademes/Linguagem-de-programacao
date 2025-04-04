import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();
        int divisor = 0;

        for (int i = 1; i <= num1 ; i++) {
            if (num1 % i == 0) {
                divisor++;
            }
        }
        if (divisor == 2){
            System.out.println("O numero: " +num1+ " é primo.");
        } else {
            System.out.println("O numero: " +num1+ " não é primo.");

        }



        scanner.close();
    }
}
