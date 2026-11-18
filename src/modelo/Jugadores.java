package src.modelo;
import java.time.LocalDateTime;

public class Jugadores {
    private int id;
    private String nickname;
    private String email;
    private String pais;
    private LocalDateTime fecha_registro;
    private String nombre;
    private int puntaje;

    public Jugadores(int id, String nickname, String email, String pais, LocalDateTime fecha_registro) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.pais = pais;
        this.fecha_registro = fecha_registro;
        this.nombre = nickname;
    }

    public Jugadores(int id, String nombre, int puntaje) {
        this.id = id;
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.nickname = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getPais() {
        return pais;
    }

    public LocalDateTime getFecha_registro() {
        return fecha_registro;
    }

    public String getNombre() {
        return nombre != null ? nombre : nickname;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.nickname = nombre;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
