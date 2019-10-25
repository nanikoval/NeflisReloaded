package neflis.model;

import java.util.ArrayList;
import java.util.List;

public class Capitulo implements Contenido{

    private  Integer numero;

    private String nombre;

    private Integer duracion;

    private String genero;

    private Serie serieALaQuePertenece;

    private List<Actor>actoresInvitados = new ArrayList<>();

    private List<Actor>actoresProtagonistasEInvitados = new ArrayList<>();



    public Capitulo (Integer numero, String nombre, Integer duracion, Serie serieALaQuePertenece){
        this.numero = numero;
        this.nombre = nombre;
        this.duracion = duracion;
        this.serieALaQuePertenece = serieALaQuePertenece;
    }


    public Integer getNumero() {
        return numero;
    }

    public String getNombre() { return nombre; }

    protected Integer getDuracion() {
        return duracion;
    }


    //PUNTO 1

    public Boolean estaVistoCompletoPor(User user){

        return user.getContenidosVistos().contains(this);
    }


    //PUNTO 2       -    Saber la duración de un contenido.

    public Integer cuantoDura(){

        return this.getDuracion();
    }


    //PUNTO 4

    protected void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }



    //PUNTO 5

    //A

    public void agregarActorInvitado(Actor actor){
        this.actoresInvitados.add(actor);
    }


    public void agregarActoresProtagonistasEInvitados(){                                  // para retocar
        this.actoresProtagonistasEInvitados.addAll(actoresInvitados);
        this.actoresProtagonistasEInvitados.addAll(this.serieALaQuePertenece.getActores());
    }

    /*
        public List<Actor> getActoresInvitados() {
            return actoresInvitados;
        }
    */

    protected List<Actor> getActoresProtagonistasEInvitados() {
        return actoresProtagonistasEInvitados;
    }


    public Boolean actua(Actor actor){

        return this.getActoresProtagonistasEInvitados().contains(actor);
        //return this.serieALaQuePertenece.getActores().contains(actor) && this.getActoresInvitados().contains(actor);
    }

    //B


    public List<Actor> getActores() {

        return this.getActoresProtagonistasEInvitados();

    }


}