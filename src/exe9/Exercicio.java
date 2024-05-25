package exe9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Verificar se todos os números da lista são distintos (não se repetem):

        boolean verificador= numeros.stream()
                                    .allMatch(new HashSet<>()::add);
        System.out.println("Todos os numeros da lista sao diferentes? "+verificador);
    }
}
