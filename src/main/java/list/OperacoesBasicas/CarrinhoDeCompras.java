package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributos
    private List<Item> itensList;

    public CarrinhoDeCompras(){
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itensList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item>itensParaRemover = new ArrayList<>();
        if (!itensList.isEmpty()) {
            for (Item item : itensList) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(item);
                }
            }
            itensList.removeAll(itensParaRemover);
        }else {
            System.out.println("A lista está vazia!");
        }
    }
    public double calcularValorTotal() {
        Double valorTotal = 0.0;
        if (!itensList.isEmpty()) {
            for (Item item : itensList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibirItens(){
       if (!itensList.isEmpty()){
           System.out.println(this.itensList);
       }else{
           System.out.println("A lista está vazia!");
       }
    }

    @Override
    public String toString(){
        return "CarrinhoDecompras{" +
                "itens=" + itensList +
                '}';
    }

    public void adicionarQuantidade(String nome, int quantidade){
        for(Item t : itensList) {

            int aumentarQuantidade = 0;
            if (t.getNome().equalsIgnoreCase(nome)) {
                aumentarQuantidade = t.getQuantidade() + quantidade;
                t.setQuantidade(aumentarQuantidade);
                return;

            }
        }

    }
    public void removerQuantidade(String nome, int quantidade){
        for(Item t : itensList) {


            if (t.getNome().equalsIgnoreCase(nome)) {
                int removerQuantidade;
                if(t.getQuantidade() >= 1){
                    removerQuantidade = t.getQuantidade() - quantidade;
                    t.setQuantidade(removerQuantidade);
                    return;

                }
            }

            }
        }




    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

    }
}
