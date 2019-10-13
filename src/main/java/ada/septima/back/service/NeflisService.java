package ada.septima.back.service;

import ada.septima.back.model.Serie;
import ada.septima.back.persistence.NeflisStorage;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class NeflisService {

    private List<Serie> series;
    private NeflisStorage neflisStorage;

    //configuracion del storage
    private final String KEY = "40f1861e";
    private final String SERVICE = "http://www.omdbapi.com";

    public NeflisService(NeflisStorage neflisStorage){
        this.neflisStorage=neflisStorage;
    }

    public List<Serie> series(String mes){
        series= neflisStorage.series();

        if(mes==null){
            return series;
        }else{
            return series.stream().filter(b->b.getGenero().equals(mes)).collect(Collectors.toList());
        }
    }

    public String getMovie(String title) {
        return "soy una pelicula";
    }

    public String getSerie(String title) {
        return "soy una serie";
    }

    public String getEpisode(String title) {
        return null;
    }

    public String getFeatured(String user_id) {
        return "busco las pelis favoriteadas";
    }

    public String getWatched(String user_id) {
        return "busco las pelis miradas por el usuario";
    }
}
