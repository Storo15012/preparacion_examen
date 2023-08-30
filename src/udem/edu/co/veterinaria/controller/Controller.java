package udem.edu.co.veterinaria.controller;

import udem.edu.co.veterinaria.model.entity.Gato;
import udem.edu.co.veterinaria.model.entity.Perro;
import udem.edu.co.veterinaria.model.interfaces.Animal;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public Controller() {

    }
    public String imprimir(){
        List<Animal> lista = new ArrayList<>();
        lista.add(new Gato(1,"12","zeus","samuel"));
        lista.add(new Perro(2,"5","luna","yonatan"));
        return lista.toString();
    }
}
