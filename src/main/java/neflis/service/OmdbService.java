package neflis.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OmdbService {

    public String restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://www.omdbapi.com/?i=tt3896198&apikey=1c60f28a";
        return restTemplate.getForObject(fooResourceUrl +"/1", String.class);

    }
}