package ex3;

import ex2.Empregado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main3 {
    static void main() {
        List<Produto> produtos = Arrays.asList(
                new Produto("produtoA", 15500, "Eletrônicos"),
                new Produto("produtoB", 480, "vestuario"),
                new Produto("produtoC", 859, "Eletrônicos"),
                new Produto("produtoD", 2000, "Eletrônicos")
                );

        List<String> des = produtos.stream()
                .filter(prod -> {
                   return prod.categoria().equalsIgnoreCase("Eletrônicos")
                            && prod.preco() > 1000;
                })
                .map(produto ->{
                        return String.format("%s - Preco com desconto: %.2f", produto.nome(), produto.preco() * 0.9);
                })
                .sorted()
                .toList();
        System.out.println();
        des.forEach(System.out::println);
    }
}
