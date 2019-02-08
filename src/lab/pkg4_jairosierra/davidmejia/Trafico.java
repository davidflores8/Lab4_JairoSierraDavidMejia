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
public class Trafico extends D_Grave{
    protected String nombred; 
    protected double cantidad;

    public Trafico() {
    }

    public Trafico(String nombred, double cantidad, int puntuacion, String Descripcion, String Victima, String Culpable, String Sentencia, String Fecha, String pais, int numero) {
        super(puntuacion, Descripcion, Victima, Culpable, Sentencia, Fecha, pais, numero);
        this.nombred = nombred;
        this.cantidad = cantidad;
    }

    public String getNombred() {
        return nombred;
    }

    public void setNombred(String nombred) {
        this.nombred = nombred;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public String toString() {
    String s="";
    s+="Nombre de la droga: "+nombred+"\n";
    s+="Cantidad de droga: "+cantidad+"\n";
    return super.toString()+s;
    }
    
}
