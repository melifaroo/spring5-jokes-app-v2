package guru.springframework.spring5jokesappv2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5jokesappv2.services.JokeService;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;        
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model){
        model.addAttribute( "joke", jokeService.getJoke() );
        return "jokes/index";
    }
    
}
