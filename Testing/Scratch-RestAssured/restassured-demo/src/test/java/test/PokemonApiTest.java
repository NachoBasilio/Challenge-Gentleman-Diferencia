package test;

import io.qameta.allure.*;
import io.restassured.response.Response;
import steps.PokemonSteps;

import org.junit.jupiter.api.*;

@Epic("PokeAPI Tests")
@Feature("Pruebas del endpoint /pokemon")
public class PokemonApiTest {

    private final PokemonSteps steps = new PokemonSteps();

    @Test
    @DisplayName("Se obtiene los 10 primeros pokemon y se valida que el primero sea Bulbasaur")
    @Severity(SeverityLevel.CRITICAL)
    void getPrimeros10Pokemon_debeDevolver200YListaCon10Resultados() {
        steps.setBaseUri();
        Response response = steps.getPokemonList(10, 0);
        steps.validateResponse(response);
    }
}