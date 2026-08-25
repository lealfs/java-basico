package org.example.veiculo;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int Paginas;
    private double Valor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int paginas) {
        Paginas = paginas;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", Paginas=" + Paginas +
                ", Valor=" + Valor +
                '}';
    }

    public Livro(String titulo, String autor, String isbn, int paginas, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        Paginas = paginas;
        Valor = valor;
    }
}
