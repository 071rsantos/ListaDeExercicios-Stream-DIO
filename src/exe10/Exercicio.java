package exe10;

import java.util.Arrays;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        //Agrupe os valores ímpares múltiplos de 3 ou de 5:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosMutiplos =  numeros.stream()
                                                //.distinct() //caso nao queira numeros repetidos
                                                .filter(n -> n % 2 != 0)
                                                .filter(n -> n % 3 == 0 || n % 5 == 0)
                                                .toList();
        numerosMutiplos.forEach(n -> System.out.print(" " +n));
    }
}
