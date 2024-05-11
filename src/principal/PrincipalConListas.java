package principal;

import com.aluracursos.scremach.modelos.Pelicula;
import com.aluracursos.scremach.modelos.Serie;
import com.aluracursos.scremach.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(9);
        Serie casaDragones = new Serie("Casa de los dragones", 2022);
        casaDragones.evalua(5);
        Pelicula otraPelicula = new Pelicula("Matrix",1998);
        otraPelicula.evalua(6);
        var peliculaOscar = new Pelicula("Señor de los anillos",2021);
        peliculaOscar.evalua(10);
        Serie lost = new Serie("Lost" , 2000);

        ArrayList<Titulo> listas = new ArrayList<>();
        listas.add(peliculaOscar);
        listas.add(miPelicula);
        listas.add(otraPelicula);
        listas.add(lost);

        for (Titulo item:listas){
            System.out.println(item);
            Pelicula pelicula = (Pelicula) item;
            System.out.println(((Pelicula) item).getClasificacion());
        }


    }
}
