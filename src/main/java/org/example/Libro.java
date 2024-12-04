package org.example;

import java.util.HashMap;
import java.util.Map;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String id;
    public static Map<String, String> infoIdAsignado = new HashMap<>();

    public Libro (String titulo, String autor, int anioPublicacion, String id){
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.anioPublicacion = anioPublicacion;


        if (infoIdAsignado.containsKey(id)) {
            //throw new IllegalArgumentException("el libro con el id: " + id + "ya existe") ;
            System.out.println("el libro con el id: " + id + "ya existe");
        }
        else{
            infoIdAsignado.put(id,titulo);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getId() {
        return id;
    }

    public static Map<String, String> getInfoIdAsignado() {
        return infoIdAsignado;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void setInfoIdAsignado(Map<String, String> infoIdAsignado) {
        Libro.infoIdAsignado = infoIdAsignado;
    }

    public void mostrarInfo(){
        System.out.println("Titulo del Libro: " +titulo);
        System.out.println("Autor: " +autor);
        System.out.println("Año Publicaciòn " +anioPublicacion);
    }


}

