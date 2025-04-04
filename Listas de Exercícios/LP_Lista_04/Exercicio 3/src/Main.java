import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 1;
        System.out.println("Números positivos divisíveis por 4 e menores que 200:");


        while (num1 < 200){

    if(num1 % 4 == 0){
        System.out.println(num1);
            }
    num1++;
        }
        scanner.close();
    }
}
