package com.aluracursos.screenmacth.calculos.calculos;
import com.aluracursos.screenmacth.calculos.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return this.tiempoTotal;
    }


    public void incluye(Titulo titulo){
        System.out.println("Agregando duracion en minutos de " + titulo);
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
