package neflis.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;

@JsonTypeName("Pelicula")
public class Pelicula implements Contenido {

    private String nombre;

    private Integer duracion;

    private String genero;

    private List<Actor> actores = new ArrayList<>();

    public Pelicula(){}


    public Pelicula(String nombre, Integer duracion, String genero) {
        this.setNombre(nombre);
        this.setDuracion(duracion);
        this.setGenero(genero);
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
        this.getActores().add(actor);
    }


    public Boolean actua(Actor actor){

        return this.getActores().contains(actor);
    }


    //B

    public List<Actor> getActores() {
        return actores;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }
}