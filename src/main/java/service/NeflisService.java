package service;

import model.Serie;
import org.springframework.stereotype.Service;
import persistence.NeflisStorage;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NeflisService {
    private List<Serie> series;
    private NeflisStorage neflisStorage;
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
}
