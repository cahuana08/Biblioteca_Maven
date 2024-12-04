package org.example;

public class LibroFisico extends Libro{
    private int numeroPaginas;

    public LibroFisico(String titulo, String autor, int anioPublicacion, String id, int numeroPaginas) {
        super(titulo, autor, anioPublicacion, id);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Páginas: " +numeroPaginas);
    }
}
