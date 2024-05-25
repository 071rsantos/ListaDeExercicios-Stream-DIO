package exe5;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Exercicio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Calcule a média dos números maiores que 5:

        OptionalDouble mediaValoresMaiorCinco = numeros.stream()
                                                .filter(n -> n > 5)
                                                .mapToInt(Integer::intValue)
                                                .average();

        System.out.println("A media dos valores maiores que cinco na lista é: "+mediaValoresMaiorCinco.getAsDouble());
    }
}
