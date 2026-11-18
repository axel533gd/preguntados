package src.modelo;

import src.dao.JugadoresDAO;
import java.util.ArrayList;

public class Gestionjugadores {
    private final JugadoresDAO jugadorDAO = new JugadoresDAO();

    public int guardar(Jugadores jugador) {
        try {
            return jugadorDAO.guardar(jugador);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public ArrayList<Jugadores> listar() {
        try {
            return jugadorDAO.listar();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public boolean actualizar(Jugadores jugador) {
        try {
            return jugadorDAO.actualizar(jugador);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminar(int id) {
        try {
            return jugadorDAO.eliminar(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}   

