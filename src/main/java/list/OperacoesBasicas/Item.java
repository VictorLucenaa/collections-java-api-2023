package main.java.list.OperacoesBasicas;

public class Item {

    private String nome;
    private Double preco;
    private int quantidade;

    public Item(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
