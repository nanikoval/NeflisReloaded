package ada.septima.back.controller;

import ada.septima.back.service.NeflisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/contents")
public class ContentsController {
    
	private NeflisService neflisService;
    
	public ContentsController(NeflisService neflisService){
        this.neflisService=neflisService;
    }
	
	@GetMapping(value="/{type}/{title}")
	public String getContents(@PathVariable String type, @PathVariable String title) {
		/* 
		 * PUNTO 1
		 * TODO:
			Que deberìa ser la respuesta? un json con todos los datos? o un objeto pasado a json?
			Como se conectan a una url rest para levantar la data? Ej: 
			http://www.omdbapi.com/?apikey=40f1861e&type=movie&t=rambo&plot=full
			http://www.omdbapi.com/?i=tt3896198&apikey=40f1861e&type=series&t=breaking+bad&plot=full
		 * 
		 */
		switch(type){
			case "movie":
				return neflisService.getMovie(title);
			case "series":
				return neflisService.getSerie(title);
		}
		
		return "hola";
	}
	
	


}
