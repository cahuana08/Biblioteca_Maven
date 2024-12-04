package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BibliotecaTest {

    private Biblioteca biblioteca;

    @BeforeClass
    public void ConfiguracionBiblioteca(){
       biblioteca = new Biblioteca("Jose Nunez Cordoba");
    }

    @Test
    public void testObtenerNombreBiblioteca() {

        String tituloEsperado = "Jose Nunez Cordoba";
        String tituloActual = biblioteca.getNombre();
        Assert.assertEquals(tituloActual, tituloEsperado);
    }


}
