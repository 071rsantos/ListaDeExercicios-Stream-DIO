package exe18;

import java.util.Arrays;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Verifique se todos os números da lista são iguais:

        boolean verificador = numeros.stream()
                                    .allMatch(n -> n.equals(numeros.get(0)));
        System.out.println("Todos os numeros da lista sao iguais? "+verificador);

    }
}
