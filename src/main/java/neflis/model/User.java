package neflis.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class User {


    private Contenido contenido;

    //private ContenidoUnitario contenidoUnitario;     -   al final no lo usamos

    private List <Contenido> contenidosVistos = new ArrayList<>();

    public Contenido getContenido() {
        return contenido;
    }

    public List<Contenido> getContenidosVistos() {

        return contenidosVistos;
    }


    public void play(Contenido contenido){

        //Usuarie al reproducir el contenido:
        this.getContenidosVistos().add(contenido);


        //otra idea
        //if contenido es el ultimo cap de la temp, agregar temporada
        //if contenido es el ultimo cap de la serie, agregar serie
    }



    //PUNTO 1    -   si un usuario vio un contenido dado en forma completa

    public Boolean vioCompleto(Contenido contenido) {        // por que no agarra el contenido del parametro

        return contenido.estaVistoCompletoPor(this);


        //otras ideas(?)
        //return contenidosVistos.stream().filter(contenido -> estaVistoCompletoPor(this));
        //return this.contenidosVistos.stream().allMatch(c->c.estaVistoCompletoPor(this);

    }


    //PUNTO 4
    //A   -   Saber los géneros que vio un usuario, sin repetición.


    public Set<Object> generosVistosSinRepeticion(){

        return this.contenidosVistos.stream().map(c->c.getGenero()).distinct().collect(Collectors.toSet());
        //elegimos SET porque no admite repetidos
        //leimos que con el distinct es redundante, pero como no estamos seguras del funcionamiento se lo dejamos
    }


    //B     -    género preferido de un usuario, del cual se vieron más minutos.

    public Integer minutosVistosDe(String genero){

        return this.getContenidosVistos().stream().filter(c->c.getGenero().equals(genero)).mapToInt(c->c.cuantoDura()).sum();  //ver bien como funca

    }

/*
    public String generoPreferido(){
        return this.generosVistosSinRepeticion().stream().max(Comparator.comparing(genero->this.minutosVistosDe(genero))).get().getGenero();
        //agregamos el comparator pero aun asi no nos toma el parametro
    }
 */

    //PUNTO 5
    //B        -     usuarios fans de un actor

    public Boolean esFanDe(Actor actor){

        return this.contenidosVistos.stream().allMatch(c->c.getActores().contains(actor));

    }






}