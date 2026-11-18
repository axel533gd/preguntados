package src.modelo;
import java.time.LocalDateTime;



public class Partidas_preguntas {
    private int id;
    private int partida_id;
    private int pregunta_id;
    private int respuesta_elegida_id;
    private int acertos;
    private int corona_obtendida;
    private int tiempo_respuesta_seg;
    private LocalDateTime respondida_en;


    private Partidas_preguntas(int id, int partida_id, int pregunta_id, int respuesta_elegida_id, int acertos, int corona_obtendida, int tiempo_respuesta_seg, LocalDateTime respondida_en) {
        this.id = id;
        this.partida_id = partida_id;
        this.pregunta_id = pregunta_id;
        this.respuesta_elegida_id = respuesta_elegida_id;
        this.acertos = acertos;
        this.corona_obtendida = corona_obtendida;
        this.tiempo_respuesta_seg = tiempo_respuesta_seg;
        this.respondida_en = respondida_en;
    }

    public int getId() {
        return id;
    }   

    public int getPartida_id() {
        return partida_id;
    }

    public int getPregunta_id() {
        return pregunta_id;
    }

    public int getRespuesta_elegida_id() {
        return respuesta_elegida_id;
    }

    public int getAcertos() {
        return acertos;
    }

    public int getCorona_obtendida() {
        return corona_obtendida;
    }

    public int getTiempo_respuesta_seg() {
        return tiempo_respuesta_seg;
    }

    public LocalDateTime getRespondida_en() {
        return respondida_en;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPartida_id(int partida_id) {
        this.partida_id = partida_id;
    }

    public void setPregunta_id(int pregunta_id) {
        this.pregunta_id = pregunta_id;
    }

    public void setRespuesta_elegida_id(int respuesta_elegida_id) {
        this.respuesta_elegida_id = respuesta_elegida_id;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public void setCorona_obtendida(int corona_obtendida) {
        this.corona_obtendida = corona_obtendida;
    }

    public void setTiempo_respuesta_seg(int tiempo_respuesta_seg) {
        this.tiempo_respuesta_seg = tiempo_respuesta_seg;
    }

    public void setRespondida_en(LocalDateTime respondida_en) {
        this.respondida_en = respondida_en;
    }

   
    public String toString() {
        return "Partidas_preguntas{" +
                "id=" + id +
                ", partida_id=" + partida_id +
                ", pregunta_id=" + pregunta_id +
                ", respuesta_elegida_id=" + respuesta_elegida_id +
                ", acertos=" + acertos +
                ", corona_obtendida=" + corona_obtendida +
                ", tiempo_respuesta_seg=" + tiempo_respuesta_seg +
                ", respondida_en=" + respondida_en +
                '}';
    }



    
}
