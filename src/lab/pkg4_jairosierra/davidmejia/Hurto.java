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
public class Hurto extends D_Menor{
    protected String Objeto;
    protected int Valor;

    public Hurto() {
    }

    public Hurto(String Objeto, int Valor, String policia, String id, int celda, String Descripcion, String Victima, String Culpable, String Sentencia, String Fecha, String pais, int numero) {
        super(policia, id, celda, Descripcion, Victima, Culpable, Sentencia, Fecha, pais, numero);
        this.Objeto = Objeto;
        this.Valor = Valor;
    }


    public String getObjeto() {
        return Objeto;
    }

    public void setObjeto(String Objeto) {
        this.Objeto = Objeto;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    @Override
    public String toString() {
        return super.toString()+"\nHurto{" + "\nObjeto hurtado=" + Objeto + "\nValor=" + Valor + '}';
    }
    
}
