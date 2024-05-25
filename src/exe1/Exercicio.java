package exe1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        // Desafio 1 - Mostre a lista na ordem numérica:
        // Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdnados = numeros.stream()
                                        .sorted(Comparator.naturalOrder())
                                        .toList();

        numerosOrdnados.forEach(n -> System.out.println(n));

    }


}
