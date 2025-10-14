package steps;

import static io.restassured.RestAssured.given;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;

public class AuthSteps {

    private String baseUri;
    private String clientId = "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com";
    private String clientSecret = "erZOWM9g3UtwNRj340YYaK_W";
    private String accessToken;

    @Step("Configurar la URI base para Auth")
    public void setBaseUri() {
        baseUri = "https://rahulshettyacademy.com/";
    }

    @Step("Realizar login y obtener access_token")
    public void login() {
        Response response = given()
                .baseUri(baseUri)
                .formParam("client_id", clientId)
                .formParam("client_secret", clientSecret)
                .formParam("grant_type", "client_credentials")
                .formParam("scope", "trust")
            .when()
                .post("oauthapi/oauth2/resourceOwner/token")
            .then()
                .statusCode(200)
                .extract().response();

        JsonPath jsonPath = response.jsonPath();
        accessToken = jsonPath.getString("access_token");
        System.out.println("Access Token: " + accessToken);
    }

    @Step("Obtener token actual")
    public String getAccessToken() {
        if (accessToken == null) {
            login();
        }
        return accessToken;
    }

    @Step("Realizar una solicitud autenticada a un endpoint protegido con token: {token}")
    public Response makeAuthenticatedRequest(String token) {
        return given()
                .baseUri(baseUri)
                .queryParam("access_token", token)
            .when()
                .get("oauthapi/getCourseDetails")
            .then()
                .extract().response();
    }
    
}
