import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite um número: ");
        int num2 = scanner.nextInt();

        int primeira = Math.min(num1, num2);
        int ultima = Math.max(num1, num2);



        for (int i = primeira; i < ultima; i++){

            if (i >= 0){
                System.out.println(i);
            }
            System.out.println("Números naturais entre " + primeira + " e " + ultima + ":");
        }

        scanner.close();
    }
}
