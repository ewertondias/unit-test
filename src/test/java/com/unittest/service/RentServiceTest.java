package com.unittest.service;

import com.unittest.entity.MovieEntity;
import com.unittest.entity.RentEntity;
import com.unittest.entity.UserEntity;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class RentServiceTest {

    private static RentService rentService;

    @BeforeAll
    static void setup() {
        rentService = new RentService();
    }

    @Test
    void test() throws Exception {
        // Cenario
        UserEntity user = new UserEntity("Usuario 1");

        MovieEntity movie = new MovieEntity("Filme 1", 1, 5.0);
        // Acao
        RentEntity rentEntity;
        rentEntity = rentService.rentMovie(user, movie);

        // Verificacao
        assertEquals(5.0, rentEntity.getValue());
    }

    /**
     * Forma Elegante: É simples e enxuta só trata exception não verifica mensagem, bom quando lança exception específicas
     * Forma Robusta: Trata exception e mensagem, tem mais poder sobre a execução (usada com try catch)
     * Forma Nova: Também trata exception e mensagem, avisa para o junit a exceção antes (exception.expect, exception.expectMessage)
     */
    @Test
    void testRent_movieHasNoStock() {
        Exception th = assertThrows(Exception.class, () -> {
            // Cenario
            UserEntity user = new UserEntity("Usuario 1");
            MovieEntity movie = new MovieEntity("Filme 1", 0, 5.0);

            // Acao
            rentService.rentMovie(user, movie);
        }, "Filme com estoque não caiu na Exception");

        // Assert Opcional
        assertEquals("Filme sem estoque", th.getMessage());
    }

}
