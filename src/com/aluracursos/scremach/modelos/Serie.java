package com.aluracursos.scremach.modelos;

public class Serie extends Titulo{
    int temporadas;
    int episodosPorTemporada;
    int minutosPorTemporada;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    @Override
    public int getDuracionEnMinutos() {

        return temporadas * episodosPorTemporada * minutosPorTemporada;

    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodosPorTemporada() {
        return episodosPorTemporada;
    }

    public void setEpisodosPorTemporada(int episodosPorTemporada) {
        this.episodosPorTemporada = episodosPorTemporada;
    }

    public int getMinutosPorTemporada() {
        return minutosPorTemporada;
    }

    public void setMinutosPorTemporada(int minutosPorTemporada) {
        this.minutosPorTemporada = minutosPorTemporada;

    }

    @Override
    public String toString() {
        return "Serie: " + this.getNombre() + "[" + this.getFechaDeLanzamiento() + "]" ;
    }
}
