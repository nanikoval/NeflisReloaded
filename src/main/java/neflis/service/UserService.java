package neflis.service;

import neflis.model.Contenido;
import neflis.model.User;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private User user;

    public List<Contenido> contentsWatched(){
        List <Contenido> contenidos = user.getContenidosVistos();
        return  contenidos.stream().collect(Collectors.toList());

    }





}