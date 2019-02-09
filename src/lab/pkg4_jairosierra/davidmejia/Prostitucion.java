/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_jairosierra.davidmejia;

import java.util.Date;

/**
 *
 * @author Jairo Sierra
 */
public class Prostitucion extends D_Menor{
    protected String nombre;

    public Prostitucion() {
    }

    public Prostitucion(String nombre, String policia, String id, int celda, String Descripcion, String Victima, String Culpable, String Sentencia, String Fecha, String pais, int numero) {
        super(policia, id, celda, Descripcion, Victima, Culpable, Sentencia, Fecha, pais, numero);
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString()+"\nProstitucion{" + "\nnombre del solicitante=" + nombre + '}';
    }
    
}
