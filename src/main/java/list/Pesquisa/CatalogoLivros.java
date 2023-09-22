package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }



    public List<Livro> pesquisarPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor))
                    livrosPorAutor.add(l);
            }
            return livrosPorAutor;
        } else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro>livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPortitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    @Override
    public String toString() {
        return "CatalogoLivros{" +
                "livrosList=" + livrosList +
                '}';
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);
        System.out.println(catalogoLivros.pesquisarPorAutor("autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2015, 2021));
        System.out.println(catalogoLivros.pesquisarPortitulo("livro 1"));


    }
}