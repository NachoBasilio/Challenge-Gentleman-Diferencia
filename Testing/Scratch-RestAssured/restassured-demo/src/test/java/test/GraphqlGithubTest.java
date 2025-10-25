package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import steps.GraphqlGithubStep;

@Epic("GraphQL GitHub Tests")
@Feature("Pruebas del endpoint GraphQL de GitHub")
public class GraphqlGithubTest {
    GraphqlGithubStep step = new GraphqlGithubStep();

    @Test()
    @DisplayName("Se realiza una petición GraphQL a GitHub y se valida la respuesta")
    @Severity(SeverityLevel.CRITICAL)
    void makeGraphqlRequest_debeDevolver200YValidarDatos() {
        step.setBaseUri();
        step.setQuery();
        step.makeGraphqlRequest();
    }
}
