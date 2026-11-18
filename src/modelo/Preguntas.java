package src.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import src.modelo.*;

public class Preguntas {
    private int id;
    private int categoria_id;
    private int dificultad_id;
    private String enunciado;
    private int activa;
    private LocalDateTime fecha_creacion;
    private List<Respuestas> respuestas; // Lista para sus 4 opciones

    public Preguntas(int id, int categoria_id, int dificultad_id, String enunciado, int activa, LocalDateTime fecha_creacion) {
        this.id = id;
        this.categoria_id = categoria_id;
        this.dificultad_id = dificultad_id;
        this.enunciado = enunciado;
        this.activa = activa;
        this.fecha_creacion = fecha_creacion;
        this.respuestas = new ArrayList<>();
    }

    // Cambiados a PUBLIC para poder usarlos desde otras clases
    public int getId() { return id; }
    public int getCategoria_id() { return categoria_id; }
    public int getDificultad_id() { return dificultad_id; }
    public String getEnunciado() { return enunciado; }
    public int getActiva() { return activa; }
    public LocalDateTime getFecha_creacion() { return fecha_creacion; }
    public List<Respuestas> getRespuestas() { return respuestas; }

    public void setId(int id) { this.id = id; }
    public void setCategoria_id(int categoria_id) { this.categoria_id = categoria_id; }
    public void setDificultad_id(int dificultad_id) { this.dificultad_id = dificultad_id; }
    public void setEnunciado(String enunciado) { this.enunciado = enunciado; }
    public void setActiva(int activa) { this.activa = activa; }
    public void setFecha_creacion(LocalDateTime fecha_creacion) { this.fecha_creacion = fecha_creacion; }
    public void setRespuestas(List<Respuestas> respuestas) { this.respuestas = respuestas; }

    @Override
    public String toString() {
        return "Preguntas{" +
                "id=" + id +
                ", categoria_id=" + categoria_id +
                ", dificultad_id=" + dificultad_id +
                ", enunciado='" + enunciado + '\'' +
                ", activa=" + activa +
                ", fecha_creacion=" + fecha_creacion +
                ", respuestas=" + respuestas.size() +
                '}';
    }
}
