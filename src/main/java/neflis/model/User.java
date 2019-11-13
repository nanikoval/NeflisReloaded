package neflis.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class User {


    private Contenido contenido;


    //private ContenidoUnitario contenidoUnitario;     -   al final no lo usamos


    private List<Content> contenidosVistos=new ArrayList<>(
            Arrays.asList(
                    new Content(1002, "Pelicula",2000,"200 min", "suspenso", "Director", "Actores", "Plot" )
            ));




    public Contenido getContenido() {
        return contenido;
    }

    public List<Content> getContenidosVistos() {

        return contenidosVistos;
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

        return this.getContenidosVistos().stream().map(c->c.getGenero()).distinct().collect(Collectors.toSet());
        //elegimos SET porque no admite repetidos
        //leimos que con el distinct es redundante, pero como no estamos seguras del funcionamiento se lo dejamos
    }



/*
    public String generoPreferido(){
        return this.generosVistosSinRepeticion().stream().max(Comparator.comparing(genero->this.minutosVistosDe(genero))).get().getGenero();
        //agregamos el comparator pero aun asi no nos toma el parametro
    }
 */

    //PUNTO 5
    //B        -     usuarios fans de un actor




    public void setContenidosVistos(Capitulo capitulo) {
        this.contenidosVistos = contenidosVistos;
    }
}