import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = scanner.nextInt();

        if (numero >= 0){
            System.out.println("Seu número é positivo.");
        }else {
            System.out.println("Seu número é negativo.");
        }
        scanner.close();
    }
}