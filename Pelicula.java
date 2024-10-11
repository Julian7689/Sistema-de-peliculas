package com.aluracursos.screenmacth.calculos.modelos;

import com.aluracursos.screenmacth.calculos.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {
    private String director;

    public Pelicula(String nombre) {
        this.setNombre(nombre);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }

    @Override
    public String toString() {
        return  "Pelicula :" + this.getNombre() + "(" + getFechaDeLanzamiento() + ")";
    }

}
