package com.MyGymRoutine.myapp.data.model;

import java.util.List;

public class GrupoMuscular {

    private String nombre;
    private List<Ejercicio> ejercicios;

    public GrupoMuscular(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(List<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }
}
