package neflis.service;

import neflis.model.Content;
import neflis.persistence.NeflisStorage;
import neflis.model.Contenido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NeflisService {
    private List<Content> content;

    @Autowired
    private NeflisStorage neflisStorage;


    public List<Content> content(String genero){

        content= neflisStorage.contents();

        if(genero==null){
            return content;
        }else{
            return content.stream().filter(b->b.getGenero().equals(genero)).collect(Collectors.toList());
        }


    }

}
