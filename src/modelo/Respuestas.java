package src.modelo;

public class Respuestas {
    private int id;
    private int preguntaId;
    private String respuesta;
    private int correcta;

    public Respuestas(int id, int preguntaId, String respuesta, int correcta) {
        this.id = id;
        this.preguntaId = preguntaId;
        this.respuesta = respuesta;
        this.correcta = correcta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPreguntaId() {
        return preguntaId;
    }

    public void setPreguntaId(int preguntaId) {
        this.preguntaId = preguntaId;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getCorrecta() {
        return correcta;
    }

    public void setCorrecta(int correcta) {
        this.correcta = correcta;
    }
}
