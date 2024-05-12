package principal;

import com.aluracursos.scremach.modelos.Pelicula;
import com.aluracursos.scremach.modelos.Serie;
import com.aluracursos.scremach.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula ){

                System.out.println(((Pelicula) item).getClasificacion());
            }
        }

        ArrayList<String> listaArtista = new ArrayList<>();
        listaArtista.add("Penelope Cruz");
        listaArtista.add("Antonio Balderas");
        listaArtista.add("Ricardo Durin");
        System.out.println(listaArtista);

        Collections.sort(listaArtista);

        System.out.println("Lista de Artista ordenada " + listaArtista);

        Collections.sort(listas);
        System.out.println("Listas de titulos ordenadas: " + listas);


    }
}
