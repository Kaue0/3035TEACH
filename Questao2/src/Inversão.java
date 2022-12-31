// Importando o scanner para entrada de dados //
import java.util.Scanner;

public class Inversão {

    void inverteFrase() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Escreva algo\n");
        // Após criar um Scanner eu faço ele ler a variável que o usuário escreve //
        String frase = leitor.next();
        /*  Aqui eu utilizo o StringBuilder do java para reverter a string, sendo
        assim muito menos trabalhoso do que fazer manualmente */
        String invertido = new StringBuilder(frase).reverse().toString();
        System.out.print(invertido);
    }
}
