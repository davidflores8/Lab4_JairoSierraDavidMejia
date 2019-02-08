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
public class Asesinato extends D_Grave{
    protected String nombrea;
    protected int cuerpos;

    public Asesinato() {
    }

    public Asesinato(String nombrea, int cuerpos, int puntuacion, String Descripcion, String Victima, String Culpable, String Sentencia, String Fecha, String pais, int numero) {
        super(puntuacion, Descripcion, Victima, Culpable, Sentencia, Fecha, pais, numero);
        this.nombrea = nombrea;
        this.cuerpos = cuerpos;
    }


    public String getNombrea() {
        return nombrea;
    }

    public void setNombrea(String nombrea) {
        this.nombrea = nombrea;
    }

    public int getCuerpos() {
        return cuerpos;
    }

    public void setCuerpos(int cuerpos) {
        this.cuerpos = cuerpos;
    }

    @Override
    public String toString() {
        String s="";
        s+="Nombre de arma: "+nombrea+"\n";
        s+="Numeros de cuerpos"+cuerpos+"\n";
        return super.toString()+s;
    }
    
    
    
}
