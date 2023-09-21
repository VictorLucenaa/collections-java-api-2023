package main.java.list.OperacoesBasicas;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CarrinhoDeCompras {

    private List<Item> itensList;

    public CarrinhoDeCompras(){
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itensList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item>itensParaRemover = new ArrayList<>();
        for(Item item : itensList){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }
        itensList.removeAll(itensParaRemover);
    }
    public double calcularValorTotal(){
        Double valorTotalCompra = 0.0;
        for(Item preco : itensList){
            if(preco.getQuantidade() > 1) valorTotalCompra += (preco.getPreco() * preco.getQuantidade());
            else{
                valorTotalCompra += preco.getPreco();
            }
        }

        DecimalFormat df = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
        String numeroFormatado = df.format(valorTotalCompra);

         return Double.parseDouble(numeroFormatado);
    }
    public void exibirItens(){
        for(Item str : itensList)
            System.out.println("Item de nome: " + str.getNome() + " R$: " + str.getPreco() + " Quantidade: " + str.getQuantidade());
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
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        DecimalFormat df = new DecimalFormat("#.00");

        carrinhoDeCompras.adicionarItem("O senhor dos anéis", 47.50, 2);
        carrinhoDeCompras.adicionarItem("Cadeira Gamer Vikings", 998.0, 1);
        carrinhoDeCompras.adicionarItem("Cadeira Gamer Vikings", 998.0, 1);
        carrinhoDeCompras.adicionarItem("Monitor full HD 32'", 1200.0, 1);
        carrinhoDeCompras.adicionarItem("Nexgard Spectra", 120.32, 2);
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor Total das suas compras é de R$: " + carrinhoDeCompras.calcularValorTotal());
       // carrinhoDeCompras.removerItem("Cadeira Gamer Vikings");
        System.out.println("após adicionar itens");
       carrinhoDeCompras.adicionarQuantidade("O senhor dos anéis", 1);
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor Total das suas compras é de R$: " + carrinhoDeCompras.calcularValorTotal());
        System.out.println("Depois de remover quantidade");
        carrinhoDeCompras.removerQuantidade("Nexgard Spectra", 3);
        System.out.println("O valor Total das suas compras é de R$: " + carrinhoDeCompras.calcularValorTotal());
    }
}
