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
public class Criminales {
    protected String Nombre;
    protected int Edad;
   protected String Genero;
  protected String Pais;
  protected String Encarcelado;
  protected String Descripción;

    public Criminales() {
    }

    public Criminales(String Nombre, int Edad, String Genero, String Pais, String Encarcelado, String Descripción) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Genero = Genero;
        this.Pais = Pais;
        this.Encarcelado = Encarcelado;
        this.Descripción = Descripción;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getEncarcelado() {
        return Encarcelado;
    }

    public void setEncarcelado(String Encarcelado) {
        this.Encarcelado = Encarcelado;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }

    @Override
    public String toString() {
        return "Criminales{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Genero=" + Genero + ", Pais=" + Pais + ", Encarcelado=" + Encarcelado + ", Descripcion=" + Descripción + '}';
    }
  
}
