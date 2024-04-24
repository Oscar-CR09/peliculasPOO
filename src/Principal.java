public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(7);
        miPelicula.evalua(7.8);

        System.out.println(miPelicula.sumaDeEvaluaciones);
        System.out.println(miPelicula.totalDeLasEvaulaciones);
        System.out.println(miPelicula.calculaMedia());
        System.out.println("**********************************");
        miPelicula.sumaDeEvaluaciones=2;
        miPelicula.totalDeLasEvaulaciones=1;
        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 180;

//       otraPelicula.muestraFichaTecnica();

    }
}
