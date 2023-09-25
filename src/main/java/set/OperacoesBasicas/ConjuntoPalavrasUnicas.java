package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavras> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }



    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(new Palavras(palavra));
    }

    public void removerPalavra(String palavra){
        Palavras palavraParaRemover = null;
        for(Palavras p : palavrasUnicasSet){
            if (p.getPalavra() == palavra)
                palavraParaRemover = p;
            break;
        }
        palavrasUnicasSet.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra){
        for(Palavras p : palavrasUnicasSet)
            if (p.getPalavra() == palavra) {
                System.out.println("A palavra: " + palavra + " está presente na SetList");
                break;
            }else  {
                System.out.println("A palavra: " + palavra + " não está presente na SetList");
                break;
            }
         }
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Tubarão");
        conjuntoPalavrasUnicas.adicionarPalavra("Tubarão martelo");
        conjuntoPalavrasUnicas.adicionarPalavra("Tubarão Tigre");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("Tubarão");
        conjuntoPalavrasUnicas.verificarPalavra("Tubarão Tigre");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();


    }
}
