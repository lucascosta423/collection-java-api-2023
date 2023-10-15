package set.operacaobasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavrasUnicas {
    private final Set<String> conjuntoDePalavrasUnicas;

    public ConjuntoDePalavrasUnicas() {
        this.conjuntoDePalavrasUnicas = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        conjuntoDePalavrasUnicas.add(palavra);
    }
    public void removerPalavra(String palavra){
        if (!conjuntoDePalavrasUnicas.isEmpty()){
            if (conjuntoDePalavrasUnicas.contains(palavra)){
                conjuntoDePalavrasUnicas.remove(palavra);
            }else {
                System.out.println("Palavra não encontrada");
            }
        }else {
            System.out.println("O conjunto esta vázio");
        }
    }
    public boolean verificarPalavra(String palavra){
        return conjuntoDePalavrasUnicas.contains(palavra);
    }
    public void exibirPalavrasUnicas(){
        if (!conjuntoDePalavrasUnicas.isEmpty()){
            System.out.println(conjuntoDePalavrasUnicas);
        }else {
            System.out.println("O conjunto esta vázio");
        }
    }

    public static void main(String[] args) {
        ConjuntoDePalavrasUnicas conjuntoDePalavrasUnicas = new ConjuntoDePalavrasUnicas();
        // Adicionando linguagens únicas ao conjunto
        conjuntoDePalavrasUnicas.adicionarPalavra("Java");
        conjuntoDePalavrasUnicas.adicionarPalavra("Python");
        conjuntoDePalavrasUnicas.adicionarPalavra("JavaScript");
        conjuntoDePalavrasUnicas.adicionarPalavra("Python");
        conjuntoDePalavrasUnicas.adicionarPalavra("C++");
        conjuntoDePalavrasUnicas.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoDePalavrasUnicas.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoDePalavrasUnicas.removerPalavra("Python");
        conjuntoDePalavrasUnicas.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoDePalavrasUnicas.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoDePalavrasUnicas.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoDePalavrasUnicas.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoDePalavrasUnicas.exibirPalavrasUnicas();
    }
}
