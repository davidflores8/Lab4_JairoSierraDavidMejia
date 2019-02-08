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
public class D_Grave extends Delito{
    protected int puntuacion;

    public D_Grave() {
    }

    public D_Grave(int puntuacion, String Descripcion, String Victima, String Culpable, String Sentencia, String Fecha, String pais, int numero) {
        super(Descripcion, Victima, Culpable, Sentencia, Fecha, pais, numero);
        this.puntuacion = puntuacion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    
//    public String toString()
//    {
//        String s="";
//        s+="Puntuacion: "+puntuacion+"\n";
//        return super.toString()+s;
//    }

    @Override
    public String toString() {
        return super.toString()+ "Delito Grave\n" + "Puntuacion: " + puntuacion + '}';
    }
    
    
    
}
