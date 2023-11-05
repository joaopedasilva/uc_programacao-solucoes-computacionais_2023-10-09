import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int tamanho;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Gerador de quadrados");
        System.out.print("Digite o tamanho do quadrado: ");
        tamanho = entrada.nextInt();

        if (tamanho > 0 && tamanho <= 10) {
            for (int linha = 0; linha < tamanho; linha++) {
                for (int coluna = 0; coluna < tamanho; coluna++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Tamanho inválido.");
        }

        entrada.close();
    }
}
