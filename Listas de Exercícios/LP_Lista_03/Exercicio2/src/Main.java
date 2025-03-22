import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite um número: ");
        double n2= scanner.nextDouble();

        if (n1 < n2) {
            System.out.println("O numero "+ n2 +"é maior que o numero" +n1);
        } else if (n2 < n1){
            System.out.println("O numero "+ n1 +"é maior que o numero" +n2);
        }else


        scanner.close();
    }
}