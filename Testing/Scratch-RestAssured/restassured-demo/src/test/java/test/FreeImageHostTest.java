package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.qameta.allure.*;
import io.restassured.response.Response;
import steps.FreeImageSteps;

@Epic("FreeImageHost Tests")
@Feature("Pruebas del endpoint /api/1/upload")
public class FreeImageHostTest {
    FreeImageSteps steps = new FreeImageSteps();

    @Test
    @DisplayName("Se sube una imagen y se valida la respuesta")
    @Severity(SeverityLevel.CRITICAL)
    void uploadImage_debeDevolver200YValidarDatos() {
        steps.setBaseUri();
        Response response = steps.uploadImage();
        steps.validateUploadResponse(response);
    }
}
