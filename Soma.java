import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        float soma = 0;
        float media;
        float[] numeros = new float[8];
        
        Scanner leitor = new Scanner(System.in);

        // Entrada dos números
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = leitor.nextFloat();
        }

        // Soma dos números
        for (int i = 0; i < 8; i++) {
            soma += numeros[i];
        }

        // Cálculo da média
        media = soma / 8;

        // Exibição da média
        System.out.println("A média é: " + media);
    }
}
