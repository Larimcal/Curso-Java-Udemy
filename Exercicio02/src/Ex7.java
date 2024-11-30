
import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double x = 0, y = 0;
        boolean entradaValida;


        do {
            System.out.println("Digite o valor de x (uma casa decimal): ");
            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
                entradaValida = true;
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número decimal.");
                entradaValida = false;
                scanner.next();
            }
        } while (!entradaValida);


        do {
            System.out.println("Digite o valor de y (uma casa decimal): ");
            if (scanner.hasNextDouble()) {
                y = scanner.nextDouble();
                entradaValida = true;
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número decimal.");
                entradaValida = false;
                scanner.next();
            }
        } while (!entradaValida);

        System.out.println("------------------------------------");

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante Q4");
        }

        System.out.println("------------------------------------");
        scanner.close();
    }
}



