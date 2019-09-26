/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Matzi
 */
public class TestListar {

    public TestListar() {
    }
    
    @Test
    public void testListar(){
        System.out.println("Test Listar");
        ColleccionLibros collLibros=new ColleccionLibros();
        ArrayList<Libro> listEsperado=new ArrayList<Libro>();
        ArrayList<Libro> listObtenido=collLibros.gelAll();
        Assert.assertEquals(listEsperado,listObtenido);
    }
}