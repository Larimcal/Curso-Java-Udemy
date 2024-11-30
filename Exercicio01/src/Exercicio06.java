import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double A,B,C;
        double pi = 3.14159;
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        double areaTriangulo = (A*C)/2;
        double areaCirculo = pi*Math.pow(C,2);
        double areaTrapezio = (A+B)*C/2;
        double areaQuadrado = Math.pow(B,2);
        double areaRetangulo = A*B;

        System.out.printf("TRIANGULO: %.3f%n",areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n",areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n",areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n",areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n",areaRetangulo);

    }
}
