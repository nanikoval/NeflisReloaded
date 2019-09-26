package model;

import java.util.List;

public interface Contenido {


    Boolean estaVistoCompletoPor(User user);

    Integer cuantoDura();

    String getGenero();

    Boolean actua(Actor actor);

    List<Actor> getActores();

}