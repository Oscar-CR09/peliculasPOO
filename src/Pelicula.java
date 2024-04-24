public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;

    private double sumaDeEvaluaciones;
    private totalDeLasEvaulaciones;

    void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("La fecha de lanzamiento es de: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionEnMinutos);
    }

    void evalua(double nota){
        sumaDeEvaluaciones +=nota;
        totalDeLasEvaulaciones ++;
    }

    double calculaMedia(){
        return sumaDeEvaluaciones / totalDeLasEvaulaciones;
    }


}
