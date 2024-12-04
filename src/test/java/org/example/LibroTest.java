package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LibroTest {

    private Libro libro;

    @BeforeClass
    public void ConfiguracionLibro(){
         libro = new Libro("Nuevo Ejemplo", "Wolverine", 2010, "3");
    }


    @Test
    public void testObtenerTituloLibro() {
        String tituloEsperado = "Las Cronicas de Narnia 2";
        String tituloActual = libro.getTitulo();
        Assert.assertEquals(tituloActual, tituloEsperado);
    }

    public void testObtenerAutorLibro() {
        String AutorEsperado = "Wolverine";
        String AutorActual = libro.getAutor();
        Assert.assertEquals(AutorActual, AutorEsperado);
    }

    public void testObtenerAnioPublicacionLibro() {
        int AnioPubEsperado = 2010;
        int AnioPubActual = libro.getAnioPublicacion();
        Assert.assertEquals(AnioPubActual, AnioPubEsperado);
    }
}
