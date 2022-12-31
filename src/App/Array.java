// Separei a função em uma classe separada para deixar o programa principal mais compacto //
package App;

public class Array {
        /* Aqui eu declaro o array que o exercício pediu, porém também seria possível
    receber um array do usuário. */  
    int[] array1 = {1, 2, 3, 4, 5, 6, 6};

    /* Agora eu vou organizar o array em ordem crescente - o que não seria necessário nesse caso
    específico pois ele já está em ordem crescente OBS: também poderia utilizar o arrays.sort*/
    void ordemCrescente() {
        int troca;
        for (int x = 0; x < array1.length; x++); {
            for (int y = 0; y < array1.length - 1; y++) {
                if (array1[y] > array1[y+1]) {
                    troca = array1[y];
                    array1[y] = array1[y+1];
                    array1[y+1] = troca;
                }
            }
        }
    }

    // Aqui é onde eu faço a função //
    void segundoMaior() {
        /* Como eu organizei o array em ordem crescente o maior número está no final, 
        eu vou fazer um loop que parte do penúltimo número. Caso ele não for igual ao
        último (o maior), eu vou retornar. */ 
        int segundo = 0;
        for (int x = array1.length - 2; x >= 0; x--) {     
            if (array1[x] != array1[array1.length - 1]) {
                segundo = array1[x];
                System.out.print("O segundo maior número do array é " +segundo);
                return;
            }
            
        }   
        
    }   
}
