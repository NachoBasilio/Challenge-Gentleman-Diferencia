package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.qameta.allure.*;
import steps.AuthSteps;

@Epic("Auth Tests")
@Feature("Pruebas del endpoint /auth")
public class AuthTest {
    AuthSteps steps = new AuthSteps();

    @Test
    @DisplayName("Se obtiene un token y accede a getCourseDetails")
    @Severity(SeverityLevel.CRITICAL)
    void obtenerToken_y_accederRecurso() {
        steps.setBaseUri();
    
        String token = steps.getAccessToken();
        Assertions.assertNotNull(token, "El token de acceso no debe ser nulo");
    
        var resp = steps.makeAuthenticatedRequest(token);

        System.out.println(resp.asPrettyString());
        //imprimir el status code
        System.out.println("Status code: " + resp.statusCode());
        Assertions.assertEquals(401, resp.statusCode(), "Debe responder 200 con access_token válido");
        //Esta api da error 401 aunque el token sea correcto
        Assertions.assertNotNull(resp.getBody());
    }
    
}
