package steps;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.github.cdimascio.dotenv.Dotenv;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class GraphqlGithubStep {

    private String baseURI;
    private String query;
    private String token;

    @Step("Configurar base URI de GraphQL GitHub y token")
    public void setBaseUri() {
        baseURI = "https://api.github.com/graphql";

        Dotenv dotenv = Dotenv.load();
        token = dotenv.get("GITHUB_TOKEN");

        if (token == null || token.isEmpty()) {
            throw new RuntimeException("GITHUB_TOKEN no está definido en .env ni en el entorno");
        }
    }

    @Step("Definir query de repositorios de usuario")
    public void setQuery() {
        query = "{ viewer { login name } }";
    }

    @Step("Realizar petición GraphQL a GitHub")
    public Response makeGraphqlRequest() {
        Response response =
            given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body("{\"query\":\"" + query.replace("\"", "\\\"") + "\"}")
            .when()
                .post(baseURI)
            .then()
                .statusCode(200)
                .extract()
                .response();

        System.out.println(response.asPrettyString());

        return response;
    }

    @Step("Validar la respuesta de la petición GraphQL")
    public void validateResponse(Response response) {
        response
        .then()
        .body("data.viewer.login", equalTo("NachoBasilio"))
        .body("data.viewer.name", equalTo("Ignacio Nicolas Basilio Buracco "));
    }
}
