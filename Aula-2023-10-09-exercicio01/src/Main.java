import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Sequência decrescente");
        System.out.print("Digite um número inteiro: ");
        numero = entrada.nextInt();

        while (numero > 0) {
            System.out.print(numero + ", ");
            numero--;
        }

        if (numero == 0) {
            System.out.println(numero + ".");
        } else if (numero < 0) {
            System.out.println("Número abaixo do limite.");
        }
        
        entrada.close();
    }
}
