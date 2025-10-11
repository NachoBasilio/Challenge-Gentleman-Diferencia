package payloads;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * Clase que construye dinámicamente el payload JSON para el endpoint /posts.
 * Permite personalizar título, cuerpo y userId, y obtener el JSON final como String.
 */
public class FakePost {
    private String title = "Nuevo Post";
    private String body = "Contenido del post";
    private int userId = 1;

    public FakePost() {}

    public FakePost(String title, String body, int userId) {
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

    public FakePost withTitle(String title) {
        this.title = title;
        return this;
    }

    public FakePost withBody(String body) {
        this.body = body;
        return this;
    }

    public FakePost withUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public String toJson() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode json = mapper.createObjectNode();
        json.put("title", title);
        json.put("body", body);
        json.put("userId", userId);

        try {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);
        } catch (Exception e) {
            throw new RuntimeException("❌ Error generando JSON del FakePost", e);
        }
    }
}
