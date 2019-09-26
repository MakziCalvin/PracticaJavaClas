/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Matzi
 */
public class TestEliminar {

    public TestEliminar() {
    }
    @Test
    public void testEliminar(){
        System.out.println("Test Eliminar");
        Libro libro=new Libro("Libro001","Titulo","Autor");
        ColleccionLibros collLibro=new ColleccionLibros();
        collLibro.Agregar(libro);
        String codigo="Libro001";
        boolean esperado=true;
        boolean obtenido=collLibro.Eliminar(codigo);
        Assert.assertEquals(esperado,obtenido); 
    }
}
