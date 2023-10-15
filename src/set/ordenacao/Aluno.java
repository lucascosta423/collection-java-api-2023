package set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private long matricula;
    private String nome;
    private Double nota;

    public Aluno(long matricula, String nome, Double nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }
    @Override
    public int compareTo(Aluno a) {
        return this.nome.compareToIgnoreCase(a.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return getMatricula() == aluno.getMatricula();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }
    public long getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public Double getNota() {
        return nota;
    }
    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
class ComparatorPorNota implements Comparator<Aluno>{
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(),a2.getNota());
    }
}