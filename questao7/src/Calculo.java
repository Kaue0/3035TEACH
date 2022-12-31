public class Calculo {

    // Aqui o número é em forma de parametro na hora de chamar a função//
    public void Operacao(float numero) {

        float cinco = numero/20; //Aqui é o calculo de 5% //
        float cinquenta = numero/2; // Aqui é dividir pela metade para conseguir 50% //
        float cemCinquenta = (numero/2) + numero; // Aqui eu faço o calculo para conseguir os 150% //
        System.out.printf("5% do número digitado equivalem a: %.1f", cinco);
        System.out.printf("\n50% do número digitado equivalem a: %.2f", cinquenta);
        System.out.printf("\n150% do número digitado equivalem a: %.3f", cemCinquenta);
    }
}
