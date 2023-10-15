package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaDeContatos {
    private Set<Contato> contatoSet;

    public AgendaDeContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        this.contatoSet.add(new Contato(nome,numero));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c: contatoSet) {
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
class TesteAgendaDeContatos {
    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaDeContatos agendaDeContatos = new AgendaDeContatos();

        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaDeContatos.exibirContatos();

        // Adicionando contatos à agenda
        agendaDeContatos.adicionarContato("João", 123456789);
        agendaDeContatos.adicionarContato("Maria", 987654321);
        agendaDeContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaDeContatos.adicionarContato("Ana", 88889999);
        agendaDeContatos.adicionarContato("Fernando", 77778888);
        agendaDeContatos.adicionarContato("Carolina", 55555555);

        // Exibindo os contatos na agenda
        agendaDeContatos.exibirContatos();

        // Pesquisando contatos pelo nome
        System.out.println(agendaDeContatos.pesquisarPorNome("Maria"));

        // Atualizando o número de um contato
        Contato contatoAtualizado = agendaDeContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaDeContatos.exibirContatos();
    }
}
