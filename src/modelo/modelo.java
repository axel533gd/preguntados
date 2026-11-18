package src.modelo;

public class modelo {
    private int id;
    private int categoriaId;
    private int dificultadId;
    private String enunciado;
    private int activa;

    public modelo() {}

    public modelo(int id, int categoriaId, int dificultadId, String enunciado, int activa) {
        this.id = id;
        this.categoriaId = categoriaId;
        this.dificultadId = dificultadId;
        this.enunciado = enunciado;
        this.activa = activa;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getCategoriaId() { return categoriaId; }
    public void setCategoriaId(int categoriaId) { this.categoriaId = categoriaId; }

    public int getDificultadId() { return dificultadId; }
    public void setDificultadId(int dificultadId) { this.dificultadId = dificultadId; }

    public String getEnunciado() { return enunciado; }
    public void setEnunciado(String enunciado) { this.enunciado = enunciado; }

    public int getActiva() { return activa; }
    public void setActiva(int activa) { this.activa = activa; }
}
