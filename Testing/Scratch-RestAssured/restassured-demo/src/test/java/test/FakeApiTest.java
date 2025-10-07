package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;
import steps.FakeApiSteps;

public class FakeApiTest {
    private final FakeApiSteps steps = new FakeApiSteps();

    @Test
    @DisplayName("Se obtiene una respuesta de la API falsa y se valida el título y contenido")
    @Severity(SeverityLevel.CRITICAL)
    void postFakeApiResponse_debeDevolver201YValidarDatos() {
        steps.setBaseUri();
        Response response = steps.postFakeApiResponse();
        steps.validateResponse(response);
    }
}
