package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class LibroDigitalTest {



    @Test
    public void testLibroDigitalSinTamanoTest(){

        assertThrows(IllegalArgumentException.class, () ->new LibroDigital("Libro Virtual","Robot",1998,"23",0));
    }

    public void testLibroDigitalSinTamanoTestDos(){

        assertThrows(IllegalArgumentException.class, () ->new LibroDigital("Libro Virtual","Robot",1998,"23",0));
    }

    public void testObtenerTituloLibroDigital() {
        LibroDigital libroDigital = new LibroDigital("Primer Libro Digital", "Virtual", 1999, "5",2000);

       String tituloEsperado = "Primer Libro Digital";
        String tituloActual = libroDigital.getTitulo();
        Assert.assertEquals(tituloActual, tituloEsperado);
    }

}
