// Importando o necessário de datas //
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Date;


public class converterData {

    void escritoEmData() throws ParseException {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Escreva uma data no formato MM/dd/yyyy\n");
        // Após criar um Scanner eu faço ele ler a variável que o usuário escreve //
        String entraData = leitor.next();

        /* Aqui eu formato a data para  aparecer o mês, dia e ano, nessa ordem. Além disso nessa
        formatação aparece também o dia da semana. */
        String formato = "MM/dd/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        Date data = sdf.parse(entraData);
        System.out.println(data);

    }

}
