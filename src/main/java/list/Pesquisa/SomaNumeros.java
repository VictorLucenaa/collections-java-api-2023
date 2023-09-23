package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
   private List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
    numerosList.add(numero);
    }

    public int calcularSoma() {
        int valorTotal = 0;
        if (!numerosList.isEmpty()) {
            valorTotal = 0;
            for (Integer numb : numerosList) {
                valorTotal += numb;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numerosList.isEmpty()) {
            for (Integer numb : numerosList) {
                if (numb >= maiorNumero) {
                    maiorNumero = numb;
                }
            }
            return maiorNumero;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }
    public int encontrarMenorNumero() {

        if (!numerosList.isEmpty()) {
            int menorNumero = Integer.MAX_VALUE;
            for (Integer numb : numerosList) {
                if (numb <= menorNumero) {
                    menorNumero = numb;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros(){

        if(!numerosList.isEmpty()){
               System.out.println(this.numerosList);
        } else{
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(123);
        somaNumeros.adicionarNumero(123);
        somaNumeros.adicionarNumero(1122);
        somaNumeros.adicionarNumero(12);
        somaNumeros.adicionarNumero(-2);
        System.out.println("O valor total dos números é: " + somaNumeros.calcularSoma());
        System.out.println("O maior número da lista é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número da lista é: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Esta é a lista completa dos números: ");
        somaNumeros.exibirNumeros();

    }
}


