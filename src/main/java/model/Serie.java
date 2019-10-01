package model;

import java.util.ArrayList;
import java.util.List;

public class Serie implements Contenido {

    //private Integer cantidadDeTemporadas;   //a priori no lo pide

    private String nombre;

    private String genero;

    private List<Actor> actores = new ArrayList<>();

    private List<Temporada> temporadasEnSerie = new ArrayList<>();




    public Serie(String nombre, String genero){
        this.setNombre(nombre);
        this.setGenero(genero);
    }


    public void agregarTemporadaASerie(Temporada temporada){

        this.getTemporadasEnSerie().add(temporada);
        temporada.setGenero(this.getGenero());                   //PUNTO 4   al agregar la temporada a la serie correspondiente, toma su genero

    }


    //PUNTO 1


    public List<Temporada> getTemporadasEnSerie() {
        return temporadasEnSerie;
    }

    public Boolean estaVistoCompletoPor(User user){
        return this.getTemporadasEnSerie().stream().allMatch(t->t.getCapitulosEnTemporada().stream().allMatch(c->c.estaVistoCompletoPor(user)));

        //opc2    this.getTemporadasEnSerie().stream().allMatch(t->t.getCapitulosEnTemporada().contains(user.getContenidosVistos())); ???
    }


    //PUNTO 2

    public Integer cuantoDura() {

        return this.getTemporadasEnSerie().stream().map(temporada -> temporada.cuantoDura()).reduce(0,Integer::sum);

    }


    //PUNTO 3      -     Determinar el último capítulo disponible de una serie

    public Capitulo ultimoCapituloDisponibleDeLaSerie(){

        return this.getTemporadasEnSerie().get(getTemporadasEnSerie().size()-1).ultimoCapituloDisponibleDeLaTemp();

    }


    //PUNTO 4


    public String getGenero() {
        return genero;
    }


    //PUNTO 5
    //A

    public void agregarActor(Actor actor){
        this.getActores().add(actor);
    }


    public Boolean actua(Actor actor){

        return this.getActores().contains(actor);      //faltan los invitados????
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

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }

    public void setTemporadasEnSerie(List<Temporada> temporadasEnSerie) {
        this.temporadasEnSerie = temporadasEnSerie;
    }
}