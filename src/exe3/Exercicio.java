package exe3;

import java.util.Arrays;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 3 - Verifique se todos os números da lista são positivos:
        // Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.


        boolean verificador = numeros.stream()
                            .allMatch(n -> n > 0);
        System.out.println("Todos os numeros são positivos? "+verificador);


    }
}
