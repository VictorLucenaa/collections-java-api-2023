package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone){
        contatoSet.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato n : contatoSet){
            if(n.getNome().startsWith(nome)){
                contatosPorNome.add(n);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
             c.setNumeroTelefone(novoNumero);
             contatoAtualizado = c;
             break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Victor L", 123456);
        agendaContatos.adicionarContato("Victor L", 6556);
        agendaContatos.adicionarContato("Victor 3", 111123);
        agendaContatos.adicionarContato("Victor 4", 658795);
        agendaContatos.adicionarContato("lucas 412", 56);
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Victor"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Victor 4", 565656));
    }
}
