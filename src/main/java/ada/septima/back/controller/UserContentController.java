package ada.septima.back.controller;

import ada.septima.back.service.NeflisService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserContentController {
    
	private NeflisService neflisService;
    
	public UserContentController(NeflisService neflisService){
        this.neflisService=neflisService;
    }
	
	@GetMapping(value="/users/{user_id}/featured")
	public String getfeatured(@PathVariable String user_id) {
		/* 
		 * PUNTO 2
		 * TODO:
			preguntar por donde le pasan el ordenamiento y el genero
			De donde se levanta la data? de un file? 
			Que debe devolver los ids? o las peliculas completas?
		 * 
		 */
		return neflisService.getFeatured(user_id);
		
	}
	
	@GetMapping(value="/users/{user_id}/watched")
	public String getFavoritos(@PathVariable String user_id) {
		/* 
		 * PUNTO 3
		 * TODO:
			de donde se levanta la data, de un file?
			Que debe devolver los ids? o las peliculas completas?
		 * 
		 */
		return neflisService.getWatched(user_id);
	}
	

	@PostMapping(value="/users/{user_id}/watched")
	public String getContents(@RequestBody String visto) {
		/* 
		 * PUNTO 4
		 * Notese: que en esta caso como no es un GET, es un "POST" se utiliza la anotation: @PostMapping
		 * Y se recibe la data por un 
		 * TODO:
			guardamos la data en un file??
			Que debe devolver los ids? o las peliculas completas?
		 * 
		 */
		return neflisService.getWatched(visto);
		
	}
	
	


}
