package src.modelo;
import src.dao.ModeloDAO;
import src.dao.PreguntaDAO;


public class Gestionjuego {
    Jugadores jugador;
    PreguntaDAO preguntaDAO = new PreguntaDAO();
    public Preguntas preguntaactual;

    public Preguntas obtenerPreguntaAleatoria() {
        preguntaactual = preguntaDAO.obtenerPreguntaAleatoria();
        return preguntaactual;
    }

    public boolean verificarRespuesta(Respuestas respuestaSeleccionada) {
        return respuestaSeleccionada.getCorrecta() == 1;
    }

}
