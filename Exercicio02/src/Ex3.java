import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira dois números: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0){
            System.out.println("Esses números são múltiplos.");
        }else{
            System.out.println("Esses números não são múltiplos.");
        }
        scanner.close();
    }
}
