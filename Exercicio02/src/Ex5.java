import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] codigo = {1,2,3,4,5};
        String[] nome = {"Cachorro Quente","X-Salada","X-Bacon","Torrada simples","Refrigerante"};
        double[] preco = {4.00, 4.50, 5.00, 2.00,1.50};

        System.out.println("Qual é o código do item: ");
        int codigoEscolhido = scanner.nextInt();
        System.out.println("Qual é a quantidade deste item: ");
        int quantidade = scanner.nextInt();

        boolean codigoValido = false;
        double precoTotal;

        for (int i = 0; i < codigo.length; i++){
            if (codigoEscolhido == codigo[i]) {
                precoTotal = preco[i] * quantidade;
                System.out.println("------------------------------------");
                System.out.println("Item: " + nome[i]);
                System.out.printf("Preço total: R$ %.2f%n", precoTotal);
                System.out.println("------------------------------------");
                codigoValido = true;
                break;
            }
        }
        if (!codigoValido){
            System.out.println("------------------------------------");
            System.out.println("Esse código não existe!");
            System.out.println("------------------------------------");
        }

        scanner.close();

    }
}
