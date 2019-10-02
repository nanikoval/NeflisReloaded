package controller;

import model.Contenido;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.NeflisService;

import java.util.List;

@RestController
public class NeflisController {
    private NeflisService neflisService;
    public NeflisController(NeflisService neflisService){
        this.neflisService=neflisService;
    }

    @GetMapping("/contents")
    public List<Contenido> contenidos(@RequestParam(value="genero", required = false)String genero){
        return neflisService.contenidos(genero);
    }


}
