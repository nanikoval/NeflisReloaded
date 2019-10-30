package neflis.service;

import neflis.persistence.NeflisStorage;
import neflis.model.Contenido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NeflisService {
    private List<Contenido> contenidos;

    @Autowired
    private NeflisStorage neflisStorage;


    public List<Contenido> contenidos(String genero){

        contenidos= neflisStorage.contenidos();

        if(genero==null){
            return contenidos;
        }else{
            return contenidos.stream().filter(b->b.getGenero().equals(genero)).collect(Collectors.toList());
        }


    }

}
