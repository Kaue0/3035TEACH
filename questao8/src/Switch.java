// Aqui eu estou chamando o Scanner //
import java.util.Scanner;

public class Switch {
    
    void Operacoes(int num1, int num2) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número de acordo com a operação desejada: ");
        System.out.print("\n1 caso queira somar os dois números");
        System.out.print("\n2 caso queira subtrair o primeiro do segundo número");
        System.out.print("\n3 caso queira multiplicar os dois números");
        System.out.println("\n4 caso queira dividir o primeiro pelo segundo número");
        System.out.print("\n");
        int numero = entrada.nextInt();
        switch(numero) { // Meu switch tem um parametro de numero, que ele reconhece e completa as operações correspondentes abaixo //
            case 1:
                int resultado1 = num1 + num2;
                System.out.printf("\nA soma dos dois números é de: %d", resultado1);
                break;
            case 2:
                int resultado2 = num1 - num2;
                System.out.printf("\nA subtração dos dois números é de: %d", resultado2);
                break;
            case 3:
                int resultado3 = num1 * num2;
                System.out.printf("\nA multiplicação dos dois números é de: %d", resultado3);
                break;
            case 4:
                int resultado4 = num1 / num2;
                System.out.printf("\nA divisão dos dois números é de: %d", resultado4);
                break;
            default:
                System.out.print("\nEssa não é uma opção válida, tente novamente mais tarde.");
                break;
        }

    }
}
