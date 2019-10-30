package neflis.controller;

import neflis.service.NeflisService;
import neflis.model.Contenido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class NeflisController {
    @Autowired
    private NeflisService neflisService;

    @GetMapping("/contents")
    public List<Contenido> contenidos(@RequestParam(value="genero", required = false)String genero){
        return neflisService.contenidos(genero);
    }


}