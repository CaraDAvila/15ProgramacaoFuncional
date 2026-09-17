package ex4;

public record Produto(
        String nome,
        double preco,
        String categoria,
        int avaliacao,
        boolean emEstoque) {}
