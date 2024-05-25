package exe17;

import java.util.Arrays;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Filtrar os números primos da lista:
        
        List<Integer> primos = numeros.stream()
                                    .filter(n -> primo(n))
                                    .toList();

        primos.forEach(n -> System.out.print(" "+n));

    }
    public static boolean primo(int n){
        if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
    }
}
