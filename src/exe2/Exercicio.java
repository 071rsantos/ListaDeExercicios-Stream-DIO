package exe2;

import java.util.Arrays;
import java.util.List;


public class Exercicio {
public static void main(String[] args) {
    // Desafio 2 - Imprima a soma dos números pares da lista:
    // Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


    int somaPares = numeros.stream() // inicializando a programacao funcional
                    .filter(n -> n % 2 == 0) // filtrando para ser apenas numeros pares
                    .mapToInt(Integer::intValue) // transformando em int
                    .sum(); // somando valores.
    System.out.println("A soma dos valores pares da lista é de: "+somaPares);
}
}
