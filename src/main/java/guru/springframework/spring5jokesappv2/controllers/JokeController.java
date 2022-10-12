package guru.springframework.spring5jokesappv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5jokesappv2.services.JokeService;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;        
    }

    @RequestMapping("/")
    public String getJoke(){
        return jokeService.getJoke();
    }
    
}
