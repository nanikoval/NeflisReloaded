package service;

import model.Contenido;
import org.springframework.stereotype.Service;
import persistence.NeflisStorage;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NeflisService {
    private List<Contenido>contenidos;

    private NeflisStorage neflisStorage;

    public NeflisService(NeflisStorage neflisStorage){
        this.neflisStorage=neflisStorage;
    }

    public List<Contenido> contenidos(String genero){
        contenidos= neflisStorage.contenidos();

        if(genero==null){
            return contenidos;
        }else{
            return contenidos.stream().filter(b->b.getGenero().equals(genero)).collect(Collectors.toList());
        }


    }

}
