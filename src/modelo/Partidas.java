package src.modelo;

public class Partidas {
    private int id;
    private int jugador_id;
    private int fecha_inicio;
    private int fecha_fin;
    private int puntaje;
    private int coronas_ganadas;
    private String estado;

    public Partidas(int id, int jugador_id, int fecha_inicio, int fecha_fin, int puntaje, int coronas_ganadas, String estado) {
        this.id = id;
        this.jugador_id = jugador_id;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.puntaje = puntaje;
        this.coronas_ganadas = coronas_ganadas;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public int getJugador_id() {
        return jugador_id;
    }

    public int getFecha_inicio() {
        return fecha_inicio;
    }

    public int getFecha_fin() {
        return fecha_fin;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public int getCoronas_ganadas() {
        return coronas_ganadas;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJugador_id(int jugador_id) {
        this.jugador_id = jugador_id;
    }

    public void setFecha_inicio(int fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setFecha_fin(int fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void setCoronas_ganadas(int coronas_ganadas) {
        this.coronas_ganadas = coronas_ganadas;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "Partidas{" +
                "id=" + id +
                ", jugador_id=" + jugador_id +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_fin=" + fecha_fin +
                ", puntaje=" + puntaje +
                ", coronas_ganadas=" + coronas_ganadas +
                ", estado='" + estado + '\'' +
                '}';
    }
}
