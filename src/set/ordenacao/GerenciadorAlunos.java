package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }
    public void adicionarAluno(Long matricula,String nome, double nota){
        alunoSet.add(new Aluno(matricula,nome,nota));
    }
    public void removerAlunoPorMatricula(long matricula){
        Aluno alunoParaRemove = null;
        if (!alunoSet.isEmpty()){
            for (Aluno a: alunoSet){
                if (a.getMatricula() == matricula){
                    alunoParaRemove = a;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemove);
        }else {
            throw new RuntimeException("O conjunto está vazio!");
        }

        if (alunoParaRemove == null) {
            System.out.println("Matricula não encontrada!");
        }
    }
    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()) {
            System.out.println(alunosPorNome);
        }else {
            System.out.println("A lista esta vazia");
        }
    }
    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunoSet.isEmpty()) {
            alunosPorNota.addAll(alunoSet);
            System.out.println(alunosPorNota);
        }else {
            System.out.println("A lista esta vazia");
        }
    }
    public void exibirAlunos(){
        System.out.println(alunoSet);
    }
}
class TesteListadeAlunos{
    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno(123456L,"João", 7.5);
        gerenciadorAlunos.adicionarAluno(123457L, "Maria", 9.0);
        gerenciadorAlunos.adicionarAluno( 123458L, "Carlos",5.0);
        gerenciadorAlunos.adicionarAluno( 123459L, "Ana",6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        gerenciadorAlunos.exibirAlunos();

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAlunoPorMatricula(000L);
        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
        gerenciadorAlunos.exibirAlunos();

        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
