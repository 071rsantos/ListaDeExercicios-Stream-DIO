package exe7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercicio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Encontrar o segundo número maior da lista:

        Optional<Integer> numerosReverse= numeros.stream()
                                            .distinct()
                                            .sorted(Comparator.reverseOrder())
                                            .skip(1)
                                            .findFirst();
        System.out.println("Segundo maior numero da lista: "+numerosReverse.get());

    }
}
