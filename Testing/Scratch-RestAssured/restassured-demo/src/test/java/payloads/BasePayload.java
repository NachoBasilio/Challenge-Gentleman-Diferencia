package payloads;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Clase base para todos los payloads.
 * Contiene utilidades comunes como conversión a JSON, logging, etc.
 */
public abstract class BasePayload {

    private static final ObjectMapper mapper = new ObjectMapper();

    /**
     * Convierte cualquier payload hijo a JSON usando Jackson.
     * Usa pretty-print para mayor legibilidad en reportes.
     */
    public String toJson() {
        try {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
        } catch (Exception e) {
            throw new RuntimeException("❌ Error al convertir payload a JSON: " + getClass().getSimpleName(), e);
        }
    }

    /**
     * Convierte el objeto en JSON plano (sin formato).
     */
    public String toCompactJson() {
        try {
            return mapper.writeValueAsString(this);
        } catch (Exception e) {
            throw new RuntimeException("❌ Error al convertir payload a JSON compacto", e);
        }
    }

    /**
     * Muestra el nombre del payload (útil para logs o Allure).
     */
    public String getPayloadName() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return toJson();
    }
}
