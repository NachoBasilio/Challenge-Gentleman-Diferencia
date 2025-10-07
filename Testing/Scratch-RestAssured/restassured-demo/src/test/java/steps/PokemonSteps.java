package steps;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PokemonSteps {

    @Step("Configurar base URI de la API")
    public void setBaseUri() {
        baseURI = "https://pokeapi.co/api/v2";
    }

    @Step("Solicitar la lista de Pokémon con limit={limit} y offset={offset}")
    public Response getPokemonList(int limit, int offset) {
        return given()
                .queryParam("limit", limit)
                .queryParam("offset", offset)
            .when()
                .get("/pokemon")
            .then()
                .log()
                .all()
                .statusCode(200)
                .extract()
                .response();
    }

    @Step("Validar datos clave de la respuesta: el primer Pokémon debe ser 'bulbasaur'")
    public void validateResponse(Response response) {
        response.then()
            .body("results.size()", equalTo(10))
            .body("results[0].name", equalTo("bulbasaur"))
            .body("results[0].url", equalTo("https://pokeapi.co/api/v2/pokemon/1/"));
    }
}