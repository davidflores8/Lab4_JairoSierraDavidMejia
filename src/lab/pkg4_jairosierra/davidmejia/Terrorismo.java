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
public class Terrorismo extends D_Grave{
    protected String nombrea;
    protected int victimas;

    public Terrorismo() {
    }

    public Terrorismo(String nombrea, int victimas, int puntuacion, String Descripcion, String Victima, String Culpable, String Sentencia, String Fecha, String pais, int numero) {
        super(puntuacion, Descripcion, Victima, Culpable, Sentencia, Fecha, pais, numero);
        this.nombrea = nombrea;
        this.victimas = victimas;
    }

    public String getNombrec() {
        return nombrea;
    }

    public void setNombrec(String nombrea) {
        this.nombrea = nombrea;
    }

    public int getVictimas() {
        return victimas;
    }

    public void setVictimas(int victimas) {
        this.victimas = victimas;
    }

    @Override
    public String toString() {
       String s="";
       s+="Nombre "+nombrea+"\n";
       s+="Numero de victimas: "+victimas+"\n";
       return super.toString()+s;
    }
    
    
    
}
