package exe16;

import java.util.Arrays;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Agrupe os números em pares e ímpares:

        List<Integer> pares = numeros.stream()
                                    .filter(n -> n % 2 == 0)
                                    .toList();
        List<Integer> impares = numeros.stream()
                                    .filter(n -> n % 2 != 0)
                                    .toList();
        System.out.println("Pares:");
        pares.forEach(n -> System.out.print(" "+n));

        System.out.println("\nImpares:");
        impares.forEach(n -> System.out.print(" "+n));

    }
}
