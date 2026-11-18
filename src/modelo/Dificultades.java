package src.modelo;

public class Dificultades {
    private int id;
    private String nombre;
    private String puntos;
    private String nivel; 



    public Dificultades(int id, String nombre, String puntos, String nivel) {
        this.id = id;
        this.nombre = nombre;
        this.puntos = puntos;
        this.nivel = nivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String toString() {
        return "Dificultades{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puntos='" + puntos + '\'' +
                ", nivel='" + nivel + '\'' +
                '}';
    }
}
