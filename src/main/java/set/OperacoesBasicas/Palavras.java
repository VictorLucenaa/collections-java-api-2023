package main.java.set.OperacoesBasicas;

public class Palavras {
    private String palavra;

    public Palavras(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public String toString() {
        return "Palavras{" +
                "palavra='" + palavra + '\'' +
                '}';
    }
}
