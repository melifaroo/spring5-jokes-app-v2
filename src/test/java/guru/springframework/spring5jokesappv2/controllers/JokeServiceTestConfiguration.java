package guru.springframework.spring5jokesappv2.controllers;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import guru.springframework.spring5jokesappv2.services.JokeService;

@Configuration
public class JokeServiceTestConfiguration {
    @Bean
    @Primary
    public JokeService jokeService() {
        return Mockito.mock(JokeService.class);
    }
}
