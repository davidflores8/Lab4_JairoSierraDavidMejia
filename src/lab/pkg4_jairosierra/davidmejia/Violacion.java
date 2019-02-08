/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_jairosierra.davidmejia;

import java.util.Date;

/**
 *
 * @author Nadina Mazzoni
 */
public class Violacion extends D_Grave{
    protected int edad;
    protected String nombre;

    public Violacion() {
    }

    public Violacion(int edad, String nombre, int puntuacion, String Descripcion, String Victima, String Culpable, String Sentencia, String Fecha, String pais, int numero) {
        super(puntuacion, Descripcion, Victima, Culpable, Sentencia, Fecha, pais, numero);
        this.edad = edad;
        this.nombre = nombre;
    }
    
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
        public String toString() {
        String s="";
        s+="Edad del a victima: "+edad+"\n";
        s+="Nombre"+nombre+"\n";
        return super.toString()+s;
    }
    
    
}
