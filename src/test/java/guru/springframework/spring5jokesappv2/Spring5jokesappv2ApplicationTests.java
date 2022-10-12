package guru.springframework.spring5jokesappv2;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import guru.springframework.spring5jokesappv2.controllers.JokeController;
import guru.springframework.spring5jokesappv2.services.JokeService;

@SpringBootTest
class Spring5jokesappv2ApplicationTests {

    @Autowired
    private JokeController controller;

    @Autowired
    private JokeService service;

    @Test
    public void contextLoads() throws Exception {		
        assertNotNull(controller);
        assertNotNull(service);
    }

}
