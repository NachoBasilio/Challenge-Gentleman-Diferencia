package steps;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.ByteArrayInputStream;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
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
        // 👉 Adjuntar el request al reporte

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

    @Step("Validar datos clave de la respuesta: el título y contenido del post")
    public void validateResponse(Response response) {
        response.then()
        .body("title", equalTo("Titulo personalizado"))
        .body("body", equalTo("Contenido del post"));
    }
}
