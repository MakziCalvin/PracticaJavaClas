/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import modelos.ColleccionLibros;
import modelos.Libro;

/**
 *
 * @author Matzi
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ColleccionLibros lista=new ColleccionLibros();
        Libro libro;
        String codigo;
        libro=new Libro("hymo", "Autorress", "Maxi");
        lista.Agregar(libro);
        libro=new Libro("kokasi", "Programadores", "jsaksakj");
        lista.Agregar(libro);
        libro=new Libro("lol", "LegueofLegent", "Perez");
        lista.Agregar(libro);
        ListarLibro(lista.gelAll());
        System.out.println("******Libros agregados**********");
        libro=new Libro("hymo", "wena ctm", "MaxiCalvin");
        lista.Modificar(libro);
        ListarLibro(lista.gelAll());
        System.out.println("******Libro modificado**********");
        codigo="hymo";
        lista.Eliminar(codigo);
        ListarLibro(lista.gelAll());
        System.out.println("******Libro Eliminado**********");
        
    }
    public static void ListarLibro(ArrayList<Libro> libro){
        for(Libro l:libro){
            System.out.println("Codigo : "+l.getCodigo());
            System.out.println("Titulo : "+l.getTitulo());
            System.out.println("Autor : "+l.getAutor());
            System.out.println("_________________________");
        }
    }
}
