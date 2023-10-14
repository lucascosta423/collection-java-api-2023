package list.Pesquisa.Somadoisnumeros;

import list.Pesquisa.Livro.Livro;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listNumeros;

    public SomaNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listNumeros.add(numero);
    }

    public Integer calcularSoma(){
        Integer soma = 0;
        if (!listNumeros.isEmpty()){
            for (int i = 0; i < listNumeros.size(); i++) {
                soma += listNumeros.get(i);
            }
        }
        return soma;
    }

    public Integer encontrarMaiorNumero() {
        Integer maiorNumero = Integer.MIN_VALUE;
        if (!listNumeros.isEmpty()) {
            for (Integer numero : listNumeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }

    public Integer encontrarMenorNumero(){
        Integer menorNumero = Integer.MAX_VALUE;
        if (!listNumeros.isEmpty()){
            for (Integer numero: listNumeros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        if (!listNumeros.isEmpty()){
            System.out.println(this.listNumeros);
        }else{
            System.out.println("A lista esta vazia");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(80);
        somaNumeros.adicionarNumero(50);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());

    }
}
