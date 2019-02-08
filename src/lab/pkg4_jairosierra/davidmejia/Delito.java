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
public class Delito {
    protected String Descripcion;
    protected String Victima;
    protected String Culpable;
    protected String Sentencia;
    protected String Fecha;
    protected String pais;
    protected int numero;

    public Delito() {
    }

    public Delito(String Descripcion, String Victima, String Culpable, String Sentencia, String Fecha, String pais, int numero) {
        this.Descripcion = Descripcion;
        this.Victima = Victima;
        this.Culpable = Culpable;
        this.Sentencia = Sentencia;
        this.Fecha = Fecha;
        this.pais = pais;
        this.numero = numero;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getVictima() {
        return Victima;
    }

    public void setVictima(String Victima) {
        this.Victima = Victima;
    }

    public String getCulpable() {
        return Culpable;
    }

    public void setCulpable(String Culpable) {
        this.Culpable = Culpable;
    }

    public String getSentencia() {
        return Sentencia;
    }

    public void setSentencia(String Sentencia) {
        this.Sentencia = Sentencia;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        String s="";
        s+="Descripcion: "+Descripcion+"\n";
        s+="Victima: "+Victima+"\n";
        s+="Culpable: "+Culpable+"\n";
        s+="Sentencia: "+Sentencia+"\n";
        s+="Fecha: "+Fecha+"\n";
        s+="Pais: "+pais+"\n";
        s+="Numero de delito: "+numero+"\n";
        return s;
    }
    
}
