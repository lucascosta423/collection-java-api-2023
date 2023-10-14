package list.Pesquisa.Livro;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private final List<Livro> livroList;
    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        this.livroList.add(new Livro(titulo,autor,anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAuto = new ArrayList<>();
        if (!this.livroList.isEmpty()){
            for (Livro l: livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAuto.add(l);
                }
            }
        }
        return livrosPorAuto;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!this.livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getAnoPublicao() >= anoInicial && l.getAnoPublicao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livrosPorTitulo = null;
        if (!this.livroList.isEmpty()){
            for (Livro l: livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.adicionarLivro("Livro1","Lucas",2023);
        catalagoLivros.adicionarLivro("Livro2","Pedro",2020);
        catalagoLivros.adicionarLivro("Livro1","Henrique",2019);
        catalagoLivros.adicionarLivro("Livro3","Lucas",2018);
        catalagoLivros.adicionarLivro("Livro4","Ana",2022);
        catalagoLivros.adicionarLivro("Livro5","Lucas",2023);
        catalagoLivros.adicionarLivro("Livro6","Pedro",1994 );

        System.out.println(catalagoLivros.pesquisarPorAutor("Lucas"));
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(2020,2023));
        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro1"));

    }
}

