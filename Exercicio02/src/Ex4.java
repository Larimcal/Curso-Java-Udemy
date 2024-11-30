import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi a hora inicial e a hora final?");
        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        int duracao;
        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O JOGO DUROU "+ duracao +" HORA(S)");

        scanner.close();
    }
}
