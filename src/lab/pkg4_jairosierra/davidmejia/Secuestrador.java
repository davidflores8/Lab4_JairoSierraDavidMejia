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
public class Secuestrador extends Agentes{
    protected String nombre1;
    protected int cantidad;

    public Secuestrador() {
    }

    public Secuestrador(String nombre1, int cantidad, String Nombre, int Edad, String Genero, String Pais, String Encarcelado, String Descripción) {
        super(Nombre, Edad, Genero, Pais, Encarcelado, Descripción);
        this.nombre1 = nombre1;
        this.cantidad = cantidad;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSecuestrador{" + "\nnombre1=" + nombre1 + "\ncantidad=" + cantidad + '}';
    }

    @Override
    public void cometer_delito() {
        System.out.println("Secuestrador{" + "nombre1=" + nombre1 + ", cantidad=" + cantidad + '}');
    }
    
}
