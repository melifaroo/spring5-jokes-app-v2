package guru.springframework.spring5jokesappv2.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

import guru.springframework.spring5jokesappv2.services.JokeService;

@SpringBootTest
class JokeControllerTest {

    @Autowired
    private JokeController controller;

    @Autowired
    private JokeService service;

    @Test
    public void checkJokeService() throws Exception {	   
        Mockito.when(service.getJoke()).thenReturn("Test Joke");
        Model model = new ConcurrentModel();	
        String view = controller.getJoke( model );
        assertEquals("jokes/index", view);
        assertEquals("Test Joke", model.getAttribute("joke"));
    }

}