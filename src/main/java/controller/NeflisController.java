package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.NeflisService;

@RestController
public class NeflisController {
    private NeflisService neflisService;
    public NeflisController(NeflisService neflisService){
        this.neflisService=neflisService;
    }


}
