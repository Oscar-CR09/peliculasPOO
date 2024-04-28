package com.aluracurso.scremach.calculos;

import com.aluracursos.scremach.modelos.Pelicula;

public class calculadoraDeTiempo {
    private int tiempoTotal;

    public void incluye (Pelicula pelicula){
        tiempoTotal += pelicula.getDuracionEnMinutos();
    }

}
