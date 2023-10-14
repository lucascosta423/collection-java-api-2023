package list.Pesquisa.Livro;

public class Livro {
    private final String autor;
    private final String titulo;
    private final Integer anoPublicao;

    public Livro(String titulo, String autor, Integer anoPublicao) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicao = anoPublicao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAnoPublicao() {
        return anoPublicao;
    }

    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anoPublicao=" + anoPublicao +
                '}';
    }
}
