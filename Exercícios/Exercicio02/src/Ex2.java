import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = scanner.nextInt();

        if (numero %2 == 0){
            System.out.println("Seu número é par.");
        }else {
            System.out.println("Seu número é ímpar.");
        }
        scanner.close();
    }
}
