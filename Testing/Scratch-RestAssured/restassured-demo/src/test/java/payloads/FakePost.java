package payloads;

/**
 * Payload para el endpoint /posts de la API falsa.
 * Hereda utilidades comunes de BasePayload.
 */
public class FakePost extends BasePayload {
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

    // Getters y setters
    public String getTitle() { return title; }
    public String getBody() { return body; }
    public int getUserId() { return userId; }
}
