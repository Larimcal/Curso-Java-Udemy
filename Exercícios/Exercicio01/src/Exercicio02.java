import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double raio;
        double pi = 3.14159;

        System.out.print("Digite o valor do raio: ");
        raio = scanner.nextDouble();

        double area = pi * Math.pow(raio, 2);

        System.out.printf("A = %.4f\n", area);
    }
}
