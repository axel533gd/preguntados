package src.dao;

import src.conexion.conexion;
import src.modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * DAO (Data Access Object) de la tabla "categorias".
 * Recibe objetos Categoria (del paquete modelo) y los guarda,
 * actualiza, elimina o lee desde MySQL usando la clase Conexion.
 */
public class CategoriaDAO {

    /**
     * Inserta una categoria nueva.
     *
     * @return el id que asigno MySQL, o -1 si no se inserto nada.
     */
    public int guardar(Categoria categoria) throws SQLException {
        String sql = "INSERT INTO categorias (nombre, descripcion, color, icono) VALUES (?, ?, ?, ?)";

        try (Connection cn = conexion.obtenerConexion();
             PreparedStatement ps = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, categoria.getNombre());
            ps.setString(2, categoria.getDescripcion());
            ps.setInt(3, categoria.getColor());
            ps.setInt(4, categoria.getIcono());

            int filas = ps.executeUpdate();
            if (filas == 0) {
                return -1;
            }

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
            return -1;
        }
    }

    /**
     * Devuelve todos los duenos guardados, ordenados por nombre.
     */
    public ArrayList<Categoria> listar() throws SQLException {
        String sql = "SELECT id, nombre, descripcion, color, icono FROM categorias ORDER BY nombre";
        ArrayList<Categoria> lista = new ArrayList<>();

        try (Connection cn = conexion.obtenerConexion();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new Categoria(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getInt("color"),
                        rs.getInt("icono")));
            }
        }
        return lista;
    }

    /**
     * Actualiza los datos de un dueno ya existente (usando su id).
     *
     * @return true si se actualizo algun registro.
     */
    public boolean actualizar(Categoria categoria) throws SQLException {
        String sql = "UPDATE categorias SET nombre = ?, descripcion = ?, color = ?, icono = ? WHERE id = ?";

        try (Connection cn = conexion.obtenerConexion();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, categoria.getNombre());
            ps.setString(2, categoria.getDescripcion());
            ps.setInt(3, categoria.getColor());
            ps.setInt(4, categoria.getIcono());
            ps.setInt(5, categoria.getId());

            return ps.executeUpdate() > 0;
        }
    }

    /**
     * Elimina un dueno por su id.
     *
     * @return true si se elimino algun registro.
     */
    public boolean eliminar(int id) throws SQLException {
        String sql = "DELETE FROM categorias WHERE id = ?";

        try (Connection cn = conexion.obtenerConexion();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }
}
