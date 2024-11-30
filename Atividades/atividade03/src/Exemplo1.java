import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        String x,y,z,sexo;


        System.out.println("Seu nome é: ");
        x = scanner.nextLine();
        System.out.println("Sua idade é: " );
        y = scanner.nextLine();
        System.out.println("Sua altura é: ");
        z = scanner.nextLine();
        System.out.printf("Digite F (Feminino) ou M (Masculino) para seu sexo: " );
        sexo = scanner.nextLine();

        scanner.close();
    }
}