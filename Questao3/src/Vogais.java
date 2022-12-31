// Importando o scanner para entrada de dados //
import java.util.Scanner;

public class Vogais {

    void somenteVogais() { 
        Scanner leitor = new Scanner(System.in);
        System.out.print("Escreva uma palavra\n");
        // Após criar um Scanner eu faço ele ler a variável que o usuário escreve //
        String palavra = leitor.next();
        // Declaro as vogais que serão retiradas //
        String todasVogais = "s";

        /* Aqui eu faço um loop que vai passar pela palavra e vai ver de uma em uma letra se ela é vogal
        se for, então o if vai mandar para a string todasVogais */
        for (int x = 0; x < palavra.length(); x++) {
            char p = palavra.charAt(x);
            String f = Character.toString(p);
            if (f == "a" || f == "e" || f == "i" || f == "o" || f == "u") {
                todasVogais = todasVogais + f;
            }
        }
        System.out.print(todasVogais);
    }
}
