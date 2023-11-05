import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int tamanho;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tamanho (mín: 1 e máx: 10): ");
        tamanho = entrada.nextInt();

        if (tamanho > 0 && tamanho <= 10) {
            for (int linha = tamanho; linha > 0; linha--) {
                for (int coluna = linha; coluna > 0; coluna--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Tamanho inválido");
        }

        entrada.close();
    }
}
