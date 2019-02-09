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
public class Vandalismo extends D_Menor{
    protected String Edificacion;
    protected int Pisos;
    protected String Nombre;

    public Vandalismo() {
    }

    public Vandalismo(String Edificacion, int Pisos, String Nombre, String policia, String id, int celda, String Descripcion, String Victima, String Culpable, String Sentencia,String Fecha, String pais, int numero) {
        super(policia, id, celda, Descripcion, Victima, Culpable, Sentencia, Fecha, pais, numero);
        this.Edificacion = Edificacion;
        this.Pisos = Pisos;
        this.Nombre = Nombre;
    }

    public String getEdificacion() {
        return Edificacion;
    }

    public void setEdificacion(String Edificacion) {
        this.Edificacion = Edificacion;
    }

    public int getPisos() {
        return Pisos;
    }

    public void setPisos(int Pisos) {
        this.Pisos = Pisos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return super.toString()+"\nVandalismo{" + "\nEdificacion=" + Edificacion + "\nPisos=" + Pisos + "\nNombre=" + Nombre + '}';
    }
    
    
}
