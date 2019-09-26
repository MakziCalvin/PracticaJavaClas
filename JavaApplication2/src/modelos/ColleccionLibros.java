/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Matzi
 */
public class ColleccionLibros {
    private ArrayList<Libro> libros;

    public ColleccionLibros() {
        this.libros=new ArrayList<>();
    }
    public boolean Agregar(Libro l){
        return this.libros.add(l);
    }
    public ArrayList<Libro> gelAll(){
        return this.libros;
    }
    public boolean Modificar(Libro l){
        for(int i=0;i<libros.size();i++){
            if(libros.get(i).getCodigo().equals(l.getCodigo())){
                libros.get(i).setCodigo(l.getCodigo());
                libros.get(i).setTitulo(l.getTitulo());
                libros.get(i).setAutor(l.getAutor());
                return true;
            }
        }
        return false;
    }
    public boolean Eliminar(String codigo){
        for(int i=0;i<libros.size();i++){
            if(libros.get(i).getCodigo().equals(codigo)){
                this.libros.remove(i);
                return true;
            }
        }
        return false;
    }
}
