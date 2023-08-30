package udem.edu.co.veterinaria.model.entity;

import udem.edu.co.veterinaria.model.abs.Canino;

public class Perro extends Canino {
    private int id;
    private String edad;
    private String nombre;

    @Override
    public String toString() {
        return "Perro{" +
                "id=" + id +
                ", edad='" + edad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", propietario='" + propietario + '\'' +
                '}';
    }

    public Perro(int id, String edad, String nombre, String propietario) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.propietario = propietario;
    }

    private String propietario;

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
