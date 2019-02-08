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
public abstract class Agentes extends Criminales{

    public Agentes() {
    }

    public Agentes(String Nombre, int Edad, String Genero, String Pais, String Encarcelado, String Descripción) {
        super(Nombre, Edad, Genero, Pais, Encarcelado, Descripción);
    }

    @Override
    public String toString() {
        return "Agentes{" + '}';
    }
    public abstract void cometer_delito();
    
}
