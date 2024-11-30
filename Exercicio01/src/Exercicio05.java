import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int codigo1,codigo2;
        int numero1, numero2;
        double valor1, valor2;

        codigo1 = scanner.nextInt();
        numero1 = scanner.nextInt();
        valor1 = scanner.nextDouble();
        codigo2 = scanner.nextInt();
        numero2 = scanner.nextInt();
        valor2 = scanner.nextDouble();

        double valorPago = (valor1*numero1)+(valor2*numero2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorPago);

    }
}
