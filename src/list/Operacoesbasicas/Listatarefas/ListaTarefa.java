package list.Operacoesbasicas.Listatarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemove = new ArrayList<>();
        for (Tarefa t: tarefas) {
            if (t.getDescricao().equals(descricao)){
                tarefasParaRemove.add(t);
            }
        }
        tarefas.removeAll(tarefasParaRemove);
    }

    public int obterNumeroTotalTarefas(){
        return tarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefas);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Numero total da tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa1");
        listaTarefa.adicionarTarefa("Tarefa1");
        listaTarefa.adicionarTarefa("Tarefa2");

        System.out.println("Numero total da tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa2");
        System.out.println("Numero total da tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
