package model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include= JsonTypeInfo.As.PROPERTY, property="type")
@JsonSubTypes({
        @JsonSubTypes.Type(value=Serie.class, name="Serie"),
        @JsonSubTypes.Type(value=Pelicula.class, name="Pelicula")
})
public interface Contenido {


    Boolean estaVistoCompletoPor(User user);

    Integer cuantoDura();

    String getGenero();

    Boolean actua(Actor actor);

    List<Actor> getActores();

}