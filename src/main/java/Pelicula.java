import java.util.ArrayList;
import java.util.List;

public class Pelicula implements Contenido {

    private String nombre;

    private Integer duracion;

    private String genero;

    private List<Actor> actores = new ArrayList<>();


    public Pelicula(String nombre, Integer duracion, String genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
    }


    //PUNTO 1

    public Boolean estaVistoCompletoPor(User user){

        return user.getContenidosVistos().contains(this);
    }


    //PUNTO 2

    protected Integer getDuracion() {
        return duracion;
    }


    public Integer cuantoDura(){
        return this.getDuracion();
    }



    //PUNTO 4


    public String getGenero() {
        return genero;
    }


    //PUNTO 5

    //A        -     Saber si un actor actuó en un contenido.

    public void agregarActor(Actor actor){
        this.actores.add(actor);
    }


    public Boolean actua(Actor actor){

        return this.actores.contains(actor);
    }


    //B

    public List<Actor> getActores() {
        return actores;
    }



}