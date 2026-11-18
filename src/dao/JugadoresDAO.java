package src.dao;

import src.modelo.Jugadores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import src.conexion.conexion;

public class JugadoresDAO {
    public ArrayList<Jugadores> listar() throws SQLException {
        return listarJugadores();
    }

    public int guardar(Jugadores jugador) throws SQLException {
        return guardarJugador(jugador);
    }

    public boolean actualizar(Jugadores jugador) throws SQLException {
        String sql = "UPDATE jugadores SET nombre = ?, puntaje = ? WHERE id = ?";

        try (Connection cn = conexion.obtenerConexion();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, jugador.getNombre());
            ps.setInt(2, jugador.getPuntaje());
            ps.setInt(3, jugador.getId());

            return ps.executeUpdate() > 0;
        }
    }

    public boolean eliminar(int id) throws SQLException {
        String sql = "DELETE FROM jugadores WHERE id = ?";

        try (Connection cn = conexion.obtenerConexion();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    public ArrayList<Jugadores> listarJugadores() throws SQLException {
        String sql = "SELECT id, nombre, puntaje FROM jugadores ORDER BY puntaje DESC";
        ArrayList<Jugadores> lista = new ArrayList<>();

        try (Connection cn = conexion.obtenerConexion();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Jugadores jugador = new Jugadores(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getInt("puntaje")
                );
                lista.add(jugador);
            }
        }

        return lista;
    }

    public int guardarJugador(Jugadores jugador) throws SQLException {
        String sql = "INSERT INTO jugadores (nombre, puntaje) VALUES (?, ?)";

        try (Connection cn = conexion.obtenerConexion();
             PreparedStatement ps = cn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, jugador.getNombre());
            ps.setInt(2, jugador.getPuntaje());

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas == 0) {
                throw new SQLException("No se pudo insertar el jugador.");
            }

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1); // Devuelve el ID generado
                } else {
                    throw new SQLException("No se pudo obtener el ID del jugador insertado.");
                }
            }
        }
    }

    
}
