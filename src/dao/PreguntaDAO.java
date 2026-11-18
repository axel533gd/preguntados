package src.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import src.modelo.Preguntas;
import src.modelo.Respuestas;

public class PreguntaDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/preguntados";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public Preguntas obtenerPreguntaAleatoria() {
        Preguntas pregunta = null;

        String sqlPregunta = "SELECT id, categoria_id, dificultad_id, enunciado, activa, fecha_creacion " +
                             "FROM preguntas WHERE activa = 1 ORDER BY RAND() LIMIT 1";

        String sqlRespuestas = "SELECT id, pregunta_id, texto, es_correcta " +
                               "FROM respuestas WHERE pregunta_id = ? ORDER BY RAND()";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement psPregunta = conn.prepareStatement(sqlPregunta);
             ResultSet rsPregunta = psPregunta.executeQuery()) {

            if (rsPregunta.next()) {
                // Convertir Timestamp de MySQL a LocalDateTime
                Timestamp ts = rsPregunta.getTimestamp("fecha_creacion");
                LocalDateTime fechaCreacion = (ts != null) ? ts.toLocalDateTime() : null;

                // Usar tu constructor exacto de Preguntas
                pregunta = new Preguntas(
                    rsPregunta.getInt("id"),
                    rsPregunta.getInt("categoria_id"),
                    rsPregunta.getInt("dificultad_id"),
                    rsPregunta.getString("enunciado"),
                    rsPregunta.getInt("activa"),
                    fechaCreacion
                );

                // Obtener las 4 respuestas asociadas
                List<Respuestas> listaRespuestas = new ArrayList<>();
                try (PreparedStatement psResp = conn.prepareStatement(sqlRespuestas)) {
                    psResp.setInt(1, pregunta.getId());
                    try (ResultSet rsResp = psResp.executeQuery()) {
                        while (rsResp.next()) {
                            // Usar tu constructor exacto de Respuestas
                            Respuestas r = new Respuestas(
                                rsResp.getInt("id"),
                                rsResp.getInt("pregunta_id"),
                                rsResp.getString("texto"),
                                rsResp.getInt("es_correcta")
                            );
                            listaRespuestas.add(r);
                        }
                    }
                }
                pregunta.setRespuestas(listaRespuestas);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pregunta;
    }
}

