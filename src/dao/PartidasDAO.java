package src.dao;

import src.conexion.conexion;
import src.modelo.Partidas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PartidasDAO {
    private final Connection connection;

    public PartidasDAO() throws SQLException {
        this.connection = conexion.obtenerConexion();
    }

    public PartidasDAO(Connection connection) {
        this.connection = connection;
    }

    public void guardar(Partidas partida) throws SQLException {
        String sql = "INSERT INTO partidas (jugador_id, fecha_inicio, fecha_fin, puntaje, coronas_ganadas, estado) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, partida.getJugador_id());
            ps.setInt(2, partida.getFecha_inicio());
            ps.setInt(3, partida.getFecha_fin());
            ps.setInt(4, partida.getPuntaje());
            ps.setInt(5, partida.getCoronas_ganadas());
            ps.setString(6, partida.getEstado());
            ps.executeUpdate();
        }
    }
}

