import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 String palindromo;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        palindromo = in.nextLine();
        System.out.println("A palavra "+ palindromo + verifica(palindromo));

    }
    public static  String verifica(String palindromo){
        palindromo = palindromo.toLowerCase();
        StringBuilder palindromoinvertido = new StringBuilder();

        for (int i = palindromo.length()-1; i >= 0; i--) {
            palindromoinvertido.append(palindromo.charAt(i));

        }
        if (palindromo.contentEquals(palindromoinvertido)){
            return ", é um palindromo";

        } else {
            return ", não é um palindromo";
        }
    }
}