package udem.edu.co.veterinaria.model.entity;

import udem.edu.co.veterinaria.model.abs.Felino;

public class Gato extends Felino {
    private int id;
    private String edad;
    private String nombre;
    private String propietario;

    public Gato(int id, String edad, String nombre, String propietario) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "id=" + id +
                ", edad='" + edad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", propietario='" + propietario + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
