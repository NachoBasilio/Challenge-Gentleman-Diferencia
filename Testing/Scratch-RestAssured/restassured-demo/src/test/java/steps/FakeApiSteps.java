package steps;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import payloads.FakePost;

public class FakeApiSteps {
    FakePost payload = new FakePost();

    @Step("Configurar base URI de la API")
    public void setBaseUri() {
        baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Step("Enviar POST a la API falsa")
    public Response postFakeApiResponse() {
        payload.withTitle("Titulo personalizado");
        
        String requestBody = payload.toJson();
        
        Allure.addAttachment("Request Body", new ByteArrayInputStream(requestBody.getBytes()));
        
        Response response = 
        given()
            .header("Content-Type", "application/json")
            .body(requestBody)
        .when()
            .post("/posts")
        .then()
            .log().all()
            .statusCode(201)
            .extract()
            .response();

        // 👉 Adjuntar el response completo
        Allure.addAttachment("Response Body", new ByteArrayInputStream(response.asPrettyString().getBytes()));
        Allure.addAttachment("Response Headers", new ByteArrayInputStream(response.getHeaders().toString().getBytes()));

        return response;
    }

    
    @Step("Enviar POST a la API falsa con un JSON")
    public Response postFakeApiResponseConUnJSON() {
        payload.withTitle("Titulo personalizado");
    
        String requestBody = loadResourceAsString("jsons/bodyDataFakeApi.json");

        Allure.addAttachment("Request Body", new ByteArrayInputStream(requestBody.getBytes()));
    
        Response response = 
        given()
            .header("Content-Type", "application/json")
            .body(requestBody)
        .when()
            .post("/posts")
        .then()
            .log().all()
            .statusCode(201)
            .extract()
            .response();

        // 👉 Adjuntar el response completo
        Allure.addAttachment("Response Body", new ByteArrayInputStream(response.asPrettyString().getBytes()));
        Allure.addAttachment("Response Headers", new ByteArrayInputStream(response.getHeaders().toString().getBytes()));

        return response;
    }

    @Step("Validar datos clave de la respuesta: el título y contenido del post")
    public void validateResponse(Response response) {
    
        JsonPath jsonPath = response.jsonPath();

        String tituloPeroDesdeUnJsonPath = jsonPath.get("title");

        System.out.println("Título del post desde JsonPath: " + tituloPeroDesdeUnJsonPath);

        response.then()
        .body("title", equalTo("Titulo personalizado"))
        .body("body", equalTo("Contenido del post"));
    }

    //Esto lo voy a poner en un archivo aparte luego
    private String loadResourceAsString(String resourcePath) {
    try (InputStream in = getClass().getClassLoader().getResourceAsStream(resourcePath)) {
        if (in == null) {
            throw new IllegalArgumentException("No se encontró el recurso: " + resourcePath);
        }
        return new String(in.readAllBytes(), StandardCharsets.UTF_8);
    } catch (Exception e) {
        throw new RuntimeException("Error leyendo recurso: " + resourcePath, e);
    }
}
}
