import com.aluracursos.scremach.modelos.Pelicula;
import com.aluracursos.scremach.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(7);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragones = new Serie();
        casaDragones.setNombre("Casa de los dragones");
        casaDragones.setFechaDeLanzamiento(2022);
        casaDragones.setEpisodosPorTemporada(1);
        casaDragones.setMinutosPorTemporada(58);
        casaDragones.setEpisodosPorTemporada(10);
        casaDragones.muestraFichaTecnica();
        System.out.println(casaDragones.getDuracionEnMinutos());





//
//        com.aluracursos.scremach.modelos.Pelicula otraPelicula = new com.aluracursos.scremach.modelos.Pelicula();
//        otraPelicula.nombre = "Matrix";
//        otraPelicula.fechaDeLanzamiento = 1998;
//        otraPelicula.duracionEnMinutos = 180;
//
////       otraPelicula.muestraFichaTecnica();

    }
}
