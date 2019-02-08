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
public class Asesino extends Agentes{
    protected String Nombre1;
    protected String Arma;

    public Asesino() {
    }

    public Asesino(String Nombre1, String Arma, String Nombre, int Edad, String Genero, String Pais, String Encarcelado, String Descripción) {
        super(Nombre, Edad, Genero, Pais, Encarcelado, Descripción);
        this.Nombre1 = Nombre1;
        this.Arma = Arma;
    }

    public String getNombre1() {
        return Nombre1;
    }

    public void setNombre1(String Nombre1) {
        this.Nombre1 = Nombre1;
    }

    public String getArma() {
        return Arma;
    }

    public void setArma(String Arma) {
        this.Arma = Arma;
    }

    @Override
    public String toString() {
        return super.toString()+"Asesino{" + "Nombre1=" + Nombre1 + ", Arma=" + Arma + '}';
    }

    @Override
    public void cometer_delito() {
        System.out.println("Asesino{" + "Nombre1=" + Nombre1 + ", Arma=" + Arma + '}');
    }
    
}
