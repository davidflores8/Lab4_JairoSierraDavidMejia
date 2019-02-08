/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_jairosierra.davidmejia;

/**
 *
 * @author Jairo Sierra
 */
public class Terroristas extends Agentes{
    protected String Pais1;
    protected String Ciudad;
    protected String Metodo;

    public Terroristas() {
    }

    public Terroristas(String Pais1, String Ciudad, String Metodo, String Nombre, int Edad, String Genero, String Pais, String Encarcelado, String Descripción) {
        super(Nombre, Edad, Genero, Pais, Encarcelado, Descripción);
        this.Pais1 = Pais1;
        this.Ciudad = Ciudad;
        this.Metodo = Metodo;
    }

    public String getPais1() {
        return Pais1;
    }

    public void setPais1(String Pais1) {
        this.Pais1 = Pais1;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getMetodo() {
        return Metodo;
    }

    public void setMetodo(String Metodo) {
        this.Metodo = Metodo;
    }

    @Override
    public String toString() {
        return super.toString()+"Terroristas{" + "Pais1=" + Pais1 + ", Ciudad=" + Ciudad + ", Metodo=" + Metodo + '}';
    }

    @Override
    public void cometer_delito() {
        System.out.println("Terroristas{" + "Pais1=" + Pais1 + ", Ciudad=" + Ciudad + ", Metodo=" + Metodo + '}');
    }
    
    
}
