package src.dao;

import src.conexion.conexion;
import src.modelo.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModeloDAO {

    
    public modelo obtenerPreguntaAleatoria() {
        modelo unaPregunta = null;
        String sql = "SELECT * FROM preguntas WHERE activa = 1 ORDER BY RAND() LIMIT 1";

        try (Connection con = conexion.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                unaPregunta = new modelo(
                    rs.getInt("id"),
                    rs.getInt("categoria_id"),
                    rs.getInt("dificultad_id"),
                    rs.getString("enunciado"),
                    rs.getInt("activa")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener la pregunta: " + e.getMessage());
        }

        return unaPregunta;
    }
}