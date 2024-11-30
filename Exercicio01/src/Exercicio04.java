import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);;

        int numero;
        int horasTrabalhadas;
        double valorPorHora;
        numero = scanner.nextInt();
        horasTrabalhadas = scanner.nextInt();
        valorPorHora = scanner.nextDouble();

        double salario = horasTrabalhadas*valorPorHora;

        System.out.println("Número = "+numero);
        System.out.printf("Salário = U$ %.2f%n",salario);


    }
}
