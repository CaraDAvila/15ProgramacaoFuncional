package ex4;

import ex3.Produto;

import java.util.Arrays;
import java.util.List;

public class Main4 {
    static void main() {
        List<ex3.Produto> produtos = Arrays.asList(
                new Produto()
        );

        List<String> rel = produtos.stream()
                .filter(prod -> {
                    return prod.categoria().equalsIgnoreCase("Eletrônicos")
                            && prod.avaliacao() > 1000;
                })
                .map()
                .collect()
                .sorted()
                .toList();

    }
}
