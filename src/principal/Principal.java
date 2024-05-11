package principal;

import com.aluracurso.scremach.calculos.CalculadoraDeTiempo;
import com.aluracursos.scremach.modelos.Pelicula;
import com.aluracursos.scremach.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(7);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragones = new Serie("Casa de los dragones", 2022);
        casaDragones.setEpisodosPorTemporada(1);
        casaDragones.setMinutosPorTemporada(58);
        casaDragones.setEpisodosPorTemporada(10);
        casaDragones.muestraFichaTecnica();
        System.out.println(casaDragones.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix",1998);
        otraPelicula.setDuracionEnMinutos(180);


        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragones);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo de necesario para ver tus titulos favoritos" +
                calculadora.getTiempoTotal() + "minutos" );

        var peliculaOscar = new Pelicula("Señor de los anillos",2021);
        peliculaOscar.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaOscar);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas.toString());

        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());


    }
}
