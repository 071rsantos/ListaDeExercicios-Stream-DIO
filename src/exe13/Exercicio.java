package exe13;

import java.util.Arrays;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Filtrar os números que estão dentro de um intervalo:
        List<Integer> numerosIntervalo = numeros.stream()
                                            .filter(n -> n > 5 && n < 10)
                                            .toList();

        numerosIntervalo.forEach(s -> System.out.println(s));
    }
}
