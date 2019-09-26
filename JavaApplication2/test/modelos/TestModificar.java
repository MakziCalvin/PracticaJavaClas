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
public class TestModificar {

    public TestModificar() {
    }
    
    @Test
    public void testModificar(){
        System.out.println("Test modificar");
        Libro libro=new Libro("Libro001","Titulo","Autor");
        ColleccionLibros collLibro=new ColleccionLibros();
        collLibro.Agregar(libro);
        boolean esperado=true;
        boolean obtenido=collLibro.Modificar(libro);
        Assert.assertEquals(esperado,obtenido); 
    }
    
}
