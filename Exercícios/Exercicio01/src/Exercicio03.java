import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A,B,C,D;
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        int diferenca = ((A * B) - (C * D));

        System.out.println("DIFERENCA = " + diferenca);

    }
}
