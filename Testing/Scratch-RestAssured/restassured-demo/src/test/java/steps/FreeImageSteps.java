package steps;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.Assert;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FreeImageSteps {
    String name = "imagen.png";
    File imageFile = new File("src/test/resources/" + name);
    String baseURI;

    @Step("Configurar base URI de FreeImageHos")
    public void setBaseUri() {
        baseURI = "https://freeimage.host/api/1";
    }
    
    public Response uploadImage() {
        Response response =
            given()
                // NO setees Content-Type manualmente en multipart
                .multiPart("source", imageFile, "image/png")
                .multiPart("key", "6d207e02198a847aa98d0a2a901485a5")
                .multiPart("action", "upload")
                .multiPart("format", "json")
            .when()
                .post(baseURI + "/upload")
            .then()
                .statusCode(200)
                .extract()
                .response();
    
        return response;
    }
    
    @Step("Validar la respuesta de la subida de imagen")
    public void validateUploadResponse(Response response) {
        response.then()
            .statusCode(200)
            .body("status_code", equalTo(200))
            .body("status_txt", equalTo("OK"))
            .body("image.extension", equalTo("png"))
            .body("image.url", notNullValue())
            .body("image.url_viewer", notNullValue())
            .body("image.image.url", notNullValue())
            .body("image.original_filename", equalTo(name));

        Allure.addAttachment("Response JSON", "application/json", response.asPrettyString(), ".json");

        String cdnUrl  = response.jsonPath().getString("image.url");
        String pageUrl = response.jsonPath().getString("image.url_viewer");
        String imgUrl  = response.jsonPath().getString("image.image.url");
        
        String html =
            "<!doctype html><html><head><meta charset='utf-8'><title>Imagen</title></head><body>" +
            "<h3>Links de la imagen</h3>" +
            "<ul>" +
              "<li><a href='" + pageUrl + "' target='_blank'>Viewer (freeimage.host)</a></li>" +
              "<li><a href='" + cdnUrl  + "' target='_blank'>CDN directo (iili.io)</a></li>" +
            "</ul>" +
            "<h4>Previsualización</h4>" +
            "<img src='" + imgUrl + "' alt='Imagen subida' style='max-width:100%; height:auto; border:1px solid #ddd; padding:6px; border-radius:8px;'/>" +
            "</body></html>";


        Allure.addAttachment("Enlaces de la subida", "text/html", html, ".html");

        assertTrue(cdnUrl.contains("iili.io"), "image.url no apunta al CDN iili.io");
        assertTrue(pageUrl.contains("freeimage.host"), "image.url_viewer no es del dominio freeimage.host");
    }
}
