package exe14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercicio {
 public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    //Encontre o maior número primo da lista:

    Optional<Integer> maiorPrimo = numeros.stream()
                            .filter(n -> isPrime(n))
                            .max(Integer::compareTo);
    maiorPrimo.ifPresent(n -> System.out.println(n));
 }

public static boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
    }
}