package neflis.model;

import java.io.Serializable;

public class Content implements Serializable {
    private Integer id;
    private String titulo;
    private Integer anio;
    private String duracion;
    private String genero;
    private String director;
    private String actores;
    private String plot;

    public Content(){}

    public Content(Integer id, String titulo, Integer anio, String duracion, String genero, String director,
                   String actores, String plot){
        this.setId(id);
        this.setTitulo(titulo);
        this.setAnio(anio);
        this.setDuracion(duracion);
        this.setGenero(genero);
        this.setDirector(director);
        this.setActores(actores);
        this.setPlot(plot);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }
}
