package com.aluracurso.scremach.calculos;

import com.aluracursos.scremach.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye (Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }


}
