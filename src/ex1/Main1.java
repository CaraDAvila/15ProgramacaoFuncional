package ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main1 {
    static void main() {
        List<String> lista = Arrays.asList("John Doe","Jane Doe","Joe Doe", "Adrian Christian Hernandes");

        List<String> nomes = lista.stream()
                .filter(nome -> nome.startsWith("A"))
                .map(nome -> nome.toUpperCase())
                .sorted()

                .toList(); //fecha

        nomes.forEach(System.out::println);
    }
}
