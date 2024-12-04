package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LibroFisicoTest {


        @Test

        public void testObtenerNumeroPaginas(){

            int NumeroPaginasEsperado = 400;
            LibroFisico libroFisico = new LibroFisico("Las Cronicas de Narnia 3", "Wolverine", 2020, "3", 300);
           libroFisico.setNumeroPaginas(NumeroPaginasEsperado);

            int NumeroPaginasActual = libroFisico.getNumeroPaginas();

            Assert.assertEquals(NumeroPaginasActual,NumeroPaginasEsperado);
        }

    public void testObtenerTituloLibroFisico() {
        LibroFisico libroFisico = new LibroFisico("Primer Libro de Fisica", "Carlos Fisio", 1999, "5",2000);

        String tituloEsperado = "Primer Libro Digital";
        String tituloActual = libroFisico.getTitulo();
        Assert.assertEquals(tituloActual, tituloEsperado);
    }
    }


