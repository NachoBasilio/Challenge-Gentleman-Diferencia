package steps;

import io.qameta.allure.Step;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;


// Un DSL (Domain-Specific Language) 
// en RestAssured está diseñado específicamente para describir peticiones 
// y validaciones HTTP de forma legible y concisa.
public class PokemonSteps {

    @Step("Configurar base URI de la API")
    public void setBaseUri() {
        baseURI = "https://pokeapi.co/api/v2";
    }

    @Step("Solicitar la lista de Pokémon con limit={limit} y offset={offset}")
    public Response getPokemonList(int limit, int offset) {
        return 
            given()
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
                //.asString() esto sirve para transformar la respuesta en string
    }

    @Step("Trae un solo pokemon")
    public Response getSinglePokemon(String pokemonName) {
        Response response = 
            given()
                .pathParam("name", pokemonName)
            .when()
                .get("/pokemon/{name}")
            .then()
                .log()
                .all()
                .statusCode(200)
                .extract()
                .response();

            //Otra forma de imprimir algo especifico es con un JSONPth
            JsonPath jsonPath = response.jsonPath();
            String name = jsonPath.getString("name");
            int id = jsonPath.getInt("id");
            System.out.println("Nombre del Pokémon: " + name);
            System.out.println("ID del Pokémon: " + id);

        return response;
    }

    @Step("Validar datos clave de la respuesta: el primer Pokémon debe ser 'bulbasaur'")
    public void validateResponse(Response response) {
        response.then()
            .body("results.size()", equalTo(10))
            .body("results[0].name", equalTo("bulbasaur"))
            .body("results[0].url", equalTo("https://pokeapi.co/api/v2/pokemon/1/"));
    }

    @Step("Validar datos del Pokémon obtenido: nombre e ID")
    public void validaResponseUnPokemon(Response response, String expectedName, int expectedId) {
        response.then()
            .body("name", equalTo(expectedName))
            .body("id", equalTo(expectedId));


        //Agregue TESTNG
        Assert.assertEquals(response.jsonPath().getString("name"), expectedName, "El nombre del Pokémon no coincide");
        Assert.assertEquals(response.jsonPath().getInt("id"), expectedId, "El ID del Pokémon no coincide");
    }
}