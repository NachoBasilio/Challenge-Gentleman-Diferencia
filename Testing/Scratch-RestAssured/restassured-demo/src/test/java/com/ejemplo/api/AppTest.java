package com.ejemplo.api;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

class RestAssuredTest {

    @Test
    void getUsuarios_debeDevolver200YListaNoVacia() {
        given()
            .baseUri("https://jsonplaceholder.typicode.com")
        .when()
            .get("/users")
        .then()
            .statusCode(200)
            .body("size()", greaterThan(0));
    }
}
