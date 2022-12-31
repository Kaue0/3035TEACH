// Importando o scanner para entrada de dados //
import java.util.Scanner;

public class Calculo {

    void Operacao() {
    Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: \n");
        float num01 = leitor.nextFloat();
        System.out.print("Digite o segundo número: \n");
        float num02 = leitor.nextFloat();
        System.out.print("Digite o terceiro número: \n");
        float num03 = leitor.nextFloat();

        double soma = num01 + num02 + num03;
        double media = soma/3;
        System.out.printf("A soma de todos os números digitados é: %.2f", soma);
        System.out.printf("\nA média dos números digitados é: %.2f", media);
    }
}
