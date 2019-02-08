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
public class D_Menor extends Delito {
    protected String policia;
    protected String id;
    protected int celda;

    public D_Menor() {
    }

    public D_Menor(String policia, String id, int celda, String Descripcion, String Victima, String Culpable, String Sentencia, String Fecha, String pais, int numero) {
        super(Descripcion, Victima, Culpable, Sentencia, Fecha, pais, numero);
        this.policia = policia;
        this.id = id;
        this.celda = celda;
    }

    public String getPolicia() {
        return policia;
    }

    public void setPolicia(String policia) {
        this.policia = policia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCelda() {
        return celda;
    }

    public void setCelda(int celda) {
        this.celda = celda;
    }

 @Override
    public String toString() {
        String s="";
        s+="Delito Menor";
        s+="Policia: "+policia+"\n";
        s+="ID del policia: "+id+"\n";
        s+="Numero de celda del prisionero: "+numero+"\n";
        return super.toString()+ s;
    }
    
}
