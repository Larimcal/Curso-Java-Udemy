import java.util.Scanner;

public class Exemplo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        char sexo;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();;
        sexo = sc.next().charAt(0);

        System.out.println("Seu nome é: " + x );
        System.out.println("Sua idade é: " + y + " anos");
        System.out.printf("Sua altura é: %.2f cm%n", z );
        System.out.printf("Digite F (Feminino) ou M (Masculino) para seu sexo: " + sexo );

        sc.close();

    }
}
