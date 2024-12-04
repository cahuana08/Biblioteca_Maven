package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Seccion> listaSecciones = new ArrayList<>();

    public Biblioteca (String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public List<Seccion> getListaSecciones() {
        return listaSecciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaSecciones(List<Seccion> listaSecciones) {
        this.listaSecciones = listaSecciones;
    }

    public void agregarSeccion(Seccion seccion){
        listaSecciones.add(seccion);

    }
    public void mostrarSecciones(){
        System.out.println("Nombre de la Biblioteca: " +nombre);
        for (Seccion seccion: listaSecciones){
            seccion.mostrarLibros();
        }

    }

}

