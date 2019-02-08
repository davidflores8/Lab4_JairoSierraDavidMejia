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
public class Secuestro extends D_Grave{
    protected String tiempo;
    protected String estado;

    public Secuestro() {
    }

    public Secuestro(String tiempo, String estado, int puntuacion, String Descripcion, String Victima, String Culpable, String Sentencia, String Fecha, String pais, int numero) {
        super(puntuacion, Descripcion, Victima, Culpable, Sentencia, Fecha, pais, numero);
        this.tiempo = tiempo;
        this.estado = estado;
    }
    
    

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String toString() {
    String s="";
    s+="Tiempo del secuestro: "+tiempo+"\n";
    s+="¿Volvio vivo o muerto? "+estado+"\n";
    return super.toString()+s;
    }
}
