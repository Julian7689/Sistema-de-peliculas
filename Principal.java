package com.aluracursos.screenmacth.calculos.modelos;

import com.aluracursos.screenmacth.calculos.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmacth.calculos.calculos.FiltroRecomendacion;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

public class Principal {
    public static <Arraylist> void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());
        System.out.println("Média de evaluaciones de la película: " +miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);

        //"PeliculaJulian", es una variable de referencia
        var peliculaJulian = new Pelicula("Pelicula Julian");
        peliculaJulian.setFechaDeLanzamiento(1999);
        peliculaJulian.setDuracionEnMinutos(120);
        peliculaJulian.setDirector("Pedro nel nelando");

        //"PeliculaJulian", es una variable de referencia
        var pelinueva = new Pelicula("Pelicula de churro y el hombre taco");
        pelinueva.setFechaDeLanzamiento(2000);
        pelinueva.setDuracionEnMinutos(100);
        pelinueva.setDirector("Paco cojerte");

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(peliculaJulian);
        listaDePeliculas.add(pelinueva);

        System.out.println("Tamaño de la lista de peliculas "+listaDePeliculas.size());
        System.out.println("La primera pelicula es : " + listaDePeliculas.getFirst().getNombre());

        System.out.println(listaDePeliculas.toString());

        System.out.println("Tostring de la pelicula"+listaDePeliculas.getFirst().getNombre());


    }
}
