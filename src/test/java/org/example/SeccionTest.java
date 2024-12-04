package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeccionTest {

    @Test
    @Parameters ({"nombreSeccion","titulo","autor","anioPublicacion","id"})



    public void eliminaLibroTest(String nombreSeccion,String titulo,String autor,String anioPublicacion,String id){

        int anioPublicacionInt = Integer.parseInt(anioPublicacion);

        Seccion seccion = new Seccion(nombreSeccion);
        Libro libro2 = new Libro(titulo, autor, anioPublicacionInt,id);
        seccion.agregarLibro(libro2);
        seccion.eliminarLibro(libro2);

        int listaLibrosActual = seccion.getListaLibros().size();
        int listaLibrosEsperada = 0;

        Assert.assertEquals(listaLibrosActual,listaLibrosEsperada);

    }

    @Test

    public void eliminaLibroTest2(){

        Seccion seccion = new Seccion("Aventuras");
        Libro libro2 = new Libro("Bryan Canson", "XXX", 2024,"9");
        seccion.agregarLibro(libro2);
        seccion.eliminarLibro(libro2);

        boolean listaLibrosActual = seccion.getListaLibros().contains(libro2);
        boolean listaLibrosEsperada = false;

        Assert.assertEquals(listaLibrosActual,listaLibrosEsperada);

    }

    public void testObtenerNombreSeccion() {

        String NombreSeccionEsperado = "Comics";
        Seccion seccion = new Seccion("Aventuras");

        String NombreSeccionActual = seccion.getNombreSeccion();
        Assert.assertEquals(NombreSeccionActual, NombreSeccionEsperado);
    }

    public void testObtenerListaLibros(){

        Seccion seccion = new Seccion("Aventuras");
        Libro libro2 = new Libro("Bryan Canson", "XXX", 2024,"9");
        Libro libro3 = new Libro("La casa de Laura", "Duver", 2000,"10");
        seccion.agregarLibro(libro2);
        seccion.agregarLibro(libro3);


        boolean listaLibrosActual = seccion.getListaLibros().contains(libro3);
        boolean listaLibrosEsperada = true;

        Assert.assertEquals(listaLibrosActual,listaLibrosEsperada);

    }
}


