package neflis.model;

import java.util.ArrayList;
import java.util.List;

public class Temporada implements Contenido {

    private String nombre;

    private Integer numero;

    private String genero;

    private Integer cantidadDeCapitulos;

    private Serie serieALaQuePertenece;

    private List<Capitulo> capitulosEnTemporada = new ArrayList<>();


    public Temporada (String nombre, Integer numero, Integer cantidadDeCapitulos, Serie serieALaQuePertenece){
        this.nombre = nombre;
        this.numero = numero;
        this.cantidadDeCapitulos = cantidadDeCapitulos;
        this.serieALaQuePertenece = serieALaQuePertenece;
    }


    public Integer getNumero() {

        return numero;

    }

    public void agregarCapituloATemporada(Capitulo capitulo){

        this.capitulosEnTemporada.add(capitulo);
        capitulo.setGenero(this.getGenero());                    //PUNTO 4  al agregar el capitulo a la temporada, toma su genero

    }

    public List<Capitulo> getCapitulosEnTemporada() {

        return capitulosEnTemporada;

    }


    //PUNTO 1

    public Boolean estaVistoCompletoPor(User user){

        return this.getCapitulosEnTemporada().stream().allMatch(c->c.estaVistoCompletoPor(user));

    }



    //PUNTO 2

    public Integer cuantoDura() {

        return this.capitulosEnTemporada.stream().map(capitulo -> capitulo.cuantoDura()).reduce(0,Integer::sum);

        //de una bolsa de capitulos con map pasa a una bolsa de numeros(minutos) y suma todos

    }

    //PUNTO 3 (responsabilidad en neflis.model.Serie)

    protected Capitulo ultimoCapituloDisponibleDeLaTemp(){

        return this.capitulosEnTemporada.get(capitulosEnTemporada.size()-1);

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

    public Boolean actua(Actor actor){

        return this.serieALaQuePertenece.getActores().contains(actor);
    }

    //B

    public List<Actor> getActores() {
        return this.serieALaQuePertenece.getActores();
    }



}