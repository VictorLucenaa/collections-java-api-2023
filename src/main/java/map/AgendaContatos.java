package main.java.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
          numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();


        agendaContatos.adicionarContato("Victor", 123456);
        agendaContatos.adicionarContato("joão", 568782);
        agendaContatos.adicionarContato("maria", 879584);
        agendaContatos.adicionarContato("Frodo", 689548);
        agendaContatos.adicionarContato("Frodo", 85745); // com o método "put" o app atualiza os dados da chave "frodo" para estes. diferente do Set que bloqueia.
        agendaContatos.exibirContatos();
        System.out.println("O número correspondente a este contato é o: " + agendaContatos.pesquisarPorNome("Victor"));
        agendaContatos.removerContato("maria");
        agendaContatos.exibirContatos();
    }
}
