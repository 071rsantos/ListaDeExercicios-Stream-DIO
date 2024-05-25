package exe8;

import java.util.Arrays;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Somar os dígitos de todos os números da lista:
        int somaDigitos= numeros.stream()
                                .map(n -> n.toString().split("")) // transformando os elementos da arrays em uma String e utilizando o .split("") para separar cada elemento
                                .flatMap(Arrays::stream) // transformando toda Arrays em stream
                                .mapToInt(Integer::parseInt) // transformando os elementos (String) em int
                                .sum(); // somando
        System.out.println("Soma de cada digito: "+somaDigitos);
    }
}
