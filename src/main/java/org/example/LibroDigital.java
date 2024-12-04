package org.example;

public class LibroDigital extends Libro{
    private double tamanoArchivo;


    public LibroDigital(String titulo, String autor, int anioPublicacion, String id, double tamanoArchivo){
        super(titulo, autor, anioPublicacion, id);
        if (tamanoArchivo == 0){
            throw new IllegalArgumentException("El tamaño del archivo no puede ser 0");
        }
        this.tamanoArchivo = tamanoArchivo;
    }


    public double getTamanoArchivo() {
        return tamanoArchivo;
    }

    public void setTamanoArchivo(double tamanoArchivo) {
        this.tamanoArchivo = tamanoArchivo;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tamaño del archivo: " +tamanoArchivo);
    }
}
