
import src.dao.*;
import src.modelo.modelo;
import src.vista.Preguntados;

public class main {
    public static void main(String[] args) {
        // System.out.println("Probando conexión con la base de datos...");

        
        // ModeloDAO dao = new ModeloDAO();

        
        // modelo p = dao.obtenerPreguntaAleatoria();

        // if (p != null) {
        //     System.out.println("\n¡Pregunta encontrada con éxito!");
        //     System.out.println("ID: " + p.getId());
        //     System.out.println("Enunciado: " + p.getEnunciado());
        // } else {
        //     System.out.println("No se pudo obtener la pregunta o la tabla está vacía.");
        // }
        Preguntados ventana = new Preguntados();
        ventana.setVisible(true);
    }
}
