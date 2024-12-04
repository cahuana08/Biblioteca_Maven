package org.example;

import java.util.ArrayList;
import java.util.List;

public class Seccion {
    private String nombreSeccion;
    private List<Libro> listaLibros = new ArrayList<>();

    public Seccion(String nombreSeccion){
        this.nombreSeccion = nombreSeccion;


    }

    public String getNombreSeccion() {
        return nombreSeccion;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void agregarLibro(Libro libro){
        listaLibros.add(libro);
    }

    public void eliminarLibro(Libro libro){
        listaLibros.remove(libro);
    }

    public void mostrarLibros(){
        for(Libro libro: listaLibros){
            libro.mostrarInfo();
        }
    }
}

