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
public class TestAgregar {

    public TestAgregar() {
    }
    
    @Test
    public void testAgregar(){
        
        System.out.println("Test Agregar");
        Libro libro=new Libro("Libro001","Titulo","Autor");
        ColleccionLibros collLibro=new ColleccionLibros();
        boolean esperado=true;
        boolean obtenido=collLibro.Agregar(libro);
        Assert.assertEquals(esperado,obtenido); 
        
    }
}
