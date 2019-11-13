package neflis.service;

import neflis.model.Contenido;
import neflis.model.Content;
import neflis.model.User;
import neflis.persistence.NeflisStorage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private User user=new User();
    private NeflisStorage neflisStorage;
    private List<Content> contentList;

    public List<Content> contenidosVistos(){

        return user.getContenidosVistos();

    }


    private Content content(Content contenido){
        Content contentNew;
        return contentNew = new Content();

    }
}
