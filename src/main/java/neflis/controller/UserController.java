package neflis.controller;



import neflis.model.Contenido;
import neflis.model.User;
import neflis.service.NeflisService;
import neflis.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class UserController {

    public User users;
    private NeflisService neflisService;


    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{user_id}/contents")
    public List<Contenido> contents(@PathVariable(value = "user_id") Integer userId,
                                         @RequestParam(value = "genero", required = false) String genero) {
        return userService.contentsWatched();
    }
}